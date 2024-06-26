package mvc_student.services.interfaceService;

import mvc_student.model.Person;
import mvc_student.model.Student;

import java.util.List;

public interface IService<T extends Person> {
    boolean add(T student);

    List<T> getALL();

    T searchByCode(int code);

    void removeStudent(T student);

    List<T> searchByName(String name);

    void editStudent(T student);
}
