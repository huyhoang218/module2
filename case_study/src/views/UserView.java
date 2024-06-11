package views;

import models.User;

import java.util.Scanner;

public class UserView {
    private static UserView instance;

    private UserView() {}

    public synchronized static UserView getInstance() {
        if (instance == null) {
            instance = new UserView();
        }
        return instance;
    }

    public User registerView() {
        System.out.println("-------------------View Register-------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        return new User(username, password, email);
    }

    public int view() {
        System.out.println("-------------------View User-------------------");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);
        int choose = -1;
        do {
            try {
                System.out.print("Choose an option: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Choose phải là số");
            }
        } while (choose < 0 || choose > 2);
        return choose;
    }

    public User loginView() {
        System.out.println("-------------------View Login-------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        return new User(username, password, "daohuyhoang@gmail.com");
    }
}
