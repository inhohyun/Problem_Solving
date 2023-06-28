n = int(input())
num = list(map(int, input().split()))
op = list(map(int, input().split()))

maxi = -1e9
mini = 1e9

def dfs(depth, total, plus, minus, multi, divine):
    global maxi, mini
    if depth == n:
        maxi = max(total, maxi)
        mini = min(total, mini)
        return
    # 연산을 다 했다면 최댓값, 최소값에 저장된 값과 비교하여 값을 갱신해줍니다.

    if plus:
        dfs(depth + 1, total + num[depth], plus - 1, minus, multi, divine)
    if minus:
        dfs(depth + 1, total - num[depth], plus, minus - 1, multi, divine)
    if multi:
        dfs(depth + 1, total * num[depth], plus, minus, multi - 1, divine)
    if divine:
        dfs(depth + 1, int(total / num[depth]), plus, minus, multi, divine - 1)

dfs(1, num[0], op[0], op[1], op[2], op[3])
# 1번째 연산이며 0번 인덱스의 저장된 값과 각 연산이 몇 번 남았는지를 입력하여 함수를
# 실행하여줍니다.
print(maxi)
print(mini)

# 이해가 안되는 부분 : 