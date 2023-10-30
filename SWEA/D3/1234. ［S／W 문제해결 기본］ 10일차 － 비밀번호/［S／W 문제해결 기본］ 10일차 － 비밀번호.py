for tc in range(1, 11):
    n, s = input().split()
    n = int(n)
    s = str(s)
    i = 0
    while i < len(s) - 1:
        if s[i] == s[i + 1]:
            front = s[:i]
            end = s[i + 2:]
            s = front + end
            i = 0
            continue
        i += 1

    print(f'#{tc}',s)