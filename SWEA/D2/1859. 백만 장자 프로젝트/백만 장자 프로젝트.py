t = int(input())

for tc in range(1, t+1):
    n = int(input())
    days = list(map(int, input().split()))
    ans = 0
    buy = []
    stack = []
    stack.append(days[n-1])
    for i in range(n-2, -1, -1):
        if stack[-1] > days[i]:
   
            buy.append(days[i])
        else:
            ans += (stack[-1]* len(buy) )- sum(buy)
            buy.clear()
            stack.append(days[i])
    
    ans += (stack[-1]* len(buy) )- sum(buy)
    print(f'#{tc}',ans)
