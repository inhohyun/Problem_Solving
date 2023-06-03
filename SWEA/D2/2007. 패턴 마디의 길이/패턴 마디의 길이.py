n = int(input())
for test in range(1, n+1):
    s = input()
    #최대 10자리 이므로
    for j in range(1, 10):
        if s[:j] == s[j:2*j]:
            print(f'#{test} {j}')
            break