package mvc.repositories;

import mvc.model.Student;
import mvc.views.StudentView;

public class StudentRepository {
    private static Student[] students = new Student[100];
    private static int count = 0;
    static {
        students[0] = new Student(12, "Hoang", "Nam Dinh", "c03");
        students[1] = new Student(21, "Huy", "Ha Noi", "c02");
        students[2] = new Student(30, "Dao", "HCM", "c01");
        count = 3;
    }

    public void add(Student student) {
        students[count] = student;
        count++;
    }

    public static void edit(Student student) {
        StudentView studentView = new StudentView();
        int editCode = studentView.viewEdit();

        for (int i = 0; i < count; i++) {
            if(students[i].getCode() == editCode) {
                students[i] = student;
                break;
            }
        }
    }

    public Student[] coppy() {
        Student[] studentCoppy = new Student[count];
        for (int i = 0; i < count; i++) {
            studentCoppy[i] = students[i];
        }
        return studentCoppy;
    }
}
