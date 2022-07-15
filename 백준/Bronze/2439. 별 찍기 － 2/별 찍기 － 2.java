



import java.util.Scanner;



public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	sc.close();
	
	for(int i =1; i<=T;i++) {
		
		for(int h=1;h<=(T-i);h++) {
			System.out.print(" ");
			
		}
		for(int j =1;j<=i;j++) {

			
			System.out.print("*");
		}
		
		System.out.println();
		
	  }		
	}

}

