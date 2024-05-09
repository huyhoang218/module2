import java.util.Scanner;

public class CheckPrime {
    public static boolean prime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("enter a number: ");
            number = scanner.nextInt();
        } while (number <= 1);

        int count = 0;
        int n = 2;

        while (count < number) {
            if (prime(n)) {
                count++;
                System.out.print(n + " ");
            }
            n++;
        }

    }
}
