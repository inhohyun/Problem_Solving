
import java.util.Scanner;
import java.util.Stack;

public class Main {


   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   Stack<Character> stk = new Stack<>();
	   
	   //태그의 안과 밖을 구분
	   boolean inout = false;
	  
	   //문자열 s를 하나씩 탐색?
	   for(int i=0;i<s.length();i++) {
		   if(s.charAt(i) == '<') {
			   inout = true;
			   
			   //<가 나올경우 그 앞에 문자열은 모두 출력
			   while(!stk.isEmpty()) {
				   System.out.print(stk.pop());
			   }
			   // < 기호 출력
			   System.out.print(s.charAt(i));
		   }
		   else if(s.charAt(i) == '>') {
			   inout = false;
			   // >기호 출력
			   System.out.print(s.charAt(i));
		   }
		   
		   //<>안에 있을 경우
		   else if(inout) {
			   System.out.print(s.charAt(i));
		   }
		   
		   else if(!inout) {
			   //공백을 기준으로 스택을 나눔
			   if(s.charAt(i)== ' ') {
				   while(!stk.isEmpty()){
					   System.out.print(stk.pop());
					   
				   }
				   //공백 출력
				   System.out.print(s.charAt(i));
			   }
			   //공백이 아닐때
			   else {
				   stk.push(s.charAt(i));
			   }
		   }
		  
		
	   }
	   // 마지막 단어 출력(마지막단어는 공백으로 끝나지 않기때문에 따로 출력)
	   while(!stk.isEmpty()){
		   System.out.print(stk.pop());
		   
	   }
    }
}