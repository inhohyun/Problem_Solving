t = int(input())

for tc in range(1, t+1):
    s = input()
    stack = []
    cnt = 0
    for i in range(len(s)):
        # 막대기 시작
        if i+1 != len(s) and s[i] == '(' and s[i+1] != ')':
            stack.append(s[i])
        # 레이저
        if i != 0 and s[i-1] == '(' and s[i] == ')':
            cnt += len(stack)
        # 막대기 끝
        elif s[i] == ')':
            stack.pop()
            cnt += 1
    print(f'#{tc}', cnt)


