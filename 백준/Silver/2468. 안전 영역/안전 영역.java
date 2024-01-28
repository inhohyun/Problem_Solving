

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int n;
	static int[][] map;
	static boolean[][] visited;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		map = new int[n][n];
		visited = new boolean[n][n];
		// 입력 받기
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int maxCnt = 1; // 아무 지역도 물에 안 잠기면 1이 최소값
		
		int cnt = 0;
		for (int i = 1; i <=100; i++) {
			leak(i);
			for (int a = 0; a < n; a++) {
				for (int b = 0; b < n; b++) {
					if (!visited[a][b]) {
						bfs(new xy(a, b));
				//		print(); // i = 1이면 한 번에 전부 false 되어야하는데?
						cnt++;
					}
					
				}
			//	System.out.println(cnt);
			}
			
			if (maxCnt < cnt) {
				maxCnt = cnt;
			}
			// 초기화
			visited = new boolean[n][n];
			cnt = 0;

		}
		System.out.println(maxCnt);
	}
	//배열 출력 테스트
	static void print() {
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				System.out.print(visited[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------map구분--------------------");
//		for (int x = 0; x < n; x++) {
//			for (int y = 0; y < n; y++) {
//				System.out.print(map[x][y]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("-------------------------------------");
	}

	// 좌표를 관리할 클래스?
	static class xy {
		private int x;
		private int y;

		xy(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		
	}

	// 특정 높이 이하 잠기게하기
	static void leak(int w) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] <= w) {
					visited[i][j] = true;

				}
			}
		}
	}

	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static Queue<xy> q = new LinkedList<>();

	static void bfs(xy start) {
		int ci = start.getX();
		int cj = start.getY();
		visited[ci][cj] = true;
		q.offer(start);
		while (true) {
			if(q.size() == 0) break;
			
			xy a = q.poll();
			visited[a.getX()][a.getY()] = true;
			for (int d = 0; d < 4; d++) {
				int di = a.getX() + dx[d];
				int dj = a.getY() + dy[d];
				if (di < 0 || di >= n || dj < 0 || dj >= n) {
					continue;
				}
				if (!visited[di][dj]) {
					visited[di][dj] = true;
					q.offer(new xy(di, dj));
				}
			}
		}
	}

}