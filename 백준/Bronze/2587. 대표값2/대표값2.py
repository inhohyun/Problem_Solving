li = []
for i in range(5):
    li.append(int(input()))

li_sum = sum(li)

li.sort()
print(li_sum // 5)
print(li[2])