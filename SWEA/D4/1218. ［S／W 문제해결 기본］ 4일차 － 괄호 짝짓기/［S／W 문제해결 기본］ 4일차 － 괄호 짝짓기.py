for tc in range(1, 11):
    # 테스트 문자의 길이
    n = int(input())
    s = input()
    stack = []
    flag = 0
    for i in range(n):
        # 스택이 빈상태에서 닫는 괄호가 나올 경우 실패처리
        if len(stack) == 0 and (s[i] == ')' or s[i] == '>' or s[i] == '}' or s[i] == ']'):
            stack.append('0')
            break
        if s[i] == '(' or s[i] == '<' or s[i] == '{' or s[i] == '[':
            stack.append(s[i])
        else:
            if s[i] == ')':
                if stack[-1] != '(':
                    break
                else:
                    stack.pop()
            if s[i] == ']':
                if stack[-1] != '[':
                    break
                else:
                    stack.pop()
                    
            if s[i] == '>':
                if stack[-1] != '<':
                    break
                else:
                    stack.pop()
            if s[i] == '}':
                if stack[-1] != '{':
                    break
                else:
                    stack.pop()
    if len(stack) == 0:
        flag = 1
    
    if flag:
        print(f'#{tc}', 1)
    else:
        print(f'#{tc}', 0)
