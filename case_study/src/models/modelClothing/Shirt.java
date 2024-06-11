package models.modelClothing;

public class Shirt extends Product {
    private String collarType;

    public Shirt(String id,String name ,String size, double price, int stock, String collarType) {
        super(id,name, size, price, stock);
        this.collarType = collarType;
    }

    public String getCollarType() {
        return collarType;
    }

    public void setCollarType(String collarType) {
        this.collarType = collarType;
    }

    @Override
    public String toString() {
        return super.toString() + ", collarType=" + collarType + '}';
    }
}
