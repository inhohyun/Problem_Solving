import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            String str = sc.next();

            answer[i] = Character.toString(str.charAt(0))+Character.toString(str.charAt(str.length()-1));
        }
        for(int i=0; i<n;i++){
            System.out.println(answer[i]);
        }



    }
}