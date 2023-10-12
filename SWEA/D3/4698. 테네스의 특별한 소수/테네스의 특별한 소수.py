t = int(input())
Prime = []
# 1과 자신을 제외한 약수 존재 체크
Check = [0] * (10**6+1)
for i in range(2, 10**6+1):
    # 1과 자신을 제외하고 약수가 존재하지 않음 => 소수
    if Check[i] == 0:
        Prime.append(i)
        # 자신의 배수들 체크
        for j in range(i, 10**6+1, i):
            Check[j] = 1
for tc in range(1, t+1):
    D,A,B = map(int, input().split())
    cnt = 0
    for i in Prime:
        if A<=i<= B and str(D) in str(i):
            cnt += 1

        if i > B:
            break

    print(f'#{tc}',cnt)
