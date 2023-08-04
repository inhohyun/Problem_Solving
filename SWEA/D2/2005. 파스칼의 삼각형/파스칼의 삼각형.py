#2005 파스칼 삼각형
test = int(input())
# 이차원 배열로 표시
for t in range(1, test+1):
    n = int(input())
    paskal = [[0]*n for _ in range(n)]
    for i in range(n):
        paskal[i][0] = 1
    if n >= 2:
        paskal[1][1] = 1
        for i in range(2, n):
            for j in range(1, n):
                paskal[i][j] = paskal[i-1][j-1] + paskal[i-1][j]
        print(f'#{t}')
        # 0은 뺴고 출력하기
        for a in range(n):
            for b in range(n):
                if paskal[a][b] != 0:
                    print(paskal[a][b], end=' ')
            print()
            
         

    
    elif n == 1:
        print(f'#{t}')
        print(1)
    elif n == 2:
        print(f'#{t}')
        print(1)
        print(1, 1)