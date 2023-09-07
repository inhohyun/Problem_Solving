t = int(input())
for tc in range(1, t+1):
    P, Q, R, S, W = map(int, input().split())
    # A : 1리터당 P원
    # B : 기본요금 Q원, R이하인경우 Q원만 납부, 아닐경우 R 초과량 1리터 당 S원
    # W : 사용하는 수도의 양
    A, B = 0,0
    A = P * W
    if W <= R:
        B = Q
    else:
        B = ((W-R) * S) + Q
    print(f'#{tc}', min(A,B))

