n = int(input())
#시험장별 학생 수
num = list(map(int, input().split()))
B, C = map(int, input().split())
#총 감독관 1명씩 배치
viewer = n
for i in num:
    i -= B
    if i > 0:
        # 감시해야하는 학생이 부 감독관이 감시할 수 있는 수로 나누어떨어지지 않으면 부감독을 1명 더 배치
        if i % C != 0:
            viewer += (i // C) + 1
        else:
            viewer += (i//C)

print(viewer)

