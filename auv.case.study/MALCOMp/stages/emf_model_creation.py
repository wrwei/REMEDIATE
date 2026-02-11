import logging
import sys
import os

sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
from base import Base

logger = logging.getLogger(__name__)


class EMFModelCreation(Base):

    def __init__(self, config_path="config.yaml"):
        super().__init__("emf_model_creation", config_path)

        # Load assets
        system_desc = self.load_asset("system_description")
        few_shot_creation = self.load_asset("few_shot_model_creation")
        few_shot_checker = self.load_asset("few_shot_model_checker")
        cot_creation = self.load_asset("chain_of_thought_creation")
        cot_checker = self.load_asset("chain_of_thought_checker")
        cot_trace = self.load_asset("chain_of_thought_trace")
        term_extraction = self.load_asset("extracted_terms")
        dsl = self.load_asset("dsl_source")

        # Model Creator agent
        self.model_creator = self.create_agent(
            name="Model_Creator",
            system_message=(
                "You are an expert in Model Driven Engineering (MDE). "
                "You are experienced in creating EMF (Eclipse Modelling Framework) models using the Epsilon Object Language (EOL). "
                "Your job is to write an EOL program to create an EMF model that conforms to the EMF metamodel (written in the Emfatic language) in here: " + dsl +
                "You should base your answer on the requirements provided to you by User. "
                "The Concepts extracted (in JSON) from the requirements are here: " + term_extraction +
                "Consult the thinking process here: " + cot_creation +
                "Here are some examples based on input requirements:" + few_shot_creation +
                "You should also consult the code produced by Model_Refactor. "
                "You must only include EOL code in your responses. "
                "Do not include any other contents that are not provided to you. "
                "Please do not include explanations in your answers. Do not include markdowns (no ```). "
            ),
            description="A EMF model creator using EOL, based on the inputs and responses from the User.",
        )

        # Model Checker agent
        self.model_checker = self.create_agent(
            name="Model_Checker",
            system_message=(
                "You are an expert in Model Driven Engineering (MDE). "
                "You are experienced in creating EMF (Eclipse Modelling Framework) models using the Epsilon Object Language (EOL). "
                "Your job is to check if the EOL program provided to you is correct, and respond with the correct EOL code."
                "You should base your answer on both the EMF metamodel (written in Emfatic) here:" + dsl +
                ", and the requirements provided by User. "
                "The description of the system to be developed is here: " + system_desc +
                "The Concepts extracted (in JSON) from the requirements are here: " + term_extraction +
                "Consult the thinking process in here: " + cot_checker +
                "Here are some examples of the extracted metamodels based on inputs:" + few_shot_checker +
                "You must only include EOL code in your responses."
                "Do not include any other contents that are not provided to you. "
                "Please do not include explanations in your answers. In addition, no markdown is permitted (no ```). "
            ),
            description="A program checker to check the syntax of the EOL code.",
        )

        # Model Refactorer agent
        self.model_refactorer = self.create_agent(
            name="Model_Refactorer",
            system_message=(
                "You are an expert in Model Driven Engineering (MDE), and you are working with some experts in creating models that conform to a metamodel written in the Emfatic language. "
                "Model_Creator has created the source code in Epsilon Object Language (EOL) based on the inputs from User. "
                "Model_Checker has checked the syntax of the EOL code. "
                "Your job is to organise and refactor the EOL code (when necessary) provided by them. "
                "In every round, you provide your answer, you need to combine with your previous answer and update them. "
                "Your answer needs to be correctly written in EOL. "
                "Do not include any other contents that are not provided to you. "
                "If no further answer can be provided, repeat your last answer. "
                "Please only provide EOL code in your answers. Do not explain (no ```). "
            ),
            description="A Model_Summariser to summerise the code from Model_Checker.",
        )

        # JSON Generator agent for traceability
        self.json_generator = self.create_agent(
            name="Json_Generator",
            system_message=(
                "You are an expert in Model Driven Engineering (MDE). "
                "You are experienced in creating EMF (Eclipse Modelling Framework) models using languages provided by the Eclipse Epsilon platform. "
                "Specifically, you use the Epsilon Object Language (EOL) to create EMF models programmatically. "
                "Your job is to generate a JSON element by analysing the EOL code (provided by Model_Checker) for model creation, and the requirement provided by User every round. "
                "The metamodel (created using the Emfatic language) for the model to be created is here: " + dsl +
                "Here are some guidance to help you: " + cot_trace +
                "Your answer should be in the following JSON format : "
                '{"requirement_gid" : ${the gid of the requirement provided by User}, '
                '"Model_Element" : ${the name of the class created by the EOL code}, '
                '"Model_Element_id" : ${the name or the id of the object created for the above class}, '
                '"Model_attribute": ${the name of the attributes set by the EOL code}, '
                '"Attribute_value": ${the value of the above attribute set by the EOL code}, '
                '"Model_reference":${the name of the references set by the EOL code} } '
                '"Reference_value":${the name or the id of the value set for the above reference} } '
                "If the EOL code creates multiple model elements, please create a JSON list with multiple JSON entries, like so: [$JSON entry, $JSON entry, ... $JSON entry]."
                " The Output format is JSON only, no markdown permitted (no ```), no explain."
            ),
            description="A Json_Generator to generate a JSON element based on the EOL code provided by Model_Checker and the requirement provided by User every round.",
        )

        self.init_group_chat()


if __name__ == "__main__":
    logging.basicConfig(level=logging.INFO)
    EMFModelCreation().run()
