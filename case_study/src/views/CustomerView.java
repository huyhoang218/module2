package views;

import models.modelPerson.Customer;
import java.util.Scanner;

public class CustomerView {
    private CustomerView() {}

    private static CustomerView instance;

    public synchronized static CustomerView getInstance() {
        if(instance == null) {
            instance = new CustomerView();
        }
        return instance;
    }

    public int view() {
        System.out.println("------------Customer View------------");
        System.out.println("");

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

    public Customer viewOperation() {
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
        } while (age <= 0);
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();

        return new Customer(id, name, age, address, phone);
    }
}
