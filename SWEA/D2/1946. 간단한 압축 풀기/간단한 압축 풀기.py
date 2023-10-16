t = int(input())
for tc in range(1, t+1):
    n = int(input())
    A, B = [], []
    for _ in range(n):
        a, b = input().split()
        A.append(a)
        B.append(int(b))
    ans = []
    s = ''
    for i in range(n):
        while B[i] != 0:
            s += A[i]
            B[i] -= 1
            if len(s) == 10:
                ans.append(s)
                s = ''
        # 마지막 줄일때 처리
        if i == n-1:
            ans.append(s)
    print(f'#{tc}')
    for j in range(len(ans)):
        print(ans[j])











