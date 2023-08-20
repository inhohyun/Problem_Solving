
def dfs(depth, start):
    global min_dif
    if depth == n//2:
        pow1, pow2 = 0,0

        for i in range(n):
            for j in range(n):
                if visited[i] and visited[j]:
                    pow1 += s[i][j]
                elif not visited[i] and not visited[j]:
                    pow2 += s[i][j]
        min_dif = min(min_dif, abs(pow1- pow2))
        return
    
    # 백트래킹으로 방문처리
    for i in range(start, n):
        if not visited[i]:
            visited[i] = True
            dfs(depth+1, i+1)
            visited[i] = False

n = int(input())

visited = [False for _ in range(n)]
s = [list(map(int, input().split())) for _ in range(n)]
min_dif = int(1e9)

dfs(0,0)
print(min_dif)


