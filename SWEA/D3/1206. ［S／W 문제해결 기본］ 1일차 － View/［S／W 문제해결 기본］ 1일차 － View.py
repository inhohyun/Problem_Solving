for tc in range(1, 11):
    n = int(input())
    apart = list(map(int, input().split()))
    cnt = 0
    for i in range(2,n-2):
        # 주변 두 칸 중 가장 높지 않으면 건너뜀
        if apart[i] != max(apart[i-2:i+3]):
            continue

        second = sorted(apart[i-2:i+3])[-2]
        # 두 번째로 높은 건물과 차이만큼 조명권 확보
        cnt += apart[i] - second

    print(f'#{tc}', cnt)
