n = int(input())
m = int(input())
ans = []
for i in range(n, m+1):
    error = 0
    if i > 1:
        # 1만 이하이니 for 문으로 돌려도 될거 같은데?
        for j in range(2, i):
            if i %j == 0:
                error += 1
                break
        
        if error == 0:
            ans.append(i)   

if len(ans) <= 0:
    print(-1)
else:
    print(sum(ans))
    print(min(ans))

