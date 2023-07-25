T = int(input())
for i in range(1, T+1):
    L, U, X = map(int, input().split())
    # 제한시간보다 더 많이 운동했을 경우
    if X > U:
        print(f'#{i}', -1)
    elif L <= X and X <= U:
        print(f'#{i}', 0)
    else:
        print(f'#{i}', L - X)
        