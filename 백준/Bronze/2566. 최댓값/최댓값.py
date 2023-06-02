li = []
m = 0
for i in range(9):
    row = list(map(int, input().split()))
    li.append(row)
    if max(row) > m:
        m = max(row)
check = 0
for i in range(0, 9):
    for j in range(0, 9):
        if li[i][j] == m:
            print(m)
            print(i+1, j+1)
            check = 1
        if check == 1:
            break
    if check == 1:
        break


