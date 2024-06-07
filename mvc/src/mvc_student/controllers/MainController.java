package mvc_student.controllers;

import mvc_student.model.Student;
import mvc_student.services.implement.StudentService;
import mvc_student.services.interfaceService.IStudentService;
import mvc_student.views.StudentView;

import java.util.List;

public class MainController {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        IStudentService studentService = new StudentService();

        int choice;
        Student student;
        List<Student> students;
        boolean result;
        int code;
        String name;

        while (true) {
            choice = studentView.view();
            switch (choice) {
                case 1: {
                    try {
                        student = studentView.viewOperation();
                        result = studentService.add(student);
                        studentView.viewMessage(result);
                        break;
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                case 2: {
                    code = studentView.inputCode();
                    student = studentService.searchByCode(code);

                    if (student == null) {
                        studentView.viewMessage(false);
                    } else {
                        Student newStudent;
                        newStudent = studentView.viewOperation();
                        if (student.getCode() == newStudent.getCode()) {
                            studentService.editStudent(newStudent);
                            studentView.viewMessage(true);
                        } else {
                            studentView.viewMessage(false);
                            throw new IllegalArgumentException("Code không được thay đổi");
                        }
                    }
                    break;
                }
                case 3: {
                    code = studentView.inputCode();
                    student = studentService.searchByCode(code);
                    if (student == null) {
                        studentView.viewMessage(false);
                    } else {
                        boolean isConfirm = studentView.confirmDelete(student);
                        if (isConfirm) {
                            studentService.removeStudent(student);
                            studentView.viewMessage(true);
                        }
                    }
                    break;
                }
                case 4: {
                    students = studentService.getALL();
                    studentView.displayAllStudent(students);
                    break;
                }
                case 5: {
                    name = studentView.inputName();
                    students = studentService.searchByName(name);
                    if (students.isEmpty()) {
                        studentView.viewMessage(false);
                    } else {
                        studentView.displayAllStudent(students);
                        studentView.viewMessage(true);
                    }
                    break;
                }
                case 0:
                    return;
            }
        }
    }
}
