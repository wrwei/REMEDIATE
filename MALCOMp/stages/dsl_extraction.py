import logging
import sys
import os

sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
from base import Base

logger = logging.getLogger(__name__)


class DSLExtraction(Base):

    def __init__(self, config_path="config.yaml"):
        super().__init__("dsl_extraction", config_path)

        # Load assets
        system_desc = self.load_asset("system_description")
        few_shot_extraction = self.load_asset("few_shot_dsl_extraction")
        few_shot_checker = self.load_asset("few_shot_dsl_checker")
        cot_extraction = self.load_asset("chain_of_thought_extraction")
        cot_checker = self.load_asset("chain_of_thought_checker")
        extracted_terms = self.load_asset("extracted_terms")
        emfatic_rules = self.load_asset("emfatic_rules")

        # DSL Extractor agent
        self.dsl_extractor = self.create_agent(
            name="DSL_Extractor",
            system_message=(
                "You are an expert in Model Driven Engineering (MDE). "
                'You are experienced in creating "Domain Specific Languages (DSLs)" or "metamodels". '
                "A metamodel contains the abstract syntax to capture the concepts for the system to be developed. "
                "You have extensive experience in creating metamodels using the Ecore modeling language provided by the Eclipse Modeling Framework (EMF). "
                "You are also an expert in creating metamodels using the Emfatic language (a textual syntax for Ecore) to create metamodels. "
                "Your job is to create a metamodel written in Emfatic based on the requirements provided to you in JSON. "
                "The description of the system to be developed is here: " + system_desc +
                "Previously, a Term model is extracted, in here: " + extracted_terms +
                "Here are some thinking processes to guide you: " + cot_extraction +
                "Here are some examples of the extracted metamodels based on inputs:" + few_shot_extraction +
                "Consider also the previous inputs from the User. "
                "When building your Emfatic code, incorporate and build upon the code from your previous answers. "
                "You must only include Emfatic code in your responses. "
                "Do not include any other contents that are not provided to you. "
                "Please do not include explanations in your answers. In addition, no markdown is permitted (no ```). "
            ),
            description="A DSL extractor to create metamodels using Emfatic based on the input and responses from the User.",
        )

        # DSL Checker agent
        self.dsl_checker = self.create_agent(
            name="DSL_Checker",
            system_message=(
                "You are an expert in Model Driven Engineering (MDE). "
                'Specifically, you are experienced in creating "Domain Specific Languages (DSLs)" or "metamodels". '
                "A metamodel contains the abstract syntax to capture the concepts for the system to be developed. "
                "You have extensive experience in creating metamodels using the Ecore modeling language provided by the Eclipse Modeling Framework (EMF). "
                "You are also an expert in using the Emfatic language (a textual syntax for Ecore) to create metamodels. "
                "The description of the system to be developed is here: " + system_desc +
                "A description of the language syntax for Emfatic is here: " + emfatic_rules +
                "Your job is to check whether the metamodel provided to you written in Emfatic is correct. "
                "You should also consult the thinking process in here: " + cot_checker +
                "Here are some examples of the extracted metamodels based on inputs:" + few_shot_checker +
                "You should also consult the terms extracted previously (but do not rely on it completely): " + extracted_terms +
                "You must only include Emfatic code in your responses. "
                "Do not include any other contents that are not provided to you. "
                "Please do not include explanations in your answers. In addition, no markdown is permitted (no ```). "
            ),
            description="A DSL_Checker to check the syntax of Emfatic code.",
        )

        # DSL Refactorer agent
        self.dsl_refactorer = self.create_agent(
            name="DSL_Refactor",
            system_message=(
                'You are an expert in Model Driven Engineering (MDE), and you are working with some experts in creating "Domain Specific Languages (DSLs)" or "metamodels". '
                "DSL_Extractor has created the DSL using Emfatic based on the inputs from User. "
                "DSL_Checker has checked the syntax of the Emfatic code. "
                "Your job is to organise and refactor (when necessary) the Emfatic code provided by DSL_Checker. "
                "When you provide your answer, you need to combine it with your previous answer and update them in one package. "
                "Pay attention to containment and non-containment references. "
                'In the requirement, when it says "A contains B" or "A defines B", it often denotes a containment reference. '
                'In the requirement, when it says "A uses B" or "A refers to B", it often denotes a non-containment reference. '
                "Refactor references when necessary by looking at the requirements as a whole. "
                "Your answer needs to be correctly written in Emfatic. "
                "You must include only Emfatic code in your responses. "
                "Do not include any other contents that are not provided to you. "
                "Please do not explain. In addition, no markdown is permitted (no ```)"
            ),
            description="A DSL_Refactor to organise and refactor the code from DSL_Checker.",
        )

        # JSON Generator agent for traceability
        self.json_generator = self.create_agent(
            name="Json_Generator",
            system_message=(
                "You are an expert in Model Driven Engineering (MDE). "
                "Your job is to generate a traceability JSON element based on the Emfatic code provided by DSL_Refactor and the requirement in JSON provided by User. "
                "In the Emfatic code provided to you by DSL_Refactor, you shall identify which class, attributes, references and operations are created, based on the requirement JSON provided by User"
                "Your answer should be in the following JSON format : "
                '{"requirement_gid" : ${the gid of the requirement provided by User}, '
                '"Emfatic_class" : ${the class name provided by DSL_Refactor}, '
                '"Emfatic_attributes": ${the "attr"s that the class contains (if not null)}, '
                '"Emfatic_references":${the "ref"s or "val"s that the class contains (if not null)}, '
                '"Emfatic_operations": ${the "op"s that class contains (if not null)} }'
                "If the Emfatic code creates multiple classes, please create a JSON list with multiple JSON entries, like so: [$JSON entry, $JSON entry, ... $JSON entry]."
                " The Output format is JSON only, no markdown permitted (no ```), no explain."
            ),
            description="A Json_Generator to generate a JSON element based on the Emfatic code provided by DSL_Refactor and the requirement provided by User.",
        )

        self.init_group_chat()


if __name__ == "__main__":
    logging.basicConfig(level=logging.INFO)
    DSLExtraction().run()
