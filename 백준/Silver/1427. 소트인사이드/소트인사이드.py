n = input()
n_li = []
for i in range(len(n)):
    n_li.append(int(n[i]))
sort_n = sorted(n_li, reverse=True)
ans = ''
for i in range(len(sort_n)):
    ans += str(sort_n[i])
print(ans)