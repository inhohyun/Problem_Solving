t = int(input())
# 월별 날짜 배열
days = [0,31, 28, 31, 30,31,30,31,31,30,31,30,31]
for tc in range(1, t+1):
    m1, d1, m2, d2 = map(int, input().split())
    ans = 0
    # 달이 같은 경우
    if m1 == m2:
        print(f'#{tc}',(d2- d1)+1)
    else:
    # 현재 달
        ans += days[m1] - d1
    # 마지막 달
        ans += d2
    # 중간 달
        for i in range(m1+1, m2):
            ans += days[i]

        print(f'#{tc}',ans+1)













