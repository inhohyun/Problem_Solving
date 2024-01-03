import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		// 3가지 케이스 다 구현
		if (A == 1 && B == 2) {
			System.out.print("B");
		}
		else if (A == 1 && B == 3) {
			System.out.print("A");
		}
		else if (A == 2 && B == 1) {
			System.out.print("A");
		}	
		else if (A == 2 && B == 3) {
			System.out.print("B");
		}
		
		else if (A == 3 && B == 1) {
			System.out.print("B");
		}
		else if (A == 3 && B == 2) {
			System.out.print("A");
		}
	}

}
