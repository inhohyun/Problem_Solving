from collections import deque
dx = [0,0,1,-1]
dy = [1,-1,0,0]
# 전형적인 bfs인데 왜 틀린거지?
def bfs(start):
    global visited
    ci, cj = start
    q = deque()
    visited[ci][cj] = True
    q.append((ci,cj))
    while q:
        ci,cj = q.popleft()
        for d in range(4):
            ni,nj = ci+dx[d], cj+dy[d]
            if 0<=ni < 100 and 0<=nj < 100:
                if arr[ni][nj] == '3':
                    return 1
                if arr[ni][nj] == '0' and visited[ni][nj] == False:
                    q.append((ni,nj))
                    visited[ni][nj] = True
    return 0

for tc in range(1, 11):
    T = int(input())
    arr = [list(input()) for _ in range(100)]

    visited = [[False] * 100 for _ in range(100)]

    print(f'#{tc}', bfs((1, 1)))