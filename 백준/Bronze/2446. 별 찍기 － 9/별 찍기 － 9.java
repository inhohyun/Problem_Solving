import java.util.*;


public class Main {

	public static void main(String[] args) {
		/*
		 * 줄별 별의 개수와 공백의 개수 저장해서 처리
		 * */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 2*n -1;
		int gong = 0;
		int flag = 0;
		for(int i=0; i<2*n-1;i++) {
			//공백 출력
			for(int g =0;g<gong;g++) {
				System.out.print(" ");
			}
			
			for(int s=0;s<star;s++) {
				System.out.print("*");
			}
			if (flag == 0) {
				gong++;
				star-= 2;
			}else {
				gong--;
				star+= 2;
			}
			if(star== 1) {
				flag = 1;
			}
			System.out.println();
		}
	
	}
}