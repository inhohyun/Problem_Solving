def cal(tList):
    #모든 집과 tList의 치킨집거리 중 최소값의 누적값 구하기
    sm = 0
    for hi,hj in home: # 집 좌표를 하나씩 처리(최소값 구하기)
        mn = 2 *n
        for ci, cj in tList:
            mn = min(mn, abs(hi-ci)+abs(hj-cj))
        # 도시의 치킨거리 끝내기
        sm += mn

    return sm


def dfs(N, tList):
    global ans
    if N == cnt:
        if len(tList) == m:
            ans = min(ans, cal(tList))
        
        return
    dfs(N+1, tList + [chicken[N]]) # 유지하는 경우
    dfs(N+1, tList) # 폐업하는 경우



n,m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

# 1. 집, 치킨집 좌표를 home, chicken에 저장
home = []
chicken = []
for i in range(n):
    for j in range(n):
        if arr[i][j] == 1:
            home.append((i,j))
        elif arr[i][j] == 2:
            chicken.append((i,j))

cnt = len(chicken)

ans = 1e9
dfs(0, [])
print(ans)


