# 어떤 상황에서 2를 곱하고 어떤 상황에서 1을 붙여야하나? -> 규칙성을 찾는 문제? -> 15분까지 고민
# b를 a로 만들기

a, b = map(int, input().split())
count = 1
while a != b:
    count += 1
    temp = b
    if b % 10 == 1:
        b //= 10
    elif b % 2 == 0:
        b //= 2


    if temp == b:
        print(-1)
        break

else:
    print(count)