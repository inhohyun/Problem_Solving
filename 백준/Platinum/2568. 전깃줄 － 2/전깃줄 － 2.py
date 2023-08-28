import bisect
n = int(input())
arr = []
for i in range(n):
    a, b = map(int, input().split())
    arr.append((a,b))

arr.sort(key=lambda x:x[1])
lis = [0] # 수열의 길이
lis_total = [0,0] # 수열 구하기, lis가 있어야 만들 수 있음
for item in arr:
    a, b = item
    if lis[-1] < a :
        lis.append(a)
        lis_total.append((a, len(lis) -1))
    else:
        idx = bisect.bisect_left(lis, a)
        lis[idx] = a
        lis_total.append((a, idx))
    target = len(lis)
result = []
# target == 6, len(lis_total) == 10
num = target -1   
i = len(lis_total)-1
while True:
    if i == 1:
        break
   
    if lis_total[i][1] != num:  
        result.append(lis_total[i][0])
        num += 1
    i -= 1
    num -= 1

result.sort()
print(n -(target-1))
for i in result:
    print(i)



