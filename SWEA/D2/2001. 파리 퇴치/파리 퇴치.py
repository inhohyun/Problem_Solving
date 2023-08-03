test = int(input())
for T in range(1, test+1):
    # N은 구역
    # M은 파리채
    N, M  = map(int, input().split())
    g = []
    ans = 0
    for _ in range(N):
        g.append(list(map(int, input().split())))
    
    for a in range(N-M+1):
        for b in range(N-M+1):
            cnt = 0
            for i in range(a, a+M):
                for j in range(b, b+M):
                    cnt += g[i][j]
            ans = max(ans, cnt)        
    print(f'#{T}', ans)

