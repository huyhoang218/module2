package mvc_student.repositories;

import mvc_student.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Hoang", "Nam Dinh", "C03"));
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAll() {
        List<Student> result = new ArrayList<>();
        result.addAll(students);
        return result;
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCode() == student.getCode()) {
                students.remove(i);
                break;
            }
        }
    }

    public Student searchByCode(int code) {
        for (Student student : students) {
            if (student.getCode() == code) {
                return student;
            }
        }
        return null;
    }
}
