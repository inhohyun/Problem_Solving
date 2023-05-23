n, m = map(int, input().split())
card = list(map(int, input().split()))
max_num = 0
for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            num = card[i]+card[j]+card[k]
            if num <= m:
                if num > max_num:
                    max_num = num
print(max_num)
