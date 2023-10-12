t = int(input())
for tc in range(1, t+1):
    n = int(input())
    A, B = [], []
    for i in range(n):
        a, b = map(int, input().split())
        A.append(a)
        B.append(b)
    cnt = 0
    for i in range(n):
        for j in range(i, n):
            if (A[i] < A[j] and B[i] > B[j]) or (A[i] > A[j] and B[i] < B[j]):
                cnt += 1
    print(f'#{tc}',cnt)



