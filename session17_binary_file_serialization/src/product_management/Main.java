package product_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management("C:\\codegym\\module2\\session\\session17_binary_file_serialization\\src\\product_management\\testProduct.csv");

        while (true) {
            System.out.println("1. Add product");
            System.out.println("2. Display product");
            System.out.println("3. Search product");
            System.out.println("4. Exit");
            System.out.println("Enter a choose: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1: {
                    System.out.println("Enter code: ");
                    String code = scanner.nextLine();
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter item: ");
                    String item = scanner.nextLine();
                    System.out.println("Enter describe: ");
                    String describe = scanner.nextLine();
                    management.addProduct(new Product(code, name, price, item, describe));
                }
            }
        }
    }
}
