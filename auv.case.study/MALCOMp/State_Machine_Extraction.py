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
            system_message='You are an expert in Domain Specific Modelling and Requirement Engineering.' +
                           'You will be provided with requirement statements from User.' +
                           'Here is an metamodel written in the Emfatic language for Robochart which includes a state machine and other modules: \n' + RoboChart_ecore + '\n' +
                           'Here is an Xtext that conforms to the ecore: \n' + xtext + '\n' +
                           'You need to know the link between the Xtext and ecore so that you can understand the code next.' +
                           '\n Here are example codes that are written in DSL which conforms to the Xtext. Please understand the codes, especially the syntax and semantics: \n' + code + '\n' +
                           '\n Here is the second example, please follow the syntax and semantics of the code:\n' + code2 +
                           '\n Please find the States, Transitions, Constants, Events and Functions.' +
                           'Create only one state machine written in the DSL and the syntax that comforms to the code examples. ' +
                           'State machines define behaviour using States, Junctions, and the possible Transitions among them. ' +
                           'States and Transitions also make use of the other elements that make up state machines which are: Events, Variables, required Interfaces, defined Interfaces, and Clocks; such elements can be used by the States and Transitions to accomplish the state machine\'s function.' +
                           'The actions of states can be specified as being executed on entry, during, or on exit of the state. ' +
                           'Actions are defined using a simple action language which contains among other things: operation calls, conditionals, event input and output. ' +
                           'States can also be composite and so contain a state machine that is executed when that state is entered. ' +
                           'Transitions connect States and Junctions and they can have any combination of triggers, guards, or action statements that specify the conditions when a transition will occur. ' +
                           'Triggers cause a transition to be taken on the occurrence of a particular event. ' +
                           'Optional start and end deadlines can be given to triggers supporting the specification of time properties of the system. ' +
                           'The guards are a boolean expression that only allow a transition to be taken when it evaluates to true, providing greater control over the transitions between states. ' +
                           'The action statement enables any required actions to be executed on the occurrence of a transition.\n' +
                           'Here is an example of a state and a transition when an event is triggered in DSL: \n' + semantic +
                           'If an event is triggered, you need also define the event in the code. And the initial state is usually defined as i0. ' +
                           'When you use a function, you need to define the function in the code. The example is: function odist ( o : Obstacle ) : real { }. ' +
                           'You need to notice that, the transition and state should be seperated, and the function should be defined outside the state machine. ' +
                           'Please check whether Variables, Events, Constants, Functions, and States are all defined correctly.',
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
                           'Your job is to generate some json element based on the  requirement statements provided by User, and the code provided by Modeller.' +
                           'For instance, the requirement statement may contain a source state, an end state, a transition, a id.' +
                           'Your answer should be in the form of a JSON format : {"requirement_gid" : ${the id of the requirement } , "source state" : ${the source state of the requirement}, "end state": ${the end state of the requirement}, "transition":${the transition from source to target of the requirement}' +
                           'The id need to conform to the id of original statement provided by User.' +
                           'You may provide some more JSON elements and organised them in one array that confomrs to the JSON syntax.' +
                           'The Output format is JSON only, no markdown permitted (no ```), no explain.',
            description='A Json_Generator to generate JSON elements based on the requirement statements provided by Modeller and the code provided by Checker.'
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



