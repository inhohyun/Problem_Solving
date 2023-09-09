
t = int(input())
for tc in range(1, t+1):
    A, B = map(int, input().split())
    cnt = 0
    for i in range(A, B+1):
        # 제곱수인지 확인
        C = i**(1/2)
        # 제곱근이 정수이면
        if C == int(C):
            i = str(i)
            C = str(int(C)) 
            if i == i[::-1] and C == C[::-1]:
                cnt += 1
    
    print(f'#{tc}', cnt)



