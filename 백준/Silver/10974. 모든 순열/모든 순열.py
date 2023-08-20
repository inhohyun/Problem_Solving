n = int(input())
visited = [False] * (n + 1)
answer = []

def dfs():
    global n,  answer
    if len(answer) == n:
        print(' '.join(map(str, answer)))
        return

    for i in range(1,n+1):
        if not i in answer:
            answer.append(i )
            dfs()
            answer.pop()
        
dfs()
        

