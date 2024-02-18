import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static ArrayList<Integer>[] list;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		init();
		for (int i = 0; i < n; i++) {
			// 모든 정점에서 출발해보기
			dfs(i, 1);
		}
		System.out.println(0);
	}

	static void init() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		list = new ArrayList[n];
		for(int i = 0; i<n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		visited = new boolean[n];
		
		for(int i = 0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M =	Integer.parseInt(st.nextToken());
			makeList(N, M);
			
		}
		
	}

	static void makeList(int x, int y) {
		list[x].add(y);
		list[y].add(x);
		
	}

	static void dfs(int start, int cnt) {
//		System.out.println(start + " " + cnt);

		if (cnt == 5) {
			System.out.println(1);
			System.exit(0);
		}
		visited[start] = true;
		for (int i : list[start]) { 

			if (!visited[i]) {
				dfs(i, cnt + 1);
			}
		}
		visited[start] = false;
	}

}