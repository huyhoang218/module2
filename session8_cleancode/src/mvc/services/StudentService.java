package mvc.services;

import mvc.model.Student;
import mvc.repositories.StudentRepository;
import mvc.views.StudentView;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();

    @Override
    public boolean add(Student student) {
        if (student.getName().equals("")) return false;
        if (student.getCode() < 0 || student.getCode() > 1000000) return false;
        studentRepository.add(student);
        return true;
    }

//    private StudentView studentView = new StudentView();
    @Override
    public boolean edit(Student student) {
//        for (Student i : student) {
//            if (i.getCode() == studentView.viewEdit()) {
//                return false;
//            }
//        }
        if (student.getName().equals("")) return false;
        if (student.getCode() < 0 || student.getCode() > 1000000) return false;
        studentRepository.edit(student);
        return true;
    }
}
