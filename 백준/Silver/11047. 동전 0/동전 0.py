n, k = map(int, input().split())
dong = []

for i in range(n):
    num = int(input())
    dong.append(num)

dong.sort(reverse=True)
answer = 0
for i in dong:
    if k >= i:
        answer += k // i
        k = k % i
    else:
        continue
if k == 0:
    print(answer)
else:
    print(1)