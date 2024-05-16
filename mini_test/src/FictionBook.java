public class FictionBook extends Book{
    private String cateGory;

    public FictionBook() {
    }

    public FictionBook(int bookCode, String name, double price, String author, String cateGory) {
        super(bookCode, name, price, author);
        this.cateGory = cateGory;
    }

    @Override
    public double getAmount() {
        return getPrice() * 0.93;
    }

    public String getCateGory() {
        return cateGory;
    }

    public void setCateGory(String cateGory) {
        this.cateGory = cateGory;
    }
}
