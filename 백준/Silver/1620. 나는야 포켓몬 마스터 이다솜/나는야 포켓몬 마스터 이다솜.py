import sys
n , m = map(int, input().split())
dic_name = {}
dic_num = {}

for i in range(1, n+1):
    poket = str(sys.stdin.readline()).replace('\n', '')

    # 포켓몬 이름이 key
    dic_name[poket] = i
    # 포켓몬 번호가 key
    dic_num[i] = poket

for i in range(m):
    ans = str(sys.stdin.readline()).replace('\n', '')

    if ans.isdigit():
        print(dic_num[int(ans)])
    else:
        print(dic_name[ans])
