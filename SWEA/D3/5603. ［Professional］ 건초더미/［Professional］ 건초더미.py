t = int(input())
for tc in range(1, t+1):
    n = int(input())
    numbers = []
    for _ in range(n):
        numbers.append(int(input()))

    middle = sum(numbers) // n
    # 여유분 저장할 공간
    tmp = 0
    # 다 middle과 같게 만들기
    for i in range(n):
        if numbers[i] > middle:
            tmp += numbers[i] - middle
            numbers[i] = middle


    print(f'#{tc}', tmp)