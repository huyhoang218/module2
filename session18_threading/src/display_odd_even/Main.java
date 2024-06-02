package display_odd_even;

public class Main {
    public static void main(String[] args) {
        Thread evenThread = new EvenThread("Even Thread");
        Thread oddThread = new OddThread("Odd Thread");
        evenThread.start();
        oddThread.start();
    }
}
