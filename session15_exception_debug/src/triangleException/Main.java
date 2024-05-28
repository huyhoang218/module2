package triangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        Triangle triangle = new Triangle();
        do {
            try {
                System.out.println("side 1: ");
                side1 = Double.parseDouble(scanner.nextLine());
                System.out.println("side 2: ");
                side2 = Double.parseDouble(scanner.nextLine());
                System.out.println("side 3: ");
                side3 = Double.parseDouble(scanner.nextLine());

                if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                    throw new TriangleExeption("Cạnh phải lớn hơn 0 ");
                }
                if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                    throw new TriangleExeption("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
                }
            } catch (NumberFormatException e) {
                System.err.println("Cạnh phải là số");
            } catch (TriangleExeption e) {
                System.err.println(e.getMessage());
            }
        } while (side1 <= 0 || side2 <= 0 || side3 <= 0 ||
                side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1);
    }
}
