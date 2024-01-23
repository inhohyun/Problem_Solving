import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		
		int[] n = new int[3];
		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(n);
		System.out.println(n[1]);
	
	}
}