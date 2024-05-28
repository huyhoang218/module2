import java.util.Arrays;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculation(x, y);
    }

    private void calculation(int x, int y) {
        try {
            System.out.println("x + y = " + (x + y));
            System.out.println("x - y = " + (x - y));
            System.out.println("x * y = " + (x * y));
            System.out.println("x / y = " + (x / y));
        } catch (Exception e) {
            System.err.println("Xay ra ngoai le: " + e.getMessage());
        }
    }
}
