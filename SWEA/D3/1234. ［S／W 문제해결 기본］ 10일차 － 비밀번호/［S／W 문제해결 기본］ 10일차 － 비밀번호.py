for tc in range(1, 11):
    n, number = input().split()
    n = int(n)
    stack = [number[0]]
    for i in range(1, n):
        if len(stack) == 0:
            stack.append(number[i])

        elif stack[-1] == number[i]:
            stack.pop()

        else:
            stack.append(number[i])
    print(f'#{tc}',''.join(stack))