for tc in range(1, 11):
    n = int(input())
    arr = list(map(int, input().split()))
    k = int(input())
    manage = list(input().split())
    for i in range(len(manage)):
        if manage[i] == 'I':
            front = arr[:int(manage[i+1])]
            end = arr[int(manage[i+1]):]
            g = int(manage[i+2])
            middle = manage[i+3:i+3+g]
            arr = front + middle + end

    print(f'#{tc}', ' '.join(map(str, arr[:10])))
