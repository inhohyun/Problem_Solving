n, m = map(int, input().split())
s = []

def dfs():
    if len(s) == m:
        print(' '.join(map(str, s)))
        return
    
    for i in range(1, n+1):
        
        s.append(i)
        dfs()
        # return하고나면(한 줄 출력하고나면 끝자리를 빼고 다음 수 넣기 -> dfs로 수 하나씩 완성)
        s.pop()

dfs()


