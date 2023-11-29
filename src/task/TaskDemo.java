package task;

import java.util.SplittableRandom;
import java.util.Stack;

public class TaskDemo {
    public static void main(String[] args) {
        String example = "([{{[(())]}}])";
        System.out.println(isBalance(example));
    }

    public static boolean isBalance(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if ((stack.isEmpty())) {
                    return false;
                }
                char openBracket = stack.pop();
                if (
                        (ch == ')' && openBracket != '(') ||
                                (ch == ']' && openBracket != '[') ||
                                (ch == '}' && openBracket != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
