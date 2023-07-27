# 같은 색끼리 연속되도록 
# 빨간색을 옮기는 경우와 파란색을 옮기는 경우를 모두 구해 최소값을 출력?
# 오른쪽, 왼쪽으로 모으는 경우를 계산
n = int(input())
arr = list(input())

# 레드와 블루의 전체 개수
red = arr.count('R')
blue = len(arr)- red
ans = min(blue, red)
cnt = 0

# 왼쪽부터 연속된 개수
for i in range(n):
    if arr[i] != arr[0]:
        break
    cnt += 1

if arr[0] == 'R':
    ans = min(ans, red-cnt)
else:
    ans = min(ans, blue - cnt)

cnt = 0

#오른쪽부터 연속된 경우
for i in range(n-1, -1, -1):
    if arr[i] != arr[-1]:
        break
    cnt += 1

if arr[-1] == 'R':
    ans = min(ans, red - cnt)
else:
    ans = min(ans, blue-cnt)

print(ans)

