package product;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void fixById(int id, String newName, double newPrice) {
        for (Product product : products) {
            if(id == product.getId()) {
                product.setName(newName);
                product.setPrice(newPrice);
                break;
            }
        }
    }

    public void delete(int id) {
        for (Product product : products) {
            if (id == product.getId()) {
                products.remove(product);
                break;
            }
        }
    }

    public Product findByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void display() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
