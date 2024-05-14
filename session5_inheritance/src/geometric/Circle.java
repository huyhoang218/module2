package geometric;

public class Circle extends Geometric {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("the " + getColor() + " circle is created with the radius is " + radius);
    }
}
