import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] dp = new int[n + 1];

	
		dp[0] = 1;
		// 홀수번재는 타일을 다 못채운다 -> 0으로 초기화
		for (int i = 2; i <= n; i += 2) {
			dp[i] = dp[i - 2] * 3; // 이전 타일을 뒤에 붙이기,

			// i수가 커지면서 2인 경우를 붙이는 것 이외에도 다른 경우가 생김 -> 답지 엔딩
			for (int j = i - 4; j >= 0; j -= 2) {
				dp[i] += dp[j] * 2;
			}

		}

		System.out.println(dp[n]);

	}

}