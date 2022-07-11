import java.util.Scanner;




public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	String arr[] = new String[sc.nextInt()];
	
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.next();
	}
	sc.close();
	
	for(int i=0;i<arr.length;i++) {
		int cnt = 0;  // O가 연속으로 입력된 횟수
		int sum = 0;  // 누적 합산
		for(int j=0;j<arr[i].length();j++) {
			if(arr[i].charAt(j) =='O') {
				cnt++; // O가 입력될 경우 추가
				
			}
			else {
				cnt = 0;
			}
			sum +=cnt;
		}
		System.out.println(sum);
	}
	

}
}
