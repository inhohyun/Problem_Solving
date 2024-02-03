import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n이상 m이하의 소수를 모두 출력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = n; i<=m;i++){
            if(isPreme(i))
                System.out.println(i);
        }

    }
    static boolean isPreme(int num){
        if (num == 1) return false;
        if (num == 2) return true;
        for(int i = 2; i<=Math.sqrt(num);i++){
                if(num% i == 0) return false;
        }
        return true;
    }
}
