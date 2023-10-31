t = int(input())
for tc in range(1, t+1):
    n = int(input())
    flag = 0
    for i in range(10):
        for j in range(10):
            if i * j == n:
                flag = 1

    if flag:
        print(f'#{tc}', 'Yes')
    else:
        print(f'#{tc}', 'No')

