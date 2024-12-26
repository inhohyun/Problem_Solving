import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int top = -1;	// 마지막 원소의 위치를 가리키는 변수

        int K = in.nextInt();
        int[] arr = new int[K];


        for(int i = 0; i < K; i++) {

            int number = in.nextInt();	// 정수 입력

            if (number == 0) {	// 0 이라면 top 위치에 있는 원소를 0으로 초기화 
                top--;	// top이 가리키는 위치 1 감소
            }
            else {
                top++;	// top이 가리키는 위치 1 증가
                arr[top] = number;	// 입력받은 정수로 초기화
            }
        }
        int sum = 0;
        for (int i = 0; i <= top; i++) {	// 합을 구할 때 K가 아닌 top까지다.
            sum += arr[i];
        }
        System.out.println(sum);

    }

}