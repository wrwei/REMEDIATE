# MALCOMp User Guide

**MALCOMp** (Multi-Agent LLM Component) is the Python-based pipeline of the REMEDIATE project. It uses multi-agent LLM conversations (via Microsoft Autogen) to automatically extract metamodels, model instances, and state machines from natural language requirements, while generating traceability links at each step.

---

## Prerequisites

### Python

Python 3.9 or later is required.

### Dependencies

Install the required packages:

```
pip install pyautogen python-dotenv pyyaml
```

| Package          | Purpose                                    |
| ---------------- | ------------------------------------------ |
| `pyautogen`      | Multi-agent LLM orchestration framework    |
| `python-dotenv`  | Loads the API key from the `.env` file     |
| `pyyaml`         | Reads the `config.yaml` configuration file |

### API Key

MALCOMp requires access to an OpenAI-compatible API. Before running, create a `.env` file in the `MALCOMp/` directory:

```
OPENAI_API_KEY=your-api-key-here
```

The API base URL and model name are configured separately in `config.yaml` (see below). The `.env` file is gitignored and should never be committed.

---

## Project Structure

```
MALCOMp/
    .env                 API key (not committed to git)
    .gitignore           Ignores .env, __pycache__, .cache, output/
    config.yaml          All pipeline settings (model, paths, stages)
    base.py              Shared infrastructure for all stages
    run.py               Unified command-line entry point
    stages/
        __init__.py
        term_extraction.py           Stage 1: Term extraction
        dsl_extraction.py            Stage 2: DSL/metamodel extraction
        emf_model_creation.py        Stage 3: EMF model creation
        state_machine_extraction.py  Stage 4: State machine extraction
    assets/                          Prompt templates, examples, and requirement files
    output/                          Generated results (created automatically)
```

---

## Configuration

All settings live in `config.yaml`. The file has three sections:

### Model settings

```yaml
model:
  name: "gpt-4o"            # The LLM model to use
  temperature: 0.5           # Sampling temperature (0.0 - 1.0)
  api_base_url: "https://a.fe8.cn/v1"   # API endpoint base URL
```

You can override the `api_base_url` at runtime by setting the `OPENAI_API_BASE` environment variable.

### Directory settings

```yaml
assets_dir: "assets"     # Where prompt templates and requirement files live
output_dir: "output"     # Where generated results are written
```

### Stage settings

Each pipeline stage has its own block under `stages:`. A stage block contains:

- **`requirement_file`** - Path to the input requirements JSON file.
- **`max_rounds`** - Maximum conversation rounds for the multi-agent group chat.
- **`asset_files`** - A mapping of logical names to filenames inside `assets_dir`. These are the prompt templates, few-shot examples, chain-of-thought guides, and intermediate results that each stage's agents use.
- **`output`** - Defines where results are saved:
  - `json_file` / `json_tag` / `json_agent` - The traceability JSON output.
  - `code_file` / `code_agent` - The code artifact output (metamodel, EOL program, or state machine).

---

## Pipeline Stages

MALCOMp operates as a sequential four-stage pipeline. Each stage feeds its output into the next.

### Stage 1: Term Extraction (`term`)

Extracts domain **concepts** and their **instances** from requirements.

- **Input**: `assets/requirement_architecture.json`
- **Agents**: `Term_Extractor` (extracts terms) and `Term_checker` (validates them)
- **Output**: `output/result_term_extraction.json` - a JSON file containing the extracted concept-instance pairs with traceability back to requirement GIDs

### Stage 2: DSL Extraction (`dsl`)

Generates an **Emfatic metamodel** (Domain Specific Language) from requirements, guided by the term extraction results.

- **Input**: `assets/requirement_architecture.json` + `assets/result_term_extraction.json`
- **Agents**: `DSL_Extractor` (creates Emfatic code), `DSL_Checker` (validates syntax), `DSL_Refactor` (organises and refactors), `Json_Generator` (creates traceability)
- **Output**:
  - `output/result_DSL.emf` - the generated Emfatic metamodel
  - `output/result_dsl_extraction.json` - traceability from requirements to metamodel elements

### Stage 3: EMF Model Creation (`model`)

Generates an **EOL (Epsilon Object Language) program** that creates model instances conforming to the extracted metamodel.

- **Input**: `assets/requirement_architecture.json` + `assets/result_term_extraction.json` + `assets/result_DSL.emf`
- **Agents**: `Model_Creator` (writes EOL code), `Model_Checker` (validates), `Model_Refactorer` (refactors), `Json_Generator` (creates traceability)
- **Output**:
  - `output/result_eol_program.eol` - the generated EOL program
  - `output/result_model_creation.json` - traceability from requirements to model elements

### Stage 4: State Machine Extraction (`statemachine`)

Generates **RoboChart state machines** from behavioural requirements.

- **Input**: `assets/requirement_behaviour.json`
- **Agents**: `Modeller` (generates RoboChart DSL code), `Json_Generator` (creates traceability)
- **Output**:
  - `output/STM.txt` - the generated state machine in RoboChart DSL
  - `output/result_statemachine_extraction.json` - traceability from requirements to state machine elements

---

## Running the Pipeline

All commands should be run from the `MALCOMp/` directory.

### Run the full pipeline

```
python run.py
```

This runs all four stages in order: `term` -> `dsl` -> `model` -> `statemachine`.

### Run specific stages

```
python run.py term dsl
```

Only the named stages are executed, in the order given.

### Run term extraction multiple times

For experimental evaluation, term extraction can be repeated to collect multiple samples:

```
python run.py term --repeat 10
```

This produces dated output files like `output/2026-02-11result_term_extractor_1.json` through `output/2026-02-11result_term_extractor_10.json`.

### Use a custom configuration file

```
python run.py --config my_config.yaml
```

### Run a single stage directly

Each stage can also be run as a standalone script:

```
python stages/term_extraction.py
python stages/dsl_extraction.py
python stages/emf_model_creation.py
python stages/state_machine_extraction.py
```

### Show help

```
python run.py --help
```

---

## Input Format

Requirements are provided as JSON files. Each file must have a top-level `"requirements"` array:

```json
{
    "requirements": [
        {
            "kind": "Non-Functional Requirement",
            "name": "SD1",
            "id": "SD1",
            "description": "The AUV system is developed as a Module named \"AUV_Module\".",
            "priority": "6",
            "types": ["architecture"]
        },
        {
            "kind": "Functional Requirement",
            "name": "SD2",
            "id": "SD2",
            "description": "...",
            "priority": "5",
            "types": ["architecture"]
        }
    ]
}
```

| Field         | Description                                        |
| ------------- | -------------------------------------------------- |
| `kind`        | `"Functional Requirement"` or `"Non-Functional Requirement"` |
| `name`        | Short name identifier                              |
| `id`          | Unique GID used for traceability                   |
| `description` | The natural language requirement text               |
| `priority`    | Priority rating (string, e.g. `"1"` to `"10"`)    |
| `types`       | Array of categories, e.g. `["architecture"]`, `["performance"]` |

The pipeline uses two separate requirement files:
- **Architecture requirements** (`requirement_architecture.json`) - used by stages 1-3
- **Behavioural requirements** (`requirement_behaviour.json`) - used by stage 4

---

## Output Format

Each stage produces two types of output:

### Traceability JSON

A JSON file mapping requirement GIDs to generated artifacts. The format varies by stage:

**Term extraction** (`result_term_extraction.json`):
```json
{
    "term_trace": [
        {
            "GID": "SD1",
            "Concept": "Module",
            "Concept_description": "...",
            "Instance": "AUV_Module",
            "Instance_description": "..."
        }
    ]
}
```

**DSL extraction** (`result_dsl_extraction.json`):
```json
{
    "dsl_trace": [
        {
            "requirement_gid": "SD1",
            "Emfatic_class": "Module",
            "Emfatic_attributes": ["name"],
            "Emfatic_references": ["contains"],
            "Emfatic_operations": []
        }
    ]
}
```

**Model creation** (`result_model_creation.json`):
```json
{
    "model_trace": [
        {
            "requirement_gid": "SD1",
            "Model_Element": "Module",
            "Model_Element_id": "AUV_Module",
            "Model_attribute": "name",
            "Attribute_value": "AUV_Module",
            "Model_reference": "contains",
            "Reference_value": "AUV_Platform"
        }
    ]
}
```

**State machine extraction** (`result_statemachine_extraction.json`):
```json
{
    "stm_trace": [
        {
            "requirement_gid": "BR1",
            "source state": "Idle",
            "end state": "Moving",
            "transition": "start"
        }
    ]
}
```

### Code Artifacts

- `result_DSL.emf` - Emfatic metamodel (stage 2)
- `result_eol_program.eol` - EOL model creation program (stage 3)
- `STM.txt` - RoboChart state machine DSL code (stage 4)

---

## Adapting to a Different Case Study

To use MALCOMp with your own requirements:

1. **Write your requirements** in the JSON format shown above and place them in `assets/`.

2. **Write a system description** in a plain text file (e.g. `assets/system_description.txt`). This gives the LLM agents context about the domain.

3. **Update `config.yaml`** to point each stage's `requirement_file` to your new JSON file.

4. **Run the pipeline**: `python run.py`

Existing case studies in `assets/` can serve as references:
- `btms_case_study/` - Bus Transportation Management System
- `LabTracker_case_study/` - Lab Requisition Management System
- `Celo_case/` - Event organisation application

---

## Troubleshooting

| Problem | Solution |
| ------- | -------- |
| `EnvironmentError: OPENAI_API_KEY not set` | Create a `.env` file in the `MALCOMp/` directory with `OPENAI_API_KEY=your-key` |
| `ModuleNotFoundError: No module named 'autogen'` | Run `pip install pyautogen` |
| `ModuleNotFoundError: No module named 'dotenv'` | Run `pip install python-dotenv` |
| `ModuleNotFoundError: No module named 'yaml'` | Run `pip install pyyaml` |
| `FileNotFoundError` on an asset file | Check that the filename in `config.yaml` matches the actual file in `assets/` |
| Stage 2 or 3 fails to find `result_term_extraction.json` | Stage 1 must run first. Run the full pipeline or run `python run.py term` first |
| API timeout or rate limit errors | Check your API key, increase the `timeout` if needed, or reduce `max_rounds` in `config.yaml` |
