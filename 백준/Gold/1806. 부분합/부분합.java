

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	
		//투 포인터
		int l = 0;
		int r = 0;
		int tmp = 0; // 만약 초기에 갱신되면?
		if(tmp >= s) {
			System.out.println(1);
			System.exit(0);
		}
		int min_answer = Integer.MAX_VALUE; 
		while (l <= n && r <= n) {
	
			// 찾던 값이면 최솟 길이 찾기
			if(tmp >= s && min_answer > r - l) {
				min_answer = r - l;
				
			}
			
			if(tmp < s) {
				tmp += arr[r++];
			}else {
				tmp -= arr[l++];
			}

		}
		if(min_answer == Integer.MAX_VALUE) {
			min_answer = 0;
		}
		
		System.out.println(min_answer);
	}
}
