t = int(input())
for tc in range(1, t+1):
    n = list(input())
    tmp = ''.join(n)
    # 최소값, 최대값
    min_n = int(tmp)
    max_n = int(tmp)

    for i in range(len(n)):
        for j in range(i, len(n)):

            # 문자열의 한 쌍을 교환하기
            n[i],n[j] = n[j], n[i]
            tmp = ''.join(n)
            n[i], n[j] = n[j], n[i]
            if tmp[0] == '0':
                if tmp != '0':
                    continue
            if max_n < int(tmp):
                max_n = int(tmp)

            if min_n > int(tmp):
                min_n = int(tmp)


    print(f'#{tc}', min_n, max_n)