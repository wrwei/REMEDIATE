# Switching LLM Models in MALCOMp

MALCOMp supports multiple LLM providers through Autogen's model configuration system. Switching models requires changes to two files: `config.yaml` and `.env`.

---

## Quick Reference

Edit the `model:` block in `config.yaml` and set the matching API key in `.env`:

| Provider | `api_type` | `.env` variable | Install command |
| -------- | ---------- | --------------- | --------------- |
| OpenAI | `"openai"` | `OPENAI_API_KEY` | `pip install pyautogen` |
| Anthropic | `"anthropic"` | `ANTHROPIC_API_KEY` | `pip install pyautogen[anthropic]` |

---

## OpenAI (GPT models)

### config.yaml

```yaml
model:
  name: "gpt-4o"
  temperature: 0.5
  api_type: "openai"
  api_base_url: "https://api.openai.com/v1"
```

### .env

```
OPENAI_API_KEY=sk-your-openai-key-here
```

### Available models

| Model | `name` value |
| ----- | ------------ |
| GPT-4o | `"gpt-4o"` |
| GPT-4o mini | `"gpt-4o-mini"` |
| GPT-4 Turbo | `"gpt-4-turbo"` |
| GPT-4 | `"gpt-4"` |

### Using an OpenAI-compatible endpoint

If you use a proxy or self-hosted endpoint that is compatible with the OpenAI API, set `api_base_url` to that endpoint:

```yaml
model:
  name: "gpt-4o"
  temperature: 0.5
  api_type: "openai"
  api_base_url: "https://your-proxy.example.com/v1"
```

You can also override the base URL at runtime without editing `config.yaml` by setting an environment variable in `.env`:

```
OPENAI_API_KEY=sk-your-key
OPENAI_API_BASE=https://your-proxy.example.com/v1
```

The `OPENAI_API_BASE` environment variable takes precedence over `api_base_url` in `config.yaml`.

---

## Anthropic (Claude models)

### Install

The Anthropic provider requires an extra dependency:

```
pip install pyautogen[anthropic]
```

### config.yaml

```yaml
model:
  name: "claude-sonnet-4-5-20250929"
  temperature: 0.5
  api_type: "anthropic"
```

Note: `api_base_url` is not needed for Anthropic — it uses the official API endpoint automatically.

### .env

```
ANTHROPIC_API_KEY=sk-ant-your-anthropic-key-here
```

### Available models

| Model | `name` value |
| ----- | ------------ |
| Claude Opus 4.6 | `"claude-opus-4-6"` |
| Claude Sonnet 4.5 | `"claude-sonnet-4-5-20250929"` |
| Claude Haiku 4.5 | `"claude-haiku-4-5-20251001"` |

---

## Configuration Fields

The `model:` block in `config.yaml` has the following fields:

| Field | Required | Default | Description |
| ----- | -------- | ------- | ----------- |
| `name` | Yes | - | The model identifier string (e.g. `"gpt-4o"`, `"claude-sonnet-4-5-20250929"`) |
| `temperature` | No | `0.5` | Sampling temperature. Lower values (e.g. `0.2`) produce more deterministic output; higher values (e.g. `0.8`) produce more varied output |
| `api_type` | No | `"openai"` | The LLM provider: `"openai"` or `"anthropic"` |
| `api_base_url` | No | `""` | Base URL for OpenAI-compatible endpoints. Ignored when `api_type` is `"anthropic"` |

---

## Examples

### Use Claude Opus for highest quality

```yaml
model:
  name: "claude-opus-4-6"
  temperature: 0.3
  api_type: "anthropic"
```

### Use GPT-4o mini for faster, cheaper runs

```yaml
model:
  name: "gpt-4o-mini"
  temperature: 0.5
  api_type: "openai"
  api_base_url: "https://api.openai.com/v1"
```

### Use Claude Haiku for fast iteration during development

```yaml
model:
  name: "claude-haiku-4-5-20251001"
  temperature: 0.5
  api_type: "anthropic"
```

---

## Keeping Both Keys

You can keep both API keys in `.env` at the same time. Only the one matching the current `api_type` in `config.yaml` will be used:

```
OPENAI_API_KEY=sk-your-openai-key
ANTHROPIC_API_KEY=sk-ant-your-anthropic-key
```

This lets you switch between providers by changing only the `model:` block in `config.yaml`, without editing `.env`.

---

## Troubleshooting

| Problem | Solution |
| ------- | -------- |
| `EnvironmentError: OPENAI_API_KEY not set` | Your `api_type` is `"openai"` but `OPENAI_API_KEY` is missing from `.env` |
| `EnvironmentError: ANTHROPIC_API_KEY not set` | Your `api_type` is `"anthropic"` but `ANTHROPIC_API_KEY` is missing from `.env` |
| `ModuleNotFoundError: No module named 'anthropic'` | Run `pip install pyautogen[anthropic]` |
| `AuthenticationError` or `401` | Your API key is invalid or expired — regenerate it from the provider's dashboard |
| `InvalidRequestError` on model name | The model ID is incorrect — check the available models tables above |
| Unexpected output quality | Try adjusting `temperature` — lower values (0.2-0.3) give more consistent results for code generation tasks |
