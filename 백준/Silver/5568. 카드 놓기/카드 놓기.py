# n개 중에서 k개를 선택하여 만들 수 있는 정수의 개수

n = int(input())
k = int(input())
numbers = []
for _ in range(n):
    numbers.append(input())


answer = set()
def permutation(cnt, perm, visit):
    global numbers

    if cnt ==k:
        answer.add(''.join(perm))
        return
    for idx in range(n):
        if not visit[idx]:
            visit[idx] = 1
            permutation(cnt+1, perm+[numbers[idx]], visit)
            visit[idx] = 0

permutation(0, [], [0]*n)
print(len(answer))