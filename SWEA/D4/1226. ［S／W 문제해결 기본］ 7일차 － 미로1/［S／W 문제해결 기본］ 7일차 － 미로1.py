from collections import deque

d = [(0,1), (0,-1), (1,0), (-1,0)]
def bfs(start):
    check = 0

    q = deque()
    ci, cj = start
    visited[ci][cj] = 1
    q.append((ci, cj))

    while q:
        ci, cj = q.pop()
        # 이동하기
        for i in range(4):
            di, dj = ci+d[i][0], cj + d[i][1]
            if 0<= di < 16 and 0<= dj < 16:
                if arr[di][dj] == 0 and visited[di][dj] == 0:
                    # 갔다가 다시 돌아오는 경우를 생각해야하나?
                    # bfs 구현법 다시보기?
                    q.append((di,dj))
                    visited[di][dj] = 1
                elif arr[di][dj] == 3:
                    check = 1
                    break
        if check == 1:
            break
    return check


for tc in range(1, 11):
    arr = []
    test = int(input())
    visited = [[0] * 16 for _ in range(16)]
    for _ in range(16):
        arr.append(list(map(int, input())))

    for i in range(16):
        for j in range(16):
            if arr[i][j] == 2:
                print(f'#{tc}',bfs((i,j)))
                break
