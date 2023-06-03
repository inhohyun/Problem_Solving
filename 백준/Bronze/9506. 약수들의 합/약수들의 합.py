
while True:
    n = int(input())
    ans = []
    answer = ''
    if n == -1:
        break
    #약수들 구하기
    for i in range(1, n):
        if n % i == 0:
            ans.append(i)
    #완전수인지 체크
    if sum(ans) == n:
        for i in range(len(ans)):
            if i == len(ans)- 1:
                answer += str(ans[i])
            else:
                answer += str(ans[i])+' + ' 

        print(n, '=', answer)
    else:
        print(n, 'is NOT perfect.')

