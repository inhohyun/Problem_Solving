t = int(input())
for tc in range(1, t+1):
    n = int(input())
    a,b,c,d,e = 0,0,0,0,0

    while True:
        if n % 11 != 0:
            break
        n = n // 11
        e += 1
    while True:
        if n % 7 != 0:
            break
        n = n // 7
        d += 1
    while True:
        if n % 5 != 0:
            break
        n = n // 5
        c += 1
    while True:
        if n % 3 != 0:
            break
        n = n // 3
        b += 1
    while True:
        if n % 2 != 0:
            break
        n = n // 2
        a += 1
    print(f'#{tc}',a,b,c,d,e)

