t= int(input())
for tc in range(1, t+1):
    N = int(input())
    p, x = [], []
    for i in range(N):
        p_v, x_v = map(float, input().split())
        p.append(p_v)
        x.append(x_v)
    avg = 0   
    for j in range(N):
        avg += p[j]*x[j]
    print(f'#{tc}', avg)