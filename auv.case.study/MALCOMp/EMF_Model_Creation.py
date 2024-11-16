import autogen
from autogen import ConversableAgent

from Base import Base

class Model_Creator(Base):

    def __init__(self):
        #system description
        with open('assets/system_description.txt', 'r', encoding='utf-8') as f:
            system_description = f.read()

        #Few-shot example for modeller
        with open('assets/few_shot_example_model_creation.txt', 'r', encoding='utf-8') as f:
            few_shot_example_model_creation = f.read()

        #Few-shot example for model checker
        with open('assets/few_shot_example_model_checker.txt', 'r', encoding='utf-8') as f:
            few_shot_example_model_checker = f.read()

        #chain of thought prompt for modeller
        with open('assets/chain_of_thought_model_creation.txt', 'r') as f:
            chain_of_thought_model_creation = f.read()

        #chain of thought prompt for model checker
        with open('assets/chain_of_thought_model_checker.txt', 'r') as f:
            chain_of_thought_model_checker = f.read()

        #chain of thought prompt for model checker
        with open('assets/chain_of_thought_model_trace.txt', 'r') as f:
            chain_of_thought_model_trace = f.read()

        #chain of thought prompt for model checker
        with open('assets/result_term_extraction.json', 'r') as f:
            term_extraction = f.read()

        #Emfatic rules
        with open('assets/result_DSL.emf', 'r', encoding='utf-8') as DSL_source:
            dsl = DSL_source.read()

        self.requirement_file = "assets/requirement_architecture.json"
        self.user = super().getUser()

        #Modeller to create emfatic code
        self.model_Creator = ConversableAgent(
            name="Model_Creator",
            llm_config={
                "temperature": 0.5,
                "config_list": super().getConfigList(),
            },
            system_message=
            'You are an expert in Model Driven Engineering (MDE). ' +
            'You are experienced in creating EMF (Eclipse Modelling Framework) models using the Epsilon Object Language (EOL). ' +
            'Your job is to write an EOL program to create an EMF model that conforms to the EMF metamodel (written in the Emfatic language) in here: ' + dsl +
            'You should base your answer on the requirements provided to you by User. ' +
            #'The description of the system to be developed is here: ' + system_description +
            'The Concepts extracted (in JSON) from the requirements are here: ' + term_extraction +
            'Consult the thinking process here: ' + chain_of_thought_model_creation +
            'Here are some examples based on input requirements:' + few_shot_example_model_creation +
            'You should also consult the code produced by Model_Refactor. ' +
            'You must only include EOL code in your responses. ' +
            'Do not include any other contents that are not provided to you. ' +
            'Please do not include explanations in your answers. Do not include markdowns (no ```). ',
            description='A EMF model creator using EOL, based on the inputs and responses from the User.'
        )

        #Model_Checker to check the syntax of Emfatic code
        self.model_Checker = ConversableAgent(
            name="Model_Checker",
            llm_config={
                "temperature": 0.5,
                "config_list": super().getConfigList(),
            },
            system_message=
            'You are an expert in Model Driven Engineering (MDE). ' +
            'You are experienced in creating EMF (Eclipse Modelling Framework) models using the Epsilon Object Language (EOL). ' +
            'Your job is to check if the EOL program provided to you is correct, and respond with the correct EOL code.' +
            'You should base your answer on both the EMF metamodel (written in Emfatic) here:'  + dsl +
            ', and the requirements provided by User. ' +
            'The description of the system to be developed is here: ' + system_description +
            'The Concepts extracted (in JSON) from the requirements are here: ' + term_extraction +
            'Consult the thinking process in here: ' + chain_of_thought_model_checker +
            'Here are some examples of the extracted metamodels based on inputs:' + few_shot_example_model_checker +
            #'You should also consult the code produced by Model_Refactor. ' +
            'You must only include EOL code in your responses.' +
            'Do not include any other contents that are not provided to you. ' +
            #'If no further answer can be provided, repeat your last answer. ' +
            'Please do not include explanations in your answers. In addition, no markdown is permitted (no ```). ',
            description='A program checker to check the syntax of the EOL code.'
        )

        #Model_Summerizer to summerize the code from Model_Checker&Modeller
        self.model_Refactorer = ConversableAgent(
            name="Model_Refactorer",
            llm_config={
                "temperature": 0.5,
                "config_list": super().getConfigList(),
            },
            system_message=
            'You are an expert in Model Driven Engineering (MDE), and you are working with some experts in creating models that conform to a metamodel written in the Emfatic language. ' +
            'Model_Creator has created the source code in Epsilon Object Language (EOL) based on the inputs from User. ' +
            'Model_Checker has checked the syntax of the EOL code. ' +
            'Your job is to organise and refactor the EOL code (when necessary) provided by them. ' +
            'In every round, you provide your answer, you need to combine with your previous answer and update them. ' +
            'Your answer needs to be correctly written in EOL. ' +
            'Do not include any other contents that are not provided to you. ' +
            'If no further answer can be provided, repeat your last answer. ' +
            'Please only provide EOL code in your answers. Do not explain (no ```). ',
            description='A Model_Summariser to summerise the code from Model_Checker.'
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
            'You are experienced in creating EMF (Eclipse Modelling Framework) models using languages provided by the Eclipse Epsilon platform. ' +
            'Specifically, you use the Epsilon Object Language (EOL) to create EMF models programmatically. ' +
            'Your job is to generate a JSON element by analysing the EOL code (provided by Model_Checker) for model creation, and the requirement provided by User every round. ' +
            'The metamodel (created using the Emfatic language) for the model to be created is here: ' + dsl +
            'Here are some guidance to help you: ' + chain_of_thought_model_trace +
            'Your answer should be in the following JSON format : ' +
            '{"requirement_gid" : ${the gid of the requirement provided by User}, ' +
            '"Model_Element" : ${the name of the class created by the EOL code}, ' +
            '"Model_Element_id" : ${the name or the id of the object created for the above class}, ' +
            '"Model_attribute": ${the name of the attributes set by the EOL code}, ' +
            '"Attribute_value": ${the value of the above attribute set by the EOL code}, ' +
            '"Model_reference":${the name of the references set by the EOL code} } ' +
            '"Reference_value":${the name or the id of the value set for the above reference} } ' +
            'If the EOL code creates multiple model elements, please create a JSON list with multiple JSON entries, like so: [$JSON entry, $JSON entry, ... $JSON entry].' +
            ' The Output format is JSON only, no markdown permitted (no ```), no explain.',
            description='A Json_Generator to generate a JSON element based on the EOL code provided by Model_Checker and the requirement provided by User every round.'
        )

        #Create a groupchat to organise the agents
        self.groupchat = autogen.GroupChat(
            agents=[self.user, self.model_Creator, self.model_Checker, self.model_Refactorer, self.json_generator],
            messages=[],
            speaker_selection_method='round_robin',
            max_round=1000,
            send_introductions=True
        )

        super().init_group_chat_manager()

    def main(self):
        model_creator = Model_Creator()

        chat_results = model_creator.user.initiate_chat(
            model_creator.groupt_chat_manager,
            #start chat with the first item of the file
            #message="Let us start creating the EOL code for creating a EMF model based on the requirements provided by User. " +
                    #"Model_Creator will write the EOL code, Model_Checker will check the correctness of the code, Model_Refactorer will organise and refactor the code. " +
                    #"The JSON_Generator will generate the JSON file containing trace information.",
            clear_history=True,
        )

        model_creator.storeJSON(chat_results, "Json_Generator", "assets/result_model_creation.json", "model_trace")

        data = chat_results.chat_history

        # Extract the last content for 'Model_Summariser'
        last_model_summariser_content = next((entry['content'] for entry in reversed(data) if entry.get('name') == 'Model_Refactorer'), None)

        if last_model_summariser_content:
            with open('assets/result_eol_program.eol', 'w', encoding='utf-8') as file:
                file.write(last_model_summariser_content)

        # Print the last content
        print(last_model_summariser_content)

if __name__ == '__main__':
    Model_Creator().main()
