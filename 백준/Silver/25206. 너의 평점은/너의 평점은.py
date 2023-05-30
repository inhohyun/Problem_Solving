dic = {'A+':4.5, 'A0':4.0, 'B+':3.5, 'B0':3.0, 'C+':2.5, 'C0':2.0, 'D+':1.5, 'D0':1.0, 'F':0}

total = 0 # 학점의 총합
result = 0 # 학점 * 과목 평점 총합

for _ in range(20):
    s, p, g = input().split()
    p = float(p)
    if g != 'P':
        total += p
        result += dic.get(g) * p

print(round(result / total, 6) )

