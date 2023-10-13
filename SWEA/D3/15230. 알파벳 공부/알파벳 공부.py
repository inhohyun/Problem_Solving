t = int(input())
str_ans = 'abcdefghijklmnopqrstuvwxyz'
for tc in range(1, t+1):
    s = input()
    cnt = 0
    for i in range(len(str_ans)):
        while True:
            if len(s) == len(str_ans):
                break
            s += '0'
        if str_ans[i] == s[i]:
            cnt+=1
        else:
            break
    print(f'#{tc}', cnt)
