t = int(input())
for tc in range(1, t+1):
    n = int(input())
    arr = [0,1,2,3,4,5,6,7,8,9]
    cnt = 1
    number = 0
    while True:
        if len(arr) == 0:
            break
        number = n * cnt
        for i in range(len(str(number))):
            if int(str(number)[i]) in arr:
                arr.remove(int(str(number)[i]))
        cnt += 1
    print(f'#{tc}',number)

