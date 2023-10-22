t = int(input())
for tc in range(1, t+1):
    test_num, n = input().split()
    arr = list(input().split())

    # 숫자를 변경할 딕셔너리
    dic = {'ZRO':0, 'ONE':1, 'TWO':2, 'THR':3, 'FOR':4, 'FIV':5, 'SIX':6, 'SVN':7, 'EGT':8, 'NIN':9}
    numbers = []
    for i in range(int(n)):
        numbers.append(dic[arr[i]])

    numbers.sort()
    ans = []
    # 다시 바꾸기
    for i in range(int(n)):
        for key, val in dic.items():
            if val == numbers[i]:
                ans.append(key)

    print(f'#{tc}')
    print(' '.join(ans))



