from collections import deque
def bfs(start):
    global max_, arr
    cnt = 1
    q = deque()
    ci, cj = start
    q.append((ci,cj))
    arr[ci][cj] = 2
    while q:
        ci, cj = q.pop()
        for d in range(4):
            di = ci + dx[d]
            dj = cj + dy[d]
            if 0< di <= n and 0< dj <= m:
                if arr[di][dj] == 1:
                    arr[di][dj] = 2
                    cnt += 1
                    q.append((di,dj))
    max_ = max(cnt, max_)

dx = [0,0,-1,1]
dy = [-1,1,0,0]
# 지나간 구역을 0으로 처리하여 1 구역 중 제일 큰 구역의 넓이 출력
n, m, k = map(int, input().split())
max_ = 0
arr = [[0] * (m+1) for _ in range((n+1))]
for i in range(k):
    r, c = map(int, input().split())
    arr[r][c] = 1

for i in range(1, n+1):
    for j in range(1, m+1):
        if arr[i][j] == 1:
            bfs((i,j))

print(max_)