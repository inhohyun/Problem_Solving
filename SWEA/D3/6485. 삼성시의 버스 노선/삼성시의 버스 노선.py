t = int(input())
for tc in range(1, t+1):
    n = int(input())
    A, B = [], []
    for i in range(n):
        a,b = map(int, input().split())
        A.append(a)
        B.append(b)

    p = int(input())
    P = []
    for i in range(p):
        P.append(int(input()))
    ans = [0] * p
    for i in range(len(P)):
        for j in range(n):
            if A[j] <= P[i] <= B[j]:
                ans[i] += 1

    print(f'#{tc}',' '.join(map(str, ans)))

