
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 42로 나눈 후 서로다른 나머지의 개수
public class Main {
public static void main(String[] args){
	Set<String> set = new HashSet<>();

	Scanner sc = new Scanner(System.in);
	int[] N = new int[10];
	int counter[] = new int[10];
	
	for(int i =0;i<10;i++) {
		int A = sc.nextInt();
	    N[i]=A;	
	}

	for(int i=0;i<N.length;i++) {
	counter[i] = N[i]%42;
	String str1 = Integer.toString(counter[i]);
	set.add(str1); // 나머지의 중복을 없애기위해 set사용
	}
System.out.println(set.size());
 
	
}
}

