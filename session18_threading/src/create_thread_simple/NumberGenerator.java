package create_thread_simple;

public class NumberGenerator implements Runnable {
    private String threadName;

    public NumberGenerator(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadName);

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread: " + threadName + " " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
