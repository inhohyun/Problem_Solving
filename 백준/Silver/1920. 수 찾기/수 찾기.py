n = int(input())
a = list(map(int, input().split()))
dic = {}
for i in a:
    dic[i] = 1


m = int(input())
b = list(map(int, input().split()))
# 시간초과로 딕셔너리로 작업
for i in b:
    if i in dic:
        print(1)
    else:
        print(0)
