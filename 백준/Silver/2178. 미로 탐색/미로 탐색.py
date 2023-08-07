
N,M = map(int, input().split())
graph = []
for i in range(N):
    graph.append(list(map(int, list(input()))))


# queue를 이용한 bfs로 탐색해보기
def bfs(si,sj,ei,ej):
    q = []
    q.append((si,sj))
            
    visited = [[0]* M for _ in range(N)]
    visited[si][sj] = 1

    while q:
        ci, cj = q.pop(0)
        if (ci,cj)  == (ei,ej):
            return visited[ei][ej]
        
        for di, dj in ((-1,0), (1,0),(0,-1),(0,1)):
            ni = ci + di
            nj = cj + dj

            if 0<= ni < N and 0 <=nj < M and visited[ni][nj]==0 and graph[ni][nj] == 1 :
                q.append((ni,nj))
                visited[ni][nj] = visited[ci][cj] + 1

ans = bfs(0,0,N-1,M-1)
print(ans)
            


