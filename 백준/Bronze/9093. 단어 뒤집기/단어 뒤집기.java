
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException{
	    Stack<Character> stack = new Stack<>();

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    

	    int T = Integer.parseInt(br.readLine());
	   

	     
	     while(T-- > 0) {
	    	 String str1 = br.readLine();

	     	 for(int j=0;j<str1.length();j++) {
	     		 
	     	 
	    	 if(str1.charAt(j)==' ') { 
	    		 
	    		while(!stack.empty()) {
	    			bw.write( stack.pop());
	   	    
	    		} 
	                 bw.write(" "); 
	    	 }
	    	 else 
	    	 {
	    		 stack.push(str1.charAt(j));
	    	 }
	    
	    		   	
	     	 }
	     	 //마지막 문자라 공백이 나오지않았을 때 스택에 저장된 내용 출력
	     	while(!stack.empty()) {
	      		bw.write( stack.pop()); 
		   
	      		}
	    	 bw.write("\n");
	    
	    } 
		 bw.flush();
    	 return; 

	}

}
