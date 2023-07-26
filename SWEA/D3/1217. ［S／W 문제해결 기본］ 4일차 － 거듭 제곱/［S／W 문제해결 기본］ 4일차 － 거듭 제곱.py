
for _ in range(10):
    test_number = int(input())
    n, m = map(int, input().split())
    
    def power(n,m):
        if m == 0:
            return 1
        else:
            return n * power(n,m-1)
        
    print(f'#{test_number}', power(n,m))