N = int(input())

T = []
P = []
for i in range(N):
    a, b = map(int, input().split())
    T.append(a)
    P.append(b)

dp = [0] * (N+1)

for n in range(N-1, -1, -1): # 뒤에서 앞으로(완료 기준)
    if n+T[n] <= N: # 기간내 상담이 가능하다면
        dp[n] = max(dp[n+1], dp[n+T[n]] + P[n])
    else:
        dp[n] = dp[n+1]


print(dp[0])
