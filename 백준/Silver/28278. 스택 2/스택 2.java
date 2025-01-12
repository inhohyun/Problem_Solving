import java.io.*;
import java.util.Stack;

public class Main {

    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //명령어의 수

        while(N --> 0){
            solution(br.readLine());
        }

        br.close();

        System.out.println(sb);
    }

    static void solution(String query){
        char c = query.charAt(0); //첫번째 문자는 명령어

        switch (c){
            //case 1의 경우 query.substring(2);를 한 이유는 공백도 문자로 포함하기 때문이다 1 X 형태이기 때문에 X의인덱스는 2다.
            case '1' : stack.push(Integer.parseInt(query.substring(2))); return;
            case '2' : sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); return;
            case '3' : sb.append(stack.size()).append("\n"); return;
            case '4' : sb.append(stack.isEmpty() ? 1 : 0).append("\n"); return;
            case '5' : sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n"); return;
            default: break;
        }
    }
}