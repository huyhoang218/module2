package triangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TriangleExeption {
        Scanner scanner = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        try {
            System.out.println("side 1: ");
            side1 = Double.parseDouble(scanner.nextLine());
            System.out.println("side 2: ");
            side2 = Double.parseDouble(scanner.nextLine());
            System.out.println("side 3: ");
            side3 = Double.parseDouble(scanner.nextLine());

            Triangle triangle = new Triangle(side1, side2, side3);

        } catch (NumberFormatException e) {
            System.err.println("Cạnh phải là số");
        }
    }
}
