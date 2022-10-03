

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		
		int count = sc.nextInt();
		int totalcheck = 0;
		
		for(int i=0;i<count;i++) {
			int price = sc.nextInt();
			int count2 = sc.nextInt();
			totalcheck += price * count2;
		}
		if(total == totalcheck) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
