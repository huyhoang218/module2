import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter year ");
        Scanner inputYear = new Scanner(System.in);
        short year = inputYear.nextShort();

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Leap year");
            }
        } else if (year % 100 != 0) {
            System.out.println("Not leap year");
        }
    }
}
