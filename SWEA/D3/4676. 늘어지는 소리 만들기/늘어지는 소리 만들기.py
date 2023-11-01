t = int(input())
for tc in range(1, t+1):
    # insert 함수 활용해서 다시 해보기
    str_ = list(input())
    h = int(input())
    p = list(map(int, input().split()))
    p.sort(reverse=True)
    for i in range(h):
        str_.insert(p[i],'-')

    print(f'#{tc}',''.join(str_))
