from collections import deque
for tc in range(1,11):
    t = int(input())
    number = list(map(int, input().split()))
    q = deque(number)

    i = 1
    while True:
        if q[-1] == 0:
            break
        if i == 6:
            i = 1
        tmp = q.popleft()
        tmp -= i
        if tmp < 0:
            q.append(0)
            break
        q.append(tmp)


        i += 1
    ans = ''
    while q:
        ans += str(q.popleft()) + ' '

    print(f'#{tc}',ans)