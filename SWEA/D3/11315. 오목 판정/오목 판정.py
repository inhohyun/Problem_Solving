T = int(input())
for tc in range(1, T+1):
    n = int(input())
    arr = [list(input()) for _ in range(n)]
    ans = 'NO'
    # 우_대각 잘라내기
    tmp = ''
    for i in range(n):
        for j in range(n):
            if arr[i][j] == 'o':
                a = 0
                tmp = ''
                while True:
                    if i+a < 0 or i+a > n-1 or j+a < 0 or j+a > n-1:
                        break
                    tmp += arr[i+a][j+a]
                    a += 1
            if 'ooooo' in tmp:
                ans = 'YES'

    # 좌_대각 잘라내기
    tmp = ''
    for i in range(n):
        for j in range(n):
            if arr[i][j] == 'o':
                a = 0
                tmp = ''
                while True:
                    if i + a < 0 or i + a > n - 1 or j - a < 0 or j - a > n - 1:
                        break
                    tmp += arr[i + a][j - a]
                    a += 1
            if 'ooooo' in tmp:
    
                ans = 'YES'

    # 가로 탐색
    for i in range(n):
        if 'ooooo' in ''.join(arr[i]):
            ans = 'YES'
    # 세로 탐색
    for i in range(n):
        tmp = ''
        for j in range(n):
            tmp += arr[j][i]
            if 'ooooo' in tmp:
                ans = 'YES'

    print(f'#{tc}',ans)