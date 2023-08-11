# 1874 스택 수열
n = int(input())

# 1~n까지의 숫자를 스택 연산을 이용해 주어진 수열로 만들 수 있는지를 물어보는 문제
stack = []
answer = []
flag = 0
cur = 1

for i in range(n):
    num = int(input())
    while cur <= num:
        stack.append(cur)
        answer.append('+')
        cur += 1

    if stack[-1] == num:
        stack.pop()
        answer.append('-')
    else:
        print('NO')
        flag = 1
        break
if flag == 0:
    for i in answer:
        print(i)