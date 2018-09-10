package grocery;

// Model for grocery item data + simple cost calc method

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

    public String toStringV2(){
        return String.format("%-30s%8.2f", name, pricePrUnit);
    }
    public String toStringV3(){
        return String.format("%-30s%8.2f%10d%8.2f", name, pricePrUnit, quantity, getCost());
    }

}
