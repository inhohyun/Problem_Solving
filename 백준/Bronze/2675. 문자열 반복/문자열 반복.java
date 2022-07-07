
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int A=0;A<T;A++ ) {
		
		int R = sc.nextInt();
		String S = sc.next();
		
		for(int i=0;i<S.length();i++) {
			
		char ch = S.charAt(i);
		for(int j =1;j<=R;j++) {
			System.out.print(ch);
		}
		
		}
		System.out.println();
		}
		
		
	
 }
}
