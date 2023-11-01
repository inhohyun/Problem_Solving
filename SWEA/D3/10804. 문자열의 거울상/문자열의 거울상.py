t = int(input())
for tc in range(1, t+1):
    s = input()
    dic = {'p':'q', 'q':'p','d':'b','b':'d'}
    s = s[::-1]
    ans = ''
    for i in range(len(s)):
        ans += dic[s[i]]
    
    print(f'#{tc}', ans)