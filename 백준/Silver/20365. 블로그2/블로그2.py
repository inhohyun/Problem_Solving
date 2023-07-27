import sys
input = sys.stdin.readline

n = int(input())
s = input()

colors = { 'B' : 0, 'R':0}

colors[s[0]] += 1
for i in range(1, n):
    # 연속된 색이 다르면 해당색 카운트
    if s[i] != s[i-1]:
        colors[s[i]] += 1

result = min(colors['B'], colors['R']) + 1
print(result)
