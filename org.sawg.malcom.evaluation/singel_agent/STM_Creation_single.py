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

with open('assets/RoboChart_ecore.txt', 'r', encoding='utf-8') as ecore:
    RoboChart_ecore = ecore.read()

#The xtext syntax of robochart
with open('assets/Xtext.txt', 'r', encoding='utf-8') as Xtext:
    xtext = Xtext.read()

#API and Key configuration
with open('assets/LRE.txt', 'r', encoding='utf-8') as LRE:
    lre = LRE.read()

with open('assets/code_snippet_1.txt', 'r', encoding='utf-8') as Code:
    code = Code.read()

with open('assets/code_snippet_2.txt', 'r', encoding='utf-8') as Code2:
    code2 = Code2.read()

with open('assets/code_snippet_3.txt', 'r', encoding='utf-8') as Code3:
    code3 = Code3.read()

with open('assets/semantic.txt', 'r', encoding='utf-8') as Semantic:
    semantic = Semantic.read()

client = OpenAI(api_key=os.environ.get("OPENAI_API_KEY"),
                base_url=os.environ.get("OPENAI_API_BASE"),
                timeout=openai.Timeout(600, connect=600))

with open("assets/requirement_architecture.json", 'r', encoding='utf-8') as rq:
    requirement_file = rq.read()


message = [
    'You are an expert in Domain specific modeling and requirement engineering.'
   'You will be provided with requirement statements from User.'
   'Here is an ecore written in emfatic for a robochart which includes a state machine and other modules: \n' + RoboChart_ecore +
   '\n Here is an Xtext that conforms the ecore: \n' + xtext +
    'You need to know the link between the Xtext and ecore so that you can understand the code next.'
    '\n Here are examples code that written in DSL which conforms the Xtext please understand  code, especially the syntax and semantics of the code: \n' + code +'\n'
    '\n Here is the second example, please follow the syntax and semantics of the code:\n'+code2+
   '\n Please find the states , transitions and some constant ,events and functions.'
   'Create only one state machine written in dsl and the syntax comforms the code examples. '
   'State machines define behaviour using states, junctions, and the possible transitions among them. '
   'The states and transitions make use of the other elements that make up state machines which are: events, variables, required interfaces, defined interfaces, and clocks; these other elements can be used by the states and transitions to accomplish the state machines function.'
   'The actions of states can be specified as being executed on entry, during, or on exit of the state. Actions are defined using a simple action language which contains among other things: operation calls, conditionals, event input and output. '
   'States can also be composite and so contain a state machine that is executed when that state is entered.'
   'Transitions connect states and junctions and they can have any combination of triggers, guards, or action statements that specify the conditions when a transition will occur. Triggers cause a transition to be taken on the occurrence of a particular event. '
   'Optional start and end deadlines can be given to triggers supporting the specification of time properties of the system. The guards are a boolean expression that only allow a transition to be taken when it evaluates to true, providing greater control over the transitions between states. '
   'The action statement enables any required actions to be executed on the occurrence of a transition.\n'
   'Here is an example of a state and a transition when an event is triggered in DSL: \n' + semantic +
    'If an event is triggered, you need also define the event in the code.And the initial state usually defined as i0'
    'When you use a function , you need to define the function in the code. The example is : function odist ( o : Obstacle ) : real { }'
   'You need to notice that, the transition and state should be seperated, and the function should be defined outside the state machine.'
  
    'Please check whether Variables, Events, Constants, Functions, and States are all defined correctly. '
    'Please do not explain. In addition, no markdown is permitted (no ```)',

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

    prompt = requirement_file
    res = get_completion(prompt, model=model, temperature=temperature)

    print(time.time() - start)  # 打印响应时间

    print(res[0])  # gpt4的结果，看这里

    with open(f'{date}single_DSL_extraction_result2.emf', 'w', encoding='utf-8') as f:
        f.write(res[0])'''

def run_multiple_times(times):
    import time

    for i in range(times):
        start = time.time()
        model = "gpt-4o"
        temperature = 0.2
        prompt = lre
        res = get_completion(prompt, model=model, temperature=temperature)

        print(f"Iteration {i+1}:")
        print(f"Time taken: {time.time() - start} seconds")
        print(res[0])  # gpt4的结果，看这里

        with open(f'assets/STM_result/{date}stm_model_result_{i+6}.rct', 'w', encoding='utf-8') as f:
            f.write(res[0])

if __name__ == '__main__':
    run_multiple_times(5)