def solution(numbers):
    stack = []
    answer = [-1] * len(numbers)
    
    for i in range(len(numbers)):
        #스택이 비어있지 않고 비교할 원소가 스택의 마지막 원소보다 크면 반복
        while stack and numbers[stack[-1]] < numbers[i]:
            answer[stack.pop()] = numbers[i]
        stack.append(i)
    
    return answer