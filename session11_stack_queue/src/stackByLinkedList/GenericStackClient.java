package stackByLinkedList;

public class GenericStackClient {
    public static void main(String[] args) {
        stackOfTStrings();
        stackOfIntegers();
    }

    private static void stackOfTStrings() {
        MyGenericStack<String> stack = new MyGenericStack<String>();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("one");

        System.out.println("size = " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("size = " + stack.size());
    }

    private static void stackOfIntegers() {
        //tương tự
        MyGenericStack<Integer> stack1 = new MyGenericStack<Integer>();
        stack1.push(5);

    }
}
