def solution(babbling):
    count = 0
    babble = ['aya', 'ye', 'woo', 'ma']
    
    for b1 in babbling:
        for b2 in babble:
            #두번 연속 같은 말 못함
            if b2 * 2 not in b1:
                b1 = b1.replace(b2, ' ')
        if b1.strip() == '':
            count += 1
            
            
    return count