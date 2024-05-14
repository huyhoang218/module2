package circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5, "blue");
        System.out.println(circle);
        System.out.println("Area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(4.2, "red", 3);
        System.out.println(cylinder);
        System.out.println("Volume = " + cylinder.getVolume());
    }
}

