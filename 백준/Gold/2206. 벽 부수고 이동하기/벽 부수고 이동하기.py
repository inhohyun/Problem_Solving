from collections import deque

n,m = map(int, input().split())
graph = []

# 벽 파괴 가능 카운트도 배열에 추가
v = [[[0] * 2 for _ in range(m)] for _ in range(n)]

v[0][0][0] = 1

for i in range(n):
    graph.append(list(map(int, input())))


dx = [0,0,1,-1]
dy = [1,-1,0,0]

def bfs(x,y,z):
    q = deque()
    q.append((x,y,z))

    while q:
        a,b,c = q.popleft()

        if a == n-1 and b == m-1:
            return v[a][b][c]
        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]
            if nx < 0 or nx >= n or ny <0 or ny >= m:
                continue

            if graph[nx][ny] == 1 and c == 0:
                v[nx][ny][1] = v[a][b][0] + 1
                q.append((nx,ny,1))
            
            elif graph[nx][ny] == 0 and v[nx][ny][c] == 0:
                v[nx][ny][c] = v[a][b][c] + 1
                q.append((nx,ny,c))
    return -1

print(bfs(0,0,0))
