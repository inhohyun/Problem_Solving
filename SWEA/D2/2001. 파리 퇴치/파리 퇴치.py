test = int(input())

for t in range(1, test+1):
    g = []
    kills = []
    n, m = map(int, input().split())
    # 그래프에 값 추가
    for _ in range(n):
        numbers = list(map(int, input().split()))
        g.append(numbers)
    #n-m-1까지 반복문
    for x in range(n-m+1):
        for y in range(n-m+1):
            temp = 0
            for i in range(m):
                for  j in range(m):
                    temp += g[x+i][y+j]
            kills.append(temp)
    
    ans = max(kills)
    print(f'#{t}', ans)
