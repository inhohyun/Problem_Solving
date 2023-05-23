n, m = map(int, input().split(" "))
#원래의 판 저장
original = []
#바뀐 체스판의 개수
count = []

for _ in range(n):
    original.append(input())

#input 값의 범위가 매우 작으므로 4중 for문 활용
for a in range(n-7):
    for b in range(m-7):
        #w로 시작할 경우
        index1 = 0
        #b로 시작할 경우 
        index2 = 0
        for i in range(a, a+8):
            for j in range(b, b+8):
                if(i+j) % 2 == 0:
                    if original[i][j] != 'W':
                        index1 += 1
                    if original[i][j] != 'B':
                        index2 += 1
                else:
                    if original[i][j] != 'B':
                        index1 += 1
                    if original[i][j] != 'W':
                        index2 += 1
        count.append(min(index1, index2))
print(min(count))
