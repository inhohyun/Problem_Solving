t = int(input())
for tc in range(1, t+1):
    n = int(input())
    ans = 0
    # 현재 속도
    current = 0
    for i in range(n):
        s = input()
        # 0이 아닐떄
        if len(s) != 1:
            r, c = map(int, s.split())
            if r == 1:
                current += c
            elif r == 2:
                current -= c
                # 속도가 0보다 줄진 않음
                if current < 0:
                    current = 0
        #현재 속도 유지
        ans += current
    print(f'#{tc}',ans)


