package models.modelClothing;

public class Product {
    private String code;
    private String name;
    private String size;
    private double price;
    private int stock;

    public Product(String code,String name , String size, double price, int stock) {
        this.code = code;
        this.name = name;
        this.size = size;
        this.price = price;
        this.stock = stock;
    }

    public boolean isStock() {
        return stock > 0;
    }

    @Override
    public String toString() {
        return "code = " + code + ", name = " + name + ", size = " + size + ", price = " + price + ", stock " + stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
