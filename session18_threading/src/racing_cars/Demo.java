package racing_cars;

public class Demo {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        thread1.start();

        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {

    }
}
