from collections import deque


n, m = map(int, input().split())

numbers = list(map(int, input().split()))

cnt = 0
q = deque()
for i in range(1, n+1):
    q.append(i)

while True:
    if len(numbers) == 0:
        break
    if q[0] == numbers[0]:
        numbers.pop(0)
        q.popleft()
        continue

    # 오른쪽과 더 가까우면 오른쪽 회전
    if q.index(numbers[0]) <= len(q) // 2:
        q.rotate(-1)
        cnt += 1

    else:
        q.rotate(1)
   
        cnt += 1
print(cnt)




