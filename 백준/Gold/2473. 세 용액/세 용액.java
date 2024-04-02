

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] numbers = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numbers);
		long answer_l = 0;
		long answer_r = 0;
		long answer_i = 0;
		long goal_sum = Long.MAX_VALUE;
		//for문 + 투 포인터
		for(int i = 0; i < n-2; i ++){
			int l = i+1;
			int r = n-1;
	

			while (l <r) {
				// 세 용액의 합
				long sum = numbers[i] + numbers[l]+ numbers[r];
				
				
				if(goal_sum > Math.abs(sum)) {
					goal_sum = Math.abs(sum); // 0과 가까운 값
					
					answer_i = numbers[i];
					answer_l = numbers[l];
					answer_r = numbers[r];
//					System.out.println("test : "+answer_i+" "+answer_l+" "+answer_r);
					if(sum == 0) {
						System.out.println(answer_i+" "+answer_l+" "+answer_r);
						System.exit(0);
					}
				}
				
				
				
				
				if(sum > 0) {
					r--;
				} else if(sum < 0) {
					l++;
				}				
			}			
		}
		
		System.out.println(answer_i+" "+answer_l+" "+answer_r);
				
	}
}
