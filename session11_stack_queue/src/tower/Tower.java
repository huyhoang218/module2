package tower;

import java.util.EmptyStackException;
import java.util.Stack;

public class Tower {
    private Stack<Integer> stack;
    private String name;

    public Tower(String name) {
        stack = new Stack<>();
        this.name = name;
    }

    public void push(int element) {
        stack.addLast(element);
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }

    public String getName() {
        return name;
    }

    public void moveTopTo(Tower tower) {
        int top = stack.pop();
        tower.push(top);
        System.out.println("Di chuyển tháp " + top + " từ " + name + " đến " + tower.name);
    }

    public void display() {
        System.out.println("Tên tháp " + name + stack.toString());
    }

    /*
    A, B, C

    n = 1: A -> C

    n = 2:
    A -> B
    A -> C
    B -> C

    n = 3:
    A -> B
    A -> C
    B -> C
    A -> B
    C -> A
    C -> B
    A -> B
     */
}
