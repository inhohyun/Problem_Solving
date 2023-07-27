# 어떻게 끊어 읽냐에 따라 숫자가 달라짐
# 민겸수를 만드는 방식을 이해해야함
# k가 나왔을 때를 기준이러 최소값, 최대값을 나누면 될듯data = input()
max = ''
min = ''
m = 0
data = input()
for i in range(len(data)):
    if data[i] == 'M':
        m += 1
    elif data[i] == 'K':
        # M이후에 K가 연속해서 나왔다면
        if m:
            min += str(10**m + 5)
            max += str(5 * (10**m))
        # k만 두번 이상 연속된 경우    
        else:
            min += '5'
            max += '5'
        m = 0
# K없이  M들로 문자열이 끝난 경우
if m:
    min += str(10 ** (m-1))
    while m:
        max += '1'
        m -= 1
print(max)
print(min)



