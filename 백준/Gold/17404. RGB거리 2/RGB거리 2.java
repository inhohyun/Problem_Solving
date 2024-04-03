
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int INF = 1_000 * 1_000;
        int[][] color = new int[n + 1][3];
        int[][] dp = new int[n + 1][3];
        int answer = INF;
        
        // color 값 저장
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                color[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 0; k < 3; k++) {
            // 초기화를 INF로 해야 올바른 결과를 얻을 수 있음
            for (int i = 0; i < 3; i++) {
                if (i == k) {
                    dp[1][i] = color[1][i];
                } else {
                    dp[1][i] = INF; // 상관없는 애들은 최대값으로 초기화
                }
            }
            
            // 2번째 집부터 조건에 맞춰서 최솟값 저장
            for (int i = 2; i <= n; i++) {
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + color[i][0];
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + color[i][1];
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + color[i][2];
            }
            
            for (int i = 0; i < 3; i++) {
                if (i != k) {
                    answer = Math.min(answer, dp[n][i]);
                }
            }
        }
        
        System.out.println(answer);
    }
}
