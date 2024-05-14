package student;

public class Student {
    private int rollno;
    private String name;
    private static String college = "Back khoa";

    Student (int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change() {
        college = "Kinh te";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
