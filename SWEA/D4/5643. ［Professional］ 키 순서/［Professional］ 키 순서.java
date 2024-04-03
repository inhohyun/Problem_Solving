

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int INF = 100000000;
		for (int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(br.readLine());
			int m = Integer.parseInt(br.readLine());

			int ans = 0;
			int[][] dis = new int[n + 1][n + 1];

			// 좀있다 거리 비교를 위해 최대로 초기화해놓기
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					dis[i][j] = INF;
				}
			}

			// 그래프 연결
			for (int i = 0; i < m; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				dis[a][b] = 1;
			}

			// 플로이드로 최단거리 연결해놓기
			for (int k = 1; k <= n; k++) {
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (dis[i][j] > dis[i][k] + dis[k][j]) {
							dis[i][j] = dis[i][k] + dis[k][j];
						}
					}
				}
			}

			for (int i = 1; i <= n; i++) {
				int cnt = 0;
				for (int j = 1; j <= n; j++) {
					if (dis[i][j] != INF || dis[j][i] != INF) {
						cnt++;
					}
				}

				if (cnt == n - 1) {
					ans++;
				}
			}

			System.out.println("#" + tc + " " + ans);
		}

	}
}
