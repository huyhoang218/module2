package models.modelPerson;

public class Customer extends Person {
    private String phone;

    public Customer() {}

    public Customer(int id, String name, int age, String address, String phone) {
        super(id, name, age, address);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return super.toString() + ", Phone = " + getPhone();
    }
}
