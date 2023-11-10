t = int(input())
for tc in range(1, t + 1):
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(n)]
    arr_90 = [[0] * n for _ in range(n)]

    for i in range(n):
        for j in range(n):
            arr_90[i][j] = arr[j][i]

        arr_90[i] = arr_90[i][::-1]


    arr_180 = [[0] * n for _ in range(n)]

    for i in range(n):
        for j in range(n):
            arr_180[i][j] = arr_90[j][i]

        arr_180[i] = arr_180[i][::-1]
    arr_270 = [[0] * n for _ in range(n)]

    for i in range(n):
        for j in range(n):
            arr_270[i][j] = arr_180[j][i]
        arr_270[i] = arr_270[i][::-1]
    print(f'#{tc}')
    for i in range(n):
        print(''.join(map(str, arr_90[i])), ''.join(map(str, arr_180[i])), ''.join(map(str, arr_270[i])))

