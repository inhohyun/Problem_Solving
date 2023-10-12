n, k = map(int, input().split())
female = [0] * 1000
male = [0] * 1000
for _ in range(n):
    s, y = map(int, input().split())
    if s == 0:
        female[y] += 1
    elif s == 1:
        male[y] += 1

for i in range(1, 7):
    # 인원별 맞게 떨어질 때
    if male[i] % k == 0:
        male[i] = male[i] // k
    # 아닐때
    else:
        male[i] = male[i] // k + 1

    if female[i] % k == 0:
        female[i] = female[i] // k
    else:
        female[i] = female[i] // k + 1
print(sum(female) + sum(male))


