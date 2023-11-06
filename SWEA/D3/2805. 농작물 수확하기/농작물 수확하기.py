t = int(input())
for tc in range(1,t+1):
    n = int(input())
    arr = []
    for i in range(n):
        arr.append(list(map(int, list(input()))))
    ans = 0
    mid = n // 2
    l, r = mid,mid
    for i in range(n):
        ans += sum(arr[i][l:r+1])

        if i < mid:
            l -= 1
            r += 1
        elif i >= mid:
            l += 1
            r -= 1

    print(f'#{tc}',ans)


