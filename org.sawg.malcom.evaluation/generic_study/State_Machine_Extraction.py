import autogen
from autogen import ConversableAgent, UserProxyAgent

from Base import Base

class State_Machine_Extractor(Base):

    def __init__(self):
        # The ecore metamodel of RoboChart
        with open('assets/RoboChart_ecore.txt', 'r', encoding='utf-8') as ecore:
            RoboChart_ecore = ecore.read()

        # The xtext syntax of robochart
        with open('assets/Xtext.txt', 'r', encoding='utf-8') as Xtext:
            xtext = Xtext.read()

        # API and Key configuration
        with open('assets/LRE.txt', 'r', encoding='utf-8') as LRE:
            lre = LRE.read()

        with open('assets/code_snippet_1.txt', 'r', encoding='utf-8') as Code:
            code = Code.read()

        with open('assets/code_snippet_2.txt', 'r', encoding='utf-8') as Code2:
            code2 = Code2.read()

        with open('assets/code_snippet_3.txt', 'r', encoding='utf-8') as Code3:
            code3 = Code3.read()

        with open('assets/semantic.txt', 'r', encoding='utf-8') as Semantic:
            semantic = Semantic.read()

        self.requirement_file = "assets/requirement_behaviour.json"
        self.user = super().getUser()

        self.modeller = ConversableAgent(
            name="Modeller",
            max_consecutive_auto_reply=1,
            llm_config={
                "temperature": 0.5,
                "config_list": super().getConfigList(),
            },
            system_message=
            'You are an expert in Domain Specific Modelling and Requirement Engineering. ' +
            'You will be provided with requirement statements from User.\n\n' +
            'METAMODEL:\n' +
            'Here is a metamodel written in the Emfatic language for RoboChart which includes a state machine and other modules:\n' + RoboChart_ecore + '\n\n' +
            'XTEXT GRAMMAR:\n' +
            'Here is an Xtext grammar that conforms to the ecore. ' +
            'You need to know the link between the Xtext and ecore so that you can understand the code examples below.\n' + xtext + '\n\n' +
            'CODE EXAMPLES:\n' +
            'Here are example codes written in the DSL which conforms to the Xtext. ' +
            'Please understand the codes, especially the syntax and semantics:\n' + code + '\n\n' +
            'Here is the second example, please follow the syntax and semantics of the code:\n' + code2 + '\n\n' +
            'SEMANTIC EXAMPLE:\n' +
            'Here is an example of a state and a transition when an event is triggered in DSL:\n' + semantic + '\n\n' +
            'TASK:\n' +
            'Please find the States, Transitions, Constants, Events and Functions. ' +
            'Create only one state machine written in the DSL and the syntax that conforms to the code examples.\n\n' +
            'STATE MACHINE CONCEPTS:\n' +
            '- State machines define behaviour using States, Junctions, and the possible Transitions among them.\n' +
            '- States and Transitions also make use of: Events, Variables, required Interfaces, defined Interfaces, and Clocks; such elements can be used by the States and Transitions to accomplish the state machine\'s function.\n' +
            '- The actions of states can be specified as being executed on entry, during, or on exit of the state.\n' +
            '- Actions are defined using a simple action language which contains among other things: operation calls, conditionals, event input and output.\n' +
            '- States can also be composite and so contain a state machine that is executed when that state is entered.\n' +
            '- Transitions connect States and Junctions and they can have any combination of triggers, guards, or action statements that specify the conditions when a transition will occur.\n' +
            '- Triggers cause a transition to be taken on the occurrence of a particular event. Optional start and end deadlines can be given to triggers supporting the specification of time properties of the system.\n' +
            '- Guards are a boolean expression that only allow a transition to be taken when it evaluates to true, providing greater control over the transitions between states.\n' +
            '- The action statement enables any required actions to be executed on the occurrence of a transition.\n\n' +
            'RULES:\n' +
            '- If an event is triggered, you also need to define the event in the code.\n' +
            '- The initial state is usually defined as i0.\n' +
            '- When you use a function, you need to define the function in the code. Example: function odist ( o : Obstacle ) : real { }.\n' +
            '- The transition and state should be separated, and the function should be defined outside the state machine.\n' +
            '- Please check whether Variables, Events, Constants, Functions, and States are all defined correctly.',
            description='A Modeller to give the code based on the response from User.'
        )

        self.json_generator = ConversableAgent(
            name="Json_Generator",
            max_consecutive_auto_reply=1,
            llm_config={
                "temperature": 0.5,
                "config_list": super().getConfigList(),

            },
            system_message='You are an expert in Model Driven Engineering (MDE).' +
                           'Your job is to generate JSON elements based on the  requirement statements provided by User, and the code provided by Modeller.' +
                           'For instance, the requirement statement may contain a source state, an end state, a transition, an id. ' +
                           'Your answer should be in the form of a JSON format : {"requirement_gid" : ${the id of the requirement } , "source state" : ${the source state of the requirement}, "end state": ${the end state of the requirement}, "transition":${the transition from source to target of the requirement}' +
                           'The id needs to conform to the id of the original statement provided by User.' +
                           'You may provide multiple JSON elements and organise them in one array that conforms to JSON syntax. ' +
                           'The Output format is JSON only, no markdown permitted (no ```), no explain.',
            description='A Json_Generator to generate JSON elements based on the requirement statements provided by User and the code provided by Modeller.'
        )

        groupchat = autogen.GroupChat(
            agents=[self.user, self.modeller, self.json_generator],
            messages=[],
            speaker_selection_method='round_robin',
            max_round=500,
            send_introductions=True
        )

        super().init_group_chat_manager()

    def main(self):
        state_machine_extractor = State_Machine_Extractor()

        chat_results = state_machine_extractor.user.initiate_chat(
            state_machine_extractor.groupt_chat_manager,
            message=[],
            clear_history=True,
        )

        state_machine_extractor.storeJSON(chat_results, "Json_Generator", "assets/result_statemachine_extraction.json", "stm_trace")

        data = chat_results.chat_history

        last_Checker_content = next((entry['content'] for entry in reversed(data) if entry.get('name') == 'Checker'), None)

        if last_Checker_content:
            with open('results/STM.txt', 'w', encoding='utf-8') as file:
                file.write(last_Checker_content)

        last_Json_Generator_content = next(
            (entry['content'] for entry in reversed(data) if entry.get('name') == 'Json_Generator'), None)

        if last_Json_Generator_content:
            with open('results/trace.json', 'w', encoding='utf-8') as file:
                file.write(last_Json_Generator_content)



