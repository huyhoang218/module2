package staff;

public abstract class Staff {
    private int code;
    private String name;
    private int age;
    private String phone;
    private String email;

    public Staff() {

    }

    public Staff(int code, String name, int age, String phone, String email) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public abstract double getRealSalary();

    @Override
    public String toString() {
        return "Staff{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
