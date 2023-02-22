
import java.util.Scanner;

//알고리즘은 맞았는데 구현에서 살짝 삐끗
public class Main {
    static int n = 0;
    static int[] t = new int[n+1];
    static int[] p = new int[n+1];
    static int max = 0;
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         t = new int[n+1];
         p = new int[n+1];
        for(int i = 1; i<= n; i++){
             t[i] = sc.nextInt();
             p[i] = sc.nextInt();
        }

      dfs( 1,0);
        System.out.print(max);

    }

    static void dfs( int day, int money){



        if(day == n+1){
            if(max < money)
                max = money;
            return;
        }
        if(day > n+1) return;

            dfs(day+ t[day], money+ p[day]); //해당날짜의 일을 수행하는 경우
            dfs( day+1, money); // 해당날짜의 일을 수행 안하는 경우

    }
}