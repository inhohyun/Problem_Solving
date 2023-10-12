n = int(input())
arr = [[0] * 1001 for _ in range(1001)]
for i in range(n):
    x,y, width, height = map(int, input().split())

    for i in range(x, x+width):
        for j in range(y, y+height):
            arr[j][i] += 1


# 논리상 문제가 없어보이는데?
# 각 색종이가 보이는 면적을 구하는것
for nCnt in range(1, n+1):
    cnt = 0
    for i in range(1001):
        for j in range(1001):
            if arr[i][j] == nCnt:
                cnt += 1
    print(cnt)

