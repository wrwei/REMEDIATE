/* REMEDIATE Pipeline UI — Client-side logic */
"use strict";

// ---------------------------------------------------------------------------
// Helpers
// ---------------------------------------------------------------------------
function wsSend(obj) {
    if (ws && ws.readyState === WebSocket.OPEN) {
        ws.send(JSON.stringify(obj));
        return true;
    }
    return false;
}

// ---------------------------------------------------------------------------
// State
// ---------------------------------------------------------------------------
var ws = null;
var autoScroll = true;
var stageAgents = {};
var taskStatuses = {};
var selectedTask = null;
var selectedRequirement = "";
var requirementFiles = [];
var caseStudies = [];
var selectedCaseStudy = "";
var gradleCommands = {};
var existingOutputs = [];
var pipelineStructure = [];

// Working indicator
var workingTimerId = null;
var workingStartTime = null;
var currentWorkingAgent = "";

// Live streaming
var liveStreamEl = null;
var liveStreamAgent = "";

// ---------------------------------------------------------------------------
// WebSocket connection
// ---------------------------------------------------------------------------
function connect() {
    var proto = location.protocol === "https:" ? "wss:" : "ws:";
    ws = new WebSocket(proto + "//" + location.host + "/ws");

    ws.onopen = function () {
        document.getElementById("connection-status").textContent = "Connected";
        document.getElementById("connection-status").className = "connected";
    };

    ws.onclose = function () {
        document.getElementById("connection-status").textContent = "Disconnected";
        document.getElementById("connection-status").className = "disconnected";
        hideWorkingIndicator();
        setTimeout(connect, 2000);
    };

    ws.onmessage = function (event) {
        handleMessage(JSON.parse(event.data));
    };
}

// ---------------------------------------------------------------------------
// Message handler
// ---------------------------------------------------------------------------
function handleMessage(msg) {
    switch (msg.type) {
        case "connected":
            stageAgents = msg.agents || {};
            pipelineStructure = msg.pipeline || [];
            requirementFiles = msg.requirements || [];
            caseStudies = msg.case_studies || [];
            selectedCaseStudy = msg.selected_case_study || "";
            selectedRequirement = msg.selected_requirement || "";
            gradleCommands = msg.gradle_commands || {};
            existingOutputs = msg.existing_outputs || [];
            taskStatuses = msg.phase_statuses || {};

            populateCaseStudies();
            renderPipelineTree();

            // Replay chat history
            var history = msg.history || [];
            for (var i = 0; i < history.length; i++) {
                var m = history[i];
                if (m.type === "agent_message") {
                    addAgentMessage(m.agent, m.content, m.phase, true);
                } else if (m.type === "system") {
                    addSystemMessage(m.content);
                }
            }
            break;

        case "agent_message":
            finalizeLiveStream();
            addAgentMessage(msg.agent, msg.content, msg.phase);
            break;

        case "agent_stream":
            handleAgentStream(msg.agent, msg.content, msg.phase);
            break;

        case "agent_working":
            showWorkingIndicator(msg.agent);
            break;

        case "input_request":
            showInputPrompt(msg.prompt);
            break;

        case "phase_complete":
            finalizeLiveStream();
            hideWorkingIndicator();
            taskStatuses[msg.phase] = msg.status || "completed";
            updateStatusDots();
            addSystemMessage(
                'Stage "' + msg.phase + '" ' + (msg.status || "completed") + "."
            );
            // Refresh file list if this is the selected task
            if (selectedTask === msg.phase) {
                requestFileList(msg.phase);
            }
            // Refresh existing outputs for dependency checks
            refreshExistingOutputs();
            break;

        case "error":
            addSystemMessage(msg.message, true);
            hideWorkingIndicator();
            break;

        case "file_list":
            renderFileList(msg.files || [], msg.task);
            break;

        case "clear_result":
            if (msg.status === "ok") {
                addSystemMessage("Cleared " + msg.count + " file(s).");
                if (selectedTask) requestFileList(selectedTask);
            } else {
                addSystemMessage("Clear failed: " + msg.message, true);
            }
            break;

        case "case_study_changed":
            requirementFiles = msg.requirements || [];
            renderPipelineTree();
            addSystemMessage("Switched case study. Requirements updated.");
            break;
    }
}

// ---------------------------------------------------------------------------
// Case study selector
// ---------------------------------------------------------------------------
function populateCaseStudies() {
    var select = document.getElementById("case-study-select");
    select.innerHTML = "";
    for (var i = 0; i < caseStudies.length; i++) {
        var opt = document.createElement("option");
        opt.value = caseStudies[i].config_path;
        opt.textContent = caseStudies[i].name.toUpperCase();
        if (caseStudies[i].config_path === selectedCaseStudy) opt.selected = true;
        select.appendChild(opt);
    }
    select.onchange = function () {
        wsSend({
            type: "select_case_study",
            config_path: select.value,
        });
        selectedCaseStudy = select.value;
    };
}

// ---------------------------------------------------------------------------
// Pipeline tree rendering
// ---------------------------------------------------------------------------
function renderPipelineTree() {
    var root = document.getElementById("pipeline-tree");
    root.innerHTML = "";

    for (var i = 0; i < pipelineStructure.length; i++) {
        var step = pipelineStructure[i];
        var node = createStepNode(step);
        root.appendChild(node);
    }
}

function createStepNode(step) {
    var div = document.createElement("div");
    div.className = "tree-step";

    // Header
    var header = document.createElement("div");
    header.className = "tree-step-header";

    var arrow = document.createElement("span");
    arrow.className = "arrow";
    arrow.textContent = "\u25B6";

    var label = document.createElement("span");
    label.className = "step-label";
    label.textContent = step.label;

    // Aggregate status dot for LLM steps
    var dot = document.createElement("span");
    dot.className = "status-dot";
    dot.setAttribute("data-step-id", step.id);
    if (step.tasks && step.tasks.length > 0) {
        var st = taskStatuses[step.tasks[0]] || "idle";
        dot.classList.add(st);
    }

    header.appendChild(arrow);
    header.appendChild(label);
    header.appendChild(dot);
    div.appendChild(header);

    // Children container
    var children = document.createElement("div");
    children.className = "tree-step-children";

    if (step.type === "manual") {
        // Step 1: Requirement files
        for (var r = 0; r < requirementFiles.length; r++) {
            children.appendChild(createRequirementItem(requirementFiles[r]));
        }
    } else if (step.type === "llm") {
        // Steps 2-5: Tasks with agents
        for (var t = 0; t < step.tasks.length; t++) {
            children.appendChild(createTaskNode(step.tasks[t]));
        }
    } else if (step.type === "gradle") {
        // Step 6: Gradle commands
        var cmds = step.commands || [];
        for (var c = 0; c < cmds.length; c++) {
            children.appendChild(createGradleCommandNode(cmds[c]));
        }
    }

    div.appendChild(children);

    // Toggle expand/collapse
    header.onclick = function () {
        var isExpanded = children.classList.contains("expanded");
        if (isExpanded) {
            children.classList.remove("expanded");
            arrow.classList.remove("expanded");
        } else {
            children.classList.add("expanded");
            arrow.classList.add("expanded");
        }
    };

    // Auto-expand first 3 steps by default
    if (step.type === "manual" || step.type === "llm") {
        children.classList.add("expanded");
        arrow.classList.add("expanded");
    }

    return div;
}

function createRequirementItem(req) {
    var div = document.createElement("div");
    div.className = "req-item";
    if (req.path === selectedRequirement) div.classList.add("selected");

    var icon = document.createElement("span");
    icon.textContent = "\uD83D\uDCC4";
    icon.style.fontSize = "11px";

    var name = document.createElement("span");
    name.textContent = req.name;

    div.appendChild(icon);
    div.appendChild(name);

    div.onclick = function () {
        selectedRequirement = req.path;
        wsSend({ type: "select_requirement", path: req.path });
        // Update UI
        var items = document.querySelectorAll(".req-item");
        for (var j = 0; j < items.length; j++) items[j].classList.remove("selected");
        div.classList.add("selected");
        // Load file preview
        loadRequirementPreview(req.path);
    };

    return div;
}

function createTaskNode(taskName) {
    var div = document.createElement("div");
    div.className = "tree-task";

    var header = document.createElement("div");
    header.className = "tree-task-header";
    header.setAttribute("data-task", taskName);
    if (selectedTask === taskName) header.classList.add("selected");

    var taskLabel = document.createElement("span");
    taskLabel.className = "task-name";
    taskLabel.textContent = taskName;

    var dot = document.createElement("span");
    dot.className = "status-dot";
    dot.setAttribute("data-task-dot", taskName);
    var st = taskStatuses[taskName] || "idle";
    dot.classList.add(st);

    var startBtn = document.createElement("button");
    startBtn.className = "action-btn";
    startBtn.textContent = "Start";
    startBtn.onclick = function (e) {
        e.stopPropagation();
        startTask(taskName);
    };

    var stopBtn = document.createElement("button");
    stopBtn.className = "action-btn stop-btn";
    stopBtn.textContent = "Stop";
    stopBtn.onclick = function (e) {
        e.stopPropagation();
        wsSend({ type: "stop_phase" });
    };

    header.appendChild(taskLabel);
    header.appendChild(dot);
    header.appendChild(startBtn);
    header.appendChild(stopBtn);
    div.appendChild(header);

    // Click task name to select and load files
    taskLabel.style.cursor = "pointer";
    taskLabel.onclick = function (e) {
        e.stopPropagation();
        selectTask(taskName);
    };

    // Agent toggles
    var agents = stageAgents[taskName] || [];
    for (var a = 0; a < agents.length; a++) {
        div.appendChild(createAgentToggle(taskName, agents[a], a === 0));
    }

    return div;
}

function createAgentToggle(taskName, agentName, isFirst) {
    var div = document.createElement("div");
    div.className = "agent-toggle";

    // Use task-scoped ID to avoid duplicates (e.g. Json_Generator in dsl vs model)
    var cbId = "agent-" + taskName + "-" + agentName;
    var cb = document.createElement("input");
    cb.type = "checkbox";
    cb.checked = true;
    cb.id = cbId;
    if (isFirst) {
        cb.disabled = true;
        div.classList.add("disabled");
    }

    var lbl = document.createElement("label");
    lbl.htmlFor = cbId;
    lbl.textContent = agentName;

    div.appendChild(cb);
    div.appendChild(lbl);

    if (isFirst) {
        var tag = document.createElement("span");
        tag.className = "required-tag";
        tag.textContent = "(required)";
        div.appendChild(tag);
    }

    return div;
}

function createGradleCommandNode(cmdId) {
    var div = document.createElement("div");
    div.className = "gradle-cmd";

    var cmd = gradleCommands[cmdId] || {};
    var needs = cmd.needs || null;
    var hasDep = needs ? existingOutputs.indexOf(needs) === -1 : false;

    var label = document.createElement("span");
    label.className = "cmd-label";
    if (hasDep) label.classList.add("has-dep-missing");
    label.textContent = cmd.label || cmdId;

    var dot = document.createElement("span");
    dot.className = "status-dot";
    dot.setAttribute("data-task-dot", cmdId);
    var st = taskStatuses[cmdId] || "idle";
    dot.classList.add(st);

    var startBtn = document.createElement("button");
    startBtn.className = "action-btn";
    startBtn.textContent = "Run";
    startBtn.disabled = hasDep;
    startBtn.onclick = function (e) {
        e.stopPropagation();
        wsSend({ type: "start_command", command: cmdId });
    };

    div.appendChild(label);
    if (hasDep) {
        var tag = document.createElement("span");
        tag.className = "dep-tag";
        tag.textContent = "needs " + needs;
        div.appendChild(tag);
    }
    div.appendChild(dot);
    div.appendChild(startBtn);

    return div;
}

// ---------------------------------------------------------------------------
// Task selection
// ---------------------------------------------------------------------------
function selectTask(taskName) {
    selectedTask = taskName;
    // Update UI
    var headers = document.querySelectorAll(".tree-task-header");
    for (var i = 0; i < headers.length; i++) {
        headers[i].classList.remove("selected");
        if (headers[i].getAttribute("data-task") === taskName) {
            headers[i].classList.add("selected");
        }
    }
    document.getElementById("file-panel-title").textContent = taskName + " \u2014 Output Files";
    requestFileList(taskName);
}

function startTask(taskName) {
    // Collect disabled agents (using task-scoped checkbox IDs)
    var agents = stageAgents[taskName] || [];
    var disabled = [];
    for (var i = 0; i < agents.length; i++) {
        var cb = document.getElementById("agent-" + taskName + "-" + agents[i]);
        if (cb && !cb.checked) disabled.push(agents[i]);
    }
    wsSend({
        type: "start_phase",
        phase: taskName,
        requirements: selectedRequirement,
        disabled_agents: disabled,
    });
    taskStatuses[taskName] = "running";
    updateStatusDots();
}

// ---------------------------------------------------------------------------
// Status dot updates
// ---------------------------------------------------------------------------
function updateStatusDots() {
    // Update task dots
    var dots = document.querySelectorAll("[data-task-dot]");
    for (var i = 0; i < dots.length; i++) {
        var task = dots[i].getAttribute("data-task-dot");
        var st = taskStatuses[task] || "idle";
        dots[i].className = "status-dot " + st;
    }
    // Update step dots (aggregate from tasks)
    for (var s = 0; s < pipelineStructure.length; s++) {
        var step = pipelineStructure[s];
        var stepDot = document.querySelector('[data-step-id="' + step.id + '"]');
        if (!stepDot) continue;
        if (step.tasks && step.tasks.length > 0) {
            var sts = taskStatuses[step.tasks[0]] || "idle";
            stepDot.className = "status-dot " + sts;
        }
    }
}

// ---------------------------------------------------------------------------
// Chat — agent messages
// ---------------------------------------------------------------------------
function addAgentMessage(agent, content, phase, isReplay) {
    var container = document.getElementById("chat-messages");
    var div = document.createElement("div");
    div.className = "message";
    div.setAttribute("data-agent", agent);

    var nameEl = document.createElement("div");
    nameEl.className = "agent-name";
    nameEl.textContent = agent;

    var contentEl = document.createElement("div");
    contentEl.className = "msg-content";

    // Try to format JSON
    var formatted = tryFormatJson(content);
    if (formatted) {
        contentEl.innerHTML = formatted;
    } else {
        contentEl.textContent = content;
    }

    div.appendChild(nameEl);
    div.appendChild(contentEl);
    container.appendChild(div);

    if (!isReplay) scrollToBottom();
}

function addSystemMessage(text, isError) {
    var container = document.getElementById("chat-messages");
    var div = document.createElement("div");
    div.className = "system-msg";
    if (isError) div.classList.add("error");
    div.textContent = text;
    container.appendChild(div);
    scrollToBottom();
}

// ---------------------------------------------------------------------------
// Chat — live streaming
// ---------------------------------------------------------------------------
function handleAgentStream(agent, content, phase) {
    if (!liveStreamEl || liveStreamAgent !== agent) {
        finalizeLiveStream();
        // Create new live element
        var container = document.getElementById("chat-messages");
        liveStreamEl = document.createElement("div");
        liveStreamEl.className = "message";
        liveStreamEl.setAttribute("data-agent", agent);
        liveStreamAgent = agent;

        var nameEl = document.createElement("div");
        nameEl.className = "agent-name";
        nameEl.textContent = agent;

        var contentEl = document.createElement("div");
        contentEl.className = "msg-content";

        liveStreamEl.appendChild(nameEl);
        liveStreamEl.appendChild(contentEl);
        container.appendChild(liveStreamEl);
    }

    var msgContent = liveStreamEl.querySelector(".msg-content");
    if (msgContent.textContent) {
        msgContent.textContent += "\n" + content;
    } else {
        msgContent.textContent = content;
    }
    scrollToBottom();
}

function finalizeLiveStream() {
    if (liveStreamEl) {
        // Try JSON formatting on finalized content
        var msgContent = liveStreamEl.querySelector(".msg-content");
        if (msgContent) {
            var formatted = tryFormatJson(msgContent.textContent);
            if (formatted) msgContent.innerHTML = formatted;
        }
    }
    liveStreamEl = null;
    liveStreamAgent = "";
}

// ---------------------------------------------------------------------------
// JSON formatting helper
// ---------------------------------------------------------------------------
function tryFormatJson(text) {
    if (!text) return null;
    var trimmed = text.trim();
    // Try to detect JSON (starts with { or [)
    if ((trimmed.charAt(0) === "{" || trimmed.charAt(0) === "[") &&
        (trimmed.charAt(trimmed.length - 1) === "}" || trimmed.charAt(trimmed.length - 1) === "]")) {
        try {
            var parsed = JSON.parse(trimmed);
            var pretty = JSON.stringify(parsed, null, 2);
            return '<div class="json-block">' + escapeHtml(pretty) + "</div>";
        } catch (e) {
            // Not valid JSON — fall through
        }
    }
    return null;
}

function escapeHtml(text) {
    var div = document.createElement("div");
    div.textContent = text;
    return div.innerHTML;
}

// ---------------------------------------------------------------------------
// Working indicator
// ---------------------------------------------------------------------------
function showWorkingIndicator(agent) {
    currentWorkingAgent = agent;
    workingStartTime = Date.now();
    var el = document.getElementById("working-indicator");
    el.classList.add("active");
    updateWorkingText();

    if (workingTimerId) clearInterval(workingTimerId);
    workingTimerId = setInterval(updateWorkingText, 1000);
}

function hideWorkingIndicator() {
    var el = document.getElementById("working-indicator");
    el.classList.remove("active");
    if (workingTimerId) {
        clearInterval(workingTimerId);
        workingTimerId = null;
    }
}

function updateWorkingText() {
    var el = document.getElementById("working-text");
    var elapsed = "";
    if (workingStartTime) {
        var secs = Math.floor((Date.now() - workingStartTime) / 1000);
        elapsed = " (" + secs + "s)";
    }
    el.textContent = currentWorkingAgent + " working\u2026" + elapsed;
}

// ---------------------------------------------------------------------------
// Input prompt
// ---------------------------------------------------------------------------
function showInputPrompt(prompt) {
    var el = document.getElementById("input-prompt");
    el.textContent = prompt || "Agent is waiting for input\u2026";
    el.classList.add("active");
}

function hideInputPrompt() {
    var el = document.getElementById("input-prompt");
    el.classList.remove("active");
}

// ---------------------------------------------------------------------------
// User input (send button / Enter key)
// ---------------------------------------------------------------------------
document.getElementById("send-btn").onclick = sendUserInput;
document.getElementById("user-input").onkeydown = function (e) {
    if (e.key === "Enter" && !e.shiftKey) {
        e.preventDefault();
        sendUserInput();
    }
};

function sendUserInput() {
    var textarea = document.getElementById("user-input");
    var text = textarea.value.trim();
    if (!text) return;

    // If input was requested, provide it
    var promptEl = document.getElementById("input-prompt");
    if (promptEl.classList.contains("active")) {
        wsSend({ type: "user_input", content: text });
        hideInputPrompt();
    } else if (selectedTask) {
        // Refine mode: send refinement message for selected task
        wsSend({
            type: "refine",
            phase: selectedTask,
            message: text,
        });
    }

    textarea.value = "";
}

// ---------------------------------------------------------------------------
// File panel
// ---------------------------------------------------------------------------
function requestFileList(task) {
    wsSend({ type: "list_files", task: task || "" });
}

function renderFileList(files, task) {
    var list = document.getElementById("file-list");
    list.innerHTML = "";

    if (files.length === 0) {
        var empty = document.createElement("div");
        empty.className = "file-item";
        empty.style.fontStyle = "italic";
        empty.textContent = "No output files yet";
        list.appendChild(empty);
        return;
    }

    for (var i = 0; i < files.length; i++) {
        var path = typeof files[i] === "string" ? files[i] : files[i].path;
        var item = document.createElement("div");
        item.className = "file-item";
        item.textContent = path;
        item.setAttribute("data-path", path);
        item.onclick = (function (p) {
            return function () {
                loadFilePreview(p);
                // Highlight selected
                var items = document.querySelectorAll(".file-item");
                for (var j = 0; j < items.length; j++) items[j].classList.remove("selected");
                this.classList.add("selected");
            };
        })(path);
        list.appendChild(item);
    }
}

function loadFilePreview(path) {
    var url = "/api/files/" + encodeURIComponent(path);
    fetch(url)
        .then(function (resp) { return resp.json(); })
        .then(function (data) {
            if (data.error) {
                showPreview(path, "Error: " + data.error);
                return;
            }
            showPreview(path, data.content);
        })
        .catch(function (err) {
            showPreview(path, "Failed to load: " + err);
        });
}

function loadRequirementPreview(path) {
    var url = "/api/req-files/" + encodeURIComponent(path);
    fetch(url)
        .then(function (resp) { return resp.json(); })
        .then(function (data) {
            if (data.error) {
                showPreview(path, "Error: " + data.error);
                return;
            }
            showPreview(path, data.content);
        })
        .catch(function (err) {
            showPreview(path, "Failed to load: " + err);
        });
}

function showPreview(path, content) {
    var panel = document.getElementById("file-preview");
    var header = document.getElementById("preview-header");
    var code = document.getElementById("preview-code");

    header.textContent = path;

    // Try to pretty-print JSON
    if (path.endsWith(".json")) {
        try {
            var parsed = JSON.parse(content);
            content = JSON.stringify(parsed, null, 2);
        } catch (e) { /* not JSON */ }
        code.textContent = content;
        code.className = "language-json";
        hljs.highlightElement(code);
    } else {
        code.textContent = content;
        code.className = "";
    }

    panel.classList.add("active");
}

// ---------------------------------------------------------------------------
// Clear button
// ---------------------------------------------------------------------------
var clearConfirmTimer = null;
document.getElementById("clear-btn").onclick = function () {
    var btn = this;
    if (btn.dataset.confirming) {
        // Second click — confirm
        clearTimeout(clearConfirmTimer);
        btn.textContent = "Clear";
        delete btn.dataset.confirming;
        wsSend({
            type: "clear_output",
            task: selectedTask || "",
        });
    } else {
        // First click — ask confirmation
        btn.textContent = "Confirm?";
        btn.dataset.confirming = "1";
        btn.style.animation = "pulse-confirm 0.5s infinite alternate";
        clearConfirmTimer = setTimeout(function () {
            btn.textContent = "Clear";
            btn.style.animation = "";
            delete btn.dataset.confirming;
        }, 3000);
    }
};

// ---------------------------------------------------------------------------
// Refresh existing outputs (for dependency checks)
// ---------------------------------------------------------------------------
function refreshExistingOutputs() {
    fetch("/api/files")
        .then(function (resp) { return resp.json(); })
        .then(function (data) {
            existingOutputs = (data.files || []).map(function (f) {
                return typeof f === "string" ? f : f.path;
            });
            // Update Gradle command dependency states without rebuilding the tree
            updateGradleDependencies();
        })
        .catch(function () { /* ignore */ });
}

function updateGradleDependencies() {
    var cmds = document.querySelectorAll(".gradle-cmd");
    for (var i = 0; i < cmds.length; i++) {
        var btn = cmds[i].querySelector(".action-btn");
        var depTag = cmds[i].querySelector(".dep-tag");
        var label = cmds[i].querySelector(".cmd-label");
        if (!btn) continue;

        // Find which command this is by matching the label text
        var cmdId = null;
        for (var key in gradleCommands) {
            var cmdLabel = gradleCommands[key].label || key;
            if (label && label.textContent === cmdLabel) {
                cmdId = key;
                break;
            }
        }
        if (!cmdId) continue;

        var needs = gradleCommands[cmdId].needs || null;
        var hasDep = needs ? existingOutputs.indexOf(needs) === -1 : false;

        btn.disabled = hasDep;
        if (label) {
            if (hasDep) label.classList.add("has-dep-missing");
            else label.classList.remove("has-dep-missing");
        }
        if (depTag) {
            depTag.style.display = hasDep ? "" : "none";
        }
    }
}

// ---------------------------------------------------------------------------
// Auto-scroll
// ---------------------------------------------------------------------------
var chatMessages = document.getElementById("chat-messages");
chatMessages.onscroll = function () {
    var el = chatMessages;
    var atBottom = el.scrollHeight - el.scrollTop - el.clientHeight < 40;
    autoScroll = atBottom;
};

function scrollToBottom() {
    if (!autoScroll) return;
    var el = document.getElementById("chat-messages");
    el.scrollTop = el.scrollHeight;
}

// ---------------------------------------------------------------------------
// Resizable panels
// ---------------------------------------------------------------------------
function initResize(handleId, leftPanelId, rightPanelId) {
    var handle = document.getElementById(handleId);
    var leftPanel = document.getElementById(leftPanelId);
    var rightPanel = document.getElementById(rightPanelId);
    var dragging = false;

    handle.onmousedown = function (e) {
        e.preventDefault();
        dragging = true;
        handle.classList.add("active");
        document.body.style.cursor = "col-resize";
        document.body.style.userSelect = "none";
    };

    document.addEventListener("mousemove", function (e) {
        if (!dragging) return;
        var container = document.querySelector(".main");
        var rect = container.getBoundingClientRect();
        var pos = e.clientX - rect.left;

        if (handleId === "resize-left") {
            var width = Math.max(200, Math.min(pos, rect.width - 400));
            leftPanel.style.width = width + "px";
        } else {
            var rightWidth = Math.max(120, rect.right - e.clientX);
            rightPanel.style.width = rightWidth + "px";
        }
    });

    document.addEventListener("mouseup", function () {
        if (dragging) {
            dragging = false;
            handle.classList.remove("active");
            document.body.style.cursor = "";
            document.body.style.userSelect = "";
        }
    });
}

initResize("resize-left", "pipeline-sidebar", "chat-panel");
initResize("resize-right", "chat-panel", "file-panel");

// ---------------------------------------------------------------------------
// Start
// ---------------------------------------------------------------------------
connect();
