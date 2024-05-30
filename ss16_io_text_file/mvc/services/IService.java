package session8_cleancode.mvc.services;

import session8_cleancode.mvc.models.Person;
import session8_cleancode.mvc.models.Student;

import java.util.List;

//T, N, K, V, E
public interface IService<T extends Person> {

    boolean add(T t);

    List<T> getAll();

    T findByCode(int code);

    void removeStudent(T student);

    boolean update(T t);

    List<T> searchByName(String name);
}
