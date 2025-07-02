function solution(n) {
    let a = 0; // dp[0]
    let b = 1; // dp[1]

    for (let i = 2; i <= n; i++) {
        const temp = (a + b) % 1234567;
        a = b;
        b = temp;
    }

    return n === 0 ? 0 : b;
}
