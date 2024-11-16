import json
import os
import autogen
from autogen import ConversableAgent

class Base:
    # set API and keyu
    os.environ["OPENAI_API_BASE"] = "https://a.fe8.cn/v1"
    os.environ["OPENAI_API_KEY"] = "sk-jxGxEstKGNXlwD4gaFIIveFQOAWm7hRxUZth8k191o5m8DE4"

    def __init__(self):
        self.groupchat = None
        self.user = None
        self.requirement_file = None
        self.config_list = None
        self.groupt_chat_manager = None

    def getUser(self):
        self.user = MyConversableAgent(
            file_path=self.requirement_file,
            name = "User",
            llm_config = False,
            human_input_mode='ALWAYS',
            description='A User to provide the requirements.'
        )
        return self.user

    def getConfigList(self):
        self.config_list = [
            {
                "model": "gpt-4o",
                "api_key": os.environ.get("OPENAI_API_KEY"),
                "base_url": os.environ.get("OPENAI_API_BASE"),
            },
        ]
        return self.config_list

    def init_group_chat_manager(self):
        self.groupt_chat_manager = autogen.GroupChatManager(
            self.groupchat,
            llm_config={
                "temperature": 0.5,
                "config_list": self.config_list,
            }
        )

    def storeJSON(self, chat_results, agent_name, file_name, tag_name):
        content = [item['content'] for item in chat_results.chat_history if item.get('name') == agent_name]
        temp = "{\"" + tag_name+ "\": []}"
        data = json.loads(temp)
        with open(file_name, 'w') as f:
            json.dump(data, f, indent=4)
        for item in content:
            try:
                parsed_json = json.loads(item)
                if type(parsed_json) is list:
                    for sub_json in parsed_json:
                        data[tag_name].append(sub_json)
                else:
                    data[tag_name].append(parsed_json)
            except json.JSONDecodeError as e:
                print(f"Error parsing JSON: {e}")
        with open(file_name, 'w') as file:
            json.dump(data, file, indent=4)

class MyConversableAgent(ConversableAgent):
    def __init__(self, file_path, *args, **kwargs, ):
        super().__init__(*args, **kwargs)
        self.file_path = file_path  # Path to your input file
        self.current_index = 0  # Track the current index of req array
        with open(self.file_path, 'r', encoding="utf-8") as file:
            self.data = json.load(file)['requirements']

    def get_human_input(self, prompt: str) -> str:
        """
        Override to customize the way to get human input.
        For example, read input from a JSON file.
        Args:
            prompt (str): prompt for the human input.
        Returns:
            str: human input from a JSON file.
        """
        if self.current_index < len(self.data):
            # Get the current item from req array
            item = self.data[self.current_index]
            # Convert the item to string format
            reply = json.dumps(item)
            self.current_index += 1
        else:
            reply = "exit"  # Or any other suitable message
        self._human_input.append(reply)
        return reply