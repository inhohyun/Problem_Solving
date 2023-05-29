
p = [1, 1, 2, 2, 2, 8]
ans= []
n = list(map(int, input().split()))
for i in range(6):
    ans.append(p[i] - n[i])

s = ''
for i in range(6):
    s += str(ans[i])+' '

print(s)