t = int(input())
for tc in range(1, t+1):
    arr = []
    for _ in range(5):
        arr.append(list(input()))

    # 부족한 수 -1로 채우기, 아래에서 에러
    for i in range(5):
        if len(arr[i]) != 15:
            while True:
                if len(arr[i]) == 15:
                    break
                arr[i].append('-1')
    answer = ''
    for i in range(15):
        for j in range(5):
            if arr[j][i] == '-1':
                continue
            answer += arr[j][i]

    print(f'#{tc}', answer)