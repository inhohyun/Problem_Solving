

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int mod =  1_000_000_000;
		
		int[][] dp = new int[n+1][k+1];
		
		//n이 1일때 초기화
		for(int i = 0; i <=k; i++) {
			dp[1][i] = i;
		}
		
		//k가 1일 때 초기화
		for(int i = 0; i <= n; i++) {
			dp[i][1] = 1;
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 2; j <=k; j++) {
				dp[i][j] = (dp[i-1][j] + dp[i][j-1])% mod;
			}
		}
		
		System.out.println(dp[n][k] % mod);
		
		
	}
}

