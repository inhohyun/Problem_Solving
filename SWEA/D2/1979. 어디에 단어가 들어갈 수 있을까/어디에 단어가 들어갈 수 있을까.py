t = int(input())
for tc in range(1, t+1):
    n, m = map(int, input().split())
    arr = [list(input().split()) for _ in range(n)]
    ans = 0
    for i in range(n):
        cnt = 0
        for j in range(n):
            if arr[i][j] == '1':
                cnt += 1
            elif arr[i][j] == '0':
                if cnt == m:
                    ans += 1
                cnt = 0
        if cnt == m:
            ans += 1
    cnt = 0
    for i in range(n):
        cnt = 0
        for j in range(n):
            if arr[j][i] == '1':
                cnt += 1
            else:
                if cnt == m:
                    ans += 1
                cnt = 0
        if cnt == m:
            ans += 1
    print(f'#{tc}',ans)


