TEST = int(input())
for i in range(1, TEST+1):
    n = int(input())
    cnt = 0
    p = list(map(int, input().split()))
    nomral = sum(p) // n
    for j in range(n):
        if p[j] <= nomral:
            cnt += 1
    
    print(f'#{i}', cnt)