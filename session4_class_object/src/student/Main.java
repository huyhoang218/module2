package student;

public class Main {
    public static void main(String[] args) {
        Student.change();

        Student student1 = new Student(111, "Hoang");
        Student student2 = new Student(222, "Huy");
        Student student3 = new Student(333, "Dao");

        student1.display();
        student2.display();
        student3.display();
    }
}
