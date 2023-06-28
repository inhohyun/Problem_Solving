start, end = map(int, input().split())
li = []
for i in range(1, end+1):
    for _ in range(1, i+1):
        li.append(i)
print(sum(li[start-1:end]))
