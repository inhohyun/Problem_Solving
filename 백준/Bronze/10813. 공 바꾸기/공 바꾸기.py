n,m = map(int, input().split())
arr = [0] * n # for문을 입력해서 지정하는 법도 익히기
for i in range(n):
    arr[i] = i+1

for _ in range(m):
    i, j = map(int, input().split())
    temp = arr[i-1]
    arr[i-1] = arr[j-1]
    arr[j-1] = temp


ans = ''
for i in range(n):
    ans += str(arr[i])+ " "

print(ans[:len(ans)-1])