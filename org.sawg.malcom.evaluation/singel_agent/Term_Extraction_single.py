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

    # Few-shot example
with open('assets/few_shot_example_term_extraction.txt', 'r', encoding='utf-8') as I:
    few_shot_example = I.read()

    # chain of thought example
with open('assets/chain_of_thought_term_extraction.txt', 'r') as f:
    chain_of_thought_term_extraction = f.read()

    # chain of thought example
with open('assets/chain_of_thought_term_checker.txt', 'r') as f:
    chain_of_thought_term_checker = f.read()

with open('assets/requirement_architecture.json', 'r') as f:
    requirement_file = f.read()

client = OpenAI(api_key=os.environ.get("OPENAI_API_KEY"),
                base_url=os.environ.get("OPENAI_API_BASE"),
                timeout=openai.Timeout(600, connect=600))

message = [ 'You are an expert in requirement engineering.' +
            'Requirement statements can be categorised into Functional Requirements and Non-Functional Requirements. ' +
            'You will be provided with some requirement statements from User, which are for a system to be developed.' +
            'The description of the system is here: ' + system_description +
            'Your task is to extract Concepts and their Instances from the requirement statements.' +
            'The requirements will be provided by User, please note that the requirements are not ordered, and one requirement may implicitly depend on other requirements. ' +
            'Each requirement statement is identified by a unique GID (short for Global ID). ' +
            'Please extract occurrences of the following from the requirement statements: "GID", "Concepts" and "Instances". ' +
            'The rationale for your task is here: ' + chain_of_thought_term_extraction +
            'The Output format should be in JSON only, no markdown permitted (no ```), no explain.' +
            'Include only contents provided to you.']


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

    prompt = requirement_file
    res = get_completion(prompt, model=model, temperature=temperature)

    print(time.time() - start)  # 打印响应时间

    print(res[0])  # gpt4的结果，看这里

    with open(f'{date}single_term_extraction_result.json', 'w', encoding='utf-8') as f:
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

        with open(f'assets/Term_extraction_result/{date}single_term_extraction_result_{i+1}.json', 'w', encoding='utf-8') as f:
            f.write(res[0])

if __name__ == '__main__':
    run_multiple_times(5)