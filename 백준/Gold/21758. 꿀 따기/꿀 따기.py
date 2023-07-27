# 두 꿀벌이 딸 수 있는 꿀의 최대치
# 두 꿀벌을 어떻게 배치해야 최대치가 될까? -> 꿀을 따는 로직을 아직 이해 못했음 -> 두 벌이 벌통쪽으로 날아가면서 지나가는 숫자를 더함
# 예제 입력보고 규칙 찾기 -> 벌꿀통과 벌 사이에 있는 값들이 최대값 -> 일단 꿀통을 어디에 둘지? 

# 벌 - 벌 - 꿀, 꿀 - 벌 - 벌, 벌 - 꿀 - 벌의 3가지 경우로 나눠서 최대값 비교
n = int(input())
load = list(map(int, input().split()))
target = sum(load)
answer = 0
temp = load[0]

# 벌 - 벌 - 꿀
for i in range(1, n):
    # 중간에 못먹는 꿀
    temp += load[i]
    # 첫 번째 벌이 먹을 수 있는 양 + 두 번째 벌이 먹을 수 있는 양
    answer = max(answer, target - load[0] + target - temp - load[i])

# 꿀 - 벌 - 벌
load.reverse()
temp = load[0]

for i in range(1, n):
    # 중간에 못먹는 꿀
    temp += load[i]
    # 첫 번째 벌이 먹을 수 있는 양 + 두 번째 벌이 먹을 수 있는 양
    answer = max(answer, target - load[0] + target - temp - load[i])

# 벌 - 꿀 - 벌
for i in range(1, n):
    answer = max(answer, target - load[0] - load[-1]+load[i])

print(answer)
