function solution(n) {
    let prime = new Array(n + 1).fill(true);
    prime[0] = prime[1] = false; // 0과 1은 소수가 아님

    // 에라토스테네스의 체
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (prime[i]) {
            for (let j = i * i; j <= n; j += i) {
                prime[j] = false;
            }
        }
    }

    // true인 값들만 필터링 → 소수의 개수
    return prime.filter(Boolean).length;
}
