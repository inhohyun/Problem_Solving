n = int(input())

# 입력값의 모든 소인수가 10**6보다 크면 적절?
for _ in range(n):
    number = int(input())
    # 그냥 소수인지를 판단?

    for i in range(2, 1000001):
        if number %i == 0:
            print('NO')
            break
        if i == 1000000:
            print('YES')