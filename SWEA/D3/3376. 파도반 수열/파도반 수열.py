
T = int(input())
for tc in range(1,T+1):
    data = []
    n = int(input())
    data.append(0)
    data.append(1)
    data.append(1)
    data.append(1)
    for i in range(4, 101):
        data.append(data[i-3]+data[i-2])

    print(f'#{tc}',data[n])
