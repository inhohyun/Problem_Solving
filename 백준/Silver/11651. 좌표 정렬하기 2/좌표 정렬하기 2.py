n = int(input())
# 리스트 안에 튜플
g = []

for i in range(n):
    a, b = map(int, input().split())
    t = (a, b)
    g.append(t)

g.sort(key=lambda x: (x[1], x[0]))

for i in range(n):
    print(g[i][0], g[i][1])