for t in range(1, 11):
    n = int(input())
    ans = 0
    # 8*8 배열 입력받기
    arr = []
    for i in range(8):
        arr.append(list(input()))

    str_target = ''
    # 가로 탐색
    for i in range(8):
        for j in range(9-n):
            for b in range(j, j+n):
                str_target += arr[i][b]
            
            if str_target == str_target[::-1]:
                ans += 1
            str_target = ''

    # 세로 탐색
    for i in range(9-n):  
        for j in range(8):
            # index out 에러 해결하기
            for a in range(i, i+n):
                str_target += arr[a][j]
            
            if str_target == str_target[::-1]:
                ans += 1
            str_target = ''

    print(f'#{t}',ans)