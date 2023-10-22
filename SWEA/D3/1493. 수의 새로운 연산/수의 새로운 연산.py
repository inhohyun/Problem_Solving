dct = {}
r_dct = {}
i,j = 1,1
for n in range(1, 50000): # 10000까지의 숫자를 좌표에 저장할떄,  그 4배 크기 삼각형
    dct[n] = (i,j)
    r_dct[(i,j)] = n
    i, j = i-1, j+1
    if i<1:
        i, j = j,1


t = int(input())
for tc in range(1, t+1):
    p, q = map(int, input().split())

    pi, pj = dct[p]
    qi, qj = dct[q]

    ans = r_dct[(pi+qi, pj+qj)]

    print(f'#{tc}', ans)
