for tc in range(1, 11):
    n, s = input().split()
    n = int(n)
    s = str(s)
    stack = []
    for o in s:
        if stack and o == stack[-1]:
            stack.pop()
        else:
            stack.append(o)

    print(f'#{tc}',''.join(stack))