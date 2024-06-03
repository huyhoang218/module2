package validate_class;

import java.util.Scanner;

public class ValidateClass {
    public static void main(String[] args) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        Scanner scanner = new Scanner(System.in);
        String className;

        do {
            System.out.print("Nhập tên lớp: ");
            className = scanner.nextLine();
            if (className.matches(regex)) break;
            else System.out.println("Tên định dạng sai, hãy thử lại");
        } while (true);
    }
}
