def dfs(n):
    global ans
    if n == N:
        ans = max(ans, int(''.join(map(str, lst))))
        return
    # L 개에서 2개 뽑는 모든 조합(들을 교환)
    for i in range(L-1):
        for j in range(i+1, L):
            lst[i], lst[j] = lst[j], lst[i]

            chk = int(''.join(map(str, lst)))

            # 이미 해본 경우는 넘기자
            if (n, chk) not in v:
                dfs(n+1)
                v.append((n,chk))

            lst[i], lst[j] = lst[j], lst[i]

T = int(input())
for tc in range(1, T+1):
    st, t = input().split()

    N = int(t)
    lst = []

    for ch in st:
        lst.append(ch)
    L = len(lst)
    ans = 0
    v = []
    dfs(0)
    print(f'#{tc}', ans)
