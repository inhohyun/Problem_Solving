t = int(input())
for tc in range(1, t+1):
    board = [list(input()) for _ in range(8)]
    flag = 0
    # 가로 탐색
    for i in range(8):

        # 가로에 룩이 1개 이상 있으면
        if board[i].count('O') != 1:
            flag = 1


    # 세로 탐색
    for i in range(8):
        for j in range(8):
            if board[i][j] == 'O':
                for x in range(i+1, 8):
                    if board[x][j] == 'O':
                        flag = 1

    if flag:
        print(f'#{tc}', 'no')
    else:
        print(f'#{tc}', 'yes')

