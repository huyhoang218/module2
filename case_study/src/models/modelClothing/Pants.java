package models.modelClothing;

public class Pants extends Product {
    private String type;

    public Pants(String id,String name, String size, double price, int stock, String type) {
        super(id,name, size, price, stock);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", type=" + type + '}';
    }
}
