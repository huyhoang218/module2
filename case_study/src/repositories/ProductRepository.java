package repositories;

import models.modelClothing.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private static final String SRC_PRODUCT = "C:\\codegym\\module2\\session\\case_study\\src\\data\\products.csv";
    private static ProductRepository instance;
    private static List<Product> products = new ArrayList<>();

    private ProductRepository() {
    }

    public static ProductRepository getInstance() {
        if (instance == null) {
            instance = new ProductRepository();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.add(product);
        writeProduct(product, true);
    }

    public Product searchByCode(String code) {
        for (Product porduct : products) {
            if (porduct.getCode().equals(code)) {
                return porduct;
            }
        }
        return null;
    }

    public Product checkStock(String code) {
        for (Product product : products) {
            if (product.isStock()) {
                return product;
            }
        }
        return null;
    }

    private void writeProduct(Product product, boolean append) {
        File file = new File(SRC_PRODUCT);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            bufferedWriter.write(product.toString());
            bufferedWriter.newLine();
        } catch (IOException exception) {
            System.err.println("Lỗi ghi File");
        }
    }

    public void writeAllProduct(List<Product> products, boolean append) {
        File file = new File(SRC_PRODUCT);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append))) {
            for (Product product : products) {
                bufferedWriter.write(product.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Lỗi ghi File");
        }
    }

    private void readProduct() {
        File file = new File(SRC_PRODUCT);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                products.add(new Product(temp[0], temp[1], temp[2] ,Double.parseDouble(temp[2]), Integer.parseInt(temp[3])));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File không tìm thấy");
        } catch (IOException e) {
            System.out.println("Lỗi đọc dữ liệu");
        }
    }

    public List<Product> getAll() {
        return new ArrayList<>(products);
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCode().equals(product.getCode())) {
                products.remove(i);
                break;
            }
        }
    }

    public void editProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCode().equals(product.getCode())) {
                products.set(i, product);
                break;
            }
        }
    }


//    public boolean stockProduct(Product product) {
//        if (product.getStock() > 0)
//            return true;
//        else
//            return false;
//    }
}
