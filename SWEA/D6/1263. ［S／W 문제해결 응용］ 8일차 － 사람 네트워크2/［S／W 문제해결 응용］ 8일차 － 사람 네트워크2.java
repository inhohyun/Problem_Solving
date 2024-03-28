
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			int[][] dist = new int[n][n];
			
			int[] ans = new int[n];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					dist[i][j] = Integer.parseInt(st.nextToken());
					if(i != j && dist[i][j] ==0) {
						dist[i][j] = 100000;
						
					}
				}
			}
			
			//플로이드
			for(int k = 0;k < n; k++) {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						if(i==j) continue;
						
						dist[i][j] = Math.min(dist[i][k]+dist[k][j], dist[i][j]);
					}
				}
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					ans[i] += dist[i][j];
				}
			}
			
			int min_answer = Integer.MAX_VALUE;
			for(int i = 0; i < n; i ++) {
				min_answer = Math.min(min_answer, ans[i]);
			}
			
			System.out.println("#"+tc+" "+min_answer);
		}
	}
}
