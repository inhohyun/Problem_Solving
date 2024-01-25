
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int k = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
		for (int c = 0; c < k; c++) {

			int i = 0;
			int j = 0;
			int x = 0;
			int y = 0;

			st = new StringTokenizer(br.readLine());

			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			int answer = 0;
			for (int a = i-1; a < x; a++) {
				for (int b = j-1; b < y; b++) {
					answer += arr[a][b];
				}
			}
			System.out.println(answer);
		}
	}

}