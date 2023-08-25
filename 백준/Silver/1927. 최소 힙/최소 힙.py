from queue import PriorityQueue
import sys
q = PriorityQueue()

n = int(input())

for i in range(n):
    m = int(sys.stdin.readline())
    if m ==0:
        if q.qsize() == 0:
            print(0)
        else:
            print(q.get())
    else:
        q.put(m)
    