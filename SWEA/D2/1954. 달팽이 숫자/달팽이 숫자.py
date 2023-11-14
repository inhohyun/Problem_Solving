dArr = [(0,1), (1,0), (0,-1), (-1,0)]


t = int(input())
for tc in range(1, t+1):
    n = int(input())
    arr = [[0] * n for _ in range(n)]
    target_num = 1
    d = 0
    ci, cj = 0, 0
   
    while True:
        if target_num == n**2:
            break
        # 벽을 만나지 않으면 한 칸 전진
        if 0 <= ci < n and 0 <= cj < n and arr[ci][cj] == 0:
            arr[ci][cj] = target_num
        
            target_num += 1
            # 현재 방향으로 1칸 전진
            di, dj = dArr[d]
            ci += di
            cj += dj
        # 벽을 만나면 이전 값으로 돌리고 방향 바꾸기
        else:
            # 이전 값으로 돌리고 방향 바꾸기
            ci -= di
            cj -= dj 
            
            d = (d +1) % 4
            di, dj = dArr[d]
            ci += di
            cj += dj
    for i in range(n):
        for j in range(n):
            if arr[i][j] == 0:
                arr[i][j] = n**2
    print(f'#{tc}')
    for i in range(n):
        print(' '.join(map(str, arr[i])))


        
        



        



