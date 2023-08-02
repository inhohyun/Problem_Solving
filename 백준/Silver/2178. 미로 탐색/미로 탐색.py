N,M = map(int, input().split())
graph = []
for i in range(N):
    graph.append(list(map(int, list(input()))))

def bfs(si,sj,ei,ej):
    q = []
    # 방문 표시할 리스트
    v = [[0]*M for _ in range(N)]

    q.append((si,sj))
    v[si][sj] = 1
    while q:
        ci, cj = q.pop(0)
        if (ci,cj) == (ei, ej):
            return v[ei][ej]

        # 4방향, 범위내, 조건에 맞으면: arr ==1, v== 0
        # 4방향 탐색
        for di, dj in ((-1,0), (1,0), (0,-1), (0,1)):
            ni, nj = ci+di, cj+dj
            # 범위내이고 길이며 방문안했을 경우
            if 0 <= ni <N and 0 <= nj <M and graph[ni][nj] == 1 and v[ni][nj] == 0:
                q.append((ni,nj))
                v[ni][nj] = v[ci][cj] + 1

# 상하좌우 탐색? -> bfs로 탐색
ans = bfs(0,0,N-1,M-1)
print(ans)