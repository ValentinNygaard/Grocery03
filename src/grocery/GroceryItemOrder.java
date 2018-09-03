package grocery;

public class GroceryItemOrder {

    private String name;
    private int quantity;
    private double pricePrUnit;

    public GroceryItemOrder(String name, int quantity, double pricePrUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePrUnit = pricePrUnit;
    }

    public double getCost() {
        return quantity*pricePrUnit;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePrUnit() {
        return pricePrUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePrUnit(double pricePrUnit) {
        this.pricePrUnit = pricePrUnit;
    }

    public String toString() {
        return name + " " + quantity + " " + getCost();
    }

}
