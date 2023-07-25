T = int(input())
for i in range(1, T+1):
    A, B = map(int, input().split())
    if A+B < 24:
        print(f'#{i}',A+B)
    elif A+B >= 24:
        temp = 24 - A
        num = B - temp
        print(f'#{i}', num)