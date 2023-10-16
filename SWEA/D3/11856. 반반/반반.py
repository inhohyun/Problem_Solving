t = int(input())
for tc in range(1, t+1):
    s = input()
    flag = 0
    for i in range(len(s)):
        if s.count(s[i]) != 2:
            flag = 1

    if flag:
        print(f'#{tc}', 'No')
    else:
        print(f'#{tc}', 'Yes')

