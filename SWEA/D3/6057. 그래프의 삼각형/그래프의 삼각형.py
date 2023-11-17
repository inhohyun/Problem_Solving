t = int(input())
for tc in range(1, t+1):
    n, m = map(int, input().split())
    graph = [[0] * (n+1) for _ in range(n+1)]
    for i in range(m):
        x, y = map(int, input().split())
        graph[x][y] = 1
        graph[y][x] = 1
    cnt = 0
    # 3중 for 문?
    for i in range(n+1):
        for j in range(i,n+1):
            for k in range(j,n+1):
                if graph[i][j] == 1 and graph[i][k] == 1 and graph[j][k] == 1:
                    cnt += 1
    
    print(f'#{tc}', cnt)