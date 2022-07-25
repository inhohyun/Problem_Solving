

import java.util.Scanner;

public class Main {


   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int N = sc.nextInt();
	StringBuilder sb = new StringBuilder();

	

for(int i =0; i<T;i++) {
		int A = sc.nextInt();
  
        if(N>A) {
     
        	sb.append(A).append(" ");
        }
		        
	  }
System.out.print(sb); 

	
	  
    }
}