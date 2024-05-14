package geometric;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.setFilled("black");
        circle.setColor("red");

        System.out.println(" a circle " + circle.toString());
        System.out.println("the radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        circle.printCircle();
        System.out.println();

        Rectangle rectangle = new Rectangle(2, 4);
        rectangle.setFilled("blue");
        rectangle.setColor("green");

        System.out.println("a rectangle " + rectangle.toString());
        System.out.println("the area is " + rectangle.getArea());

    }
}