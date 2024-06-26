package shape;

import shape.resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        setColor(color);
        setFilled(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 2 * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() +
                ", which is a subclass of " +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println(getArea() + (getArea() * percent / 100));
    }
}
