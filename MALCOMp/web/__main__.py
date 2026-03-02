"""Launch the REMEDIATE Pipeline Web UI.

Usage:
    cd MALCOMp
    python -m web
"""
import uvicorn

uvicorn.run("web.server:app", host="0.0.0.0", port=8000, reload=True)
