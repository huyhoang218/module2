package mvc.views;

import mvc.model.Student;
import mvc.repositories.StudentRepository;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class StudentView {
    public int view() {
        System.out.println("------------Student View------------");
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Display all Student");
        System.out.println("0. End program");
        System.out.print("Input your choice: ");
        Scanner input = new Scanner(System.in);
        int choice = Integer.parseInt(input.nextLine());

        return choice;
    }

    public Student viewAdd() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input code: ");
        int code = Integer.parseInt(input.nextLine());
        System.out.print("Input name: ");
        String name = input.nextLine();
        System.out.print("Input address: ");
        String address = input.nextLine();
        System.out.print("Input class room: ");
        String classRoom = input.nextLine();

        Student student = new Student(code, name, address, classRoom);
        return student;
    }

    public void viewMessage(boolean result) {
        if(result) {
            System.out.println("Added successfully");
        } else {
            System.out.println("Add new failed");
        }
    }

    public int viewEdit() {
        System.out.println("Sửa thông tin sinh viên theo code");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập code sinh sinh viên cần sửa: ");
        int codeEdit = Integer.parseInt(input.nextLine());

        return codeEdit;
    }

    public Student viewEditInfo() {
        Scanner input = new Scanner(System.in);
        viewEdit();

        System.out.print("Input name edit: ");
        String nameEdit = input.nextLine();
        System.out.print("Input address edit: ");
        String addressEdit = input.nextLine();
        System.out.print("Input class room: ");
        String classRoomEdit = input.nextLine();

        Student student = new Student(viewEdit(), nameEdit, addressEdit, classRoomEdit);
        return student;
    }

    public void viewEditResult(boolean result) {
        if (result) System.out.println("Chỉnh sửa thành công");
        else System.out.println("Chỉnh sửa thất bại");
    }

    public void viewStudent() {
//        Student[] student = coppy();
        StudentRepository studentRepository = new StudentRepository();
        System.out.println(Arrays.toString(studentRepository.coppy()));
    }
}
