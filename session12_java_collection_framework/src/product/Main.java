package product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "tv", 100);
        Product product1 = new Product(2, "lap", 200);
        Product product2 = new Product(3, "dt", 100);

        ProductManager productManager = new ProductManager();

        productManager.addProduct(product);
        productManager.addProduct(product1);
        productManager.addProduct(product2);

        productManager.display();
        System.out.println( productManager.findByName("lap"));

        productManager.fixById(2, "latop", 300);
        productManager.delete(1);

        System.out.println("_________________");
        productManager.display();

    }
}
