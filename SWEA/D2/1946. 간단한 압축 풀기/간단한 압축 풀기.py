t = int(input())
for tc in range(1, t+1):
    n = int(input())
    s = ''
    for _ in range(n):
        ch, m = input().split()
        m = int(m)
        for i in range(m):
            s += ch
    # s를 10줄씩 끝기
    tmp = ''
    ans = []
    for i in range(len(s)):
        tmp += s[i]
        if len(tmp) == 10:
            ans.append(tmp)
            tmp = ''
    if tmp != '':
        ans.append(tmp)
    print(f'#{tc}')
    for a in ans:
        print(a)

