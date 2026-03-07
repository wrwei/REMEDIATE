# MALCOMp Pipeline Architecture

## Table of Contents

- [1. Overview](#1-overview)
- [2. End-to-End Pipeline Flow](#2-end-to-end-pipeline-flow)
- [3. Entry Point and CLI](#3-entry-point-and-cli)
- [4. Base Infrastructure](#4-base-infrastructure)
- [5. Stage 1: Term Extraction](#5-stage-1-term-extraction)
- [6. Stage 2: DSL Extraction](#6-stage-2-dsl-extraction)
- [7. Stage 3: EMF Model Creation](#7-stage-3-emf-model-creation)
- [8. Stage 4: State Machine Extraction](#8-stage-4-state-machine-extraction)
- [9. Configuration Reference](#9-configuration-reference)

---

## 1. Overview

MALCOMp (Multi-Agent LLM pipeline for Model-Driven Engineering) is a multi-stage pipeline that transforms natural language requirements into formal models using multi-agent LLM conversations orchestrated by Microsoft AutoGen.

### High-Level Architecture

```
                          MALCOMp Pipeline
 ┌─────────────────────────────────────────────────────────┐
 │                                                         │
 │  requirement_architecture.json                          │
 │         │                                               │
 │         ▼                                               │
 │  ┌──────────────────┐                                   │
 │  │  Term Extraction  │  Agents: Term_Extractor,         │
 │  │   (max 100 rds)   │          Term_checker            │
 │  └────────┬─────────┘                                   │
 │           │ result_term_extraction.json                  │
 │           ▼                                              │
 │  ┌──────────────────┐                                   │
 │  │  DSL Extraction   │  Agents: DSL_Extractor,          │
 │  │   (max 500 rds)   │          DSL_Checker,            │
 │  └────────┬─────────┘          DSL_Refactor,            │
 │           │                     Json_Generator           │
 │           │ result_DSL.emf                               │
 │           │ result_dsl_extraction.json                   │
 │           ▼                                              │
 │  ┌──────────────────────┐                               │
 │  │  EMF Model Creation   │  Agents: Model_Creator,      │
 │  │    (max 1000 rds)     │          Model_Checker,       │
 │  └────────┬─────────────┘          Model_Refactorer,    │
 │           │                         Json_Generator       │
 │           │ result_eol_program.eol                       │
 │           │ result_model_creation.json                   │
 │           ▼                                              │
 │       [DONE]                                             │
 │                                                         │
 │  requirement_behaviour.json                             │
 │         │                                               │
 │         ▼                                               │
 │  ┌────────────────────────────┐                         │
 │  │  State Machine Extraction   │  Agents: Modeller,     │
 │  │      (max 500 rds)          │          Json_Generator │
 │  └────────┬───────────────────┘                         │
 │           │ STM.txt                                      │
 │           │ result_statemachine_extraction.json           │
 │           ▼                                              │
 │       [DONE]                                             │
 └─────────────────────────────────────────────────────────┘
```

### Dependencies

| Package | Purpose |
|---------|---------|
| `pyautogen>=0.2` | Microsoft AutoGen framework for multi-agent LLM conversations |
| `python-dotenv>=1.0` | Loads environment variables from `.env` files |
| `pyyaml>=6.0` | YAML parsing for `config.yaml` |

---

## 2. End-to-End Pipeline Flow

### Data Flow Between Stages

```
requirement_architecture.json ──┐
                                ▼
                    ┌───────────────────────┐
                    │   Stage 1: Term       │
                    │   Extraction          │
                    └───────────┬───────────┘
                                │
                    result_term_extraction.json
                                │
               ┌────────────────┼────────────────┐
               ▼                ▼                 │
   ┌───────────────────┐  requirement_            │
   │  Stage 2: DSL     │  architecture.json       │
   │  Extraction       │                          │
   └─────────┬─────────┘                          │
             │                                     │
    result_DSL.emf                                 │
    result_dsl_extraction.json                     │
             │                                     │
             ▼                                     ▼
   ┌───────────────────────┐        requirement_architecture.json
   │  Stage 3: EMF Model   │        result_term_extraction.json
   │  Creation             │        result_DSL.emf
   └─────────┬─────────────┘
             │
    result_eol_program.eol
    result_model_creation.json


requirement_behaviour.json ──┐
                             ▼
                 ┌──────────────────────────┐
                 │  Stage 4: State Machine  │
                 │  Extraction              │
                 └────────────┬─────────────┘
                              │
                     STM.txt
                     result_statemachine_extraction.json
```

**Key observations:**
- Stages 1-3 form a sequential chain, each consuming outputs from prior stages.
- Stage 4 is independent; it uses a separate input file (`requirement_behaviour.json`) and has no dependency on stages 1-3.
- Every stage produces a **traceability JSON** linking requirements (by GID) to generated artefacts.
- Stages 2, 3, and 4 also produce a **code artefact** (Emfatic metamodel / EOL program / RoboChart state machine).

### Execution Sequence

1. **Initialisation**: Load config, validate API keys, resolve paths.
2. **For each stage** (in order: term, dsl, model, statemachine):
   - Instantiate the stage class.
   - Load requirement JSON file.
   - Create `RequirementFeederAgent` + stage-specific agents.
   - Create `GroupChat` with round-robin speaker selection.
   - Call `initiate_chat()` — requirements are fed one-by-one.
   - Extract and store JSON traceability output.
   - Extract and store code artefact (if applicable).
3. **Completion**: Log stage completion, move to next stage.

---

## 3. Entry Point and CLI

**Location:** `run.py`

### Usage

```bash
# Run all stages (default)
python run.py

# Run specific stages
python run.py term dsl

# Custom config file
python run.py --config path/to/config.yaml

# Repeat term extraction N times (evaluation mode)
python run.py term --repeat 10
```

### Arguments

| Argument | Type | Default | Description |
|----------|------|---------|-------------|
| `stages` | positional | all four | Stages to run: `term`, `dsl`, `model`, `statemachine` |
| `--config` | string | `examples/auv/config.yaml` | Path to config YAML file |
| `--repeat` | int | 1 | Run term extraction N times (only applies to `term` stage) |

### Stage Registry

```python
STAGES = {
    "term":         TermExtraction,
    "dsl":          DSLExtraction,
    "model":        EMFModelCreation,
    "statemachine": StateMachineExtraction,
}
```

---

## 4. Base Infrastructure

**Location:** `base.py`

### `Base` Class

The abstract base class shared by all four stages. Handles configuration loading, agent creation, group chat orchestration, and output storage.

#### Initialisation Flow

1. Load `.env` file (API keys).
2. Parse `config.yaml` and resolve paths relative to the config file directory.
3. Validate that the correct API key is set (`OPENAI_API_KEY` or `ANTHROPIC_API_KEY`).
4. Build LLM `config_list` for AutoGen agents.
5. Create `RequirementFeederAgent` as the "user" agent.
6. Initialise empty `agents` list for subclasses to populate.

#### LLM Configuration

All agents share the same default LLM config:

```python
{
    "temperature": 0.5,       # From config.yaml model.temperature
    "config_list": [{         # Built from .env + config.yaml
        "model": "gpt-4o",
        "api_key": "sk-...",
        "api_type": "openai"  # or "anthropic"
    }],
    "timeout": 600000,        # 10 minutes
    "cache_seed": None,       # No caching
}
```

Supports both OpenAI and Anthropic providers via `model.api_type` in config.

#### Agent Creation

```python
def create_agent(self, name, system_message, description, **agent_kwargs):
```

Creates a `ConversableAgent` with the default LLM config and registers it in `self.agents`.

#### Group Chat Setup

```python
def init_group_chat(self):
```

Creates an `autogen.GroupChat` with:
- All agents (user + processing agents)
- `speaker_selection_method="round_robin"`
- `max_round` from stage config (default 100)
- `send_introductions=True`

#### Pipeline Execution

```python
def run(self, message=""):
```

1. Calls `self.user.initiate_chat(self.group_chat_manager)`.
2. Extracts JSON traceability from the designated `json_agent`.
3. Extracts code artefact from the designated `code_agent` (if configured).
4. Stores both to `output_dir`.

#### Output Storage

- **`store_json()`**: Collects all messages from `json_agent`, parses JSON, aggregates into a list under a root key (`json_tag`), writes to file.
- **`_store_last_agent_output()`**: Takes the last message from `code_agent` and writes it verbatim to file.

### `RequirementFeederAgent` Class

A specialised `ConversableAgent` that replaces human input with sequential requirement feeding.

```python
class RequirementFeederAgent(ConversableAgent):
    """A ConversableAgent that feeds requirements from a JSON file one by one."""

    def __init__(self, file_path, *args, **kwargs):
        super().__init__(*args, **kwargs)
        self.file_path = file_path
        self.current_index = 0
        with open(self.file_path, "r", encoding="utf-8") as f:
            self.data = json.load(f)["requirements"]

    def get_human_input(self, prompt):
        if self.current_index < len(self.data):
            item = self.data[self.current_index]
            reply = json.dumps(item)
            self.current_index += 1
        else:
            reply = "exit"
        self._human_input.append(reply)
        return reply
```

Maintains a `current_index` pointer. Each call to `get_human_input()` returns one requirement as JSON and advances the pointer. When all requirements are consumed, returns `"exit"` to terminate the conversation.

---

## 5. Stage 1: Term Extraction

**Location:** `stages/term_extraction.py`

**Purpose:** Extract domain concepts and their instances from natural language requirements.

### Agents

| Agent | Role | Description |
|-------|------|-------------|
| **Term_Extractor** | Generator | Analyses each requirement to identify Concepts (classes) and Instances (named objects). Guided by chain-of-thought prompts and few-shot examples. |
| **Term_checker** | Validator | Reviews the extraction for correctness: singular noun concepts, quoted instances, no duplicates, proper JSON format. Outputs corrected JSON if needed. |

### Multi-Agent Conversation Pattern

```
RequirementFeederAgent ──► Term_Extractor ──► Term_checker
        │                                          │
        │◄─────────── (next requirement) ◄─────────┘
```

Per requirement:
1. **RequirementFeederAgent** provides one requirement JSON.
2. **Term_Extractor** extracts concepts and instances into JSON.
3. **Term_checker** validates and corrects the extraction.
4. Cycle repeats for the next requirement.

### Asset Files

| Config Key | File | Purpose |
|-----------|------|---------|
| `system_description` | `system_description.txt` | Description of the system being modelled |
| `few_shot_example` | `few_shot_example_term_extraction.txt` | Example requirement-to-term extractions |
| `chain_of_thought_extraction` | `chain_of_thought_term_extraction.txt` | Step-by-step reasoning guide for extraction |
| `chain_of_thought_checker` | `chain_of_thought_term_checker.txt` | Correctness criteria for validation |

### Output

**Traceability JSON** (`result_term_extraction.json`):
```json
{
    "req": [
        {
            "Requirement": "The AUV system is developed as a Module named \"AUV_Module\".",
            "GID": "SD1",
            "Concept": "Module",
            "Concept_description": null,
            "Instance": "AUV_Module",
            "Instance_of": "Module",
            "Instance_description": null,
            "Requirement_kind": "Non-Functional",
            "Non-Requirement_type": "architecture"
        }
    ]
}
```

### Repeat Mode

The `--repeat N` CLI flag creates N independent runs of this stage, each producing a dated output file for evaluation purposes:

```
2026-02-19result_term_extractor_1.json
2026-02-19result_term_extractor_2.json
...
```

---

## 6. Stage 2: DSL Extraction

**Location:** `stages/dsl_extraction.py`

**Purpose:** Generate an Emfatic metamodel (EMF Domain Specific Language) from requirements and previously extracted terms.

### Agents

| Agent | Role | Description |
|-------|------|-------------|
| **DSL_Extractor** | Generator | Creates Emfatic metamodel code from requirements, guided by term extraction results, chain-of-thought, and few-shot examples. |
| **DSL_Checker** | Validator | Validates Emfatic syntax, tree structure, unique class names, proper inheritance. Uses the Emfatic language reference. |
| **DSL_Refactor** | Refactorer | Organises and consolidates the Emfatic code. Handles containment (`val`) vs. non-containment (`ref`) references. Merges with previous answers across rounds. |
| **Json_Generator** | Tracer | Generates traceability JSON mapping requirements (by GID) to Emfatic classes, attributes, references, and operations. |

### Multi-Agent Conversation Pattern

```
RequirementFeederAgent ──► DSL_Extractor ──► DSL_Checker ──► DSL_Refactor ──► Json_Generator
        │                                                                          │
        │◄──────────────────── (next requirement) ◄────────────────────────────────┘
```

### Asset Files

| Config Key | File | Purpose |
|-----------|------|---------|
| `system_description` | `system_description.txt` | System description |
| `few_shot_dsl_extraction` | `few_shot_example_dsl_extraction.txt` | Example metamodel extractions |
| `few_shot_dsl_checker` | `few_shot_example_dsl_checker.txt` | Example correct metamodels |
| `chain_of_thought_extraction` | `chain_of_thought_dsl_extraction.txt` | Reasoning guide for metamodel creation |
| `chain_of_thought_checker` | `chain_of_thought_dsl_checker.txt` | Validation criteria |
| `extracted_terms` | `result_term_extraction.json` | Output from Stage 1 |
| `emfatic_rules` | `emfatic.txt` | Emfatic language syntax reference |

### Output

**Code artefact** (`result_DSL.emf`):
```emfatic
package AUV;

abstract class NamedElement {
    attr String name;
}

class Module extends NamedElement {
    val RoboticPlatform[*] platforms;
    val Interface[*] interfaces;
    val Controller[*] controllers;
}

class RoboticPlatform extends NamedElement {
    ref Interface[*] interfaces;
}
...
```

**Traceability JSON** (`result_dsl_extraction.json`):
```json
{
    "dsl_trace": [
        {
            "requirement_gid": "SD1",
            "Emfatic_class": "Module",
            "Emfatic_attributes": null,
            "Emfatic_references": ["platforms", "interfaces"],
            "Emfatic_operations": null
        }
    ]
}
```

---

## 7. Stage 3: EMF Model Creation

**Location:** `stages/emf_model_creation.py`

**Purpose:** Generate an Epsilon Object Language (EOL) program that creates model instances conforming to the metamodel from Stage 2.

### Agents

| Agent | Role | Description |
|-------|------|-------------|
| **Model_Creator** | Generator | Writes EOL code to instantiate classes from the Emfatic metamodel, set attributes, and create references. Uses term extraction + metamodel as context. |
| **Model_Checker** | Validator | Validates EOL syntax, ensures conformance to the metamodel, prevents out-of-scope creations. |
| **Model_Refactorer** | Refactorer | Consolidates EOL code from previous rounds. Merges with earlier answers into one complete program. |
| **Json_Generator** | Tracer | Maps requirements (by GID) to created model elements, attributes, and references. |

### Multi-Agent Conversation Pattern

```
RequirementFeederAgent ──► Model_Creator ──► Model_Checker ──► Model_Refactorer ──► Json_Generator
        │                                                                                │
        │◄──────────────────────── (next requirement) ◄──────────────────────────────────┘
```

### Asset Files

| Config Key | File | Purpose |
|-----------|------|---------|
| `system_description` | `system_description.txt` | System description |
| `few_shot_model_creation` | `few_shot_example_model_creation.txt` | Example EOL programs |
| `few_shot_model_checker` | `few_shot_example_model_checker.txt` | Example correct EOL code |
| `chain_of_thought_creation` | `chain_of_thought_model_creation.txt` | Reasoning guide for model creation |
| `chain_of_thought_checker` | `chain_of_thought_model_checker.txt` | Validation criteria |
| `chain_of_thought_trace` | `chain_of_thought_model_trace.txt` | Guidance for traceability generation |
| `extracted_terms` | `result_term_extraction.json` | Output from Stage 1 |
| `dsl_source` | `result_DSL.emf` | Output from Stage 2 |

### Output

**Code artefact** (`result_eol_program.eol`):
```eol
var auv_module = new M!Module;
auv_module.name = "AUV_Module";

var auv_platform = new M!RoboticPlatform;
auv_platform.name = "AUV_Platform";

var sensors = new M!Interface;
sensors.name = "Sensors";

auv_platform.interfaces.add(sensors);
auv_module.platforms.add(auv_platform);
...
```

**Traceability JSON** (`result_model_creation.json`):
```json
{
    "model_trace": [
        {
            "requirement_gid": "SD1",
            "Model_Element": "Module",
            "Model_Element_id": "AUV_Module",
            "Model_attribute": "name",
            "Attribute_value": "AUV_Module",
            "Model_reference": "platforms",
            "Reference_value": "AUV_Platform"
        }
    ]
}
```

---

## 8. Stage 4: State Machine Extraction

**Location:** `stages/state_machine_extraction.py`

**Purpose:** Generate RoboChart state machines from behavioural requirements. This stage is independent of stages 1-3 and uses a different input file.

### Agents

| Agent | Role | Description |
|-------|------|-------------|
| **Modeller** | Generator | Creates RoboChart DSL state machine code from behavioural requirements. Uses the RoboChart Ecore metamodel, Xtext grammar, code examples, and semantic examples as context. Has `max_consecutive_auto_reply=1`. |
| **Json_Generator** | Tracer | Maps requirements (by GID) to states, transitions, source/end states. Has `max_consecutive_auto_reply=1`. |

### Multi-Agent Conversation Pattern

```
RequirementFeederAgent ──► Modeller ──► Json_Generator
        │                                     │
        │◄───── (next requirement) ◄──────────┘
```

### Asset Files

| Config Key | File | Purpose |
|-----------|------|---------|
| `robochart_ecore` | `RoboChart_ecore.txt` | RoboChart metamodel in Emfatic |
| `xtext` | `Xtext.txt` | Xtext grammar for RoboChart DSL |
| `code_snippet_1` | `code_snippet_1.txt` | First RoboChart code example |
| `code_snippet_2` | `code_snippet_2.txt` | Second RoboChart code example |
| `semantic` | `semantic.txt` | Semantic examples for entry/exit actions and event transitions |

### Output

**Code artefact** (`STM.txt`):
```robochart
stm LRE_Beh {
    requires Inputs
    requires Outputs
    initial i0

    state OCM {
        entry advVel ! vel
    }
    state MOM {
        entry advVel ! 1
    }

    transition t0 {
        from i0
        to OCM
    }
    transition t1 {
        from OCM
        to MOM
        trigger reqVel ? x
        condition x > threshold
        action advVel ! x
    }

    var cobs : Close
    var vel : real
    event reqVel
    event advVel
}
```

**Traceability JSON** (`result_statemachine_extraction.json`):
```json
{
    "stm_trace": [
        {
            "requirement_gid": "LRE-NF1",
            "source state": "i0",
            "end state": "OCM",
            "transition": "t0"
        }
    ]
}
```

---

## 9. Configuration Reference

**Location:** `examples/auv/config.yaml`

### Full Structure

```yaml
model:
  name: "gpt-4o"                            # LLM model identifier
  temperature: 0.5                           # Sampling temperature (0.0-1.0)
  api_type: "openai"                         # "openai" or "anthropic"
  api_base_url: "https://api.openai.com/v1"  # API endpoint (OpenAI only)

assets_dir: "assets"                         # Asset files directory (relative to config)
output_dir: "output"                         # Output directory (relative to config)

stages:
  term_extraction:
    requirement_file: "assets/requirement_architecture.json"
    max_rounds: 100
    asset_files:
      system_description: "system_description.txt"
      few_shot_example: "few_shot_example_term_extraction.txt"
      chain_of_thought_extraction: "chain_of_thought_term_extraction.txt"
      chain_of_thought_checker: "chain_of_thought_term_checker.txt"
    output:
      json_file: "result_term_extraction.json"
      json_tag: "term_trace"
      json_agent: "Term_checker"

  dsl_extraction:
    requirement_file: "assets/requirement_architecture.json"
    max_rounds: 500
    asset_files:
      system_description: "system_description.txt"
      few_shot_dsl_extraction: "few_shot_example_dsl_extraction.txt"
      few_shot_dsl_checker: "few_shot_example_dsl_checker.txt"
      chain_of_thought_extraction: "chain_of_thought_dsl_extraction.txt"
      chain_of_thought_checker: "chain_of_thought_dsl_checker.txt"
      extracted_terms: "result_term_extraction.json"
      emfatic_rules: "emfatic.txt"
    output:
      json_file: "result_dsl_extraction.json"
      json_tag: "dsl_trace"
      json_agent: "Json_Generator"
      code_file: "result_DSL.emf"
      code_agent: "DSL_Refactor"

  emf_model_creation:
    requirement_file: "assets/requirement_architecture.json"
    max_rounds: 1000
    asset_files:
      system_description: "system_description.txt"
      few_shot_model_creation: "few_shot_example_model_creation.txt"
      few_shot_model_checker: "few_shot_example_model_checker.txt"
      chain_of_thought_creation: "chain_of_thought_model_creation.txt"
      chain_of_thought_checker: "chain_of_thought_model_checker.txt"
      chain_of_thought_trace: "chain_of_thought_model_trace.txt"
      extracted_terms: "result_term_extraction.json"
      dsl_source: "result_DSL.emf"
    output:
      json_file: "result_model_creation.json"
      json_tag: "model_trace"
      json_agent: "Json_Generator"
      code_file: "result_eol_program.eol"
      code_agent: "Model_Refactorer"

  state_machine_extraction:
    requirement_file: "assets/requirement_behaviour.json"
    max_rounds: 500
    asset_files:
      robochart_ecore: "RoboChart_ecore.txt"
      xtext: "Xtext.txt"
      code_snippet_1: "code_snippet_1.txt"
      code_snippet_2: "code_snippet_2.txt"
      semantic: "semantic.txt"
    output:
      json_file: "result_statemachine_extraction.json"
      json_tag: "stm_trace"
      json_agent: "Json_Generator"
      code_file: "STM.txt"
      code_agent: "Modeller"
```

### Field Reference

| Field | Type | Required | Description |
|-------|------|----------|-------------|
| `model.name` | string | Yes | LLM model identifier (e.g., `gpt-4o`, `claude-sonnet-4-5-20250929`) |
| `model.temperature` | float | No | Sampling temperature 0.0-1.0 (default: 0.5) |
| `model.api_type` | string | No | `"openai"` (default) or `"anthropic"` |
| `model.api_base_url` | string | No | Base URL for OpenAI-compatible endpoints |
| `assets_dir` | string | No | Assets directory, relative to config file (default: `"assets"`) |
| `output_dir` | string | No | Output directory, relative to config file (default: `"output"`) |
| `stages.<name>.requirement_file` | string | Yes | Path to requirements JSON file |
| `stages.<name>.max_rounds` | int | No | Max group chat rounds (default: 100) |
| `stages.<name>.asset_files.<key>` | string | Yes | Filename of an asset file in `assets_dir` |
| `stages.<name>.output.json_file` | string | Yes | Output JSON traceability filename |
| `stages.<name>.output.json_tag` | string | Yes | Root key in the output JSON |
| `stages.<name>.output.json_agent` | string | Yes | Agent whose messages contain the JSON output |
| `stages.<name>.output.code_file` | string | No | Code artefact output filename |
| `stages.<name>.output.code_agent` | string | No | Agent whose last message is the code artefact |

### Environment Variables

| Variable | Required When | Description |
|----------|-------------|-------------|
| `OPENAI_API_KEY` | `api_type = "openai"` | OpenAI API key |
| `OPENAI_API_BASE` | Optional | Overrides `model.api_base_url` |
| `ANTHROPIC_API_KEY` | `api_type = "anthropic"` | Anthropic API key |
