t = int(input())
for tc in range(1, t+1):
    n, k = map(int, input().split())
    ok = list(map(int, input().split()))
    ans = []
    for i in range(1, n+1):

        if not i in ok:
            ans.append(i)
    print(f'#{tc}', ' '.join(map(str, ans)))
    

