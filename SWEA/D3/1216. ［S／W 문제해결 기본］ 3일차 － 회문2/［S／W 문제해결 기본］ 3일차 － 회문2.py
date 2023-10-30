# 팰린드롭인지 확인하는 함수
def palin(s):
    if s == s[::-1]:
        return True
    return False

for tc in range(1, 11):
    t = int(input())
    arr = []
    for _ in range(100):
        arr.append(list(input()))
    ans = 0
    # 가로 탐색
    for i in range(100):
        for j in range(100):
            s = ''
            for c in range(j, 100):
                s += arr[i][c]
                if palin(s):
                    ans = max(ans, len(s))

    # 세로 탐색
    for i in range(100):
        for j in range(100):
            s = ''
            for c in range(j, 100):
                s += arr[c][i]
                if palin(s):
                    ans = max(ans, len(s))

    print(f'#{tc}',ans)
    

