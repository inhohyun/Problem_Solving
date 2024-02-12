
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int k;
	static int cnt;
	static int[] coin;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		coin = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		int[] dp = new int[k + 1]; // k를 만드는 경우의 수를 저장할 배열
		dp[0] = 1;
		

		// n개의 종류의 동전들을 활용해서 k를 만드는 경우의 수 구하기
		for (int i = 1; i <= n; i++) {
			for (int j = coin[i]; j <= k; j++) {

				dp[j] += dp[j - coin[i]]; // 이전에 만든 경우의 수에 새로운 동전으로 만드는 경우의 수 더하가
			}
		}

		System.out.println(dp[k]);

	}

}