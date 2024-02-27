import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] price = new int[n][3];
		
		for(int i = 0; i< n; i++) {
			st = new StringTokenizer(br.readLine());
			price[i][0] = Integer.parseInt(st.nextToken());
			price[i][1] = Integer.parseInt(st.nextToken());
			price[i][2] = Integer.parseInt(st.nextToken());
		}
		
		//연속되지 않도록 최솟값 
		for(int i = 1; i <n; i++) {
			price[i][0] += Math.min(price[i-1][1], price[i-1][2]);
			price[i][1] += Math.min(price[i-1][0], price[i-1][2]);
			price[i][2] += Math.min(price[i-1][0], price[i-1][1]);
		}
		
		
		//n-1 번째 집의 3가지 경우 중 최솟값 출력하기
		int answer = Math.min(price[n-1][0], Math.min(price[n-1][1], price[n-1][2]));
		
		System.out.println(answer);
		
		
		
	}
}
