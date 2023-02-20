def solution(n):
    answer = 0
    while True:
        if 7 * answer >= n:
            break
        else:
            answer += 1
    return answer