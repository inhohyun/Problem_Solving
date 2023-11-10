t = int(input())
for tc in range(1, t + 1):
    n = int(input())
    days = list(map(int, input().split()))
    buy = []
    ans = 0
    max_cost = max(days)
    for i in range(n):

        if days[i] != max_cost:
            buy.append(days[i])
        else:
            # 판매하기
            ans += max_cost * len(buy) - sum(buy)
            buy.clear()

            if i == n-1:
                break
            # 최대값 갱신하기
            max_cost = 0
            for j in range(n-1, i, -1):
                if max_cost < days[j]:
                    max_cost = days[j]
    print(f'#{tc}', ans)
