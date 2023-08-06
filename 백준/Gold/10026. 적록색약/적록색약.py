from collections import deque

def bfs(x,y):
    q.append((x,y))
    
    dx = [-1,0,1,0]
    dy = [0,1,0,-1]

    visited[x][y] = 1
    while q:
        x,y = q.popleft()
        for d in range(4):
            nx = x + dx[d]
            ny = y + dy[d]

            # 인덱스 범위내, 같은 색, 아직 방문 안함
            if 0 <= nx < n and 0 <=ny < n and arr[nx][ny] == arr[x][y] and not visited[nx][ny]:
                visited[nx][ny] = 1
                q.append((nx,ny))


n = int(input())
arr = [list(input()) for _ in range(n)]
q = deque()

visited = [[0] * n for _ in range(n)]
cnt1 = 0
# 정상인
for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            bfs(i,j)
            cnt1 += 1
# 적록색약
for i in range(n):
    for j in range(n):
        if arr[i][j] == 'G':
            arr[i][j] = 'R'

visited = [[0] * n for _ in range(n)]
cnt2 = 0
for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            bfs(i,j)
            cnt2 += 1

print(cnt1, cnt2)
