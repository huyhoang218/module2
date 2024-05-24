package tower;

import java.lang.*;

public class TowerOfHanoi {

    class Stack {
        int capacity;
        int top;
        int array[];
    }

    Stack initStack(int capacity) {
        Stack stack = new Stack();
        stack.capacity = capacity;
        stack.top = -1;
        stack.array = new int[capacity];
        return stack;
    }

    public boolean isFull(Stack stack) {
        return (stack.top == stack.capacity - 1);
    }

    public boolean isEmpty(Stack stack) {
        return (stack.top == -1);
    }

    public void push(Stack stack, int item) {
        if (isFull(stack)) {
            return;
        }

        stack.array[++stack.top] = item;
    }

    public int pop(Stack stack) {
        if (isEmpty(stack))
            return Integer.MIN_VALUE;

        return stack.array[stack.top--];
    }

    public void move(Stack towerA, Stack towerB, char a, char b) {
        int disk1 = pop(towerA);
        int disk2 = pop(towerB);

        if (disk1 == Integer.MIN_VALUE) {
            push(towerA, disk2);
            printMove(b, a, disk2);
        } else if (disk2 == Integer.MIN_VALUE) {
            push(towerB, disk1);
            printMove(a, b, disk1);
        } else if (disk1 > disk2) {
            push(towerA, disk1);
            push(towerA, disk2);
            printMove(b, a, disk2);
        } else {
            push(towerB, disk2);
            push(towerB, disk1);
            printMove(a, b, disk1);
        }
    }

    public void printMove(char from, char to, int disk) {
        System.out.println("Move the disk " + disk + " from " + from + " to " + to);
    }

    public void iterativeTowerOfHanoi(int n, Stack towerA, Stack towerC, Stack towerB) {
        int i, moves;
        char a = 'A', b = 'B', c = 'C';

        if (n % 2 == 0) {
            char temp = b;
            b = a;
            a = temp;
        }
        moves = (int) (Math.pow(2, n) - 1);

        for (i = n; i >= 1; i--) {
            push(towerA, i);
        }

        for (i = 1; i <= moves; i++) {
            if (i % 3 == 1)
                move(towerA, towerB, a, b);
            else if (i % 3 == 2)
                move(towerA, towerC, a, c);
            else if (i % 3 == 0)
                move(towerC, towerB, c, b);
        }
    }

    public static void main(String[] args) {

        int n = 3;

        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();

        Stack towerA = towerOfHanoi.initStack(n);
        Stack towerB = towerOfHanoi.initStack(n);
        Stack towerC = towerOfHanoi.initStack(n);

        towerOfHanoi.iterativeTowerOfHanoi(n, towerA, towerC, towerB);
    }
}