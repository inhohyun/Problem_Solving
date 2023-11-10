t = int(input())
for tc in range(1, t+1):
    n = int(input())
    target = '0123456789'
    i = 1
    while True:
        if len(target) == 0:
            break

        tmp = str(n * i)
        for j in range(len(tmp)):
            if tmp[j] in target:
                target = target.replace(tmp[j], '')

        i += 1

    print(f'#{tc}',n*(i-1))
