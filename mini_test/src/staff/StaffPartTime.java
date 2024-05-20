package staff;

public class StaffPartTime extends Staff{
    private int hour;

    public StaffPartTime() {

    }

    public StaffPartTime(int hour) {
        this.hour = hour;
    }

    public StaffPartTime(int code, String name, int age, String phone, String email, int hour) {
        super(code, name, age, phone, email);
        this.hour = hour;
    }

    @Override
    public double getRealSalary() {
        return hour * 100000;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
