def solution(s):
    stack = []
    for i in s:
        if i == '(':
            stack.append(i)
        else: # 닫는 괄호가 나올 경우
            if stack == []: #스택이 비어있는데 닫는 괄호가 나오는 경우
                return False
            else:
                stack.pop()
    return stack == [] #스택이 비어있으면 true