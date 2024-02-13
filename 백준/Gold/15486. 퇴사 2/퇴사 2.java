
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] pay = new int[n+2];
		int[] time = new int[n+2];
		
		for(int i = 1; i<=n; i++) {
			
			time[i] = sc.nextInt();
			pay[i] = sc.nextInt();
		}
		int[] dp = new int[n+2]; // 중간중간 최대값을 갱신 시킬 배열, 
		int max = 0;
		for(int i = 1; i<=n+1;i++) {
			//i일까지의 수익이 최대이면 최대값 갱신해주기
			if(max < dp[i]) {
				max = dp[i];
			}
			
			int day = i + time[i]; // 현재 일자 
			
			//퇴사 전까지 상담을 끝낼 수 있으면
			if(day <= n+1) {
				//현재 날짜까지의 최대 금액 갱신해주기
				dp[day] = Math.max(dp[day], max+pay[i]); 
			}
		}
		System.out.println(max);
	}
}
