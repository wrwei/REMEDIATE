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
        lre = self.load_asset("lre")
        code1 = self.load_asset("code_snippet_1")
        code2 = self.load_asset("code_snippet_2")
        code3 = self.load_asset("code_snippet_3")
        semantic = self.load_asset("semantic")

        # Modeller agent
        self.modeller = self.create_agent(
            name="Modeller",
            system_message=(
                "You are an expert in Domain Specific Modelling and Requirement Engineering."
                "You will be provided with requirement statements from User."
                "Here is an metamodel written in the Emfatic language for Robochart which includes a state machine and other modules: \n" + robochart_ecore + "\n"
                "Here is an Xtext that conforms to the ecore: \n" + xtext + "\n"
                "You need to know the link between the Xtext and ecore so that you can understand the code next."
                "\n Here are example codes that are written in DSL which conforms to the Xtext. Please understand the codes, especially the syntax and semantics: \n" + code1 + "\n"
                "\n Here is the second example, please follow the syntax and semantics of the code:\n" + code2 +
                "\n Please find the States, Transitions, Constants, Events and Functions."
                "Create only one state machine written in the DSL and the syntax that conforms to the code examples. "
                "State machines define behaviour using States, Junctions, and the possible Transitions among them. "
                "States and Transitions also make use of the other elements that make up state machines which are: Events, Variables, required Interfaces, defined Interfaces, and Clocks; such elements can be used by the States and Transitions to accomplish the state machine's function."
                "The actions of states can be specified as being executed on entry, during, or on exit of the state. "
                "Actions are defined using a simple action language which contains among other things: operation calls, conditionals, event input and output. "
                "States can also be composite and so contain a state machine that is executed when that state is entered. "
                "Transitions connect States and Junctions and they can have any combination of triggers, guards, or action statements that specify the conditions when a transition will occur. "
                "Triggers cause a transition to be taken on the occurrence of a particular event. "
                "Optional start and end deadlines can be given to triggers supporting the specification of time properties of the system. "
                "The guards are a boolean expression that only allow a transition to be taken when it evaluates to true, providing greater control over the transitions between states. "
                "The action statement enables any required actions to be executed on the occurrence of a transition.\n"
                "Here is an example of a state and a transition when an event is triggered in DSL: \n" + semantic +
                "If an event is triggered, you need also define the event in the code. And the initial state is usually defined as i0. "
                "When you use a function, you need to define the function in the code. The example is: function odist ( o : Obstacle ) : real { }. "
                "You need to notice that, the transition and state should be seperated, and the function should be defined outside the state machine. "
                "Please check whether Variables, Events, Constants, Functions, and States are all defined correctly."
            ),
            description="A Modeller to give the code based on the response from User.",
            max_consecutive_auto_reply=1,
        )

        # JSON Generator agent for traceability
        self.json_generator = self.create_agent(
            name="Json_Generator",
            system_message=(
                "You are an expert in Model Driven Engineering (MDE)."
                "Your job is to generate some json element based on the  requirement statements provided by User, and the code provided by Modeller."
                "For instance, the requirement statement may contain a source state, an end state, a transition, a id."
                'Your answer should be in the form of a JSON format : {"requirement_gid" : ${the id of the requirement } , "source state" : ${the source state of the requirement}, "end state": ${the end state of the requirement}, "transition":${the transition from source to target of the requirement}'
                "The id need to conform to the id of original statement provided by User."
                "You may provide some more JSON elements and organised them in one array that conforms to the JSON syntax."
                "The Output format is JSON only, no markdown permitted (no ```), no explain."
            ),
            description="A Json_Generator to generate JSON elements based on the requirement statements provided by User and the code provided by Modeller.",
            max_consecutive_auto_reply=1,
        )

        self.init_group_chat()


if __name__ == "__main__":
    logging.basicConfig(level=logging.INFO)
    StateMachineExtraction().run()
