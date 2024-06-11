package views;

import models.modelClothing.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private ProductView() {
    }

    private static ProductView instance;

    public synchronized static ProductView getInstance() {
        if (instance == null) {
            instance = new ProductView();
        }
        return instance;
    }

    public int view() {
        System.out.println("-------------------------Product View-------------------------");
        System.out.println("1. Add Product");
        System.out.println("2. Edit Product");
        System.out.println("3. Delete Product");
        System.out.println("4. Display All Product");
        System.out.println("5. Check Stock");
        System.out.println("0. Exit");

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

    public String inputCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product id that needs editing: ");
        return scanner.nextLine();
    }

    public Product viewOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter code: ");
        String code = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter size: ");
        String size = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter stock: ");
        int stock = Integer.parseInt(scanner.nextLine());

        return new Product(code,name, size, price, stock);
    }

    public void displayAllProduct(List<Product> products) {
        System.out.println("List Product:");
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public boolean confirmDelete(Product product) {
        System.out.println("Bạn có muốn xóa product có code là " +
                product.getCode() + " tên là " + product.getName() +
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

    public void showStockProduct(Product product) {
        System.out.println(product.toString());
    }

    public void productSoldOut(Product product) {
        System.out.println(product.getName() + " is sold out");
    }
}
