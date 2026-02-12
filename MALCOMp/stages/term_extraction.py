import datetime
import logging
import sys
import os

sys.path.insert(0, os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
from base import Base

logger = logging.getLogger(__name__)


class TermExtraction(Base):

    def __init__(self, config_path="config.yaml"):
        super().__init__("term_extraction", config_path)

        # Load assets
        system_desc = self.load_asset("system_description")
        cot_extraction = self.load_asset("chain_of_thought_extraction")
        cot_checker = self.load_asset("chain_of_thought_checker")
        few_shot = self.load_asset("few_shot_example")

        # Term extraction agent
        self.term_extractor = self.create_agent(
            name="Term_Extractor",
            system_message=(
                "You are an expert in requirement engineering. "
                "Requirement statements can be categorised into Functional Requirements and Non-Functional Requirements. "
                "You will be provided with some requirement statements from User, which are for a system to be developed. "
                "The description of the system is here: " + system_desc +
                "Your task is to extract Concepts and their Instances from the requirement statements. "
                "The requirements will be provided by User, please note that the requirements are not ordered, and one requirement may implicitly depend on other requirements. "
                "Each requirement statement is identified by a unique GID (short for Global ID). "
                'Please extract occurrences of the following from the requirement statements: "GID", "Concepts" and "Instances". '
                "The rationale and output format for your task is here: " + cot_extraction +
                "Here are some examples to guide you: " + few_shot +
                "The Output format should be in JSON only, no markdown permitted (no ```), no explain. "
                "Include only contents provided to you."
            ),
            description="A Term_Extractor to extract Concepts and Instances from requirement statements.",
        )

        # Term checker agent
        self.term_checker = self.create_agent(
            name="Term_checker",
            system_message=(
                "You are an expert in requirement engineering and Model Driven Engineering (MDE). "
                "Your task is to check whether the Concepts and Instances extracted by Term_Extractor are correct, "
                "and output the corrected JSON if any issues are found. "
                "The description of the system to be developed is here: " + system_desc +
                "The rationale and correctness criteria for your task is here: " + cot_checker +
                "Here are some examples of the extracted models, which may help you: " + few_shot +
                "If the extraction is correct, output it unchanged. If it contains errors, output the corrected version. "
                "The Output format should be in JSON only, no markdown permitted (no ```), no explain. "
                "Include only contents provided to you and Term_Extractor."
            ),
            description="A Term_checker to verify and correct the output from Term_Extractor.",
        )

        self.init_group_chat()

    def run_multiple(self, times):
        """Run term extraction multiple times with dated output files."""
        date = f"{datetime.datetime.now():%Y-%m-%d}"
        for i in range(times):
            stage = TermExtraction(config_path=self.config_path)
            results = stage.run()
            # Also save with dated filename
            output_path = stage.output_dir / f"{date}result_term_extractor_{i + 1}.json"
            stage.store_json(results, "Term_checker", str(output_path), "term_trace")
            logger.info("Completed term extraction run %d/%d", i + 1, times)


if __name__ == "__main__":
    logging.basicConfig(level=logging.INFO)
    TermExtraction().run_multiple(10)
