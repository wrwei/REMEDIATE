"""FastAPI server: REST endpoints + WebSocket for real-time REMEDIATE pipeline UI."""
from __future__ import annotations

import asyncio
import logging
import sys
from pathlib import Path

import json as _json
import yaml
from fastapi import FastAPI, WebSocket, WebSocketDisconnect
from fastapi.responses import FileResponse, JSONResponse
from fastapi.staticfiles import StaticFiles

from web.bridge import (
    PipelineBridge, STAGE_NAMES, STAGE_AGENTS, PIPELINE_STRUCTURE,
    GRADLE_COMMANDS, _STAGE_CONFIG_KEY,
)
from web.iostream import WebSocketIOStream
from web.state import SessionState

logger = logging.getLogger(__name__)

MALCOMP_DIR = Path(__file__).resolve().parent.parent
STATIC_DIR = Path(__file__).resolve().parent / "static"
DEFAULT_CONFIG = MALCOMP_DIR / "examples" / "auv" / "config.yaml"

# Ensure MALCOMp root is importable
if str(MALCOMP_DIR) not in sys.path:
    sys.path.insert(0, str(MALCOMP_DIR))

app = FastAPI(title="REMEDIATE Pipeline UI")

# Serve static assets (CSS, JS)
app.mount("/static", StaticFiles(directory=str(STATIC_DIR)), name="static")

# Module-level persistent session state
_SESSION_FILE = MALCOMP_DIR / "output" / ".session.json"
_state = SessionState(persist_path=_SESSION_FILE)


def _active_config() -> str:
    """Return the path to the currently selected config.yaml."""
    cs = _state.get_selected_case_study()
    if cs and Path(cs).exists():
        return cs
    return str(DEFAULT_CONFIG)


def _config_dir() -> Path:
    return Path(_active_config()).resolve().parent


def _output_dir() -> Path:
    try:
        with open(_active_config(), encoding="utf-8") as f:
            config = yaml.safe_load(f)
        return _config_dir() / config.get("output_dir", "output")
    except Exception:
        return _config_dir() / "output"


# ---------- REST endpoints ------------------------------------------------

@app.get("/")
async def index():
    """Serve the main HTML page."""
    return FileResponse(
        str(STATIC_DIR / "index.html"),
        headers={"Cache-Control": "no-cache, no-store, must-revalidate"},
    )


@app.get("/api/config")
async def get_config():
    """Return the current config.yaml."""
    with open(_active_config(), encoding="utf-8") as f:
        return yaml.safe_load(f)


@app.get("/api/case-studies")
async def list_case_studies():
    """List available case studies (each has a config.yaml in examples/)."""
    examples_dir = MALCOMP_DIR / "examples"
    studies = []
    if examples_dir.exists():
        for d in sorted(examples_dir.iterdir()):
            config = d / "config.yaml"
            if config.exists():
                studies.append({
                    "name": d.name,
                    "config_path": str(config),
                })
    return {"case_studies": studies}


@app.get("/api/stages")
async def get_stages():
    """Return stage names and agent rosters."""
    return {"stages": STAGE_NAMES, "agents": STAGE_AGENTS}


@app.get("/api/requirements")
async def list_requirements():
    """List requirement JSON files from the active case study."""
    assets_dir = _config_dir() / "assets"
    files = []
    if assets_dir.exists():
        for f in sorted(assets_dir.glob("requirement_*.json")):
            files.append({
                "path": str(f.relative_to(_config_dir())),
                "name": f.stem,
            })
    return {"files": files}


@app.get("/api/req-files/{path:path}")
async def get_requirement_file_content(path: str):
    """Return content of a requirement JSON file."""
    full = (_config_dir() / path).resolve()
    assets_root = (_config_dir() / "assets").resolve()
    if not str(full).startswith(str(assets_root)):
        return JSONResponse({"error": "invalid path"}, status_code=400)
    if not full.exists() or not full.is_file():
        return JSONResponse({"error": "not found"}, status_code=404)
    try:
        content = full.read_text(encoding="utf-8")
    except UnicodeDecodeError:
        return JSONResponse({"error": "binary file"}, status_code=400)
    return {"path": path, "content": content}


@app.get("/api/files")
async def list_output_files():
    """List files in the output directory."""
    out = _output_dir()
    if not out.exists():
        return {"files": []}
    files = []
    for f in sorted(out.rglob("*")):
        if f.is_file() and not f.name.startswith("."):
            files.append({
                "path": str(f.relative_to(out)).replace("\\", "/"),
                "size": f.stat().st_size,
            })
    return {"files": files}


@app.get("/api/files/{path:path}")
async def get_file_content(path: str):
    """Return content of a specific output file."""
    out = _output_dir()
    full = (out / path).resolve()
    if not str(full).startswith(str(out.resolve())):
        return JSONResponse({"error": "invalid path"}, status_code=400)
    if not full.exists() or not full.is_file():
        return JSONResponse({"error": "not found"}, status_code=404)
    try:
        content = full.read_text(encoding="utf-8")
    except UnicodeDecodeError:
        return JSONResponse({"error": "binary file"}, status_code=400)
    return {"path": path, "content": content}


@app.get("/api/task-files/{task}")
async def list_task_files(task: str):
    """Return output files belonging to a specific stage."""
    out = _output_dir()
    files: list[str] = []

    if task in STAGE_NAMES:
        # LLM-based stage — find outputs from config
        config_key = _STAGE_CONFIG_KEY.get(task, task)
        try:
            with open(_active_config(), encoding="utf-8") as f:
                config = yaml.safe_load(f)
            stage_cfg = config.get("stages", {}).get(config_key, {})
            out_cfg = stage_cfg.get("output", {})

            json_file = out_cfg.get("json_file")
            code_file = out_cfg.get("code_file")

            if json_file and (out / json_file).exists():
                files.append(json_file)
            if code_file and (out / code_file).exists():
                files.append(code_file)
        except Exception:
            pass
    elif task in GRADLE_COMMANDS:
        # Gradle command — currently no separate output dir tracking
        pass

    # Fallback: if no specific files found, list all output files
    if not files and out.exists():
        for f in sorted(out.rglob("*")):
            if f.is_file() and not f.name.startswith("."):
                files.append(str(f.relative_to(out)).replace("\\", "/"))

    return {"task": task, "files": files}


# ---------- WebSocket endpoint --------------------------------------------

@app.websocket("/ws")
async def websocket_endpoint(ws: WebSocket):
    """Handle real-time communication with the browser."""
    await ws.accept()
    loop = asyncio.get_running_loop()
    config_path = _active_config()
    bridge = PipelineBridge(config_path, _state)
    iostream = WebSocketIOStream(ws, loop, state=_state)

    try:
        # Build requirements list
        req_files = []
        assets_dir = _config_dir() / "assets"
        if assets_dir.exists():
            for f in sorted(assets_dir.glob("requirement_*.json")):
                req_files.append({
                    "path": str(f.relative_to(_config_dir())),
                    "name": f.stem,
                })

        # Build case studies list
        examples_dir = MALCOMP_DIR / "examples"
        case_studies = []
        if examples_dir.exists():
            for d in sorted(examples_dir.iterdir()):
                config = d / "config.yaml"
                if config.exists():
                    case_studies.append({
                        "name": d.name,
                        "config_path": str(config),
                    })

        # Check which output files exist (for dependency indicators)
        out = _output_dir()
        existing_outputs = []
        if out.exists():
            for f in out.rglob("*"):
                if f.is_file():
                    existing_outputs.append(
                        str(f.relative_to(out)).replace("\\", "/")
                    )

        # Send initial state
        await ws.send_json({
            "type": "connected",
            "stages": STAGE_NAMES,
            "agents": STAGE_AGENTS,
            "pipeline": PIPELINE_STRUCTURE,
            "requirements": req_files,
            "case_studies": case_studies,
            "selected_requirement": _state.get_selected_requirement(),
            "selected_case_study": _state.get_selected_case_study() or str(DEFAULT_CONFIG),
            "history": _state.get_messages(),
            "phase_statuses": _state.get_phase_statuses(),
            "gradle_commands": GRADLE_COMMANDS,
            "existing_outputs": existing_outputs,
        })

        while True:
            data = await ws.receive_json()
            msg_type = data.get("type")

            if msg_type == "select_requirement":
                path = data.get("path", "")
                _state.set_selected_requirement(path)
                _state.save()

            elif msg_type == "select_case_study":
                config_path = data.get("config_path", "")
                _state.set_selected_case_study(config_path)
                _state.save()
                # Stop any running phase before switching
                bridge.stop_phase()
                # Reinitialize bridge with new config
                bridge = PipelineBridge(config_path, _state)
                # Send updated requirements list
                new_config_dir = Path(config_path).resolve().parent
                new_assets = new_config_dir / "assets"
                new_reqs = []
                if new_assets.exists():
                    for f in sorted(new_assets.glob("requirement_*.json")):
                        new_reqs.append({
                            "path": str(f.relative_to(new_config_dir)),
                            "name": f.stem,
                        })
                await ws.send_json({
                    "type": "case_study_changed",
                    "config_path": config_path,
                    "requirements": new_reqs,
                })

            elif msg_type == "start_phase":
                phase_name = data.get("phase", "")
                requirements = data.get("requirements") or _state.get_selected_requirement() or None
                disabled = data.get("disabled_agents", [])
                bridge.start_phase(phase_name, iostream, loop,
                                   requirements_override=requirements,
                                   disabled_agents=disabled)

            elif msg_type == "start_command":
                command_id = data.get("command", "")
                bridge.start_command(command_id, iostream, loop)

            elif msg_type == "refine":
                phase_name = data.get("phase", "")
                user_message = data.get("message", "")
                bridge.start_refine(phase_name, user_message, iostream, loop)

            elif msg_type == "stop_phase":
                bridge.stop_phase()

            elif msg_type == "user_input":
                iostream.provide_input(data.get("content", ""))

            elif msg_type == "list_files":
                task_filter = data.get("task")
                out = _output_dir()
                files: list[str] = []

                if task_filter and task_filter in STAGE_NAMES:
                    config_key = _STAGE_CONFIG_KEY.get(task_filter, task_filter)
                    try:
                        with open(_active_config(), encoding="utf-8") as cf:
                            cfg = yaml.safe_load(cf)
                        stage_cfg = cfg.get("stages", {}).get(config_key, {})
                        out_cfg = stage_cfg.get("output", {})
                        json_file = out_cfg.get("json_file")
                        code_file = out_cfg.get("code_file")
                        if json_file and (out / json_file).exists():
                            files.append(json_file)
                        if code_file and (out / code_file).exists():
                            files.append(code_file)
                    except Exception:
                        pass
                elif out.exists():
                    for f in sorted(out.rglob("*")):
                        if f.is_file() and not f.name.startswith("."):
                            files.append(
                                str(f.relative_to(out)).replace("\\", "/")
                            )

                await ws.send_json({
                    "type": "file_list",
                    "task": task_filter or "",
                    "files": files,
                })

            elif msg_type == "clear_output":
                task_filter = data.get("task")
                out = _output_dir()
                try:
                    count = 0
                    if task_filter and task_filter in STAGE_NAMES:
                        config_key = _STAGE_CONFIG_KEY.get(task_filter, task_filter)
                        with open(_active_config(), encoding="utf-8") as cf:
                            cfg = yaml.safe_load(cf)
                        stage_cfg = cfg.get("stages", {}).get(config_key, {})
                        out_cfg = stage_cfg.get("output", {})
                        for key in ("json_file", "code_file"):
                            fname = out_cfg.get(key)
                            if fname and (out / fname).exists():
                                (out / fname).unlink()
                                count += 1
                        _state.set_phase_status(task_filter, "idle")
                    else:
                        if out.exists():
                            for f in list(out.rglob("*")):
                                if f.is_file():
                                    f.unlink()
                                    count += 1
                            for d in sorted(out.rglob("*"), reverse=True):
                                if d.is_dir():
                                    try:
                                        d.rmdir()
                                    except OSError:
                                        pass
                        _state.reset()

                    await ws.send_json({
                        "type": "clear_result",
                        "status": "ok",
                        "count": count,
                        "task": task_filter or "",
                    })
                except Exception as exc:
                    logger.exception("Clear output failed")
                    await ws.send_json({
                        "type": "clear_result",
                        "status": "error",
                        "message": str(exc),
                    })

    except WebSocketDisconnect:
        logger.info("WebSocket client disconnected")
    finally:
        iostream.close()
