from collections import deque
move = [(0,1), (1,0), (-1,0), (0,-1)]
def bfs():
    global q, visited
    while len(q):
        i,j = q.popleft()

        for dx, dy in move:
            ci, cj = i + dx, j + dy

            if 0 <= ci < n and 0 <= cj < n :
                if visited[ci][cj] > visited[i][j] + field[ci][cj]:
                    visited[ci][cj] = visited[i][j] + field[ci][cj]
                    q.append((ci,cj))




for t in range(int(input())):
    n = int(input())
            
    field = [list(map(int, list(input()))) for _ in range(n)]
    inf = float('inf')
    # 거리별 최소 이동거리를 저장할 배열
    visited = [[1000000] * n for _ in range(n)]
    visited[0][0] = 0

    q = deque()
    q.append((0,0))

    bfs()
    print(f'#{t+1}', visited[n-1][n-1])