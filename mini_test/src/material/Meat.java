package material;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Meat extends Material{
    private double weight;

    public Meat() {}

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getRealMoney() {
        long dayExpiry = DAYS.between(LocalDate.now(), getExpiryDate());
        if (dayExpiry <= 5) {
            return getAmount() * 0.7;
        }
        return getAmount() * 0.9;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
