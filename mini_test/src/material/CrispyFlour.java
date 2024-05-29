package material;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.MONTHS;

public class CrispyFlour extends Material{
    private int quantity;

    public CrispyFlour() {}

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getRealMoney() {
        long monthExpiry = MONTHS.between(LocalDate.now(), getExpiryDate());
        if (monthExpiry <= 4) {
            return getAmount() * 0.8;
        }
        return getAmount() * 0.95;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
