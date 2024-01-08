
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int[] numbers = new int[10];
            for(int i =0;i <10; i++ ){
            	numbers[i] = sc.nextInt();
            }
            
            int total = 0;
            for(int a : numbers){
            	if(a % 2 !=0){
                	total += a;
                }
            }
            System.out.printf("#%d %d", test_case, total);
            System.out.println();
			

		}
	}
}