k = int(input())
j = []

# 소인수분해 알고리즘으로 구현
for i in range(2, int(k**0.5)+ 1):
    while k%i == 0:
        j.append(i)
        k //= i    
       
# 마지막으로 남은 값까지 구현
if k != 1: 
    j.append(k)

print(len(j))
print(*j)