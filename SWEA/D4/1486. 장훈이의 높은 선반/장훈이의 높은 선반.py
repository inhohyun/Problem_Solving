
def dfs(depth, start, height):
    global max_

    if 0 < depth <= N:
        if height >= B: # 탑의 길이가 선반의 높이보다 크거나 같음
            if height >= max_:
                return
            max_ = height # 작다면 해당 키를 저장
            return
        if depth == N:
            return

    for i in range(start, N):
        dfs(depth+1, i+1, height+H[i])


t = int(input())

for tc in range(1, t+1):
    N, B = map(int, input().split())
    H = list(map(int, input().split()))

    max_ = 1 << 60 # B보단 크거나 같으면서 그 중 최소의 점원의 키의 합

    dfs(0,0,0)

    print(f'#{tc}', max_-B)

