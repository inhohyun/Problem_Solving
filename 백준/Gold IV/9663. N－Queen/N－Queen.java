import java.util.Scanner;

public class Main {
    static int n;
    static int[] board;
    static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n];
        dfs(board, 0);
        System.out.println(answer);
    }

    static void dfs(int[] arr, int cnt){
        //n줄까지 퀸이 배치됐으면 가능
        if(cnt == n){
            answer++;
        return;
        }

        for(int i = 0; i < n; i++){
           arr[cnt] = i; // arr에 행의 값을 저장함
           if(isCheck(arr, cnt)){
               dfs(arr, cnt+1);
           }
        }
    }

    //매개 변수의 배열이 nqueen 조건을 만족하는지 확인하기
    static boolean isCheck(int[] arr, int cnt){
        // 이전꺼랑 비교를 어캐함? -> 열이 같거나 대각선은...거리?가 1이면 안되나
        for(int i = 0; i<cnt; i++){

            if(arr[i] == arr[cnt]) return false; //같은 행 -> arr에 들어있는 행 값이 같으면 안됨
            if(Math.abs(arr[cnt] - arr[i])  == cnt - i) return false; // 대각

        }
        return true;
    }

}
