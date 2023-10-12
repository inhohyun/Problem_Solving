n, k = map(int, input().split())
data = []
for _ in range(n):
    s, y = map(int, input().split())
    # 튜플 형태로 저장
    data.append((s, y))
data.sort()
# 방에 한 명 넣어놓고 시작
ans = 1
current_box = data.pop()
current_person = 1
# 방에 사람이 k명까지 들어올 수 있음
while True:
    if len(data) == 0:
        break
    # 방에 k명이 들어있을 때
    if current_person == k:
        current_box = data.pop()
        ans += 1
        current_person = 0
    # 같은 학년 같은 반이 없으면 방을 늘림
    elif current_box not in data:
        current_box = data.pop()
        ans += 1
        current_person = 0
    else:
        current_person += data.count(current_box)
        data.remove(current_box)

print(ans)







