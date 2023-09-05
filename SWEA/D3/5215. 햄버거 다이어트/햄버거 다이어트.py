def dfs(index, sTaste, sKcal):
    global maxTaste

    if sKcal > L:
        return
    
    if maxTaste < sTaste:
        maxTaste = sTaste
    
    if index == N:
        return
    
    taste, kcal = data[index]

    # 햄버거 재료 리스트에서 재료를 사용
    dfs(index +1, sTaste+taste, sKcal + kcal)
    # 햄버거 재료 리스트에서 재료를 사용하지 않았을 때
    dfs(index +1, sTaste, sKcal)

t = int(input())
for tc in range(1, t+1):
    N, L =map(int, input().split())

    # 햄버거와 칼로리 리스트 저장
    data = [list(map(int, input().split())) for _ in range(N)]

    maxTaste = 0

    dfs(0,0,0)
    print(f'#{tc}', maxTaste)