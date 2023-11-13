def dfs(depth, sum_tast,sum_kal):
    global max_tast

    if sum_kal > l:
        return
    
    if sum_tast > max_tast:
        max_tast = sum_tast

    if depth == n:
        return


    # 해당 재료 선택
    dfs(depth+1, sum_tast+tast[depth], sum_kal+kal[depth])
    # 해당 재료 선택x
    dfs(depth+1, sum_tast,sum_kal)

t = int(input())
for tc in range(1, t+1):
    n, l = map(int, input().split())
    max_tast = 0
    tast, kal = [], []
    for i in range(n):
        a, b = map(int, input().split())
        tast.append(a)
        kal.append(b)

    dfs(0,0,0)
    print(f'#{tc}',max_tast)


