package point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.4f, 3.4f);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(2f, 2.5f, 5f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D.toString());

        MoveablePoint movePoint = new MoveablePoint(3.0f,4.2f,5.6f,8.5f);
        System.out.println(movePoint);
        System.out.println(movePoint.move());
    }
}
