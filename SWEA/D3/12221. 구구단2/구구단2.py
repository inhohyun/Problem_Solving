t = int(input())
for tc in range(1, t+1):
    a, b = map(int, input().split())
    if a >=10 or b >= 10:
        print(f'#{tc}',-1)
    else:
        print(f'#{tc}',a*b)