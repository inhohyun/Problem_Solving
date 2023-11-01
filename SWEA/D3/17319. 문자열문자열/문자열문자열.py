t = int(input())
for tc in range(1, t+1):
    n = int(input())
    s= input()
    flag = 0
    for i in range(n):
        if s.count(s[i]) % 2 != 0:
            flag = 1
    if flag:
        print(f'#{tc}','No')
    else:
        print(f'#{tc}','Yes')
        