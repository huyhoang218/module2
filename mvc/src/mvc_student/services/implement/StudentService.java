package mvc_student.services.implement;

import mvc_student.model.Student;
import mvc_student.repositories.StudentRepository;
import mvc_student.services.interfaceService.IStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();

    @Override
    public boolean add(Student student) {
        if (student.getName().equals("")) return false;
        if (student.getCode() < 0 || student.getCode() > 1000000) return false;
        studentRepository.addStudent(student);
        return true;
    }

    @Override
    public List<Student> getALL() {
        return studentRepository.getAll();
    }

    @Override
    public Student searchByCode(int code) {
        return studentRepository.searchByCode(code);
    }

    @Override
    public void removeStudent(Student student) {
        studentRepository.removeStudent(student);
    }

    @Override
    public List<Student> searchByName(String name) {
        List<Student> students = this.getALL();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        int left = 0;
        int right = students.size() - 1;
        List<Student> result = new ArrayList<>();

        while (left <= right) {
            int mid = (left + right) / 2;
            if (students.get(mid).getName().contains(name)) {
                result.add(students.get(mid));
                return result;
            } else if (students.get(mid).getName().compareTo(name) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    @Override
    public void editStudent(Student student) {
        studentRepository.editStudent(student);
    }
}
