import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	static int n;
	static int m;
	static int k;
	static int[][] graph;
	static boolean[] visited1;
	static boolean[] visited2;

	public static void main(String[] args) throws IOException {
		Main main = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		graph = new int[n + 1][n + 1];
		visited1 = new boolean[n + 1];
		visited2 = new boolean[n + 1];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			main.add(x, y);
		}
		main.dfs(k);
		System.out.println();
		main.bfs(k);
	}

	void add(int x, int y) {
		graph[x][y] = 1;
		graph[y][x] = 1;
	}

	void dfs(int start) {
		System.out.print(start + " ");
		visited2[start] = true;
		for (int i = 1; i <= n; i++) {
			if (graph[start][i] == 1 && !visited2[i]) {
				dfs(i);
			}
		}
	}

	void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited1[start] = true;
		System.out.print(start + " ");
		while (!q.isEmpty()) {
			start = q.poll();
			for (int i = 1; i < n + 1; i++) {
				if (graph[start][i] == 1 && !visited1[i]) {

					q.add(i);
					visited1[i] = true;
					System.out.print(i + " ");
				}
			}
		}

	}

}