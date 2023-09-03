from collections import deque
for _ in range(10):
    t = int(input())
    q = deque()
    data = list(map(int, input().split()))
    for i in data:
        q.append(i)
    flag = 0
    while True:
        if flag == 1:
            break
        # 5번 이동시키는 것이 한 사이클?
        for i in range(1, 6):
            
            front = q.popleft()
            front -= i
            if front <= 0:
                q.append(0)
                flag = 1
                break
            else:
                q.append(front)
    
    print(f'#{t}', ' '.join(map(str, q)))

