package mvc.services;

import mvc.model.Student;

public interface IStudentService {
    boolean add(Student student);
    boolean edit(Student student);
}
