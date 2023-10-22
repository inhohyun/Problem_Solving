t = int(input())
for tc in range(1, t+1):
    s = input()
    arr = ['', 'SAT', 'FRI', 'THU', 'WED', 'TUE', 'MON', 'SUN']

    for i in range(8):
        if arr[i] == s:
            print(f'#{tc}', i)

