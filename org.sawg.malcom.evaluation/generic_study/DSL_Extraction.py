import autogen
from autogen import ConversableAgent

from Base import Base

class DSL_Extractor(Base):

    def __init__(self):
        #system description
        with open('assets/system_description.txt', 'r', encoding='utf-8') as system_file:
            system_description = system_file.read()

        #Few-shot example for dsl extraction
        with open('assets/few_shot_example_dsl_extraction.txt', 'r', encoding='utf-8') as few_shot_dsl_file:
            few_shot_example_dsl_extraction = few_shot_dsl_file.read()

        #Few-shot example for dsl checker
        with open('assets/few_shot_example_dsl_checker.txt', 'r', encoding='utf-8') as few_shot_dsl_checker:
            few_shot_example_dsl_checker = few_shot_dsl_checker.read()

        #chain of thought prompt for dsl extraction
        with open('assets/chain_of_thought_dsl_extraction.txt', 'r') as cot_dsl_extraction:
            chain_of_thought_dsl_extraction = cot_dsl_extraction.read()

        #chain of thought prompt for dsl checker
        with open('assets/chain_of_thought_dsl_checker.txt', 'r') as cot_dsl_checker:
            chain_of_thought_dsl_checker = cot_dsl_checker.read()

        #Extracted terms
        with open('assets/result_term_extraction.json', 'r', encoding='utf-8') as term_file:
            extracted_terms = term_file.read()

        #Emfatic rules
        with open('assets/emfatic.txt', 'r', encoding='utf-8') as emfatic_rules_file:
            emfatic_rules = emfatic_rules_file.read()

        self.requirement_file = "assets/requirement_architecture.json"
        self.user = super().getUser()

        #DSL Extractor to create emfatic code
        self.dsl_extractor = ConversableAgent(
            name="DSL_Extractor",
            llm_config={
                "temperature": 0.5,
                "config_list": super().getConfigList(),
            },
            system_message=
            'You are an expert in Model Driven Engineering (MDE). ' +
            'You are experienced in creating "Domain Specific Languages (DSLs)" or "metamodels". ' +
            'A metamodel contains the abstract syntax to capture the concepts for the system to be developed. ' +
            'You have extensive experience in creating metamodels using the Ecore modeling language provided by the Eclipse Modeling Framework (EMF). ' +
            'You are also an expert in creating metamodels using the Emfatic language (a textual syntax for Ecore) to create metamodels.' +
            'Your job is to create a metamodel written in Emfatic based on the requirements provided to you in JSON every round. ' +
            'The description of the system to be developed is here: ' + system_description +
            'Previously, a Term model is extracted, in here: ' + extracted_terms +
            'Here are some thinking processes to guide you: ' + chain_of_thought_dsl_extraction +
            'Here are some examples of the extracted metamodels based on inputs:' + few_shot_example_dsl_extraction +
            'Consider also the previous inputs from the User. ' +
            'You must only include Emfatic code in your responses.' +
            'Do not include any other contents that are not provided to you. ' +
            'Please do not include explanations in your answers. In addition, no markdown is permitted (no ```). ',
            description='A DSL extractor to create metamodels using Emfatic based on the input and responses from the User.'
        )

        #DSL checker to check the syntax of Emfatic code
        self.dsl_checker = ConversableAgent(
            name="DSL_Checker",
            llm_config={
                "temperature": 0.5,
                "config_list": super().getConfigList(),
            },
            system_message=
            'You are an expert in Model Driven Engineering (MDE). ' +
            'Specifically, you are experienced in create "Domain Specific Languages (DSLs)" or "metamodels". ' +
            'A metamodel contains the abstract syntax to capture the concepts for the system to be developed. ' +
            'You have extensive experience in creating metamodels using the Ecore modeling language provided by the Eclipse Modeling Framework (EMF). '
            'You are also an expert in using the Emfatic language (a textual syntax for Ecore) to create metamodels. ' +
            'An description of the language syntax for Emfatic is here: ' + emfatic_rules +
            'Your job is to check whether the metamodel provided to you written in Emfatic is correct, in every round of conversation. ' +
            'You should also consult the thinking process in here: ' + chain_of_thought_dsl_checker +
            'Here are some examples of the extracted metamodels based on inputs:' + few_shot_example_dsl_checker +
            'You should also consult the terms extracted previously (but do not rely on it completely): ' + extracted_terms +
            'You must only include Emfatic code in your responses.' +
            'Do not include any other contents that are not provided to you. ' +
            'Please do not include explanations in your answers. In addition, no markdown is permitted (no ```). ',
            description='A Model_Checker to check the syntax of Emfatic code.'
        )

        #DSL refactor to summerize the code from Model_Checker&Modeller
        self.dsl_refactorer = ConversableAgent(
            name="DSL_Refactor",
            llm_config={
                "temperature": 0.5,
                "config_list": super().getConfigList(),
            },
            system_message=
            'You are an expert in Model Driven Engineering (MDE), and you are working with some experts in creating "Domain Specific Languages (DSLs)" or "metamodels". ' +
            'DSL_Extractor has created the DSL using Emfatic based on the inputs from User. ' +
            'Model_Checker has checked the syntax of the Emfatic code. ' +
            'Your job is to organise and refactor (when necessary) the Emfatic code provided by Model_Checker. ' +
            'In every round, you provide your answer, you need to combine with your previous answer and update them in one package. ' +
            'Pay attention to containement and non-containment references. ' +
            'In the requirement, when it says "A contains B" or "A defines B", it often denotes a containment reference. ' +
            'In the requirement, when it says "A uses B" or "A refers to B", it often denotes a non-containment reference. ' +
            'Refactor references when necessary by looking at the requirements as a whole. ' +
            'Your answer needs to be correctly written in Emfatic. ' +
            'You must include only Emfatic code in your responses.' +
            'Do not include any other contents that are not provided to you. ' +
            'Please do not explain. In addition, no markdown is permitted (no ```)',
            description='A DSL_Refactor to organise and refactor the code from Model_Checker.'
        )

        #Json_Generator to generate a json for traceability.
        self.json_generator = ConversableAgent(
            name="Json_Generator",
            llm_config={
                "temperature": 0.5,
                "config_list": super().getConfigList(),
            },
            system_message=
            'You are an expert in Model Driven Engineering (MDE). ' +
            'Your job is to generate a traceability JSON element based on the Emfatic code provided by DSL_Summariser and the requirement in JSON provided by User every round. ' +
            'In the Emfatic code provided to you by DSL_Summariser, you shall identify which class, attributes, references and operations are created, based on the requirement JSON provided by User' +
            'Your answer should be in the following JSON format : ' +
            '{"requirement_gid" : ${the gid of the requirement provided by User}, ' +
            '"Emfatic_class" : ${the class name provided by Model_Checker}, ' +
            '"Emfatic_attributes": ${the "attr"s that the class contains (if not null)}, ' +
            '"Emfatic_references":${the "ref"s or "val"s that the class contains (if not null)}, ' +
            '"Emfatic_operations": ${the "op"s that class contains (if not null)} }' +
            'If the Emfatic code creates multiple classes, please create a JSON list with multiple JSON entries, like so: [$JSON entry, $JSON entry, ... $JSON entry].' +
            ' The Output format is JSON only, no markdown permitted (no ```), no explain.',
            description='A Json_Generator to generate a json element based on the Emfatic code provided by Model Checker and the requirement provided by User every round.'
        )

        #Create a groupchat to organise the agents
        self.groupchat = autogen.GroupChat(
            agents=[self.user, self.dsl_extractor, self.dsl_checker, self.dsl_refactorer, self.json_generator],
            messages=[],
            speaker_selection_method='round_robin',
            max_round=500,
            send_introductions=True
        )

        super().init_group_chat_manager()

    def main(self):
        dsl_extractor = DSL_Extractor()

        chat_results = dsl_extractor.user.initiate_chat(
            dsl_extractor.groupt_chat_manager,
            #message="Let us start extracting Domain Specific Languages (DSL) or metamodels from the requirements in JSON. " +
                    #"DSL_Extractor will extract the DSL, DSL_Checker will check the correctness of the DSL, DSL_Refactor will organise and refactor the DSL. " +
                    #"The JSON_Generator will generate the JSON file containing trace information.",
            clear_history=True,
        )

        dsl_extractor.storeJSON(chat_results, "Json_Generator", "assets/result_dsl_extraction.json", "dsl_trace")

        data = chat_results.chat_history

        # Extract the last content for 'DSL_Refactor'
        last_dsl_refactor_content = next((entry['content'] for entry in reversed(data) if entry.get('name') == 'DSL_Refactor'), None)

        if last_dsl_refactor_content:
            with open('assets/result_DSL.emf', 'w', encoding='utf-8') as file:
                file.write(last_dsl_refactor_content)

        # Print the last content
        print(last_dsl_refactor_content)

if __name__ == '__main__':
    DSL_Extractor().main()