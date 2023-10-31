t = int(input())
for tc in range(1, t+1):
    arr = list(map(int, input().split()))
    for i in range(len(arr)):
        if arr[i] < 40:
            arr[i] = 40
    answer = sum(arr) // len(arr)
    
    print(f'#{tc}', answer)

