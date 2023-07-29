import sys


def dfs(x, y, v):
    global answer

    # 빈 곳이면 청소
    if graph[x][y] == 0:
        graph[x][y] = 2 # 방문 처리
        answer += 1 # 청소 구역 카운트

    # 반복문을 통해 4방향 확인
    for _ in range(4):
        nv = (v + 3) % 4 # 현재 방향 + 3을 4로 나눈 나머지가 왼쪽 방향
        nx = x + dx[nv]
        ny = y + dy[nv]

        # 이동 위치가 빈 곳이면 탐색
        if graph[nx][ny] == 0:
            dfs(nx, ny, nv)
            return
        # 현재 방향 변경
        v = nv

    # 4방향 모두 탐색했다면
    nv = (v + 2) % 4 # 현재방향 + 2를 4로 나눈 나머지가 후진 방향
    nx = x + dx[nv]
    ny = y + dy[nv]

    # 이동 위치가 벽이라면 리턴
    if graph[nx][ny] == 1:
        return

    # 이동 위치가 벽이 아니라면 탐색
    dfs(nx, ny, v)


n, m = map(int, sys.stdin.readline().split())
r, c, d = map(int, sys.stdin.readline().split())
graph = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

# d => 0,3,2,1 순서로 돌아야함. 북/서/남/동
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
answer = 0
dfs(r, c, d)
print(answer)