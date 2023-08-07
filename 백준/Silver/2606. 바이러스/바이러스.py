n = int(input())
m = int(input())

g = [[] for _ in range(n+1)]
for i in range(m):
    a, b = map(int, input().split())
    g[a] += [b]
    g[b] += [a]
visited = [0] * (n+1)
def dfs(v):
    visited[v] = 1
    for nx in g[v]:
        if visited[nx] == 0:
            dfs(nx)

dfs(1)
print(sum(visited) - 1)
