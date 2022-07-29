




import java.util.Scanner;
import java.util.Stack;

public class Main {


   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	   Stack<Character> stack = new Stack<>();
       String str = sc.nextLine();
	   
	   int sum = 0;

	   //레이저랑 막대기랑 구분
	   //왜 문자열 끝까지는 안되는거지?
	   for(int i=0;i<str.length();i++) {
		   if('(' == str.charAt(i)) {
			   stack.push('(');
			   continue;		 
		   }
		   
		   if(')' == str.charAt(i)) {
			   stack.pop();
			   //레이저 일때
				if(str.charAt(i-1) == '(') {
					sum += stack.size();
				}
				//막대의 끝일때
				else {
					sum++;
				}
				
				 
		   }
	   } 
	
	   System.out.print(sum);
	   sc.close();
	   
	   
	   
    }
}