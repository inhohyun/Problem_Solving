t = int(input())
for tc in range(1, t+1):
    n = int(input())
    arr = [[0] * n for _ in range(n)]
    for i in range(n):
        arr[i][0] = 1
    for i in range(1,n):
        for j in range(1,n):
            arr[i][j] = arr[i-1][j-1] + arr[i-1][j]

    ans = ''
    for i in range(n):
        for j in range(n):
            if arr[i][j] != 0:
                ans += str(arr[i][j]) + ' '
        if i == n-1:
            break
        ans += '\n'
    print(f'#{tc}')
    print(ans)