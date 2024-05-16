package shape.colorable;

import shape.Shape;
import shape.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[1];
        shape[0] = new Square();

        Square square = (Square) shape[0];
        square.howToColor();
    }
}
