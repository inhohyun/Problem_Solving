t = int(input())
for tc in range(1, t+1):
    s = input()
    if s.count('x') >= 8:
        print(f'#{tc}','NO')
    else:
        print(f'#{tc}','YES')