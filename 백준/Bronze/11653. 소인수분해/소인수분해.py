n = int(input())
if n == 1:
    print()
else:
    ans = []
    temp = n
    for j in range(2, n+1):
        for i in range(2, n+1):
            if temp % i == 0:
                temp /= i
                ans.append(i)
                break
        if temp == 1:
            break
        
    
    for i in range(len(ans)):
        print(ans[i])
