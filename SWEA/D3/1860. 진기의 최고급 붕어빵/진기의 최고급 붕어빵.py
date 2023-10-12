t = int(input())
for tc in range(1, t+1):
    # m 초마다 k개의 붕어빵을 만듦
    n, m, k = map(int, input().split())
    person = list(map(int, input().split()))
    rest_boog = 0 # 만들어논 붕어빵 개수
    flag = 0
    # 손님 정렬
    person.sort()
    for i in range(n):
        time = person[i]
        # time 지점에 남은 붕어빵이 몇개인지
        # m초에 k개 만들어지는데 그럼 time시간에 몇개 만들어져있는지?
        rest_boog = ((time //m) * k) - (i)
        if rest_boog < 1:
            print(f'#{tc}','Impossible')
            flag = 1
            break

    if flag == 0:
         print(f'#{tc}', 'Possible')





