# 100 * 100 배열
arr = [[0] * 101 for _ in range(101)]

for _ in range(4):
    x1, y1, x2, y2 = map(int, input().split())
    # 직사각형 내부 좌표를 1로 처리하기
    for x in range(x1, x2):
        for y in range(y1,y2):
            arr[x][y] = 1


cnt = 0
# 0이 아닌 수 세기
for i in range(100):
    for j in range(100):
        if arr[i][j] != 0:
            cnt += 1

print(cnt)

