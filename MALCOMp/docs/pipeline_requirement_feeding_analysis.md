# Pipeline Requirement Feeding Analysis

## Overview

This document analyses how the MALCOMp pipeline feeds requirements into its multi-agent processing stages. The investigation covers the feeding mechanism, data flow, and a pros/cons evaluation of the current approach versus alternatives.

## Current Approach: One-by-One Feeding

Requirements are fed **individually (one-by-one)** into each pipeline stage, not in bulk. All requirements are loaded into memory at initialisation, but they are drip-fed one at a time into a single continuous group chat conversation.

### Key Component: `RequirementFeederAgent`

**Location:** `base.py`, lines 207-226

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

**How it works:**

1. At initialisation, all requirements are loaded from the JSON file into `self.data`.
2. A `current_index` pointer starts at `0`.
3. Each time the group chat calls `get_human_input()`, the agent returns **one requirement** (the one at `current_index`) as a JSON string.
4. The pointer increments by one after each return.
5. When all requirements have been fed, the agent returns `"exit"` to signal completion.

### Group Chat Orchestration

**Location:** `base.py`, lines 125-146

Each stage creates a `GroupChat` with:
- The `RequirementFeederAgent` acting as the user
- One or more processing agents (e.g., extractor, checker)
- `speaker_selection_method="round_robin"` for turn-taking
- A configurable `max_rounds` limit

All requirements are processed within a **single `initiate_chat()` call**. The conversation flow looks like:

```
Round 1:     User provides Requirement #1
Rounds 2-N:  Agents process Requirement #1 (back-and-forth)
Round N+1:   User provides Requirement #2
Rounds N+2-M: Agents process Requirement #2
...
Final Round: User sends "exit", conversation ends
```

### Pipeline Stages

All four stages follow the same one-by-one feeding pattern:

| Stage | Source File | Input File | Max Rounds | Output |
|-------|-----------|------------|------------|--------|
| Term Extraction | `stages/term_extraction.py` | `requirement_architecture.json` | 100 | `result_term_extraction.json` |
| DSL Extraction | `stages/dsl_extraction.py` | `requirement_architecture.json` | 500 | `result_DSL.emf` + `result_dsl_extraction.json` |
| EMF Model Creation | `stages/emf_model_creation.py` | `requirement_architecture.json` | 1000 | `result_eol_program.eol` + `result_model_creation.json` |
| State Machine Extraction | `stages/state_machine_extraction.py` | `requirement_behaviour.json` | 500 | `STM.txt` + `result_statemachine_extraction.json` |

### Data Input Format

All requirement files follow this structure:

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
        }
    ]
}
```

---

## Pros and Cons of One-by-One Feeding

### Pros

| Pro | Explanation |
|-----|-------------|
| **Focused agent attention** | Each requirement gets full, dedicated processing by the extractor and checker agents without distraction from other requirements. |
| **Simpler error tracing** | If something goes wrong, it is easy to identify which specific requirement caused the issue since they are processed sequentially. |
| **Conversational context builds up** | Later requirements benefit from the accumulated context of earlier ones. Agents can reference and stay consistent with previously extracted terms and models. |
| **Lower per-turn token cost** | Each individual turn sends one requirement, keeping per-message payloads small. |

### Cons

| Con | Explanation |
|-----|-------------|
| **Context window bloat** | Since everything runs in a single `initiate_chat()` call, the conversation history grows with every requirement. By requirement #15+, the message history may be very large, increasing cost and risking context window limits. |
| **No parallelism** | Requirements are strictly sequential with no concurrent processing. For a large requirement set, this means long total wall-clock time. |
| **Compounding errors** | If an agent makes a mistake on an early requirement, the flawed context persists in the chat history and could influence processing of all subsequent requirements. |
| **`max_rounds` is a global limit** | The `max_rounds` configuration (e.g., 100 for term extraction) caps the **total** conversation rounds across **all** requirements, not per requirement. If requirements are complex, later ones may get cut off. |
| **No retry granularity** | If the pipeline fails on requirement #8, there is no way to resume from #8. The entire stage must restart from requirement #1. |
| **Token cost scales non-linearly** | Because the full conversation history is sent with each turn, cost grows roughly O(n^2) with the number of requirements rather than O(n) as it would with independent batches. |

---

## Alternative: Bulk / Batch Approach

A bulk approach would either send **all requirements at once** in a single prompt, or process them in **independent chat sessions** (one per requirement or per batch of requirements).

### Pros of Bulk / Batch

| Pro | Explanation |
|-----|-------------|
| **Parallelisable** | Independent sessions can run concurrently, reducing total wall-clock time. |
| **No context bloat** | Each session starts fresh, avoiding ever-growing conversation histories. |
| **O(n) token cost** | Cost scales linearly with the number of requirements. |
| **Per-requirement retry** | Failed requirements can be retried independently without reprocessing successful ones. |
| **Predictable round budget** | `max_rounds` can be allocated per requirement rather than shared globally. |

### Cons of Bulk / Batch

| Con | Explanation |
|-----|-------------|
| **Loss of cross-requirement consistency** | Agents cannot reference decisions made for earlier requirements, potentially leading to inconsistent extractions. |
| **Potentially worse extraction quality** | Without accumulated context, agents may miss relationships or duplicate terms across requirements. |
| **Higher orchestration complexity** | Managing multiple independent sessions and merging their outputs requires additional infrastructure. |
| **Redundant system prompts** | Each independent session must re-send system prompts and few-shot examples, adding overhead per session. |

---

## Summary

The current pipeline design prioritises **consistency and context accumulation** at the cost of **scalability and resilience**. This trade-off is appropriate for small-to-medium requirement sets where cross-requirement coherence is important. For larger requirement sets, a hybrid approach (e.g., batching requirements into groups of 5-10 and running batches independently) could balance both concerns.
