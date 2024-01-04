import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int total = 0;
		
		for (int i=0;i<n.length();i++) {
			total += Character.getNumericValue(n.charAt(i));
			
		}
		
		System.out.print(total);
	}
}
