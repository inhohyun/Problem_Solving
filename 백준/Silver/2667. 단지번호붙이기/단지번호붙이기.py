n = int(input())
graph = []
num = []

for i in range(n):
    graph.append(list(map(int, input())))

# 이동할 좌표
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

# 단지내 아파트 수
count = 0
# 단지 수
result = 0

def dfs(x, y):
    # 종료 조건
    if x < 0 or x >= n or y < 0 or y >= n:
        return False

    if graph[x][y] == 1:
        global count
        count += 1
        # 방문한 노드 0으로 처리
        graph[x][y] = 0
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            dfs(nx, ny)
        return True
    
    # 1이 아닌 노드 탐색시 False
    return False

for i in range(n):
    for j in range(n):
        # 1인 노드 탐색시
        if dfs(i, j):
            num.append(count)
            result += 1
            count = 0
num.sort()
print(result)
for i in range(len(num)):
    print(num[i])
    