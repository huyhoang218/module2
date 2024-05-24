package binary;

import java.util.Scanner;

public class BinaryMain {
    public static void main(String[] args) {
        Binary binary = new Binary();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi: ");
        int number = Integer.parseInt(scanner.nextLine());

        data(number, binary);

        System.out.println(binary.toString());
    }

    private static void data(int number, Binary binary) {
        while (number >= 1) {
            binary.push(number % 2);
            number = number / 2;
        }
    }

}
