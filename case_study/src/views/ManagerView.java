package views;

import java.util.Scanner;

public class ManagerView {
    private static ManagerView instance;

    private ManagerView() {}

    public synchronized static ManagerView getInstance() {
        if (instance == null) {
            instance = new ManagerView();
        }
        return instance;
    }

    public int managerView() {
        System.out.println("-----------------Manger View-----------------");
        System.out.println("1. Employee Manager");
        System.out.println("2. Product Management");
        System.out.println("0. Exit");

        Scanner scanner = new Scanner(System.in);
        int option = -1;

        do {
            try {
                System.out.println("Enter a option: ");
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Option phải là số!");
            } catch (Exception e) {
                System.err.println("Lỗi khác");
            }
        } while (option < 0 || option > 3);

        return option;
    }
}
