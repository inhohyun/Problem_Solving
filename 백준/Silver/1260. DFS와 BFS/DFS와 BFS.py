from collections import deque
n, m, v = map(int, input().split())
graph = [[0] * (n+1) for _ in range(n+1)]
for i in range(m):
    x,y = map(int, input().split())
    graph[x][y] = 1
    graph[y][x] = 1
# 왜 visited 배열은 일차원으로 선정했지?
visited1 = [False] * (n+1)
visited2 = [False] * (n+1)

def bfs(v):
    q = deque([v])
    visited2[v] = True
    while q:
        v = q.popleft()
        print(v, end=' ')
        for i in range(1, n+1):
            if not visited2[i] and graph[v][i]: #만약 해당 i값을 방문하지 않았고 V와 연결이 되어 있다면
                q.append(i)
                visited2[i] = True

# 동서남북 탐색하는건 알겠는데 그래프 탐색이 기억이 안나네?
def dfs(v):
    visited1[v] = True
    print(v, end=' ')
    for i in range(1, n+1):
        if not visited1[i] and graph[v][i]:
            dfs(i)

dfs(v)
print()
bfs(v)