#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Time    : 2023/12/12 9:33
# @Author  : zmengl
# @File    :
# @desc    :
import datetime
import os
import openai
import logging
from openai import OpenAI

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
with open('assets/result_DSL.emf', 'r', encoding='utf-8') as DSL_source:
    dsl = DSL_source.read()

client = OpenAI(api_key=os.environ.get("OPENAI_API_KEY"),
                base_url=os.environ.get("OPENAI_API_BASE"),
                timeout=openai.Timeout(600, connect=600))

with open("assets/requirement_architecture.json", 'r', encoding='utf-8') as rq:
    requirement_file = rq.read()

with open("2024-11-01single_eol_result.eol", 'r', encoding='utf-8') as code:
    eol_code = code.read()


message = [
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
    '"Model_references":${the name of the references set by the EOL code} } ' +
    '"Reference_value":${the name or the id of the value set for the above reference} } ' +
    'If the EOL code creates multiple model elements, please create a JSON list with multiple JSON entries, like so: [$JSON entry, $JSON entry, ... $JSON entry].' +
    ' The Output format is JSON only, no markdown permitted (no ```), no explain.',

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
    import time

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

    prompt = 'This is requirement JSON:'+requirement_file+'this is the Emfatic code: '+eol_code
    res = get_completion(prompt, model=model, temperature=temperature)

    print(time.time() - start)  # 打印响应时间

    print(res[0])  # gpt4的结果，看这里

    with open(f'{date}single_EOL_trace_result.json', 'w', encoding='utf-8') as f:
        f.write(res[0])'''
def run_multiple_times(times):
    import time
    for i in range(times):
        start = time.time()
        model = "gpt-4o"
        temperature = 0.2
        prompt = 'This is requirement JSON:'+requirement_file+'this is the Emfatic code: '+eol_code
        res = get_completion(prompt, model=model, temperature=temperature)
        print(f"Iteration {i+1}:")
        print(f"Time taken: {time.time() - start} seconds")
        print(res[0])  # gpt4的结果，看这里
        with open(f'assets/EMF_Model_trace_result/{date}single_EOL_trace_result_{i+1}.json', 'w', encoding='utf-8') as f:
            f.write(res[0])

if __name__ == '__main__':
    run_multiple_times(5)