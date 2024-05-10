import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
        return r2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a ");
        double a = parseDouble(input.nextLine());
        System.out.print("enter b ");
        double b = parseDouble(input.nextLine());
        System.out.print("enter c ");
        double c = parseDouble(input.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("x1 = x2 = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }

}
