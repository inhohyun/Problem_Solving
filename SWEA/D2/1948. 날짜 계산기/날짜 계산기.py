t = int(input())
for tc in range(1, t+1):
    s_m, s_d, e_m, e_d = map(int, input().split())
    dic = {1:31,2:28,3:31,4:30,5:31,6:30,7:31,8:31,9:30,10:31,11:30,12:31}

    ans = 0
    for i in range(s_m+1, e_m):
        ans += dic[i]
    if s_m == e_m:
        ans += e_d - s_d +1
    else:
        ans += dic[s_m] - s_d +1
        ans += e_d

    print(f'#{tc}',ans)