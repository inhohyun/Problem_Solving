n = int(input())
ans = ''
cnt = 0
for i in range(1, n+1):
    if '3' in str(i) or '6' in str(i) or '9' in str(i):
        cnt += str(i).count('3')
        cnt += str(i).count('6')
        cnt += str(i).count('9')
        ans += '-' * cnt
        cnt = 0
        ans += ' '
    else:
        ans += str(i)+' '
print(ans)

