t = int(input())
for tc in range(1, t+1):
    n, m = map(int, input().split())
    # n개의 뿔과 m마리의 짐승
    # 연립방정식 활용
    x = n-m
    y = 2 * m - n
    print(f'#{tc}', y, x)

