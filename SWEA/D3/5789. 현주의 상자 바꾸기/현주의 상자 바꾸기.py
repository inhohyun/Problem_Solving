test = int(input())
for T in range(1, test+1):
    N, Q = map(int, input().split())

    box = [0] * (N+1)
    for i in range(1, Q+1):
        L, R = map(int, input().split())
        for j in range(L, R+1):
            box[j] = i
    
    print(f'#{T}', end=' ')
    for a in range(1, len(box)):
        print(box[a], end=' ')
    print()
