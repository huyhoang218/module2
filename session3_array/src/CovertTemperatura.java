import java.util.Scanner;

public class CovertTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double c;
        double f;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
        } while (choice < 0);

        if (choice == 1) {
            System.out.print("enter fahrenheit: ");
            f = input.nextDouble();
            System.out.println(fahrenheitToCelsius(f));
        } else if (choice == 2) {
            System.out.print("enter celius: ");
            c = input.nextDouble();
            System.out.println(celsiusToFahrenheit(c));
        } else {
            System.exit(choice);
        }
    }

    public static double celsiusToFahrenheit(double c) {
        return (9.0 / 5) * c + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (5.0 / 9) * (f - 32);
    }
}
