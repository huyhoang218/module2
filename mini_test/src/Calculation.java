public interface Calculation {
    default double calculationFrice(Book b) {
        return 1 - b.getAmount();
    }
}
