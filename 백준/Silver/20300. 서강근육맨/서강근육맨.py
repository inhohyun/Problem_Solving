import sys 

input = sys.stdin.readline

n = int(input()) #운동기구 개수
lose = list(map(int, input().split()))
lose.sort() #오름차순으로 정렬

result = lose[-1]

if n%2 == 1:
    for i in range(n//2):
        tmp = lose[i] + lose[n-i-2]
        if result < tmp:
            result = tmp
    
else:
    for i in range(n//2):
        tmp = lose[i] + lose[n-i-1]
        if result < tmp:
            result = tmp

print(result)