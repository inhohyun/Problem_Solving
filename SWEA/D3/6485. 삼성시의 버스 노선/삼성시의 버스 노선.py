t = int(input())
for tc in range(1, t+1):
    N = int(input())
    A, B = [], []
    for _ in range(N):
        a, b = map(int, input().split())
        A.append(a)
        B.append(b)
    P = int(input())
    C = []
    ans = [0] * P
    for i in range(P):
        C.append(int(input()))
    
    # 검증
    for i in range(P):
        cnt = 0
        for j in range(N):
            if A[j] <= C[i] <= B[j]:
                cnt += 1
        
        ans[i] = cnt
    
    print(f'#{tc}',' '.join(map(str, ans)))
