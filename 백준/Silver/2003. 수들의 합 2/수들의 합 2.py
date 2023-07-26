n, m = map(int, input().split())
# 배열의 부분합이 M이 되는 경우의 수
A = list(map(int, input().split()))
cnt = 0
# 이중 for문이 아닌 투 포인터로 접근하기
left = 0
right = 1
while right <= n and left <= right:
    numbers = A[left:right]
    total = sum(numbers)
    if total == m:
        cnt += 1
        right += 1
    elif total < m:
        right += 1
    else:
        left += 1

print(cnt)