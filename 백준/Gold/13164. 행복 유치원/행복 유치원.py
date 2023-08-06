n, k = map(int, input().split())
st = list(map(int, input().split()))

arr = []
arr.append(st[1] -st[0])
for i in range(1, n-1):
    arr.append(st[i+1] - st[i])
# 반례?
arr.sort()
arr = arr[:n-k] 
print(sum(arr))