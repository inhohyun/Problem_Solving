# 튜플로 각 인덱스별 최단거리 저장?

for t in range(1, 11):
    tc = int(input())
    arr = [list(map(int, input().split())) for _ in range(100)]

    min_value = 1e9
    result = 0
    for i in range(100):
        if arr[0][i] == 1:
            cnt = 0
            x, y= 0,i
            while x != 99:
                x += 1
                cnt += 1
                # 오른쪽으로 가기

                if y > 0 and arr[x][y-1] == 1:
                    while y > 0 and arr[x][y-1] ==1:
                        y -= 1
                        cnt += 1
                elif y < 99 and arr[x][y+1] == 1:
                    while y < 99 and arr[x][y+1] ==1:
                        y += 1
                        cnt += 1
            if min_value > cnt:
                min_value = cnt
                result = i
    print(f'#{t}', result)




    