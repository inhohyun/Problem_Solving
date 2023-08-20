TEST = int(input())
def dfs(depth, temp):
    global cnt, numbers
    if depth == n:
        return
    temp += numbers[depth]
    if temp == k:
        cnt += 1
        
    # 순차적인 합을 구한 후 중간 값을 제거한 경우도 탐색
    dfs(depth+1, temp)

    dfs(depth+1, temp-numbers[depth])



for t in range(1, TEST+1):
    n, k = map(int, input().split())
    numbers = list(map(int, input().split()))
    cnt = 0
    dfs(0,0)
    print(f'#{t}', cnt)

