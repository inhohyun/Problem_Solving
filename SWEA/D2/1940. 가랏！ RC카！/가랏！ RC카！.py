t = int(input())
for tc in range(1, t+1):
    n = int(input())
    ans = 0
    speed = 0
    for i in range(n):
        command = input()
        if command == '0':
            ans += speed
        else:
            a, b = map(int, command.split())
            # 가속
            if a == 1:
                speed += b
            # 감속
            elif a == 2:
                speed -= b
                if speed < 0:
                    speed = 0
            ans += speed
    print(f'#{tc}',ans)



