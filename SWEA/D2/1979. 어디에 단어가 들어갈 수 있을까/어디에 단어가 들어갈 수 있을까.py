t = int(input())
for tc in range(1, t+1):
    n, k = map(int, input().split())
    data = []
    for _ in range(n):
        data.append(list(map(int, input().split())))

    result = 0
    # 가로 확인
    for i in range(n):
        cnt = 0
        for j in range(n):
            if data[i][j] == 1:
                cnt += 1
            if data[i][j] == 0 or j == n - 1:
                if cnt == k:
                    result += 1
                if data[i][j] == 0:
                    cnt = 0

    # 세로 확인
    for i in range(n):
        cnt = 0
        for j in range(n):
            if data[j][i] == 1:
                cnt += 1
            if data[j][i] == 0 or j == n - 1:
                if cnt == k:
                    result += 1
                if data[j][i] == 0:
                    cnt = 0

    print('#%d %d' % (tc, result))
