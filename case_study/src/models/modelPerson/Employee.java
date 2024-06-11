package models.modelPerson;

public class Employee extends Person {
    private double day;

    public Employee() {}

    public Employee(int id, String name, int age, String address, double day) {
        super(id, name, age, address);
        this.day = day;
    }

    @Override
//    public String toString() {
//        return super.toString() + ", Salary = " + getSalary();
//    }
    public String toString() {
        return super.toString() + "," + getSalary();
    }

    public double getSalary() {
        return day * 100000;
    }

    public double getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
