import json
import logging
import os
from pathlib import Path

import autogen
import yaml
from autogen import ConversableAgent
from dotenv import load_dotenv

logger = logging.getLogger(__name__)


class Base:
    """Base class for all MALCOMp pipeline stages.

    Provides shared configuration loading, asset file reading, agent creation,
    group chat setup, and result extraction helpers.
    """

    def __init__(self, stage_name, config_path="config.yaml"):
        load_dotenv()
        self.config = self._load_config(config_path)
        self._validate_env()
        self.stage_config = self.config["stages"][stage_name]
        self.assets_dir = Path(self.config.get("assets_dir", "assets"))
        self.output_dir = Path(self.config.get("output_dir", "output"))
        self.output_dir.mkdir(exist_ok=True)

        self.config_list = self._build_config_list()
        self.default_llm_config = {
            "temperature": self.config["model"].get("temperature", 0.5),
            "config_list": self.config_list,
            "timeout": 600000,
            "cache_seed": None,
        }

        self.requirement_file = self.stage_config["requirement_file"]
        self.user = self._create_user()
        self.agents = []
        self.groupchat = None
        self.group_chat_manager = None

    def _validate_env(self):
        api_type = self.config["model"].get("api_type", "openai")
        if api_type == "anthropic":
            if not os.environ.get("ANTHROPIC_API_KEY"):
                raise EnvironmentError(
                    "ANTHROPIC_API_KEY not set. Add it to your .env file."
                )
        else:
            if not os.environ.get("OPENAI_API_KEY"):
                raise EnvironmentError(
                    "OPENAI_API_KEY not set. Add it to your .env file."
                )

    @staticmethod
    def _load_config(config_path):
        with open(config_path, "r", encoding="utf-8") as f:
            return yaml.safe_load(f)

    def _build_config_list(self):
        api_type = self.config["model"].get("api_type", "openai")
        if api_type == "anthropic":
            return [
                {
                    "model": self.config["model"]["name"],
                    "api_key": os.environ["ANTHROPIC_API_KEY"],
                    "api_type": "anthropic",
                }
            ]
        else:
            return [
                {
                    "model": self.config["model"]["name"],
                    "api_key": os.environ["OPENAI_API_KEY"],
                    "base_url": os.environ.get(
                        "OPENAI_API_BASE",
                        self.config["model"].get("api_base_url", ""),
                    ),
                }
            ]

    def load_asset(self, key):
        """Load an asset file by its config key name."""
        filename = self.stage_config["asset_files"][key]
        path = self.assets_dir / filename
        return path.read_text(encoding="utf-8")

    def create_agent(self, name, system_message, description, **agent_kwargs):
        """Create a ConversableAgent with the default llm_config.

        Any extra keyword arguments are passed directly to ConversableAgent
        (e.g. max_consecutive_auto_reply).
        """
        llm_config = {**self.default_llm_config}
        agent = ConversableAgent(
            name=name,
            llm_config=llm_config,
            system_message=system_message,
            description=description,
            **agent_kwargs,
        )
        self.agents.append(agent)
        return agent

    def _create_user(self):
        return RequirementFeederAgent(
            file_path=self.requirement_file,
            name="User",
            llm_config=False,
            human_input_mode="ALWAYS",
            description="A User to provide the requirements.",
        )

    def init_group_chat(self):
        """Create GroupChat and GroupChatManager from registered agents."""
        all_agents = [self.user] + self.agents
        self.groupchat = autogen.GroupChat(
            agents=all_agents,
            messages=[],
            speaker_selection_method="round_robin",
            max_round=self.stage_config.get("max_rounds", 100),
            send_introductions=True,
        )
        self.group_chat_manager = autogen.GroupChatManager(
            self.groupchat,
            llm_config=self.default_llm_config,
        )

    def run(self, message=""):
        """Execute the pipeline stage: initiate chat, store JSON trace and code artifact."""
        chat_results = self.user.initiate_chat(
            self.group_chat_manager,
            message=message,
            clear_history=True,
        )
        output_cfg = self.stage_config["output"]

        # Store JSON traceability
        self.store_json(
            chat_results,
            agent_name=output_cfg["json_agent"],
            file_name=str(self.output_dir / output_cfg["json_file"]),
            tag_name=output_cfg["json_tag"],
        )

        # Store code artifact if configured
        if "code_agent" in output_cfg and "code_file" in output_cfg:
            self._store_last_agent_output(
                chat_results,
                agent_name=output_cfg["code_agent"],
                file_name=str(self.output_dir / output_cfg["code_file"]),
            )

        return chat_results

    def store_json(self, chat_results, agent_name, file_name, tag_name):
        """Extract JSON from an agent's messages and save to file."""
        content = [
            item["content"]
            for item in chat_results.chat_history
            if item.get("name") == agent_name
        ]
        data = {tag_name: []}
        for item in content:
            try:
                parsed = json.loads(item)
                if isinstance(parsed, list):
                    data[tag_name].extend(parsed)
                else:
                    data[tag_name].append(parsed)
            except json.JSONDecodeError as e:
                logger.warning("Skipping unparseable JSON from %s: %s", agent_name, e)

        with open(file_name, "w", encoding="utf-8") as f:
            json.dump(data, f, indent=4)
        logger.info("Stored JSON trace to %s", file_name)

    def _store_last_agent_output(self, chat_results, agent_name, file_name):
        """Extract the last message from a named agent and write to file."""
        last_content = next(
            (
                entry["content"]
                for entry in reversed(chat_results.chat_history)
                if entry.get("name") == agent_name
            ),
            None,
        )
        if last_content:
            with open(file_name, "w", encoding="utf-8") as f:
                f.write(last_content)
            logger.info("Stored %s output to %s", agent_name, file_name)
        else:
            logger.warning("No output found from agent %s", agent_name)


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
