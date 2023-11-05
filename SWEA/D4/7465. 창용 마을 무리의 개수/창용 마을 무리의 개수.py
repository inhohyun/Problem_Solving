from collections import deque
def bfs(v):
    global visited
    q = deque()
    q.append(v)
    while q:
        v = q.pop()
        for i in range(1,n+1):
            if arr[i][v] == 1 and visited[i] == False:
                visited[i] = True
                q.append(i)

t = int(input())
for tc in range(1, t+1):
    n,m = map(int, input().split())
    arr = [[0] * (n+1) for _ in range(n+1)]
    visited = [False for _ in range(n+1)]
    ans = 0
    for _ in range(m):
        a,b = map(int, input().split())
        arr[a][b] = 1
        arr[b][a] = 1
    for i in range(1,n+1):
        if visited[i] == False:
            bfs(i)
            ans += 1


    print(f'#{tc}',ans)
