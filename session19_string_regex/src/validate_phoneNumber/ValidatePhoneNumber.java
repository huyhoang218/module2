package validate_phoneNumber;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regex = "^\\d{2}-\\d{10}$";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number phone: ");
        String phoneNumber = scanner.nextLine();
        System.out.println(phoneNumber.matches(regex));
    }
}
