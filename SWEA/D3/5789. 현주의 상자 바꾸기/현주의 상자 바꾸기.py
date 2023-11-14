t = int(input())
for tc in range(1, t+1):
    N, Q = map(int, input().split())
    arr = [0 for _ in range(N+1)]
    for i in range(1, Q+1):
        L, R = map(int, input().split())
        for j in range(L, R+1):
            arr[j] = i
    print(f'#{tc}', ' '.join(map(str, arr[1:])))