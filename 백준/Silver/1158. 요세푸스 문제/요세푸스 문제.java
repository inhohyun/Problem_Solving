
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       StringTokenizer st = new StringTokenizer(br.readLine());
	   Queue<Integer> Q = new LinkedList<>(); 
	   StringBuilder sb = new StringBuilder();
	   
       int N = Integer.parseInt(st.nextToken()); // 7
       int K = Integer.parseInt(st.nextToken()); // 3
	   	for(int i = 1; i<=N;i++) {
	   	Q.offer(i); // Q에 1~7값을 넣음
	   	}	   	  	
	   	sb.append("<");
	   	while(Q.size() != 1) { // 한 개가 남을 때까지
	   		for(int i=0;i<K-1;i++) { // K 이전 두 개의 숫자는 제거하여 다시 큐에 넣기
	   			Q.offer(Q.poll());
	   		}
	   		sb.append(Q.poll()+", "); // K번쩨 수는 제거하며 sb에 저장
	   	}
	   	sb.append(Q.poll()+">"); //마지막 큐값을 sb에 저장
	   	bw.write(sb.toString()+"\n");
	   	bw.flush();
	   	bw.close();
	   	br.close();	       
	   
    }
}