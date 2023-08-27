from collections import deque
import copy

def bfs():
    q = deque()
    tmp_graph = copy.deepcopy(graph)
    # 2를 전부 퍼뜨리기 위해 2의 위치를 큐에 저장
    for i in range(n):
        for j in range(m):
            if tmp_graph[i][j] == 2:
                q.append((i,j))
    
    while q:
        x,y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            if tmp_graph[nx][ny] == 0:
                tmp_graph[nx][ny] = 2
                q.append((nx,ny))

    # 안전구역 개수
    global answer
    cnt = 0
    for i in range(n):
        for j in range(m):
            if tmp_graph[i][j] == 0:
                cnt += 1
    
    answer = max(answer, cnt)



def makWall(cnt):
    if cnt == 3:
        bfs()
        return
    
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 0:
                graph[i][j] = 1
                makWall(cnt+1)
                graph[i][j] = 0


n, m = map(int, input().split())

graph = []

dx = [0,0,1,-1]
dy = [1,-1,0,0]

for _ in range(n):
    graph.append(list(map(int, input().split())))

answer = 0
makWall(0)
print(answer)


