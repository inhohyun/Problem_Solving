


import java.util.Scanner;
import java.util.Stack;


public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	
	Stack<Integer> stack = new Stack<>(); 
	int start = 0;
	int T = sc.nextInt();
	while(T --> 0) {
		int value = sc.nextInt();
		if(value > start) {
			for(int i = start+1;i<=value;i++) {
				stack.push(i);
				sb.append("+").append("\n");
			}
			start = value;
		}
		else if(stack.peek() != value) { //top의 원소랑 입력값이랑 불일치
			System.out.println("NO");
			return; 
		}
		stack.pop();
		sb.append("-").append("\n");
	}
	System.out.println(sb);

		
		
		

	
	}

}
