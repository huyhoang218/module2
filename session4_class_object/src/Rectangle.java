import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double w = input.nextDouble();
        double h = input.nextDouble();

        Rectangle rec = new Rectangle(w, h);

        System.out.println(rec.display());
        System.out.println("area is: " + rec.getArea());
        System.out.println("perimeter is : " + rec.getPerimeter());
    }
}
