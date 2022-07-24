import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

   public static void main(String[] args) throws IOException{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  Deque<Integer> D = new LinkedList<>();
	  StringBuilder sb = new StringBuilder();
	  
	  int T = Integer.parseInt(br.readLine());
	  while(T --> 0) {
		  String[] d = br.readLine().split(" ");
		  
		  switch(d[0]) {
		      case "push_front":{
			        D.addFirst(Integer.parseInt(d[1]));
			        break;
		      }
		      case "push_back" :{
			        D.addLast(Integer.parseInt(d[1]));
			        break;}
		      case "pop_front" :{
			      
			        if(D.isEmpty()) {
			    		 sb.append(-1).append('\n');
			    	  }
			    	  else {
			    		  sb.append(D.pollFirst()).append('\n');
			    	  }
			        break;}
		      case "pop_back" :{
		    	   if(D.isEmpty()) {
			    		 sb.append(-1).append('\n');
			    	  }
			    	  else {
			    		  sb.append(D.pollLast()).append('\n');
			    		  }
		    	  break;}
		      case "size":{
		    	 sb.append(D.size()).append('\n') ;
		    	  break;}
		      case"empty":{
		    	  if(D.isEmpty()) {
		    		 sb.append(1).append('\n');
		    	  }
		    	  else {
		    		  sb.append(0).append('\n');
		    	  }
		    	  break;
		    	  }
		      case"front":{
		    	  if(D.isEmpty()) {
			    		 sb.append(-1).append('\n');
			    	  }
			    	  else {
			    		  sb.append(D.peekFirst()).append('\n');
			    	  }
		      break;
		    	  }
		      case"back":
		    	  if(D.isEmpty()) {
			    		 sb.append(-1).append('\n');
			    	  }
			    	  else {
			    		  sb.append(D.peekLast()).append('\n');
			    	  }
		  }
	
		  
		  
		  
	  }
	  
	  System.out.println(sb);
    }
}