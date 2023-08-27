n, m = map(int, input().split())

numbers = sorted(list(map(int, input().split())))
ans = []
visited = [False] * n
def dfs():
    
    if len(ans) == m:
        print(*ans)
        return
    remember = 0
    for i in range( n):
        
        if remember != numbers[i]:
            if not visited[i]:

                ans.append(numbers[i])
                visited[i] = True
                remember = numbers[i]
                
            
                dfs()

                ans.pop()
                visited[i] = False
dfs()