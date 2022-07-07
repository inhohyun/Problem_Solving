
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int arr[] = new int[26];
		
		for(int i=0; i <arr.length;i++) {
			arr[i] = -1; // arr 원소 값을 -1로 초기화
		}
		String S = sc.nextLine();
		
		for(int i =0;i<S.length();i++) {
			char ch = S.charAt(i); // 문자열을 각 문자를 추출하여 ch변수에 저장
			
			if(arr[ch-'a'] == -1) { //arr 원소 값이 -1일때 초기화
			arr[ch -'a'] = i;
			}
		}
	    for(int val : arr) { //배열의 객체들 출력
	    	System.out.print(val +" ");
	    }
        
		
	
	}
	
}
