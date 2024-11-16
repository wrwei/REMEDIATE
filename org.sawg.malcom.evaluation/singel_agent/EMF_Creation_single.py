import datetime
import os
import openai
import logging
from openai import OpenAI
import time

date = f"{datetime.datetime.now():%Y-%m-%d}"


os.environ["OPENAI_API_BASE"] = "https://a.fe8.cn/v1"
os.environ["OPENAI_API_KEY"] = "sk-jxGxEstKGNXlwD4gaFIIveFQOAWm7hRxUZth8k191o5m8DE4"



with open('assets/system_description.txt', 'r', encoding='utf-8') as f:
    system_description = f.read()

# Few-shot example for modeller
with open('assets/few_shot_example_model_creation.txt', 'r', encoding='utf-8') as f:
    few_shot_example_model_creation = f.read()

# Few-shot example for model checker
with open('assets/few_shot_example_model_checker.txt', 'r', encoding='utf-8') as f:
    few_shot_example_model_checker = f.read()

# chain of thought prompt for modeller
with open('assets/chain_of_thought_model_creation.txt', 'r') as f:
    chain_of_thought_model_creation = f.read()

# chain of thought prompt for model checker
with open('assets/chain_of_thought_model_checker.txt', 'r') as f:
    chain_of_thought_model_checker = f.read()

# chain of thought prompt for model checker
with open('assets/chain_of_thought_model_trace.txt', 'r') as f:
    chain_of_thought_model_trace = f.read()

# chain of thought prompt for model checker
with open('assets/result_term_extraction.json', 'r') as f:
    term_extraction = f.read()

# Emfatic rules
with open('assets/DSL_extraction_result/2024-11-07single_DSL_extraction_result_1.emf', 'r', encoding='utf-8') as DSL_source:
    dsl = DSL_source.read()

with open("assets/requirement_architecture.json", 'r', encoding='utf-8') as rq:
    requirement_file = rq.read()

client = OpenAI(api_key=os.environ.get("OPENAI_API_KEY"),
                base_url=os.environ.get("OPENAI_API_BASE"),
                timeout=openai.Timeout(600, connect=600))

message = [
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
            ]

def get_completion(prompt, model, temperature):
    res = ''
    try:
        response = client.chat.completions.create(
            model=model,
            # TODO 这里修改system设定
            messages=[
                {"role": "system",
                 "content": message[0]},
                {"role": "user", "content": prompt},
            ],
            temperature=temperature,
            # max_tokens=4096,
        )
        res = response.choices[0].message.content
        # 响应tokens数量
        prompt_tokens_num = response.usage.prompt_tokens
        output_tokens_num = response.usage.completion_tokens
        return res, prompt_tokens_num, output_tokens_num
    except openai.APIConnectionError as e:
        logging.error(f'The server could not be reached, cause:{e.__cause__}')
    except openai.RateLimitError as e:
        logging.error('A 429 status code was received; we should back off a bit.')
    except openai.APIStatusError as e:
        logging.error(
            f'Another non-200-range status code was received, status_code: {e.status_code}, error response: {e.response}')
    except Exception as e:
        logging.error(
            f'Another error response: {e}')
    return res, 0, 0

'''if __name__ == '__main__':

    start = time.time()
    # TODO 只需要改这里！！！！！！！！！！！！！！！！！！！
    # 修改prompt，下面是示例，按照自己的需求进行修改
    # model = "gpt-3.5-turbo-1106"
    # model = "gpt-4-1106-preview"
    # model = "gpt-4-0125-preview"
    #model = "gpt-4-turbo"
    model = "gpt-4o"
    # model = "gpt-4-32k-0613"
    # model = "gpt-3.5-turbo"
    temperature = 0.2

    prompt = requirement_file
    res = get_completion(prompt, model=model, temperature=temperature)

    print(time.time() - start)  # 打印响应时间

    print(res[0])  # gpt4的结果，看这里

    with open(f'{date}single_eol_result.emf', 'w', encoding='utf-8') as f:
        f.write(res[0])'''

def run_multiple_times(times):
    import time

    for i in range(times):
        start = time.time()
        model = "gpt-4o"
        temperature = 0.2
        prompt = requirement_file
        res = get_completion(prompt, model=model, temperature=temperature)

        print(f"Iteration {i+1}:")
        print(f"Time taken: {time.time() - start} seconds")
        print(res[0])  # gpt4的结果，看这里

        with open(f'assets/EMF_Model_result/{date}single_eol_result_{i+1}.eol', 'w', encoding='utf-8') as f:
            f.write(res[0])

if __name__ == '__main__':
    run_multiple_times(5)