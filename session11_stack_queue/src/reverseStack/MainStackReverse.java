package reverseStack;

import java.util.Stack;

public class MainStackReverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        System.out.println(stack);
        Stack<Integer> stackReverse = new Stack<Integer>();

        while (!stack.isEmpty()) {
            stackReverse.push(stack.pop());
        }

        System.out.println(stackReverse);

    }
}
