def solution(n):
    answer = []
    for i in range(2, n+1):
        if isprime(i):
            if n % i == 0:
                answer.append(i)
    return answer
def isprime(n):
    if n ==1: return False
    for i in range(2, n):
        if n % i == 0: return False
    return True