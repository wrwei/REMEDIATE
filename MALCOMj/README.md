# MALCOMj

**MALCOMj** (Multi-Agent LLM Component - Java) is the Eclipse/Java-based Model-Driven Engineering tooling for the REMEDIATE project. It provides the metamodels, model instances, and model transformations that form the ground-truth reference implementation.

Built on [Eclipse Modeling Framework (EMF)](https://eclipse.dev/modeling/emf/) and [Eclipse Epsilon](https://eclipse.dev/epsilon/). Runs standalone via Gradle — no Eclipse IDE required.

---

## Quick Start

```bash
# Run a transformation
gradle runAuvValidation

# Run all AUV transformations
gradle runAll

# List available tasks
gradle tasks --group transformations
```

Requires Java 17+ and Gradle 8+.

---

## Project Structure

```
MALCOMj/
    build.gradle                        Gradle build with Epsilon dependencies
    settings.gradle
    src/main/
        java/org/sawg/malcomj/
            TransformationRunner.java   Standalone EOL/EVL/EGL runner
        resources/
            metamodel/                  Core REMEDIATE framework metamodels (shared)
                base.ecore              Foundation: Element, ModelElement, LangString
                requirement.ecore       Requirements: FunctionalRequirement, NonFunctionalRequirement
                terminology.ecore       Terminology: Concept, Instance, TerminologyPackage
                bifrost.ecore           Traceability: TracePackage, Trace, ExternalReference
            examples/
                auv/                    AUV (Autonomous Underwater Vehicle) case study
                    metamodel/          AUV-specific domain metamodels
                    model/              Model instances and traceability bridges
                    transformation/     EOL/EVL/EGL transformation scripts
```

---

## Running Transformations

### Via Gradle tasks

Each AUV transformation has a pre-configured Gradle task:

| Task | Description |
|------|-------------|
| `gradle runAuvEmfCreation` | Create AUV EMF model instance |
| `gradle runAuvValidation` | Validate AUV model against constraints |
| `gradle runEmf2Robochart` | Generate RoboChart DSL from AUV model |
| `gradle runReq2Concept` | Create requirement-to-concept traceability bridges |
| `gradle runReq2Ecore` | Create requirement-to-ecore traceability bridges |
| `gradle runReq2EmfModel` | Create requirement-to-model traceability bridges |
| `gradle runReq2StateMachine` | Create requirement-to-state-machine traceability bridges |
| `gradle runRequirementGen` | Generate requirement documents |
| `gradle runTestEcore` | Run test script against AUV metamodel |
| `gradle runAll` | Run all of the above |

### Via command line

You can run any transformation directly using the `TransformationRunner`:

```bash
gradle run --args="--script path/to/script.eol --emf M=model.xmi;metamodel.ecore"
```

Arguments:
- `--script <path>` — the EOL, EVL, or EGL script to run
- `--emf <spec>` — an EMF model: `Name=modelFile;metamodel1.ecore,metamodel2.ecore[;options]`
- `--json <spec>` — a JSON model: `Name=file.json`

EMF options (appended after metamodels with semicolons):
- `readOnLoad=false` — for new/empty models
- `storeOnDisposal=true` — persist changes after execution
- `meta:uri` — use a registered metamodel URI instead of a file

---

## Core Metamodels

| Metamodel | Namespace URI | Key Classes |
|-----------|---------------|-------------|
| `base.ecore` | `http://www.sawg.org/base` | Element, ModelElement, LangString, Description |
| `requirement.ecore` | `http://www.sawg.org/requirement` | RequirementPackage, FunctionalRequirement, NonFunctionalRequirement |
| `terminology.ecore` | `http://www.sawg.org/terminology` | TerminologyPackage, Concept, Instance |
| `bifrost.ecore` | `http://www.sawg.org/bifrost` | TracePackage, Trace, ExternalReference |

---

## AUV Case Study

### Domain Metamodels

| Metamodel | Description | Corresponding MALCOMp Stage |
|-----------|-------------|---------------------------|
| `terminology.ecore` | Concepts and Instances from requirements | Stage 1: Term Extraction |
| `auv.ecore` | AUV architecture DSL (Module, Platform, etc.) | Stage 2: DSL Extraction |
| `auv.ecore` (instances) | EMF model instances conforming to AUV DSL | Stage 3: EMF Model Creation |
| `robochart.ecore` | RoboChart state machine DSL | Stage 4: State Machine Extraction |

### Model Instances

| File | Description |
|------|-------------|
| `AUV.requirement` | AUV requirements (architecture and behavioural) |
| `example.terminology` | Extracted terminology (concepts and instances) |
| `AUV.model` | AUV architecture model instance |
| `req2concept.bifrost` | Traceability: requirements to terminology concepts |
| `req2DSL.bifrost` | Traceability: requirements to metamodel elements |
| `req2model.bifrost` | Traceability: requirements to model instances |

### Transformation Scripts

| File | Language | Purpose |
|------|----------|---------|
| `req2concept_traceability.eol` | EOL | Traceability bridges: requirements to concepts/instances |
| `req2ecore_traceability.eol` | EOL | Traceability bridges: requirements to Ecore elements |
| `req2emf_model_traceability.eol` | EOL | Traceability bridges: requirements to model instances |
| `req2state_machine_traceability.eol` | EOL | Traceability bridges: requirements to state machine elements |
| `auv_emf_creation.eol` | EOL | Creates the AUV EMF model instance |
| `auv_validation.evl` | EVL | Validates AUV model against constraints |
| `emf2robochart.egl` | EGL | Generates RoboChart DSL code from EMF models |
| `requirement_generation.egl` | EGL | Generates requirement documents |

---

## Dependencies

All dependencies are managed by Gradle and downloaded from Maven Central:

| Dependency | Version | Purpose |
|------------|---------|---------|
| `org.eclipse.epsilon.eol.engine` | 2.8.0 | Epsilon Object Language |
| `org.eclipse.epsilon.evl.engine` | 2.8.0 | Epsilon Validation Language |
| `org.eclipse.epsilon.egl.engine` | 2.8.0 | Epsilon Generation Language |
| `org.eclipse.epsilon.emc.emf` | 2.8.0 | EMF model driver (includes EMF transitively) |
| `org.eclipse.epsilon.emc.json` | 2.8.0 | JSON model driver |

---

## Relationship to MALCOMp

| | MALCOMj | MALCOMp |
|---|---------|---------|
| **Approach** | Manual, hand-crafted | Automated, LLM-generated |
| **Platform** | Java/Gradle + Epsilon | Python/Autogen |
| **Purpose** | Ground-truth reference | Experimental pipeline |
| **Metamodels** | Defined here | Attempts to generate equivalent |
| **Traceability** | EOL scripts create Bifrost bridges | LLM agents generate JSON traces |

The metamodels defined in MALCOMj serve as the validation oracle for MALCOMp's LLM-generated outputs.

---

## Creating a New Case Study

1. Create a new directory under `src/main/resources/examples/`:
   ```
   src/main/resources/examples/my_project/
       metamodel/          Domain-specific metamodels (.ecore, .emf)
       model/              Model instances
       transformation/     EOL/EVL/EGL scripts
   ```

2. Define your domain metamodels that extend the core metamodels in `src/main/resources/metamodel/`.

3. Create requirement models conforming to `requirement.ecore`.

4. Write transformation scripts for traceability, validation, and code generation.

5. Add Gradle tasks in `build.gradle` using the `runTransformation` helper.
