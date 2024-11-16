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

with open('assets/system_description.txt', 'r', encoding='utf-8') as system_file:
    system_description = system_file.read()

# Few-shot example for dsl extraction
with open('assets/few_shot_example_dsl_extraction.txt', 'r', encoding='utf-8') as few_shot_dsl_file:
    few_shot_example_dsl_extraction = few_shot_dsl_file.read()

# Few-shot example for dsl checker
with open('assets/few_shot_example_dsl_checker.txt', 'r', encoding='utf-8') as few_shot_dsl_checker:
    few_shot_example_dsl_checker = few_shot_dsl_checker.read()

# chain of thought prompt for dsl extraction
with open('assets/chain_of_thought_dsl_extraction.txt', 'r') as cot_dsl_extraction:
    chain_of_thought_dsl_extraction = cot_dsl_extraction.read()

# chain of thought prompt for dsl checker
with open('assets/chain_of_thought_dsl_checker.txt', 'r') as cot_dsl_checker:
    chain_of_thought_dsl_checker = cot_dsl_checker.read()

# Extracted terms
with open('assets/result_term_extraction.json', 'r', encoding='utf-8') as term_file:
    extracted_terms = term_file.read()

# Emfatic rules
with open('assets/emfatic.txt', 'r', encoding='utf-8') as emfatic_rules_file:
    emfatic_rules = emfatic_rules_file.read()

client = OpenAI(api_key=os.environ.get("OPENAI_API_KEY"),
                base_url=os.environ.get("OPENAI_API_BASE"),
                timeout=openai.Timeout(600, connect=600))

with open("assets/requirement_architecture.json", 'r', encoding='utf-8') as rq:
    requirement_file = rq.read()

with open("2024-10-30single_DSL_extraction_result2.emf", 'r', encoding='utf-8') as code:
    emfatic_code = code.read()


message = [
    'You are an expert in Model Driven Engineering (MDE). ' +
    'Your job is to generate a traceability JSON element based on the Emfatic code and the requirement in JSON provided by User  ' +
    'In the Emfatic code provided to you by DSL_Summariser, you shall identify which class, attributes, references and operations are created, based on the requirement JSON provided by User' +
    'Your answer should be in the following JSON format : ' +
    '{"requirement_gid" : ${the gid of the requirement provided by User}, ' +
    '"Emfatic_class" : ${the class name provided by Model_Checker}, ' +
    '"Emfatic_attributes": ${the "attr"s that the class contains (if not null)}, ' +
    '"Emfatic_references":${the "ref"s or "val"s that the class contains (if not null)}, ' +
    '"Emfatic_operations": ${the "op"s that class contains (if not null)} }' +
    'If the Emfatic code creates multiple classes, please create a JSON list with multiple JSON entries, like so: [$JSON entry, $JSON entry, ... $JSON entry].' +
    ' The Output format is JSON only, no markdown permitted (no ```), no explain.'
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

    prompt = 'This is requirement JSON:'+requirement_file+'this is the Emfatic code: '+emfatic_code
    res = get_completion(prompt, model=model, temperature=temperature)

    print(time.time() - start)  # 打印响应时间

    print(res[0])  # gpt4的结果，看这里

    with open(f'{date}single_DSL_trace_result.json', 'w', encoding='utf-8') as f:
        f.write(res[0])'''

def run_multiple_times(times):
    import time
    for i in range(times):
        start = time.time()
        model = "gpt-4o"
        temperature = 0.2
        prompt = 'This is requirement JSON:'+requirement_file+'this is the Emfatic code: '+emfatic_code
        res = get_completion(prompt, model=model, temperature=temperature)
        print(f"Iteration {i+1}:")
        print(f"Time taken: {time.time() - start} seconds")
        print(res[0])  # gpt4的结果，看这里
        with open(f'assets/DSL_trace_result/{date}single_DSL_trace_result_{i+1}.json', 'w', encoding='utf-8') as f:
            f.write(res[0])

if __name__ == '__main__':
    run_multiple_times(5)