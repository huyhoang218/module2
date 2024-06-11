package services.iServices;

import models.modelPerson.Person;
import services.exception.InvalidNameException;

import java.util.List;

public interface IService<T extends Person>{
    boolean add(T employee) throws InvalidNameException;

    List<T> getAll();

    T searchById(int code);

    void removeEmployee(T employee);

    boolean editEmployee(int id, T newEmployee) throws InvalidNameException;

    List<T> searchByName(String name);
}
