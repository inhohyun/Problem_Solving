t = int(input())
for tc in range(1, t+1):
    n, m, k = map(int, input().split())
    person = list(map(int, input().split()))
    # 온 사람들 정렬시키기
    person.sort()
    rest = 0
    i = 0
    flag = 0
    # 1초부터 마지막 사람이 온 시간까지
    for time in range(1, person[-1]+1):
        if person[0] == 0:
            flag = 1
            break
        # 붕어빵 나올시간 되면 붕어빵 만들기
        if time % m == 0:
            rest += k
        # 사람이 온 경우
        if time == person[i]:
            if rest != 0:
                rest -= 1
                # 다음 사람
                i += 1
            # 남은 붕어빵이 없는데 사람이 올 경우
            else:
                flag = 1
                break

    if flag == 1:
        print(f'#{tc}', 'Impossible')
    else:
        print(f'#{tc}', 'Possible')
