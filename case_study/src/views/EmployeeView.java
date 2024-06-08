package views;

import models.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static EmployeeView instance;

    private EmployeeView() {
    }

    public synchronized static EmployeeView getInstance() {
        if (instance == null) {
            instance = new EmployeeView();
        }
        return instance;
    }
    public int view() {
        System.out.println("------------Employee View------------");
        System.out.println("1. Add Employee");
        System.out.println("2. Edit Employee");
        System.out.println("3. Delete Employee");
        System.out.println("4. Display All Employee");
        System.out.println("5. Search Employee By Name");
        System.out.println("0. End program");

        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter a choice: ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Choice phải là số!");
            } catch (Exception e) {
                System.err.println("Lỗi khác");
            }

        } while (choice < 0 || choice > 5);

        return choice;
    }

    public Employee viewOperation() {
        Scanner scanner = new Scanner(System.in);
        int id = -1;

        do {
            try {
                System.out.print("Enter Id: ");
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Id phải là số nguyên dương");
            }
        } while (id <= 0);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        int age = -1;

        do {
            try {
                System.out.print("Enter Age: ");
                age = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Age phải là số nguyên dương");
            }
        } while (age < 18 || age > 40);
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        int day = -1;
        do {
            try {
                System.out.print("Enter work day: ");
                day = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Day phải là số nguyên dương");
            }
        } while (day < 0 || day > 31);

        return new Employee(id, name, age, address, day);
    }

    public void displayAllEmployee(List<Employee> employees) {
        System.out.println("List Employee:");

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public void showNotification(boolean result) {
        if (result) {
            System.out.println("Successful task");
        } else {
            System.out.println("Task failed");
        }
    }

    public int inputID() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee id that needs editing: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public boolean confirmDelete(Employee employee) {
        System.out.println("Bạn có muốn xóa nhân viên có id là " +
                employee.getId() + " tên là " + employee.getName() +
                ". Bấm Yes để xác nhận, No để hủy");
        Scanner scanner = new Scanner(System.in);
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("Yes"))
            return true;
        else {
            System.out.println("Task failed");
            return false;
        }
    }

    public String inputName() {
        System.out.print("Enter name search: ");
        return new Scanner(System.in).nextLine();
    }
}
