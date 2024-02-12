import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	static int n;
	static int m;
	static int[] numbers;
	static boolean[] is;
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	 n = Integer.parseInt(st.nextToken());
    	 m = Integer.parseInt(st.nextToken());
    	numbers = new int[m];
    	is = new boolean[n+1];
    	go(0);
    }
    
    static void go(int depth) {
    	if(depth == m) {
    		for(int i = 0;i<numbers.length;i ++) {
    			System.out.print(numbers[i] + " ");
    		}
    		System.out.println();

    		return;
    	}
    	
    	for(int i=1;i<=n;i++) {
    		if(is[i]) continue;
    		numbers[depth] = i ;
    		is[i] = true;
    		go(depth+1);
    		is[i] = false;
    		
    		
    	}
    	
    }
    
    
}
