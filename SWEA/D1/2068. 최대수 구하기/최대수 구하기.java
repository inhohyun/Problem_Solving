
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[] n = new int[10];
		for (int i=0; i<test;i++) {
			for(int j=0;j<10;j++) {
				n[j] = sc.nextInt();
			}
			
			Arrays.sort(n);
			System.out.printf("#%d %d", i+1,n[n.length - 1]);
			System.out.println();
		}
		
	}
}
