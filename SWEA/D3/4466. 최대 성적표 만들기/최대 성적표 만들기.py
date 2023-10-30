t = int(input())
for tc in range(1, t+1):
    n, k = map(int, input().split())
    point = list(map(int,input().split()))
    point.sort()
    point.reverse()
    ans = sum(point[:k])
    print(f'#{tc}', ans)