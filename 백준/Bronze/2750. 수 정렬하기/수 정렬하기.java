

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[] arr = new int[T];
		
		for(int i=0;i<T;i++) {
			int n = sc.nextInt();
			arr[i] = n;
		}
		Arrays.sort(arr);
		for(int i=0;i<T;i++) {
			System.out.println(arr[i]);
		}
	}


}
