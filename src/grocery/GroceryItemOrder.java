package grocery;

public class GroceryItemOrder {

    private int quantity;
    private double pricePrUnit;
    private String name;

    GroceryItemOrder(int quantity, double pricePrUnit,String name) {
        this.quantity = quantity;
        this.pricePrUnit = pricePrUnit;
        this.name = name;
    }

    public double getCost() {
        return quantity*pricePrUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePrUnit() {
        return pricePrUnit;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePrUnit(double pricePrUnit) {
        this.pricePrUnit = pricePrUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " " + quantity + " " + getCost();
    }

}
