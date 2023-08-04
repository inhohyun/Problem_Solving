# 1209 Sum
for t in range(1, 11):
    n = int(input())
    g = []
    ans = 0
    for _ in range(100):
        g_li = list(map(int, input().split()))
        # 가로 합
        ans = max(ans, sum(g_li))
        g.append(g_li)

    for i in range(100):
        high= 0
        for j in range(100):
            high += g[j][i]
        # 세로 합
        ans = max(high, ans)
    tmp  =0
    # 오른쪽 방향 대각선 합
    for i in range(100):
        tmp += g[i][i]

    ans = max(tmp, ans)

    for i in range(100):
        tmp = 0
        for j in range(99, 0,-1):
            tmp += g[i][j]
        
    ans = max(tmp, ans)
    print(f'#{t}', ans)


    # 대각선, 가로, 세로의 합 중 최대값 출력
    
