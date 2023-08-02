# 조망권이 확보된 층수
for t in range(1, 11):
    n = int(input())
    apart = list(map(int, input().split()))
    # 양쪽으로 두 칸 이상이 확보되어야 함
    ans = 0
    for i in range(2, n-2):
        # 양쪽보다 크다면
        mx = apart[i-2]
        for j in range(i-1, i+3):
            if i==j:
                continue
            else:
                if mx <apart[j]:
                    mx = apart[j]
        if apart[i] > mx:
            ans += apart[i] - mx
            
    print(f'#{t}', ans)