package mvc_student.views;

import mvc_student.model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    public int view() {
        System.out.println("------------Student View------------");
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Display all Student");
        System.out.println("5. Search student by name");
        System.out.println("0. End program");
        Scanner input = new Scanner(System.in);
        int choice = -1;

        do {
            try {
                System.out.print("Input your choice: ");
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Choice phải là giá trị số!");
            } catch (Exception e) {
                System.err.println("Lỗi khác chưa tìm ra nguyên nhân");
            }
        } while (choice < 0 || choice > 5);

        return choice;
    }

    public Student viewAdd() {
        Scanner input = new Scanner(System.in);
//        System.out.print("Input code: ");
        int code = inputCode();
//        int code = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tên: ");
        String name = input.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = input.nextLine();
        System.out.print("Nhập class room: ");
        String classRoom = input.nextLine();

        Student student = new Student(code, name, address, classRoom);
        return student;
    }

    public void viewMessage(boolean result) {
        if (result) {
            System.out.println("Tác vụ thành công");
        } else {
            System.out.println("Tác vụ thất bại");
        }
    }

    public void displayAllStudent(List<Student> students) {
        System.out.println("Danh sách học sinh:");

        for (Student student : students) {
            System.out.println(infoStudent(student));
        }
    }

    private String infoStudent(Student student) {
        return "Code: " + student.getCode() +
                ", name: " + student.getName() +
                ", address: " + student.getAddress();
    }

    public int inputCode() {
        Scanner scanner = new Scanner(System.in);
        int code = -1;

        do {
            try {
                System.out.print("Nhập code: ");
                code = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Code là số nguyên dương");
            }
        } while (code <= 0);
        return code;
    }

    public boolean confirmDelete(Student student) {
        System.out.println("Bạn có muốn xóa sinh viên có code là " +
                student.getCode() + " tên là " + student.getName() +
                ". Bấm Yes để xác nhận, No để hủy");
        Scanner scanner = new Scanner(System.in);
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("Yes")) {
            return true;
        } else {
            return false;
        }
    }

    public String inputName() {
        System.out.print("Nhập tên người dùng cần tìm: ");
        return new Scanner(System.in).nextLine();
    }
}
