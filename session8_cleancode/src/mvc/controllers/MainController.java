package mvc.controllers;

import mvc.model.Student;
import mvc.services.IStudentService;
import mvc.services.StudentService;
import mvc.views.StudentView;

public class MainController {
    public static void main(String[] args) {
        int choice;
        Student student;
        boolean result;
        int choiceEdit;

        StudentView studentView = new StudentView();
        IStudentService iStudentService = new StudentService();

        while (true) {
            choice = studentView.view();
            switch (choice) {
                case 1: {
                    student = studentView.viewAdd();
                    result = iStudentService.add(student);
                    studentView.viewMessage(result);
                    studentView.viewStudent();
                    break;
                }
                case 2: {
                    student = studentView.viewEditInfo();
                    result = iStudentService.edit(student);
                    studentView.viewEditResult(result);
                    break;
                    }
                case 3:
                case 4: {
                    Student[] students = studentService.getAll();
                }
                case 0:
                    return;
            }
        }
    }
}
