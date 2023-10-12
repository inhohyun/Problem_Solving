T = int(input())
 
for i in range(T):
    A, B, C = map(int, input().split())
    max_bread = 0
     
    min_price = min(A, B)
     
    max_bread = C // min_price
     
    print("#{} {}".format(i+1, max_bread))