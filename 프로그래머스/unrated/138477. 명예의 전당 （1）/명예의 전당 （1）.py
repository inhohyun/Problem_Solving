def solution(k, score):
    answer = []
    honor = []
    for i in range(len(score)):
        #아직 명예의 전당이 꽉 차지 않으면 판별없이 입상
        if i < k:
            honor.append(score[i])
        else:
            honor.append(score[i])
            honor.remove(min(honor))
        answer.append(min(honor))
        
            
    
    
    return answer