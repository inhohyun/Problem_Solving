

# 만들 수 없는 수 중 가장 작은 값을 출력
t = int(input())
for tc in range(1, t+1):
    n = int(input())
    arr = ''
    # 만든 수들을 저장할 배열
    while True:
        if len(arr) == n:
            break
        number = list(map(int, input().split()))
        for i in range(len(number)):
            arr += (str(number[i]))
    
    cnt = 0
    result = 0
    while True:
        if str(cnt) not in arr:
            result = cnt
            break
        cnt += 1

    print(f'#{tc}',result)


