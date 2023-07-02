n = int(input())
time = []
# 일찍 끝나는 회의 위주로 배치하면 회의를 많이 배치할 수 있음
# 일찍 끝나는 회의순 중에서 일찍 시작하는 순으로 배치하면 최대 값

for _ in range(n):
    # 시작, 끝 값을 리스트로 저장
    start, end = map(int, input().split())
    time.append([start, end])

# 시작시간 기준으로 정렬
time.sort(key=lambda x: x[0])
# 끝나는 시간 기준으로 정렬
time.sort(key=lambda x: x[1])

# 끝나는 시간 저장
last = 0
# 회의 개수 저장
count = 0

for i, j in time:
    # 이전 회의 끝나는 시간보다 늦게 시작하면 회의 가능
    if i >= last:
        count += 1
        last = j
print(count)