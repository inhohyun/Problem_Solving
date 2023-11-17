t = int(input())
for tc in range(1, t+1):
    s, t = input().split()

    s1, s2 = s, t
    flag = 0
    while True:
        if len(s1) == len(s2):
            if s1 == s2:
                flag = 1
            break
        if len(s1) > len(s2):
            s2 += t
        else:
            s1 += s
    if flag:
        print(f'#{tc}', 'yes')
    else:
        print(f'#{tc}', 'no')
        
