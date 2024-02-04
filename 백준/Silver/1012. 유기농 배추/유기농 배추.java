import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int[][] map;
	static int n;
	static int m;
	static int k;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int test = 1; test<=t;test++) {
			int cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			map = new int[n][m];
			for(int i = 0;i<k;i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[x][y] = 1; // 배추 위치 표시
				
				
			}
		
			visited = new boolean[n][m];
			// 배추 탐색
			for(int i = 0; i<n;i++) {
				for(int j = 0; j<m;j++) {
					//배추가 있고 방문하지 않은 배추일 경우
					if(map[i][j] == 1 && !visited[i][j]) {
						bfs(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}

	}
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
 	static void bfs(int x, int y) {
		Integer[] xy = new Integer[2];
		xy[0] = x;
		xy[1] = y;
		Queue<Integer[]> q = new ArrayDeque();
		q.add(xy);
		visited[x][y] = true;
		while(!q.isEmpty()) {
			Integer[] cicj = q.poll();
			for(int d =0; d<4;d++) {
				int di = cicj[0] + dx[d];
				int dj = cicj[1] + dy[d];
				 if(di <0 || di >= n || dj <0 || dj>=m) continue;
				 
				 if(!visited[di][dj] && map[di][dj] == 1) {
					 visited[di][dj] = true;
					 
					 q.add(new Integer[] {di, dj});
				 }
			}
		}
	}

}