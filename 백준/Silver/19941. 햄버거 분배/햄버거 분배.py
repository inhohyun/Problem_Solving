n, k = map(int, input().split())
ham = list(input())
cnt = 0
# 각각의 원소를 비교하여 이중 for문으로 먹을 수 있는 햄버거 찾기
for i in range(n):
    # 사람일 경우
    if ham[i] == 'P':
        for j in range(max(i-k,0), min(i+k+1, n)):
            if ham[j] == 'H':
                ham[j] = 0
                cnt += 1
                break
    

print(cnt)
            