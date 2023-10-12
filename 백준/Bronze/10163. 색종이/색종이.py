n = int(input())
arr = [[0] * 1001 for _ in range(1001)]
for k in range(1, n+1):
    x,y, width, height = map(int, input().split())

    for i in range(x, x+width):
        for j in range(y, y+height):
            arr[i][j] = k


# 논리상 문제가 없어보이는데?
# 각 색종이가 보이는 면적을 구하는것
cnt_color = [0] * (n+1)
for i in range(1001):
    for j in range(1001):
        if arr[i][j]:
            cnt_color[arr[i][j]] += 1
cnt_color.remove(0)
for i in cnt_color:

    print(i)




