n = int(input())
p = [0] * 21
p[0] = 0
p[1] = 1
if n == 0 :
    print(0)
elif n == 1:
    print(1)
else:
    for i in range(2, n+1):
        p[i] = p[i-1] + p[i-2]

    print(p[n])
