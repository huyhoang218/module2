package queueByArray;

public class MyQueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.dequeue();
        queue.dequeue();
    }
}
