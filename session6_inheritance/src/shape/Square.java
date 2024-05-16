package shape;

import shape.colorable.Colorable;
import shape.resizeable.Resizeable;

public class Square extends Rectangle implements Colorable {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double heigth) {
        setSide(heigth);
    }

    @Override
    public String toString() {
        return "A square with side = " +
                getSide() +
                ", which is a subclass of " +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println(getArea() + (getArea() * percent / 100));
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
