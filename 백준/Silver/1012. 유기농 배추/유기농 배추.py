from collections import deque

test = int(input())

dx = [0,0,1,-1]
dy = [1,-1,0,0]

def bfs(graph, a, b):
    q = deque()
    # 방문한 구역 0으로 처리
    q.append((a,b))
    graph[a][b] = 0
    # 근처에 1이 없을 때까지 반복
    while q:
        x, y = q.popleft()
        # 상하좌우 탐색
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            # 구역을 벗어난 경우 건너뛰기
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            # 근처의 1들을 0으로 초기화
            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                q.append((nx, ny))


for i in range(test):
    cnt = 0
    n, m, k = map(int, input().split())
    # 그래프 생성
    graph = [[0] * m for _ in range(n)]

    # 배추 위치 표시
    for j in range(k):
        x, y = map(int, input().split())
        graph[x][y] = 1
    
    # 완전탐색하여 배추 위치 찾기
    for a in range(n):
        for b in range(m):
            # 배추를 찾음
            if graph[a][b] == 1:
                bfs(graph, a,b)
                cnt += 1
    
    print(cnt)



