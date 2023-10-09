t= int(input())
for tc in range(1, t+1):
    N, A, B = map(int, input().split())
    # 모두 구독하고 있는 사람의 최대, 최소
    max_sub, min_sub = 0,0
    max_sub = min(A, B)
    if A+B < N:
        min_sub = 0
    else:
        min_sub = abs(N - (A+B))
    print(f'#{tc}', max_sub, min_sub)