package stackByArray;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.size());
        stack.pop();
        stack.pop();

        System.out.println(stack.size());
    }
}
