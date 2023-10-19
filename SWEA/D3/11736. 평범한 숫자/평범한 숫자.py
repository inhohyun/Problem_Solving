t = int(input())
for tc in range(1, t+1):
    n = int(input())
    p = list(map(int, input().split()))
    ans = 0
    for i in range(1, n-1):
        m = [p[i-1], p[i], p[i+1]]
        max_num = max(m)
        min_num = min(m)
        if p[i] != max_num and p[i] != min_num:
            ans += 1
    print(f'#{tc}', ans)
    
            

