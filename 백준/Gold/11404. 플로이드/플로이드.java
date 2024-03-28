
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int INF = 10000000;
		int[][] arr = new int[n+1][n+1];
		
		//최대치로 초기화
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				arr[i][j] = INF;
				
				if(i==j) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			arr[a][b] = Math.min(arr[a][b], c);
		}
		
		//플로이드 워샬
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <=n; i++) {
				for(int j = 1; j<=n; j++) {
					if(arr[i][j] > arr[i][k] + arr[k][j]) {
						arr[i][j] = arr[i][k] + arr[k][j];
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <=n; i++) {
			for(int j = 1; j<=n; j++) {
				if(arr[i][j] == INF) {
					arr[i][j] = 0; // 
				}
				
				sb.append(arr[i][j]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	
		
		
	}
}
