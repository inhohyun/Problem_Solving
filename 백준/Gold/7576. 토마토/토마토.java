
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class xy {
		int x;
		int y;

		xy(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int m, n;
	static int[][] box;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static int cnt;
	static Queue<xy> q = new ArrayDeque<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		// 배열 입력 받기
		box = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[] xy = new int[2]; // 좌표를 관리할 배열
		// 1이면 bfs 호출하기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 1) {

					q.add(new xy(i, j));
				}
			}
		}

		bfs();
		// box에 0이 남아있으면 -1 출력 아니면 cnt 출력
		for (int i = 0; i < n; i++) {
			int tmp = 0;
			for (int j = 0; j < m; j++) {
				if (box[i][j] == 0) {
					System.out.println(-1);
					System.exit(0);
				}
				tmp = Math.max(tmp, box[i][j]);

			}
			cnt = Math.max(cnt, tmp);
		}

		System.out.println(cnt - 1);

	}

	static void bfs() {

		while (!q.isEmpty()) {

			xy ij = q.poll();

			for (int d = 0; d < 4; d++) {
				int di = ij.x + dx[d];
				int dj = ij.y + dy[d];
				if (0 > di || di >= n || dj < 0 || dj >= m)
					continue;
				if (box[di][dj] == 0) {
					box[di][dj] = box[ij.x][ij.y] + 1; // 누적합 형식으로 저장하기

					q.add(new xy(di, dj));

				}
			}

		}
	}
}