



import java.util.Scanner;



public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt(); // case
	int arr[];
	
	for(int i =0; i <T;i++) {
		int N = sc.nextInt(); // 학생 수 
		arr = new int[N]; 
		
		double sum = 0; // 성적 합
		
		for(int j = 0; j<N;j++) {
			int val = sc.nextInt(); // 학생들 성적
			arr[j] = val; // 성적을 배열로 관리
			sum += val;
		}
	    double mean = (sum / N); // 평균
	    double count = 0; // 평균을 넘는 학생 수
	   
	    for(int j = 0; j<N;j++) {
	    	if(arr[j]>mean) { // 학생 성적이 평균을 넘을 경우 count값 증가 
	    		count++;
	    		
	    	}
	    }
	    // 소수점 셋째자리까지 출력하기 위해 printf() 사용 %.3f로 출력 포맷지정
	    System.out.printf("%.3f%%\n", (count/N)*100);
	    
	}
	sc.close();
}
}

