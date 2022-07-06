import java.util.Scanner;

public class  Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int sum=0;
        if(A==B&&B==C) {
        	sum = 10000+A*1000; 	
        }
        else if(A==B&&B!=C) {
        	sum = 1000+A*100;
        }
        else if(A==C&&B!=C) {
        	sum = 1000+A*100;
        }
        else if(B==C&&A!=C) {
        	sum = 1000+B*100;
        }
        else {
        	if(A>B&&A>C) { // A가 가장 큰 경우
        		sum = A*100;
        	}
        	else if(B>A&&B>C) { //B가 가장 큰 경우
        		sum = B*100;
        	}
        	else if(C>A&&C>B) { // C가 가장 큰 경우
        		sum = C*100;
        	}
        }
        
        System.out.print(sum);
        
		
	
	}
	
}
