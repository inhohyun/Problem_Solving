import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] bracket = input.toCharArray();

        Stack<Character> stack = new Stack<>();
        int answer = 0;
        int tmp = 1;

        for (int i = 0; i < bracket.length; i++) {
            if (bracket[i] == '(') {
                stack.push(bracket[i]);
                tmp *= 2;
            } else if (bracket[i] == '[') {
                stack.push(bracket[i]);
                tmp *= 3;
            } else if (bracket[i] == ')') {
                if (stack.isEmpty() || stack.peek() == '[') {
                    answer = 0;
                    break;
                }
                if (i > 0 && bracket[i - 1] == '(') {
                    answer += tmp;
                }
                stack.pop();
                tmp /= 2;
            } else {
                if (stack.isEmpty() || stack.peek() == '(') {
                    answer = 0;
                    break;
                }
                if (i > 0 && bracket[i - 1] == '[') {
                    answer += tmp;
                }
                stack.pop();
                tmp /= 3;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }
}
