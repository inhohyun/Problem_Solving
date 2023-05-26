import sys
input = sys.stdin.readline

n = int(input())
li = []
for i in range(n):
    [a, b] = map(int, input().split())
    li.append([a, b])

li_sort = sorted(li, key = lambda x: (x[0], x[1]))

for i in range(n):
    print(li_sort[i][0], li_sort[i][1])