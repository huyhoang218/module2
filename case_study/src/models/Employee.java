package models;

public class Employee extends Person{
    private int day;

    public Employee() {}

    public Employee(int id, String name, int age, String address, int day) {
        super(id, name, age, address);
        this.day = day;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary = " + getSalary();
    }

    public double getSalary() {
        return day * 100000;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
