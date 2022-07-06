
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int H = sc.nextInt();
		int A = sc.nextInt();
		
		int sum = H+A;
		
		if(sum >= 60) {
			T = T+(sum/60);
			sum = sum%60;
			 if(T>=24) {
					T = T-24;
					
				}
		}

		System.out.print(T+" "+sum);
		
		
		
	}
	
}
