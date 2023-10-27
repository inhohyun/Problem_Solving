from collections import deque
t = int(input())
dx = [0,0,1,-1]
dy = [1,-1,0,0]

def bfs(start):
    global ans
    ci, cj = start
    q = deque()
    q.append((ci,cj, str(board[ci][cj])))
    while q:
        ci, cj, tmp = q.popleft()
        if len(tmp) == 7:
            ans.add(tmp)
            continue
        for d in range(4):
            ni = ci + dx[d]
            nj = cj + dy[d]
            if ni <0 or ni >= 4 or nj <0 or nj >=4:
                continue
            else:
                q.append((ni,nj,tmp+str(board[ni][nj])))





for tc in range(1, t+1):
    board = [list(map(int, input().split())) for _ in range(4)]
    ans = set()

    # 모든 경우를 bfs로 탐색하기
    for i in range(4):
        for j in range(4):
            bfs((i,j))

    print(f'#{tc}', len(ans))
