
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 
	 int T =Integer.parseInt(br.readLine());
	 
	 while(T-- > 0)
 	 {
		 Stack<Character> stack = new Stack<>();
		 String G = br.readLine();
		 
		  //스택에 여는괄호만 넣기
	/*
		 1. (와)가 짝이 맞는겨웅
		 2. (가 더 많은 경우
		 3. )가 더 많은 경우
		 4. ()가 개수는 맞으나 짝이 안맞는경우
		 */
		 for(int i =0;i<G.length();i++) {
			 char ch = G.charAt(i);
			 //괄호의 괄짝이 맞는지 확인하는 코
			 if(G.charAt(i)=='(' ) { 
				
				 stack.push(ch);
			 }
			 else if(G.charAt(i) ==')' && stack.empty() != true) {
					stack.pop();
			
			 }
			 
			 else { // 스택이 비워져있는데 닫는 괄호가 나오는 경우 무조건 no
				 stack.push(ch);
				break;
				 
	
			 }
		
			 
		 }
		 //닫는 괄호가 더 많아도 stack은 비어있음

		 if(stack.empty() == true) {
			 bw.write("YES");
		 }
		 else{
			 bw.write("NO");
		 }
		bw.write("\n");

	 }
		bw.flush();
		return;

	}

}
