package shape;

import java.util.Scanner;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("blue", false, 4.25);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3, 4, "black", false);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(3.5, "yellow", false);
        System.out.println(square);

        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();
        double side1, side2, side3;
        do {
//            System.out.print("enter side 1: ");
//            triangle.setSide1(input.nextDouble());
//            System.out.print("enter side 2: ");
//            triangle.setSide2(input.nextDouble());
//            System.out.print("enter side 3: ");
            System.out.print("fill side1 : ");
            side1 = input.nextDouble();
            System.out.print("fill side2 : ");
            side2 = input.nextDouble();
            System.out.print("fill side3 : ");
            side3 = input.nextDouble();
        } while (!isTriangle(side1, side2, side3));

        input.nextLine();
        System.out.print("enter color: ");
        triangle.setColor(input.nextLine());
        System.out.print("enter fill true or false: ");
        triangle.setFilled(input.nextBoolean());
        System.out.println(triangle);
    }

    public static boolean isTriangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }
}