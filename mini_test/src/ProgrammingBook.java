public class ProgrammingBook extends Book{
    private String language;
    private String frameWork;

    public ProgrammingBook() {
    }

    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String frameWork) {
        super(bookCode, name, price, author);
        this.language = language;
        this.frameWork = frameWork;
    }

    @Override
    public double getAmount() {
        return getPrice() * 0.95;
    }

    public String getLanguage() {
        return language;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }

}
