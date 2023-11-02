t = int(input())
for tc in range(1, t+1):
    s = list(input())
    answer = ''
    # 길이가 홀수인 경우
    if s == s[::-1]:
        answer = 'Exist'
    else:
        for i in range(len(s)):
            if s[i] == '?':
                s[i] = s[len(s) - (i+1)]
            if s == s[::-1]:
                answer = 'Exist'
            else:
                answer = 'Not exist'

    print('#%d %s' % (tc, answer))


