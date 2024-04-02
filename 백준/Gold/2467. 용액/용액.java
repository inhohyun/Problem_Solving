
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, numbers[];
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
         for(int i = 0; i < n; i++){
        numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        //딱 1번만 긁기
        int l = 0;
        int r = n-1;

        int goal = Integer.MAX_VALUE; // 만들 수
        int answer_l = 0;
        int answer_r = 0;
        while(l < r){

            int sum = numbers[l] + numbers[r];

            if(goal > Math.abs(sum)){
                goal = Math.abs(sum);

                answer_l = numbers[l];
                answer_r = numbers[r];

                if(sum == 0) break;
            }
            

            if(sum < 0){
                l++;
            }else{
                r--;
            }
        }
        System.out.println(answer_l+" "+answer_r);
    

    }
}
