# REMEDIATE

**REMEDIATE** — REquirement ModEl DrIven system engineering with multi-AgenT large language modEls

This repository implements an automated Model-Driven Engineering (MDE) pipeline with two complementary approaches: a hand-crafted ground-truth reference (MALCOMj) and an LLM-powered experimental pipeline (MALCOMp). The framework covers requirements modelling, terminology extraction, DSL generation, EMF model creation, state machine extraction, and full traceability between artefacts.

---

## Core Projects

### MALCOMj — Ground-Truth Reference Implementation

Java/Gradle project providing the hand-crafted metamodels, model instances, and Epsilon (EOL/EVL/EGL) transformations that serve as the validation oracle. Runs standalone via Gradle — no Eclipse IDE required.

- **Technology:** Java 17+, Gradle, Eclipse EMF, Eclipse Epsilon 2.8.0
- **Entry point:** `gradle tasks --group transformations`

### MALCOMp — LLM-Powered Pipeline

Python project using Microsoft Autogen for multi-agent LLM conversations that automatically extract metamodels, models, and state machines from natural language requirements.

- **Technology:** Python, Microsoft Autogen, OpenAI/Anthropic LLMs
- **Entry point:** `python run.py --stage all`

---

## Eclipse Plugins

These provide EMF-generated Java APIs, edit providers, and tree-based editors for use within the Eclipse IDE. They are not required for standalone Gradle or Python workflows.

| Plugin | Purpose |
|--------|---------|
| `org.sawg.requirement.model` | EMF code generation for base, requirement, and terminology metamodels |
| `org.sawg.requirement.model.edit` | EMF Edit adapters for requirement/terminology models |
| `org.sawg.requirement.model.editor` | Eclipse editor for requirement/terminology models |
| `org.sawg.bifrost.model` | EMF code generation for the Bifrost traceability metamodel |
| `org.sawg.bifrost.model.edit` | EMF Edit adapters for Bifrost traceability models |
| `org.sawg.bifrost.model.editor` | Eclipse editor for Bifrost traceability models |
| `org.sawg.requirement.design` | Sirius graphical editor for requirements modelling |
| `org.sawg.bifrost.design` | Sirius graphical editor for traceability bridges |

---

## Evaluation

### org.sawg.malcom.evaluation

Evaluation framework comparing MALCOMj and MALCOMp outputs across different multi-agent configurations. Contains Jupyter notebooks and experimental results for single-agent, one/two/all multi-agent setups.

### auv.case.study

Original Eclipse workspace container for the AUV (Autonomous Underwater Vehicle) case study. Includes Sirius modelling projects with both MALCOMj and MALCOMp examples. The standalone versions in the top-level `MALCOMj/` and `MALCOMp/` directories supersede the copies here.

---

## Metamodel Architecture

The framework is built on four core metamodels defined in MALCOMj:

| Metamodel | Namespace URI | Purpose |
|-----------|---------------|---------|
| `base.ecore` | `http://www.sawg.org/base` | Foundation types: Element, ModelElement, LangString, Description |
| `requirement.ecore` | `http://www.sawg.org/requirement` | Requirements: FunctionalRequirement, NonFunctionalRequirement |
| `terminology.ecore` | `http://www.sawg.org/terminology` | Terminology: Concept, Instance, TerminologyPackage |
| `bifrost.ecore` | `http://www.sawg.org/bifrost` | Traceability: TracePackage, Trace, ExternalReference |

---

## Getting Started

### MALCOMj (Java)

```bash
cd MALCOMj
gradle runAuvValidation      # validate AUV model
gradle runRequirementGen     # generate requirement documents
gradle runAll                # run all transformations
```

Requires Java 17+ and Gradle 8+.

### MALCOMp (Python)

```bash
cd MALCOMp
pip install -r requirements.txt
cp .env.example .env         # configure API keys
python run.py --stage all
```

Requires Python 3.10+.
