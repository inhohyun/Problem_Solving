n = int(input())
ans = 0
consulting = []

def go(n, index, temp):
    if index == n:
        global ans
        if ans < temp:
            ans = temp
        return 
    if index > n:
        return 
    # 상담을 하는 경우
    go(n, index + consulting[index][0], temp + consulting[index][1])
    # 상담을 안하는 경우
    go(n, index+1, temp)



for i in range(n):
    t, p = map(int, input().split())
    consulting.append((t, p))

go(n, 0, 0)
print(ans)