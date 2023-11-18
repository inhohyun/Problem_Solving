from collections import deque
def bfs(v):
    global visited
    q = deque()
    q.append(v)
    while q:
        v = q.popleft()
        for i in range(1, n+1):
            if visited[i] == 0 and graph[v][i] == 1:
                visited[i] = 1
                q.append(i)

t = int(input())
for tc in range(1, t+1):
    n, m = map(int, input().split())
    graph = [[0] *(n+1) for _ in range(n+1)]
    for _ in range(m):
        x, y = map(int, input().split())
        graph[x][y] = 1
        graph[y][x] = 1

    visited = [0] * (n+1)
    cnt = 0
    for i in range(1, n+1):
        if visited[i] == 0:
            bfs(i)
            cnt += 1

    print(f'#{tc}',cnt)