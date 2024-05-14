package student2;

public class Student2 {
    private String name = "Hoang";
    private String classes = "C03";

    Student2() {}

    protected void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}

 class Test {
    public static void main(String[] args) {
        Student2 s2 = new Student2();
        s2.setName("huy");
        s2.setClasses("C02");

    }
}
