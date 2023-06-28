n = int(input())
for i in range(n):
    A = list(map(int, input().split()))
    A.sort()
    print(A[-3])