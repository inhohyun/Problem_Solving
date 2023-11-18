t = int(input())
for tc in range(1, t+1):
    s = input()

    mid = len(s) // 2
    flag = 1
    i = 0
    while True:
        if s == s[::-1]:
            break
        if i == mid:
            break
        if s[i] == '*' or s[-(i+1)] == '*':
            break

        if s[i] != s[-(i+1)]:
            flag = 0
            break
        i += 1
    
    if flag:
        print(f'#{tc}', 'Exist')
    else:
        print(f'#{tc}', 'Not exist')
