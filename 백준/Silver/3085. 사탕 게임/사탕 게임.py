# 로직은 맞는데 구현을 실패함
# 다른사람이 구현한 것 참조

import sys
input = sys.stdin.readline

n = int(input())
board = [list(input()) for _ in range(n)]
maxCnt = 0

# 행렬을 검사하여 최대값을 갱신하는 함수
def check():
    global maxCnt
    for i in range(n):
        # 행을 검사
        cnt = 1 
        for j in range(1, n):
            if board[i][j] == board[i][j-1]:
                cnt += 1
                maxCnt = max(cnt, maxCnt)
            else:
                cnt = 1
        
        cnt = 1
        # 열을 검사
        for j in range(1, n):
            if board[j][i] == board[j-1][i]:
                cnt += 1
                maxCnt = max(cnt, maxCnt)
            else:
                cnt = 1


for i in range(n):
    for j in range(n):
        # 오른쪽과 바꿈
        if j+1 < n:
            board[i][j], board[i][j+1] = board[i][j+1], board[i][j]
            check()
            board[i][j], board[i][j+1] = board[i][j+1], board[i][j]
        # 아래쪽과 바꿈
        if i+1 < n:
            board[i][j], board[i+1][j] = board[i+1][j], board[i][j]
            check()
            board[i][j], board[i+1][j] = board[i+1][j], board[i][j]

print(maxCnt)