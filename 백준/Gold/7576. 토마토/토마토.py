from collections import deque
m,n = map(int, input().split())
arr = []
q = deque()
cnt = 0
# 그래프 입력받기
for i in range(n):
    arr.append(list(map(int, input().split())))

dx, dy = [1, -1, 0, 0], [0, 0, 1, -1]
for i in range(n):
    for j in range(m):
        if arr[i][j] == 1:
            q.append((i,j))

while q:
    # 좌표의 현재 위치
    ci, cj = q.popleft()
    for d in range(4):
        di = ci + dx[d]
        dj = cj + dy[d]
        if 0 <= di < n and 0 <= dj < m:
            if arr[di][dj] == 0:
                arr[di][dj] = arr[ci][cj] + 1
                # 왜 반복문을 못 빠져나오지?
                q.append((di,dj))
ans = 0
for line in arr:
    for tomato in line:
        if tomato == 0:
            print(-1)
            exit()
        
    ans = max(ans, max(line)) 

print(ans -1)