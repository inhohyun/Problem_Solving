def solution(lottos, win_nums):
    answer = []
    count = 0
    zero = 0
    d = [6,6,5,4,3,2,1]
    
    for lotto in lottos:
        if lotto == 0:
            zero += 1
            continue
        for win_num in win_nums:
            if lotto == win_num:
                count += 1
    count += zero
    answer.append(d[count])    
    count -= zero
    answer.append(d[count])

            
    return answer