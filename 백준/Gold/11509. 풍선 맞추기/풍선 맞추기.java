import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[1_000_002]; // 화살의 위치
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		
		while(st.hasMoreTokens()) {
			
			int height  = Integer.parseInt(st.nextToken());
			
			if(arr[height] == 0) { // 해당 위치에 화살이 없을 때
				arr[height - 1] += 1;
				cnt += 1;
			}
			
			else { // 해당 위치에 이미 화살이 있을 때
				arr[height] -= 1;
				arr[height - 1] += 1;
			}
		}
		System.out.println(cnt);
	}
}