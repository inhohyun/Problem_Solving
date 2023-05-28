n,m = map(int, input().split())
arr = [0] * n # for문을 입력해서 지정하는 법도 익히기
for _ in range(m):
    i, j, k = map(int, input().split())
    for a in range(i-1,j):
        arr[a] = k

ans = ''
for b in arr:
    ans += str(b)+' '

print(ans[:len(ans)-1])
