package shape.resizeable;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        System.out.println("before");

        Circle circle = (Circle) shapes[0];
        Rectangle rectangle = (Rectangle) shapes[1];
        Square square = (Square) shapes[2];

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());

        System.out.println("after");

        circle.resize(ranDom(100));
        rectangle.resize(ranDom(100));
        square.resize(ranDom(100));
    }

    public static double ranDom(double x) {
        return Math.floor(Math.random() * x);
    }
}
