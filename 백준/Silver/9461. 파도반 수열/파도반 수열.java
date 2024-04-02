

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			
			long[] p = new long[101];	
				p[1] = 1;
				p[2] = 1;
				p[3] = 1;
				p[4] = 2;
				p[5] = 2;

				for(int i = 6; i <= 100; i++) {
					p[i] = p[i-1] + p[i-5];
				}
				
				sb.append(p[n]+"\n");
			
			
			
			
		}
		System.out.println(sb);
	}

}
