t = int(input())
for tc in range(1, t+1):
    a1, b1, a2, b2 = map(int, input().split())

    a_ans, b_ans = 0,0

    a_ans = ((a1+a2) % 12) + ((b1+b2) // 60)
    b_ans = (b1+b2) % 60

    print(f'#{tc}', a_ans, b_ans)
