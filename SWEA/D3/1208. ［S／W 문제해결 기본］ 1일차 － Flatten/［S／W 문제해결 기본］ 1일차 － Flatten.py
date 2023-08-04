# 1208 Flatten

for t in range(1, 11):
    n = int(input())
    dum = list(map(int, input().split()))
    # n번만큼 제일 큰수에서 1을 빼서 제일 작은수에 더하기
    for _ in range(n):
        # 왜 1이나오지?
        for index, value in enumerate(dum):
            if value == max(dum):
                dum[index] -= 1
                for index2, value2 in enumerate(dum): 
                    if value2 == min(dum):
                        dum[index2] += 1
                        break
                break


    

    print(f'#{t}', max(dum)-min(dum))
