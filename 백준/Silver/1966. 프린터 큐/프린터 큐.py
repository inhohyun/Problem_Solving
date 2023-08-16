from collections import deque
test = int(input())
for _ in range(test):
    N, M = map(int, input().split())
    # 문서가 몇 번째로 인쇄되는지 출력
    q = deque(list(map(int, input().split())))
    idx_q = deque(list(range(N)))

    cnt = 0
    while q:
        if q[0] == max(q):
            cnt += 1
            q.popleft()
            idx_front = idx_q.popleft()
            if  idx_front == M:
                print(cnt)
        
        else:
            q.append(q.popleft())        
            idx_q.append(idx_q.popleft())


   
   