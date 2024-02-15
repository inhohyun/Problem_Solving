
def dfs(x):
    global answer
    if x == n:
        answer += 1
    else:
        # 각 행에 퀸 놓아보기
        for i in range(n):
            # 일차원 배열에 몇번째 열에 퀸을 놓았는지 저장
            row[x] = i

            # 조건을 만족하지 못하면(놓을 수 없는 자리) 재귀를 반복하지 않으므로 종료조건 불필요
            if adjacent(x):
                dfs(x+1)



    

def adjacent(x): # x와 i가 같으면 행이 같은거
    for i in range(x):
        # 열이 같거나 대각선에 위치라면 false
        if row[x] == row[i] or abs(row[x]-row[i]) == x-i:
            return False
    return True
    
n = int(input())

answer = 0

row = [0] * n
dfs(0)
print(answer)