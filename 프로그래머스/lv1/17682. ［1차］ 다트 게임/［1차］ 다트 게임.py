def solution(dartResult):
    s = []
    start_idx = 0
    power = {'S' : 1, 'D' : 2, 'T': 3}
    
    for i in range(len(dartResult)):
        op = dartResult[i]
        if op in power:
            s.append(int(dartResult[start_idx:i]) ** power[op])
        elif op == '*':
            #맨 마지막수 두개를 가져와 *2해서 저장
            s[-2:] = [x*2 for x in s[-2:]]
        elif op == '#':
            s[-1] = -s[-1]
        #op가 숫자가 아니라면 그 다음수가 숫자이므로 start_idx에 저장
        if not op.isnumeric():
            start_idx = i+1
    return sum(s)