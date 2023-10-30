t = int(input())
for tc in range(1, t+1):
    n, d = map(int, input().split())
    ans = 0
    arr = [0] * n

    # 앞에서 부터 차례대로 물주자
    for i in range(n):
        if arr[i] == 0:
            for j in range(i,(i+d*2)+1):
                if 0 not in arr:
                    break


                arr[j] = 1
            ans += 1
    print(f'#{tc}',ans)


