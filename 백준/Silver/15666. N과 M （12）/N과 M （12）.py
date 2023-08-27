n, m = map(int, input().split())

numbers = sorted(list(map(int, input().split())))
ans = []

def dfs(start):
    
    if len(ans) == m:
        print(*ans)
        return
    remember = 0
    for i in range(start, n):
        
        if remember != numbers[i]:
            ans.append(numbers[i])
            remember = numbers[i]
            dfs(i)
            ans.pop()
dfs(0)