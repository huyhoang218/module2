package session8_cleancode.mvc.services.impl;

import session8_cleancode.mvc.models.Teacher;
import session8_cleancode.mvc.services.ITeacherService;

import java.util.List;

public class TeacherService implements ITeacherService {
    @Override
    public boolean add(Teacher teacher) {
        return false;
    }

    @Override
    public List<Teacher> getAll() {
        return List.of();
    }

    @Override
    public Teacher findByCode(int code) {
        return null;
    }

    @Override
    public void removeStudent(Teacher student) {

    }

    @Override
    public boolean update(Teacher teacher) {
        return false;
    }

    @Override
    public List<Teacher> searchByName(String name) {
        return List.of();
    }
}
