"""WebSocket-backed IOStream for bridging pyautogen agents to a browser UI.

Thread-safety: print() is called from the pipeline thread; the WebSocket
send is dispatched to the FastAPI async event loop via
asyncio.run_coroutine_threadsafe().  input() blocks the pipeline thread
until the async WebSocket handler receives user input.
"""
from __future__ import annotations

import asyncio
import logging
import re
import threading
from typing import Any

logger = logging.getLogger(__name__)

# pyautogen wraps agent names in ANSI yellow: \x1b[33mName\x1b[0m (to Recipient):
_AGENT_HEADER_RE = re.compile(
    r"(?:\x1b\[\d+m)?(\w+)(?:\x1b\[0m)? \(to (?:\x1b\[\d+m)?(\w+)(?:\x1b\[0m)?\):"
)

# Strip all ANSI escape codes for content matching
_ANSI_RE = re.compile(r"\x1b\[[0-9;]*m")


class WebSocketIOStream:
    """IOStream implementation that routes agent I/O through a WebSocket.

    Implements the autogen.io.IOStream protocol (print + input).
    """

    def __init__(self, websocket: Any, loop: asyncio.AbstractEventLoop,
                 phase_name: str = "", state: Any = None):
        self._ws = websocket
        self._loop = loop
        self.phase_name = phase_name
        self._state = state  # SessionState for persistent chat log

        # Synchronisation for input()
        self._input_event = threading.Event()
        self._input_value = ""

        # Message accumulation state
        self._current_sender = ""
        self._buffer: list[str] = []

        # Flag set when the WebSocket is closed
        self._closed = False

    # ---- IOStream.print() ------------------------------------------------

    def print(self, *objects: Any, sep: str = " ", end: str = "\n",
              flush: bool = False) -> None:
        """Intercept pyautogen print calls and forward to the browser."""
        if self._closed:
            raise InterruptedError("Stream closed — phase stopped")
        text = sep.join(str(o) for o in objects) + end

        for line in text.splitlines():
            stripped = line.strip()
            if not stripped:
                continue

            # Check for agent header (e.g. "Term_Extractor (to chat_manager):")
            match = _AGENT_HEADER_RE.match(stripped)
            if match:
                # Flush whatever we had from the previous agent
                self._flush_buffer()
                self._current_sender = match.group(1)
                # Notify the browser which agent is now working
                self._send_json({
                    "type": "agent_working",
                    "phase": self.phase_name,
                    "agent": self._current_sender,
                })
                continue

            # Skip ANSI separator lines (dashes)
            if re.fullmatch(r"[\-\x1b\[\dm]+", stripped):
                continue

            # Skip pyautogen internal "Next speaker:" messages, but
            # extract the agent name and notify the browser
            plain = _ANSI_RE.sub("", stripped)
            if plain.startswith("Next speaker:"):
                next_agent = plain.split(":", 1)[1].strip()
                self._send_json({
                    "type": "agent_working",
                    "phase": self.phase_name,
                    "agent": next_agent,
                })
                continue

            self._buffer.append(stripped)

            # Stream each line immediately for live display in the browser
            self._send_json({
                "type": "agent_stream",
                "phase": self.phase_name,
                "agent": self._current_sender or "system",
                "content": stripped,
            })

        if flush:
            self._flush_buffer()

    def _flush_buffer(self) -> None:
        """Send accumulated lines as a single agent message."""
        if not self._buffer:
            return
        content = "\n".join(self._buffer)
        self._buffer.clear()
        sender = self._current_sender or "system"
        msg = {
            "type": "agent_message",
            "phase": self.phase_name,
            "agent": sender,
            "content": content,
        }
        self._send_json(msg)
        # Persist to session state
        if self._state:
            self._state.add_message(msg)
            self._state.save()

    # ---- IOStream.input() ------------------------------------------------

    def input(self, prompt: str = "", *, password: bool = False) -> str:
        """Block the pipeline thread until the browser user provides input."""
        # Flush any pending output first
        self._flush_buffer()

        self._send_json({
            "type": "input_request",
            "phase": self.phase_name,
            "prompt": prompt,
        })

        # Block until provide_input() is called from the async handler
        self._input_event.clear()
        self._input_event.wait()
        return self._input_value

    def provide_input(self, value: str) -> None:
        """Called by the async WebSocket handler when user input arrives."""
        self._input_value = value
        self._input_event.set()

    def finalize(self) -> None:
        """Flush any remaining buffered content (call at end of phase)."""
        self._flush_buffer()

    # ---- Notification helpers --------------------------------------------

    def notify_phase_event(self, event_type: str, **kwargs: Any) -> None:
        """Send a structured event to the browser (phase_complete, error, etc.).

        This bypasses the _closed flag so completion/error events are always
        delivered even after stop_phase() closes the stream.
        """
        msg = {"type": event_type, "phase": self.phase_name}
        msg.update(kwargs)
        self._send_json(msg, force=True)
        # Persist phase completion as a system message
        if self._state and event_type == "phase_complete":
            status = kwargs.get("status", "completed")
            phase = kwargs.get("phase", self.phase_name)
            self._state.add_message({
                "type": "system",
                "content": f'Stage "{phase}" {status}.',
            })
            self._state.save()

    # ---- Low-level WebSocket send ----------------------------------------

    def _send_json(self, msg: dict, *, force: bool = False) -> None:
        """Dispatch a JSON message to the WebSocket from any thread.

        If *force* is True, attempt delivery even when the stream is closed
        (used by notify_phase_event so completion events always reach the UI).
        """
        if self._closed and not force:
            return
        try:
            future = asyncio.run_coroutine_threadsafe(
                self._ws.send_json(msg), self._loop,
            )
            future.result(timeout=5)
        except Exception:
            logger.debug("WebSocket send failed (client may have disconnected)")

    def close(self) -> None:
        """Mark the stream as closed so pending sends are skipped."""
        self._closed = True
        # Unblock any waiting input() call
        self._input_value = "exit"
        self._input_event.set()
