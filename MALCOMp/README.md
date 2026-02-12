# MALCOMp

**MALCOMp** (Multi-Agent LLM Component) is a Python pipeline that uses multi-agent LLM conversations to automatically extract metamodels, model instances, and state machines from natural language requirements. It generates traceability links at each step.

Built on [Microsoft Autogen](https://github.com/microsoft/autogen) for multi-agent orchestration. Part of the [REMEDIATE](https://github.com/) research project.

---

## Quick Start

```bash
# 1. Install dependencies
pip install -r requirements.txt

# 2. Set up your API key
cp .env.example .env
# Edit .env and add your OpenAI or Anthropic key

# 3. Run the pipeline (uses the included AUV example by default)
python run.py
```

---

## Project Structure

```
MALCOMp/
    base.py              Shared infrastructure for all stages
    run.py               Unified command-line entry point
    stages/
        term_extraction.py           Stage 1: Term extraction
        dsl_extraction.py            Stage 2: DSL/metamodel extraction
        emf_model_creation.py        Stage 3: EMF model creation
        state_machine_extraction.py  Stage 4: State machine extraction
    examples/
        auv/                         AUV case study (bundled example)
            config.yaml              Configuration for the AUV case study
            assets/                  Prompts, requirements, and reference files
```

---

## Pipeline Stages

MALCOMp operates as a sequential four-stage pipeline. Each stage feeds its output into the next.

| Stage | Name | Input | Output |
|-------|------|-------|--------|
| 1 | **Term Extraction** | Requirements JSON | Concepts and Instances (JSON) |
| 2 | **DSL Extraction** | Requirements + Terms | Emfatic metamodel (.emf) + traceability JSON |
| 3 | **EMF Model Creation** | Requirements + Terms + Metamodel | EOL program (.eol) + traceability JSON |
| 4 | **State Machine Extraction** | Behavioural requirements | RoboChart DSL (.txt) + traceability JSON |

---

## Usage

All commands should be run from the `MALCOMp/` directory.

### Run the full pipeline

```bash
python run.py
```

### Run specific stages

```bash
python run.py term dsl
```

### Run with a custom config

```bash
python run.py --config path/to/config.yaml
```

### Repeat term extraction (for evaluation)

```bash
python run.py term --repeat 10
```

---

## Configuration

Each example or case study has its own `config.yaml`. See [examples/auv/config.yaml](examples/auv/config.yaml) for the full format.

Key sections:

- **`model`** — LLM provider, model name, temperature
- **`assets_dir`** / **`output_dir`** — directories for input assets and generated output (relative to the config file)
- **`stages`** — per-stage settings: requirement file, max rounds, asset file mappings, and output config

All paths in `config.yaml` are resolved relative to the config file's directory, so each example is self-contained.

---

## Creating Your Own Case Study

1. Create a new directory under `examples/`:
   ```
   examples/my_project/
       config.yaml
       assets/
           system_description.txt
           requirement_architecture.json
           requirement_behaviour.json
           ...
   ```

2. Write your requirements in JSON format:
   ```json
   {
       "requirements": [
           {
               "kind": "Functional Requirement",
               "name": "REQ1",
               "id": "REQ1",
               "description": "The system shall...",
               "priority": "5",
               "types": ["architecture"]
           }
       ]
   }
   ```

3. Copy and adapt chain-of-thought and few-shot example files from the AUV example.

4. Run:
   ```bash
   python run.py --config examples/my_project/config.yaml
   ```

---

## Switching LLM Providers

MALCOMp supports OpenAI and Anthropic. See [SWITCHING_MODELS.md](SWITCHING_MODELS.md) for details.

**OpenAI (default):**
```yaml
model:
  name: "gpt-4o"
  api_type: "openai"
```

**Anthropic:**
```bash
pip install pyautogen[anthropic]
```
```yaml
model:
  name: "claude-sonnet-4-5-20250929"
  api_type: "anthropic"
```

---

## Dependencies

| Package | Purpose |
|---------|---------|
| `pyautogen` | Multi-agent LLM orchestration |
| `python-dotenv` | Loads API keys from `.env` |
| `pyyaml` | Reads `config.yaml` |

Python 3.9+ required.
