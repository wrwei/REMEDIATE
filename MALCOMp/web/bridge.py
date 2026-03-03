"""Pipeline bridge: runs MALCOMp stages in background threads with WebSocket I/O."""
from __future__ import annotations

import asyncio
import json
import logging
import os
import re
import shutil
import subprocess
import sys
import tempfile
import threading
from pathlib import Path
from typing import Any

import yaml

from web.iostream import WebSocketIOStream
from web.state import SessionState

logger = logging.getLogger(__name__)

# Ensure the MALCOMp root is on sys.path so stage imports work
_MALCOMP_DIR = Path(__file__).resolve().parent.parent
if str(_MALCOMP_DIR) not in sys.path:
    sys.path.insert(0, str(_MALCOMP_DIR))

# Sibling MALCOMj project
_MALCOMJ_DIR = _MALCOMP_DIR.parent / "MALCOMj"
_GRADLEW = "gradlew.bat" if sys.platform == "win32" else "./gradlew"

# ---------------------------------------------------------------------------
# Pipeline metadata
# ---------------------------------------------------------------------------

STAGE_NAMES = ["term", "dsl", "model", "statemachine"]

STAGE_AGENTS: dict[str, list[str]] = {
    "term":         ["Term_Extractor", "Term_checker"],
    "dsl":          ["DSL_Extractor", "DSL_Checker", "DSL_Refactor", "Json_Generator"],
    "model":        ["Model_Creator", "Model_Checker", "Model_Refactorer", "Json_Generator"],
    "statemachine": ["Modeller", "Json_Generator"],
}

PIPELINE_STRUCTURE = [
    {
        "id": "step1_requirements",
        "label": "1 \u2014 Develop Requirement Model",
        "type": "manual",
        "tasks": [],
    },
    {
        "id": "step2_concepts",
        "label": "2 \u2014 Extract Concepts & Instances",
        "type": "llm",
        "tasks": ["term"],
    },
    {
        "id": "step3_dsml",
        "label": "3 \u2014 Generate DSML",
        "type": "llm",
        "tasks": ["dsl"],
    },
    {
        "id": "step4_model",
        "label": "4 \u2014 Generate Domain-Specific Model",
        "type": "llm",
        "tasks": ["model"],
    },
    {
        "id": "step5_safety",
        "label": "5 \u2014 Generate Safety-Related Models",
        "type": "llm",
        "tasks": ["statemachine"],
    },
    {
        "id": "step6_management",
        "label": "6 \u2014 Model Management (MALCOMj)",
        "type": "gradle",
        "tasks": [],
        "commands": [
            "runAuvEmfCreation",
            "runAuvValidation",
            "runEmf2Robochart",
            "runReq2Concept",
            "runReq2Ecore",
            "runReq2EmfModel",
            "runReq2StateMachine",
        ],
    },
]

GRADLE_COMMANDS: dict[str, dict] = {
    "runAuvEmfCreation":   {"label": "Create AUV EMF Model Instance"},
    "runAuvValidation":    {"label": "Validate AUV Model Constraints"},
    "runEmf2Robochart":    {"label": "Generate RoboChart DSL from AUV Model"},
    "runReq2Concept":      {"label": "Req \u2192 Concept Traceability",  "needs": "result_term_extraction.json"},
    "runReq2Ecore":        {"label": "Req \u2192 DSL Traceability",      "needs": "result_dsl_extraction.json"},
    "runReq2EmfModel":     {"label": "Req \u2192 Model Traceability",    "needs": "result_model_creation.json"},
    "runReq2StateMachine": {"label": "Req \u2192 StateMachine Traceability", "needs": "result_statemachine_extraction.json"},
}

# Map from stage name to its config key in config.yaml
_STAGE_CONFIG_KEY = {
    "term": "term_extraction",
    "dsl": "dsl_extraction",
    "model": "emf_model_creation",
    "statemachine": "state_machine_extraction",
}


def _get_stage_classes() -> dict[str, type]:
    """Lazily import stage classes (avoids heavy imports at module level)."""
    from stages import (
        TermExtraction,
        DSLExtraction,
        EMFModelCreation,
        StateMachineExtraction,
    )
    return {
        "term": TermExtraction,
        "dsl": DSLExtraction,
        "model": EMFModelCreation,
        "statemachine": StateMachineExtraction,
    }


class PipelineBridge:
    """Manages running pipeline stages in background threads."""

    def __init__(self, config_path: str, state: SessionState) -> None:
        self.config_path = config_path
        self.state = state
        self._thread: threading.Thread | None = None
        self._stop_event = threading.Event()
        self._current_phase: str | None = None
        self._iostream: WebSocketIOStream | None = None
        # Cache stage instances so agents retain conversation context
        self._phase_cache: dict[str, Any] = {}

    @property
    def is_running(self) -> bool:
        return self._thread is not None and self._thread.is_alive()

    # ---- LLM-based stages (Steps 2-5) ------------------------------------

    def start_phase(self, phase_name: str, iostream: WebSocketIOStream,
                    loop: asyncio.AbstractEventLoop, *,
                    requirements_override: str | None = None,
                    disabled_agents: list[str] | None = None) -> None:
        """Launch an LLM pipeline stage in a background thread."""
        if self.is_running:
            iostream.notify_phase_event(
                "error", message="A stage is already running",
            )
            return

        if phase_name not in STAGE_NAMES:
            iostream.notify_phase_event(
                "error", message=f"Unknown stage: {phase_name}",
            )
            return

        # Build effective config path (apply requirements override if given)
        effective_config = self.config_path
        if requirements_override:
            effective_config = self._make_override_config(requirements_override)

        self._stop_event.clear()
        self._current_phase = phase_name
        self._iostream = iostream
        iostream.phase_name = phase_name
        iostream._flush_buffer()
        iostream._current_sender = ""
        self.state.set_phase_status(phase_name, "running")

        self._thread = threading.Thread(
            target=self._run_phase,
            args=(phase_name, iostream, loop, effective_config,
                  disabled_agents or []),
            daemon=True,
        )
        self._thread.start()

    def _run_phase(self, phase_name: str, iostream: WebSocketIOStream,
                   loop: asyncio.AbstractEventLoop,
                   config_path: str | None = None,
                   disabled_agents: list[str] | None = None) -> None:
        """Execute a single LLM stage (runs in a background thread)."""
        from autogen.io import IOStream

        effective_config = config_path or self.config_path
        tmp_config = effective_config if effective_config != self.config_path else None
        disabled = set(disabled_agents or [])

        status = "completed"
        try:
            with IOStream.set_default(iostream):
                stages = _get_stage_classes()
                cls = stages[phase_name]
                stage = cls(config_path=effective_config)

                # Remove disabled agents and rebuild the group chat
                if disabled and hasattr(stage, "agents"):
                    stage.agents = [
                        a for a in stage.agents if a.name not in disabled
                    ]
                    if hasattr(stage, "init_group_chat"):
                        stage.init_group_chat()

                    # Update output config so store_json looks for the right agent
                    output_cfg = stage.stage_config.get("output", {})
                    json_agent = output_cfg.get("json_agent", "")
                    if json_agent and json_agent in disabled:
                        output_cfg.pop("json_agent", None)
                        logger.info(
                            "json_agent %s disabled — skipping trace JSON",
                            json_agent,
                        )
                    code_agent = output_cfg.get("code_agent", "")
                    if code_agent and code_agent in disabled:
                        candidates = [
                            a.name for a in stage.agents
                            if "Json" not in a.name
                        ]
                        if candidates:
                            output_cfg["code_agent"] = candidates[-1]

                result = stage.run()
                iostream.finalize()

                self.state.set_phase_result(phase_name, result)
                self._phase_cache[phase_name] = stage

        except Exception as e:
            iostream.finalize()
            if self._stop_event.is_set():
                logger.info("Stage %s was stopped by user", phase_name)
                status = "stopped"
            else:
                logger.exception("Stage %s raised an exception", phase_name)
                status = "failed"
                self.state.set_phase_error(phase_name, str(e))
        finally:
            self._current_phase = None
            self._iostream = None
            if tmp_config:
                try:
                    os.unlink(tmp_config)
                except OSError:
                    pass

        # Only notify if stop_phase() hasn't already done so
        if not self._stop_event.is_set():
            self.state.set_phase_status(phase_name, status)
            iostream.notify_phase_event("phase_complete", status=status,
                                        phase=phase_name)

    def _make_override_config(self, requirements_file: str) -> str:
        """Write a temp config.yaml with the requirements override applied.

        When the temp config is loaded from Temp, Base resolves all paths
        relative to Temp and would break. So we resolve assets_dir, output_dir
        and requirement_file against the original config directory and write
        absolute paths into the temp config; Base then uses them as-is.
        """
        with open(self.config_path, "r", encoding="utf-8") as f:
            config = yaml.safe_load(f)

        config_dir = Path(self.config_path).resolve().parent

        def to_absolute(key: str, default: str) -> None:
            val = config.get(key, default)
            if val and not Path(val).is_absolute():
                config[key] = str((config_dir / val).resolve())

        to_absolute("assets_dir", "assets")
        to_absolute("output_dir", "output")

        req_path = Path(requirements_file)
        if not req_path.is_absolute():
            req_path = (config_dir / req_path).resolve()
        requirement_file_resolved = str(req_path)

        for stage_cfg in config.get("stages", {}).values():
            if "requirement_file" in stage_cfg:
                stage_cfg["requirement_file"] = requirement_file_resolved

        tmp = tempfile.NamedTemporaryFile(
            mode="w", suffix=".yaml", delete=False, encoding="utf-8",
        )
        yaml.safe_dump(config, tmp)
        tmp.close()
        return tmp.name

    # ---- Gradle-based commands (Step 6) -----------------------------------

    def start_command(self, command_id: str, iostream: WebSocketIOStream,
                      loop: asyncio.AbstractEventLoop) -> None:
        """Launch a MALCOMj Gradle task in a background thread."""
        if self.is_running:
            iostream.notify_phase_event(
                "error", message="A stage is already running",
            )
            return

        if command_id not in GRADLE_COMMANDS:
            iostream.notify_phase_event(
                "error", message=f"Unknown command: {command_id}",
            )
            return

        # Check dependency
        cmd_cfg = GRADLE_COMMANDS[command_id]
        needs = cmd_cfg.get("needs")
        if needs:
            output_dir = self._get_output_dir()
            if output_dir and not (output_dir / needs).exists():
                iostream.notify_phase_event(
                    "error",
                    message=f"Prerequisite missing: {needs}. Run the corresponding stage first.",
                )
                return

        self._stop_event.clear()
        self._current_phase = command_id
        self._iostream = iostream
        iostream.phase_name = command_id
        iostream._flush_buffer()
        iostream._current_sender = ""
        self.state.set_phase_status(command_id, "running")

        self._thread = threading.Thread(
            target=self._run_command,
            args=(command_id, iostream, loop),
            daemon=True,
        )
        self._thread.start()

    # Patterns for Gradle noise lines that should be suppressed
    _GRADLE_NOISE = re.compile(
        r"^("
        r"(> Task |:)\S+"
        r"|Downloading\s+http"
        r"|Download\s+http"
        r"|\s*$"
        r"|[\[\]]{1,2}"
        r"|BUILD SUCCESSFUL in"
        r"|[0-9]+ actionable task"
        r"|> Configure project"
        r"|Picked up JAVA_TOOL_OPTIONS"
        r"|WARNING:.*--args"
        r")",
        re.IGNORECASE,
    )

    def _run_command(self, command_id: str, iostream: WebSocketIOStream,
                     loop: asyncio.AbstractEventLoop) -> None:
        """Run a MALCOMj Gradle task and stream output to the WebSocket."""
        cmd_cfg = GRADLE_COMMANDS[command_id]
        label = cmd_cfg["label"]

        # Copy prerequisite JSON files from MALCOMp output to MALCOMj model dir
        self._copy_outputs_to_malcomj()

        gradlew = str(_MALCOMJ_DIR / _GRADLEW)
        cmd = [gradlew, command_id]

        def _sys(text):
            iostream._flush_buffer()
            iostream._current_sender = ""
            iostream._send_json({
                "type": "agent_message",
                "phase": iostream.phase_name,
                "agent": "system",
                "content": text,
            })

        status = "completed"
        try:
            _sys(f"{label} starting...")
            logger.info("Running command: %s", " ".join(cmd))

            proc = subprocess.Popen(
                cmd,
                cwd=str(_MALCOMJ_DIR),
                stdout=subprocess.PIPE,
                stderr=subprocess.STDOUT,
                text=True,
                encoding="utf-8",
                errors="replace",
            )

            error_lines = []
            for line in proc.stdout:
                if self._stop_event.is_set():
                    proc.terminate()
                    break
                stripped = line.rstrip("\n")
                logger.debug("[%s] %s", command_id, stripped)

                if any(kw in stripped.lower() for kw in
                       ("error", "exception", "failed", "fatal", "caused by")):
                    error_lines.append(stripped)

                clean = stripped.strip()
                if clean and not self._GRADLE_NOISE.match(clean):
                    iostream.print(clean, flush=True)

            proc.wait(timeout=30)

            if self._stop_event.is_set():
                status = "stopped"
                _sys(f"{label} stopped by user.")
            elif proc.returncode != 0:
                status = "failed"
                error_summary = "\n".join(error_lines[:10])
                msg = f"{label} failed with exit code {proc.returncode}."
                if error_summary:
                    msg += "\n" + error_summary
                _sys(msg)
            else:
                _sys(f"{label} completed successfully.")

        except Exception as e:
            if self._stop_event.is_set():
                status = "stopped"
            else:
                logger.exception("Command %s raised an exception", command_id)
                status = "failed"
                iostream.print(f"[{label}] Error: {e}", flush=True)
                self.state.set_phase_error(command_id, str(e))
        finally:
            self._current_phase = None
            self._iostream = None

        self.state.set_phase_status(command_id, status)
        iostream.notify_phase_event("phase_complete", status=status,
                                    phase=command_id)

    def _copy_outputs_to_malcomj(self) -> None:
        """Copy MALCOMp output JSON files to MALCOMj's expected model directory."""
        output_dir = self._get_output_dir()
        if not output_dir:
            return

        # MALCOMj expects JSON files at src/main/resources/examples/auv/model/
        target_dir = _MALCOMJ_DIR / "src" / "main" / "resources" / "examples" / "auv" / "model"
        if not target_dir.exists():
            return

        json_files = [
            "result_term_extraction.json",
            "result_dsl_extraction.json",
            "result_model_creation.json",
            "result_statemachine_extraction.json",
        ]
        for name in json_files:
            src = output_dir / name
            if src.exists():
                shutil.copy2(src, target_dir / name)
                logger.info("Copied %s to %s", src, target_dir / name)

    # ---- Stop ---------------------------------------------------------------

    def stop_phase(self) -> None:
        """Request the running phase to stop."""
        if not self.is_running:
            return

        phase_name = self._current_phase
        iostream = self._iostream

        self._stop_event.set()
        if iostream:
            iostream.close()

        # Detach the thread so new phases can start immediately
        self._thread = None
        self._current_phase = None
        self._iostream = None

        if iostream and phase_name:
            self.state.set_phase_status(phase_name, "stopped")
            iostream.notify_phase_event("phase_complete", status="stopped",
                                        phase=phase_name)

    # ---- Refine mode --------------------------------------------------------

    def start_refine(self, phase_name: str, user_message: str,
                     iostream: WebSocketIOStream,
                     loop: asyncio.AbstractEventLoop) -> None:
        """Launch a refine run: re-run a stage with user instructions."""
        if self.is_running:
            iostream.notify_phase_event(
                "error", message="A stage is already running",
            )
            return

        if phase_name not in STAGE_NAMES:
            iostream.notify_phase_event(
                "error", message=f"Unknown stage: {phase_name}",
            )
            return

        self._stop_event.clear()
        self._current_phase = phase_name
        self._iostream = iostream
        iostream.phase_name = phase_name
        iostream._flush_buffer()
        iostream._current_sender = ""
        self.state.set_phase_status(phase_name, "running")

        self._thread = threading.Thread(
            target=self._run_refine,
            args=(phase_name, user_message, iostream, loop),
            daemon=True,
        )
        self._thread.start()

    def _run_refine(self, phase_name: str, user_message: str,
                    iostream: WebSocketIOStream,
                    loop: asyncio.AbstractEventLoop) -> None:
        """Execute a refine run in a background thread."""
        from autogen.io import IOStream

        cached_stage = self._phase_cache.get(phase_name)
        status = "completed"
        try:
            with IOStream.set_default(iostream):
                if cached_stage:
                    result = cached_stage.run(
                        message=f"REFINEMENT REQUEST:\n{user_message}",
                    )
                    iostream.finalize()
                    stage = cached_stage
                else:
                    # No cache — re-create stage with refinement message
                    stages = _get_stage_classes()
                    cls = stages[phase_name]
                    stage = cls(config_path=self.config_path)
                    result = stage.run(
                        message=f"REFINEMENT REQUEST:\n{user_message}",
                    )
                    iostream.finalize()

                self.state.set_phase_result(phase_name, result)
                self._phase_cache[phase_name] = stage

        except Exception as e:
            iostream.finalize()
            if self._stop_event.is_set():
                status = "stopped"
            else:
                logger.exception("Refine %s raised an exception", phase_name)
                status = "failed"
                self.state.set_phase_error(phase_name, str(e))
        finally:
            self._current_phase = None
            self._iostream = None

        if not self._stop_event.is_set():
            self.state.set_phase_status(phase_name, status)
            iostream.notify_phase_event("phase_complete", status=status,
                                        phase=phase_name)

    # ---- Helpers ------------------------------------------------------------

    def _get_output_dir(self) -> Path | None:
        """Get the output directory from the active config."""
        try:
            with open(self.config_path, "r", encoding="utf-8") as f:
                config = yaml.safe_load(f)
            config_dir = Path(self.config_path).resolve().parent
            rel = config.get("output_dir", "output")
            return config_dir / rel
        except Exception:
            return None
