def solution(n, lost, reserve):
    #1.set을 활용해 둘 다 포함되는 애들 제거
    reserve_only = set(reserve) - set(lost)
    lost_only = set(lost) - set(reserve)
    
    #2. 여분을 기준으로 앞뒤를 확인하여 체육복을 빌려준다.
    for reserve in reserve_only:
        front = reserve - 1
        back = reserve + 1
        if front in lost_only:
            lost_only.remove(front)
        elif back in lost_only:
            lost_only.remove(back)
            
    #3. 전체 학생수에 lost_only에 남은 학생 수를 빼준다.
    answer = n - len(lost_only)
    return answer