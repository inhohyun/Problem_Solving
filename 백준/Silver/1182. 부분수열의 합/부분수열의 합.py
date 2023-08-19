n, s = map(int, input().split())
numbers = list(map(int, input().split()))
cnt = 0

def dfs(depth, temp):
    global cnt


    if depth >= n:
        return
    

    temp += numbers[depth]

    if temp == s:
        cnt += 1
    dfs(depth +1, temp)
    dfs(depth +1, temp -numbers[depth])


dfs(0,0)
print(cnt)

