def dfs(v, cnt):
    global answer
    if cnt > answer:
        answer = cnt
    for nv in graph[v]:
        if not visited[nv]:
            visited[nv] = 1
            dfs(nv, cnt+1)
            visited[nv] = 0


for tc in range(1, int(input())+1):
    n, m = map(int, input().split())
    graph = [[] for _ in range(n+1)]
    for _ in range(m):
        x, y = map(int, input().split())
        graph[x].append(y)
        graph[y].append(x)
    answer = 0
    visited = [0] * (n + 1)
    for i in range(1, n+1):
        visited[i] = 1
        dfs(i, 1)
        visited[i] = 0
    print('#{} {}'.format(tc, answer))
