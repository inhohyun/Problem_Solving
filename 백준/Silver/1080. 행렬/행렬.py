# 나올 수 없는 경우 
# 1. 두 행렬이 다른데 범위가 3보다 작을 때
# 2. 끝까지 뒤집어 봤는데 둘이 다를때

cnt = 0
n, m = map(int, input().split())

# 두 리스트
listA = []
for _ in range(n):
    listA.append(list(map(int, list(input()))))
listB = []
for _ in range(n):
    listB.append(list(map(int, list(input()))))


# listA를 뒤집는 함수
def check (a,b):
    for x in range(a, a+3):
        for y in range(b, b+3):
            if listA[x][y] == 0:
                listA[x][y] = 1
            else:
                listA[x][y] = 0

if (n<3 or m< 3) and listA != listB:
    cnt = -1

else:
    #끝까지 돌려보기
    for r in range(n-2):
        for c in range(m-2):
            if listA[r][c] != listB[r][c]:
                check(r,c)
                cnt += 1


if cnt != -1:
    # 끝까지 돌려봤는데도 다르면 -1출력
    if listA != listB:
        cnt = -1

print(cnt)