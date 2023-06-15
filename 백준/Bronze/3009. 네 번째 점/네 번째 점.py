# 리스트에 x, y 좌표 넣기
x_nums = []
y_nums = []
ansX, ansY = 0,0 
for i in range(3):
    X, Y = map(int, (input().split()))
    x_nums.append(X)
    y_nums.append(Y)

for i in range(3):
    if x_nums.count(x_nums[i]) == 1:
        ansX = x_nums[i]
    if y_nums.count(y_nums[i]) == 1:
        ansY = y_nums[i]
    
print(ansX, ansY)


