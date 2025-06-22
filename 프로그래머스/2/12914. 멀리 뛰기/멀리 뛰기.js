function solution(n) {
    let answer = 0;
    let MOD = 1234567;
    
    let dp = new Array(n+1 ).fill(0);
    
    dp[0] = 1;
    dp[1] = 1;
    
    for(let i = 2; i <= n; i++){
        dp[i] = (dp[i-1] + dp[i-2]) % MOD;
     }
    
    
    return dp[n];
}