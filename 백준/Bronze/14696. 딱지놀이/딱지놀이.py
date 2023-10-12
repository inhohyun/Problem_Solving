n = int(input())

for i in range(n):
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))
    A.remove(A[0])
    B.remove(B[0])
    if A.count(4) > B.count(4):
        print('A')
    elif A.count(4) < B.count(4):
        print('B')

    if A.count(4) == B.count(4) and A.count(3) < B.count(3):
        print('B')
    elif A.count(4) == B.count(4) and A.count(3) > B.count(3):
        print('A')

    if A.count(3) == B.count(3) and A.count(2) < B.count(2):
        print('B')
    elif A.count(3) == B.count(3) and A.count(2) > B.count(2):
        print('A')

    if A.count(2) == B.count(2) and A.count(1) < B.count(1):
        print('B')
    elif A.count(2) == B.count(2) and A.count(1) > B.count(1):
        print('A')

    if sorted(A) == sorted(B):
        print('D')





