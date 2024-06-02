package display_odd_even;

public class EvenThread extends Thread{
    private String name;

    public EvenThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(name + ": " + i);
                }
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
