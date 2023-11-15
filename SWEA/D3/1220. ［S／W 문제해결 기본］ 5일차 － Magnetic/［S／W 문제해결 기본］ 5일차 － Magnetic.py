for tc in range(1, 11):
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(100)]

    ans = 0
    tmp = ''
    # 세로 기준으로 12의 개수를 셈
    for i in range(100):
        for j in range(100):
            if arr[j][i] != 0:
                tmp += str(arr[j][i])
        ans += tmp.count('12')
        tmp = ''
    print(f'#{tc}',ans)