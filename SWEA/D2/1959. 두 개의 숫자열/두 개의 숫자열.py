t = int(input())
for tc in range(1, t+1):
    n, m = map(int, input().split())
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))
    result = 0
    # A 배열이 더 긴 경우
    if n > m:
        for start in range(n-m):
            tmp = 0
            for i in range(m):
                tmp += A[start +i] * B[i]

            result = max(result, tmp)
    elif m > n:

        for start in range((m - n)+1):
            tmp = 0
            for i in range(n):
                tmp += A[i] * B[start + i]
            result = max(result, tmp)
    elif m == n:
        for i in range(n):
            result += A[i] + B[i]

    print(f'#{tc}',result)

