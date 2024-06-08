package services;

import models.Person;
import java.util.List;

public interface IService<T extends Person>{
    boolean add(T employee);

    List<T> getAll();

    T searchById(int code);

    void removeEmployee(T employee);

    boolean editEmployee(T newEmployee);

    List<T> searchByName(String name);
}
