package stack_test;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(7);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println("*******");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("*******");
        System.out.println(stack.empty());
    }
}
