def dfs(cnt):
    global result, number
    
    if cnt == c:
        result = max(result, int(''.join(map(str, number)))) # 결과를 바로 최대값으로 갱신
        return
    for i in range(len(number)):
        for j in range(i+1, len(number)):
            number[i], number[j] = number[j], number[i]
            chk = int(''.join(map(str, number))) 
            if (cnt, chk) not in v:            
                dfs(cnt+1)
                v.append((cnt,chk))
            number[i], number[j] = number[j], number[i]

t = int(input())
for tc in range(1, t+1):
    n, c = map(int, input().split())
    number = list(map(int, list(str(n))))
    result = 0 # 초기값을 0으로 설정
    v  = []
    dfs(0)
    print(f'#{tc}', result)