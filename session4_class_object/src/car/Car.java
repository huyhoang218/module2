package car;

public class Car {
    private String name;
    private String engine;
    public static int numberCar;

    public Car (String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberCar++;
    }
}
