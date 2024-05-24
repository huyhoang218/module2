package binary;

import java.util.LinkedList;

public class Binary {
    private LinkedList<Integer> stack;

    public Binary() {
        stack = new LinkedList<>();
    }

    public void push(int element) {
        stack.addFirst(element);
    }

    @Override
    public String toString() {
        return "Binary{" +
                "stack=" + stack +
                '}';
    }
}
