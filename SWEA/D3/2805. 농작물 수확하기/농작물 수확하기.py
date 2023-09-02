# 범위가 위에서부터 2씩 증가하고 n부터 2씩 감소함

t = int(input())

for test in range(1, t+1):
    n = int(input())
    arr = []
    for _ in range(n):
        arr.append(list(map(int, input())))

    answer = 0
    left_tmp = n //2 
    right_tmp = n // 2

    for i in range(n):
        for j in range(left_tmp, right_tmp+1):
            answer += arr[i][j]

        if i < n//2:
            left_tmp -= 1
            right_tmp +=1
        else:
            left_tmp += 1
            right_tmp -= 1
        
    
    print('#{} {}'.format(test, answer))


