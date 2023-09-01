test = int(input())
for t in range(1, test+1):
    n = input()
    if int(n[len(n) -1]) % 2 == 0:
        # 짝수
        print(f'#{t}', 'Even')
    else:
        # 홀수
        print(f'#{t}', 'Odd')
