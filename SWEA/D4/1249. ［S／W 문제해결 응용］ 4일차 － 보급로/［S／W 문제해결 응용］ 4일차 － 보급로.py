from collections import deque
dx = [0,0,1,-1]
dy = [1,-1,0,0]

def bfs(start):
    global visited
    q = deque()
    ci, cj = start
    q.append((ci,cj))
    while q:
        ci, cj = q.popleft()
        for d in range(4):
            di = ci + dx[d]
            dj = cj + dy[d]
            if 0<= di < n and 0<= dj < n:
                if visited[di][dj] > visited[ci][cj] + arr[ci][cj]:
                    visited[di][dj] = visited[ci][cj] + arr[ci][cj]
                    q.append((di,dj))



t = int(input())
for tc in range(1, t+1):
    n = int(input())
    arr = [list(map(int, list(input()))) for _ in range(n)]
    visited = [[100000] * n for _ in range(n)]
    visited[0][0] = 0


    bfs((0,0))
    print(f'#{tc}',visited[n-1][n-1])
