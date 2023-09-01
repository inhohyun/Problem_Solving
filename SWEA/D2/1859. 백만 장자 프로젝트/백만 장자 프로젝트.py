test = int(input())
for t in range(1, test+1):
    n = int(input())
    days = list(map(int, input().split()))
    buy = []
    max_cost = max(days)
    answer = 0
    for i in range(n):
        # 최대값이 아니면 구입
        if days[i] != max_cost:
            buy.append(days[i])

        # 최대값이면 판매하고 최대값 갱신
        else:
            answer += max_cost * len(buy) - sum(buy)
            buy.clear()
            if i == n-1:
                break
                
            #최대값 갱신
            max_cost = 0
            for j in range(n-1, i, -1):
                if max_cost < days[j]:
                    max_cost = days[j]


    print(f'#{t}', answer)




