package session8_cleancode.mvc.services.impl;

import session8_cleancode.mvc.models.Student;
import session8_cleancode.mvc.repositories.StudentRepository;
import session8_cleancode.mvc.services.IStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();
    @Override
    public boolean add(Student student) {
//        Kiểm tra dữ liệu
        if(student.getName().equals("")) {
            return false;
        }
        if(student.getCode() <0 || student.getCode()>1000000) {
            return false;
        }
        studentRepository.add(student);
        return true;
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public Student findByCode(int code) {
        return studentRepository.findByCode(code);
    }


    @Override
    public void removeStudent(Student student) {
        studentRepository.removeStudent(student);
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public List<Student> searchByName(String name) {
        List<Student> students = this.getAll();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getPoint() - o2.getPoint();
                return o1.getName().compareTo(o2.getName());
            }
        });
        int left = 0;
        int right = students.size() - 1;
        List<Student> result = new ArrayList<>();
        while (left<=right) {
            int mid = (left+right)/2;
            if(students.get(mid).getName().contains(name)) {
                result.add(students.get(mid));
            }else if(students.get(mid).getName().compareTo(name) < 0) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return result;
    }
}
