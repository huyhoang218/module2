package car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "TwinPower Turbo");
        System.out.println("Number of car: " + Car.numberCar);

        Car car2 = new Car("Mercedes", "Mild-Hybrid");
        System.out.println("Number of car: " + Car.numberCar);
    }
}
