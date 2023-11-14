
for tc in range(1, 11):
    n = int(input())
    arr = [list(input()) for _ in range(8)]
    ans = 0
    # 가로 탐색
    for i in range(8):
        for j in range(8-n+1):
            if arr[i][j:j+n] == arr[i][j:j+n][::-1]:
                ans += 1
    # 세로 탐색
    for i in range(8):
        for j in range(8-n+1):
            tmp = ''
            for a in range(j, j+n):
                tmp += arr[a][i]
            if tmp == tmp[::-1]:
                ans += 1
    print(f'#{tc}',ans)
