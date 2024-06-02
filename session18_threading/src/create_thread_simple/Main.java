package create_thread_simple;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberGenerator("Thread first"));
        Thread thread2 = new Thread(new NumberGenerator("Thread second"));

        thread1.start();
        thread2.start();

        thread1.setPriority(MAX_PRIORITY);
        thread2.setPriority(MIN_PRIORITY);
    }
}
