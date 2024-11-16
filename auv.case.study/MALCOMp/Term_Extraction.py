import datetime

import autogen
from autogen import ConversableAgent

from Base import Base

date = f"{datetime.datetime.now():%Y-%m-%d}"


class Term_Extractor(Base):
    def __init__(self):
        #system description
        with open('assets/system_description.txt', 'r', encoding='utf-8') as f:
            self.system_description = f.read()

        #Few-shot example
        with open('assets/few_shot_example_term_extraction.txt', 'r', encoding='utf-8') as I:
            self.few_shot_example = I.read()

        #chain of thought example
        with open('assets/chain_of_thought_term_extraction.txt', 'r') as f:
            self.chain_of_thought_term_extraction = f.read()

        # chain of thought example
        with open('assets/chain_of_thought_term_checker.txt', 'r') as f:
            self.chain_of_thought_term_checker = f.read()

        self.requirement_file = "assets/requirement_architecture.json"
        self.user = super().getUser()

        #term extraction agent
        self.term_extractor = ConversableAgent(
            name = "Term_Extractor",
            llm_config={
                "temperature": 0.5,
                "config_list": super().getConfigList(),
                "timeout": 600000,
                "cache_seed": None,
            },
            system_message =
            'You are an expert in requirement engineering.' +
            'Requirement statements can be categorised into Functional Requirements and Non-Functional Requirements. ' +
            'You will be provided with some requirement statements from User, which are for a system to be developed.' +
            'The description of the system is here: ' + self.system_description +
            'Your task is to extract Concepts and their Instances from the requirement statements.' +
            'The requirements will be provided by User, please note that the requirements are not ordered, and one requirement may implicitly depend on other requirements. ' +
            'Each requirement statement is identified by a unique GID (short for Global ID). ' +
            'Please extract occurrences of the following from the requirement statements: "GID", "Concepts" and "Instances". ' +
            'The rationale for your task is here: ' + self.chain_of_thought_term_extraction +
            'The Output format should be in JSON only, no markdown permitted (no ```), no explain.' +
            'Include only contents provided to you.',
            description="An Term_Extractor to extract instances of a sentence."
        )
        #Term JSON checker
        self.term_checker = ConversableAgent(
            name="Term_checker",
            llm_config={
                "temperature": 0.5,
                "config_list": super().getConfigList(),
                "timeout": 600000,
                "cache_seed": None,
            },
           # llm_config=llm_default_config,
            system_message=
            'You are an expert in requirement engineering and Model Driven Engineering (MDE). ' +
            'In MDE, engineers produce "Domain Specific Models (DSLs)" or "metamodels". ' +
            'A metamodel defines the abstract syntax of a modelling language, which may contain: 1) Classes to describe the concepts in the target system (to be developed); ' +
            '2) Attributes with primitive types inside the Classes; and 3) References (either association or containment) among Classes. ' +
            'Each concept defined in a metamodel is also referred to as a "meta-element". ' +
            'Once a metamodel is in place, engineers can use it to create "instance models" to model their systems, which conform to the abstract syntax defined in the metamodel. ' +
            'Each instance of a "meta-element" in the instance model may also be referred to as an "instance object" of that "meta-element". ' +
            'In order to extract DSLs, one need to make sure the Concepts and their Instances are correctly extracted. ' +
            'Your task is to check whether the Concepts and Instances extracted by Term_Extractor are correct. ' +
            'To provide you with context, the description of the system to be developed is here: ' + self.system_description +
            'The rationale for your task is here: ' + self.chain_of_thought_term_checker +
            'Here are some examples of the extracted models, which may help you.' + self.few_shot_example +
            'The Output format should be in JSON only, no markdown permitted (no ```), no explain.' +
            'Include only contents provided to you and Term_Extractor.',
            description="A Term_checker to check the Output format from Term_Extractor."
        )

        self.groupchat = autogen.GroupChat(
            agents=[self.user, self.term_extractor, self.term_checker],
            messages=[],
            speaker_selection_method='round_robin',
            max_round=100,
            send_introductions=True
        )

        super().init_group_chat_manager()

    '''def main(self):
        term_extractor = Term_Extractor()

        chat_results = term_extractor.user.initiate_chat(
            term_extractor.groupt_chat_manager,
            #modify here to start your chat
            message="Let us start to extract the occurrences of Concept and Instance from the requirement statements. " +
                    "Term_Extractor will perform the extraction and Term_checker will check if the results are correct.",
            clear_history=True,
        )

        term_extractor.storeJSON(chat_results, "Term_checker", "assets/Term_extraction_result/result_term_extractor_102.json", "term_trace")
'''

    def run_extraction_multiple_times(self, times):
        for i in range(times):
            term_extractor = Term_Extractor()

            chat_results = term_extractor.user.initiate_chat(
                term_extractor.groupt_chat_manager,
                # modify here to start your chat
                message="",
                clear_history=True,
            )
            result_file = f"assets/Term_extraction_result/{date}result_term_extractor_{i + 1}.json"
            term_extractor.storeJSON(chat_results, "Term_checker", result_file,"term_trace")


if __name__ == '__main__':
    Term_Extractor().run_extraction_multiple_times(10)

