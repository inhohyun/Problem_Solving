N, K = map(int, input().split())
cnt = 0
li = [False] * (N+1)
for i in range(2, N+1):
    # i부터 N+1까지 중 i의 배수들 삭제
    for j in range(i, N+1, i):
        if li[j] != True:
            li[j] = True
            cnt += 1
            # K번째 삭제된 수 
            if cnt == K:
                print(j)