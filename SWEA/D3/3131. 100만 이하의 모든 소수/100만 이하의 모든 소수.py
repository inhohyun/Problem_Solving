# 100만(10^6)이하의 모든 소수를 구하는 프로그램 작성하기
def isPrime(n):
    sieve = [False, False] + [True] * (n-1) # n+1개의 배열 생성

    for i in range(2, int(n**0.5) + 1):
        # i가 아직 false처리 되지 않은 수라면
        if sieve[i]:
            # i의 배수들을 false처리
            for j in range(i*i, n+1, i):
                sieve[j] = False
    primes = [i for i in range(n+1) if sieve[i]]

    return primes

prime = isPrime(1000000)
print(' '.join(map(str, prime)))
