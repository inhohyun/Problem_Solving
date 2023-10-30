from collections import deque
def bfs(start):
    global arr
    # 각 영역의 넓이
    tmp = 0
    q = deque()
    ci, cj = start
    q.append((ci,cj))
    while q:
        ci, cj = q.pop()
        for d in range(4):

            di, dj = ci + dx[d], cj + dy[d]
            if 0<=di<m and 0<= dj<n:
                if arr[di][dj] == 0:
                    tmp += 1
                    arr[di][dj] = 1
                    q.append((di,dj))
    return tmp


dx = [0,0,-1,1]
dy = [-1,1,0,0]
n, m, k = map(int, input().split())
# 영역의 개수
cnt = 0
# 각 영역의 넓이를 저장한 배열
ans = []
arr = [[0]*n for _ in range(m)]

for i in range(k):
    l_x, l_y, r_x, r_y = map(int, input().split())
    # 직사각형 영역을 1로 처리하기
    for y in range(l_y, r_y):
        for x in range(l_x, r_x):
            arr[x][y] = 1


for i in range(m):
    for j in range(n):
        if arr[i][j] == 0:
            ans.append(bfs((i,j)))
for i in range(len(ans)):
    if ans[i] == 0:
        ans[i] = 1

ans.sort()
print(len(ans))
print(' '.join(map(str, ans)))

