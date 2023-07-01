n = int(input())
time = list(map(int, input().split()))
ans = 0
sorted_time = sorted(time)
for i in range(n):
    for j in range(i+1):
       ans += sorted_time[j]

print(ans)
