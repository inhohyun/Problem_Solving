t = int(input())
for tc in range(1, t+1):
    S, D, H, C = [],[],[],[]
    cards = input()
    flag = 1
    for i in range(len(cards)-2):
        if cards[i] == 'S':
            num = cards[i+1:i+3]
            if num in S:
                flag = 0
                print(f'#{tc}', 'ERROR')
                break
            S.append(num)
        if cards[i] == 'D':
            num = cards[i+1:i+3]
            if num in D:
                flag = 0
                print(f'#{tc}', 'ERROR')
                break
            D.append(num)
        if cards[i] == 'H':
            num = cards[i+1:i+3]
            if num in H:
                flag = 0
                print(f'#{tc}', 'ERROR')
                break
            H.append(num)
        if cards[i] == 'C':
            num = cards[i+1:i+3]
            if num in C:
                flag = 0
                print(f'#{tc}', 'ERROR')
                break
            C.append(num)
 
    if flag:
        print(f'#{tc}', 13-len(S), 13-len(D), 13-len(H), 13-len(C))