t = int(input())
for tc in range(1, t+1):

    D, L, N = map(int, input().split())
    total = 0
    for n in range(N): # 지금까지 때린 횟수에 따라 증가하므로 0부터 시작
        total += D * (1+n * L*(1/100))

    print(f'#{tc}',int(total))

