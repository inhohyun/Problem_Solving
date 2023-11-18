for tc in range(1, 11):
    n = int(input())
    arr = list(map(int, input().split()))
    ans = 0
    for i in range(2, n-2):
        tmp = arr[i] - arr[i-2]
        for j in range(i-2, i+3):
            if i == j:
                continue
            if arr[i] <= arr[j]:
                tmp = 0
                break

            else:
                tmp = min(tmp, arr[i] - arr[j])

     
        ans += tmp

    print(f'#{tc}',ans)