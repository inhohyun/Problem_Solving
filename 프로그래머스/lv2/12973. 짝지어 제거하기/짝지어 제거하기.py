def solution(s):
    if len(s) % 2 !=0:
        return 0
    stack = []
    
    for i in range(len(s)):
        if len(stack) == 0 or stack[-1] != s[i]:
            stack.append(s[i])
        elif s[i] == stack[-1]:
            stack.pop()
            

    
    
    return 1 if len(stack) == 0 else 0