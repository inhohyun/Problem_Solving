from collections import deque
def solution(n, m, section):
    
    answer = 0
    section = deque(section)
    #페인트 칠을 전부 다 할 때까지 반복
    while section:
        start = section.popleft() #페인트 칠 시작지점
        
        while section and start + m > section[0]:
            section.popleft()
        answer += 1    
    return answer