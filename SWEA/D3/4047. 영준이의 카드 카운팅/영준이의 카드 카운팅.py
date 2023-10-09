#  S D H C 순으로 카드가 몇 장 부족한지
t = int(input())
for tc in range(1, t+1):
    S, D, H, C = [],[],[],[]
    cards = input()
    flag = 0
    for i in range(len(cards)):
        if cards[i] == 'S':
            # 숫자는 무조건 2개(i+1:i+3)
            # 이미 있으면 에러
            if int(cards[i+1:i+3]) in S:
                print(f'#{tc}', 'ERROR')
                flag = 1
                break
            else:
                S.append(int(cards[i+1:i+3]))

        if cards[i] == 'D':
            # 숫자는 무조건 2개(i+1:i+3)
            # 이미 있으면 에러
            if int(cards[i+1:i+3]) in D:
                print(f'#{tc}', 'ERROR')
                flag = 1
                break
            else:
                D.append(int(cards[i+1:i+3]))
        if cards[i] == 'H':
            # 숫자는 무조건 2개(i+1:i+3)
            # 이미 있으면 에러
            if int(cards[i+1:i+3]) in H:
                print(f'#{tc}', 'ERROR')
                flag = 1
                break
            else:
                H.append(int(cards[i+1:i+3]))
        if cards[i] == 'C':
            # 숫자는 무조건 2개(i+1:i+3)
            # 이미 있으면 에러
            if int(cards[i+1:i+3]) in C:
                flag = 1
                print(f'#{tc}', 'ERROR')
                break
            else:
                C.append(int(cards[i+1:i+3]))
    if flag == 0:
        print(f'#{tc}', 13-len(S),  13-len(D), 13-len(H), 13-len(C))
                
