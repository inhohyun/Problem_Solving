import math
t = int(input())
for tc in range(1, t+1):
    n = int(input())
    tmp = n
    for i in range(1, int(math.sqrt(n))+1):
        if tmp % i == 0:
            x = i
            

    
    y = (n // x) 
    print(f'#{tc}',x+y - 2)

