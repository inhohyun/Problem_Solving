T = int(input())
for i in range(1, T+1):

    n = int(input())

    ans = sorted(list(map(int, input().split())))
    print(f'#{i}', end=' ')
    for j in ans:
        print(j, end=' ')
    print()
