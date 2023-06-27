E, S, M = map(int, input().split())
ans = 1
e, s, m = 1, 1, 1
while True:
    # 통과조건
    if E == e and S == s and M==m:
        print(ans)
        break
    e += 1
    s += 1
    m += 1
    ans += 1
    if e > 15:
        e = 1
    if s > 28:
        s = 1
    if m > 19:
        m = 1


    
    