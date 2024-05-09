import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double rate = 1.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter money: ");
        money = input.nextDouble();

        System.out.print("Enter month: ");
        month = input.nextInt();

        System.out.print("Enter rate: ");
        rate = input.nextDouble();

        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (rate / 100) / 12 * month;
        }

        System.out.print("total is: " + total);
    }
}
