package product_management;

import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String name;
    private double price;
    private String item;
    private String describe;

    public Product() {}

    public Product(String code, String name, double price, String item, String describe) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.item = item;
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", item='" + item + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
