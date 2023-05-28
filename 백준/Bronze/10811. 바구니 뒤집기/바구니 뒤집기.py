n,m = map(int, input().split())
arr = [0] * n # for문을 입력해서 지정하는 법도 익히기
for i in range(n):
    arr[i] = i+1

for _ in range(m):
    i, j = map(int, input().split())
    temp = arr[i-1:j]
    temp.reverse()
    arr[i-1:j] = temp

for i in range(n):
    print(arr[i], end=' ')