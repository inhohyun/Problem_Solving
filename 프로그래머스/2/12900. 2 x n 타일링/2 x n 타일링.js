function solution(n) {
    const MOD = 1_000_000_007;

    if (n === 1) return 1;
    if (n === 2) return 2;

    let a = 1; // dp[i - 2]
    let b = 2; // dp[i - 1]

    for (let i = 3; i <= n; i++) {
        let c = (a + b) % MOD;
        a = b;
        b = c;
    }

    return b;
}
