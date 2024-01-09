
import java.util.*;
public class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++) {
			int caseNum = sc.nextInt();
			int [] score = new int[101];
			
			for (int i = 0; i < 1000; i++) {
				int s = sc.nextInt();
				score[s]++;
			}
			
			int max = 0;
			int result = 0;
			for (int i = 0; i < score.length; i++) {
				if (score[i] >= max) {
					max = score[i];
					result = i;
				}
			}
			
			System.out.println("#" + caseNum + " " + result);
		}
	}
}