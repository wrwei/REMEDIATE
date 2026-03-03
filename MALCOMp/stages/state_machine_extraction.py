import logging
import sys
import os

sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
from base import Base

logger = logging.getLogger(__name__)


class StateMachineExtraction(Base):

    def __init__(self, config_path="config.yaml"):
        super().__init__("state_machine_extraction", config_path)

        # Load assets
        robochart_ecore = self.load_asset("robochart_ecore")
        xtext = self.load_asset("xtext")
        code1 = self.load_asset("code_snippet_1")
        code2 = self.load_asset("code_snippet_2")
        semantic = self.load_asset("semantic")

        # Modeller agent
        self.modeller = self.create_agent(
            name="Modeller",
            system_message=(
                # Role
                "You are an expert in Domain Specific Modelling and Requirement Engineering. "
                "You will be provided with requirement statements from User.\n\n"
                # Reference materials
                "METAMODEL:\n"
                "Here is a metamodel written in the Emfatic language for RoboChart which includes a state machine and other modules:\n" + robochart_ecore + "\n\n"
                "XTEXT GRAMMAR:\n"
                "Here is an Xtext grammar that conforms to the ecore. "
                "You need to know the link between the Xtext and ecore so that you can understand the code examples below.\n" + xtext + "\n\n"
                "CODE EXAMPLES:\n"
                "Here are example codes written in the DSL which conforms to the Xtext. "
                "Please understand the codes, especially the syntax and semantics:\n" + code1 + "\n\n"
                "Here is the second example, please follow the syntax and semantics of the code:\n" + code2 + "\n\n"
                "SEMANTIC EXAMPLE:\n"
                "Here is an example of a state and a transition when an event is triggered in DSL:\n" + semantic + "\n\n"
                # Task
                "TASK:\n"
                "Please find the States, Transitions, Constants, Events and Functions. "
                "Create only one state machine written in the DSL and the syntax that conforms to the code examples.\n\n"
                # Domain knowledge
                "STATE MACHINE CONCEPTS:\n"
                "- State machines define behaviour using States, Junctions, and the possible Transitions among them.\n"
                "- States and Transitions also make use of: Events, Variables, required Interfaces, defined Interfaces, and Clocks; such elements can be used by the States and Transitions to accomplish the state machine's function.\n"
                "- The actions of states can be specified as being executed on entry, during, or on exit of the state.\n"
                "- Actions are defined using a simple action language which contains among other things: operation calls, conditionals, event input and output.\n"
                "- States can also be composite and so contain a state machine that is executed when that state is entered.\n"
                "- Transitions connect States and Junctions and they can have any combination of triggers, guards, or action statements that specify the conditions when a transition will occur.\n"
                "- Triggers cause a transition to be taken on the occurrence of a particular event. Optional start and end deadlines can be given to triggers supporting the specification of time properties of the system.\n"
                "- Guards are a boolean expression that only allow a transition to be taken when it evaluates to true, providing greater control over the transitions between states.\n"
                "- The action statement enables any required actions to be executed on the occurrence of a transition.\n\n"
                # Rules
                "RULES:\n"
                "- If an event is triggered, you also need to define the event in the code.\n"
                "- The initial state is usually defined as i0.\n"
                "- When you use a function, you need to define the function in the code. Example: function odist ( o : Obstacle ) : real { }.\n"
                "- The transition and state should be separated, and the function should be defined outside the state machine.\n"
                "- Please check whether Variables, Events, Constants, Functions, and States are all defined correctly."
            ),
            description="A Modeller to give the code based on the response from User.",
            #max_consecutive_auto_reply=1,
        )

        # JSON Generator agent for traceability
        self.json_generator = self.create_agent(
            name="Json_Generator",
            system_message=(
                "You are an expert in Model Driven Engineering (MDE). "
                "Your job is to generate JSON elements based on the requirement statements provided by User, and the code provided by Modeller. "
                "For instance, the requirement statement may contain a source state, an end state, a transition, and an id. "
                'Your answer should be in the form of a JSON format : {"requirement_gid" : ${the id of the requirement } , "source state" : ${the source state of the requirement}, "end state": ${the end state of the requirement}, "transition":${the transition from source to target of the requirement}'
                "The id needs to conform to the id of the original statement provided by User. "
                "You may provide multiple JSON elements and organise them in one array that conforms to JSON syntax. "
                "The Output format is JSON only, no markdown permitted (no ```), no explain."
            ),
            description="A Json_Generator to generate JSON elements based on the requirement statements provided by User and the code provided by Modeller.",
            # max_consecutive_auto_reply=1,
        )

        self.init_group_chat()


if __name__ == "__main__":
    logging.basicConfig(level=logging.INFO)
    StateMachineExtraction().run()
