n = int(input())

for i in range(1, n+1):
    ans = 0
    m = list(map(int, input().split()))
    for j in range(len(m)):
        ans = sum(m)

    print('#'+str(i), round(ans / 10))
