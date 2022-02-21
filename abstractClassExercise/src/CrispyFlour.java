import java.time.LocalDate;

public class CrispyFlour extends Material{
    private int quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    double getAmount() {
        double getAmount = quantity * getCost();
        return getAmount;
    }

    @Override
    LocalDate getExpiryDate() {
        LocalDate getExpiryDate = getManufacturingDate();
        return getExpiryDate;
    }
}
