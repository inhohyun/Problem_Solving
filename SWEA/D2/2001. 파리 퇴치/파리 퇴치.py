t = int(input())
for tc in range(1, t+1):
    n, m = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(n)]
    ans = 0
    for i in range(n-m+1):
        for j in range(n-m+1):
            tmp = 0
            for x in range(i, i+m):
                for y in range(j, j+m):
                   tmp += arr[x][y]
            if ans < tmp:
                ans = tmp

    print(f'#{tc}',ans)