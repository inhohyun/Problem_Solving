
import java.util.Arrays;
import java.util.Scanner;



public class Main {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int A =sc.nextInt();
	int B =sc.nextInt();
	int C =sc.nextInt();
	int T = A*B*C;  //T배열에 입력값의 곱을 넣어줌
	int counter[] = new int[10]; //
	String str = Integer.toString(T);
	

	for(int i=0;i<str.length();i++) { // T값에 따라 counter의 값을 증가
	char ch = (char) (str.charAt(i)-'0');
	counter[ch]++;
	}
	for(int i = 0;i<10;i++) {
		System.out.println(counter[i]);
	}

	
	

}
}

