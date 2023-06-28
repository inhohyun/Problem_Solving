test = int(input())
for t in range(test):
    rest_mon = int(input())
    a,b,c,d,e,f,g,h = 0,0,0,0,0,0,0,0
    # 최적화 시켜야 함
    a = rest_mon // 50000
    rest_mon = rest_mon % 50000
    b = rest_mon // 10000
    rest_mon = rest_mon % 10000
    c = rest_mon // 5000
    rest_mon = rest_mon % 5000
    d = rest_mon // 1000
    rest_mon = rest_mon % 1000
    e = rest_mon // 500
    rest_mon = rest_mon % 500
    f = rest_mon // 100
    rest_mon = rest_mon % 100
    g = rest_mon // 50
    rest_mon = rest_mon % 50
    h = rest_mon // 10
    rest_mon = rest_mon % 10

    print(f'#{t+1}')
    print(a,b,c,d,e,f,g,h)    
        
        
        
