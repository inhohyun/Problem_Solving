t = int(input())
for tc in range(1, t+1):
    s = input()
    ans = 0
    while True:
        if s.count('0') == len(s):

            break

        for i in range(len(s)):
            # 뒤에 전부 반전시키기
            if s[i] == '1':
                for j in range(i, len(s)):
                    if s[j] == '1':
                        s = s[:j] + '0'+s[j+1:]
                    else:
                        s = s[:j] + '1'+s[j+1:]

                ans += 1
    print(f'#{tc}',ans)