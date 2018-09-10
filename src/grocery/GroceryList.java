package grocery;

// Handles list of grocery items shopped - Array version

public class GroceryList {

    // Initializing

    private GroceryItemOrder shoppingList[] = new GroceryItemOrder[10];
    private int shoppingListCounter = 0;

    // Add Item to ShoppingList Array

    void addGroceryItemOrder(GroceryItemOrder newItem){
        shoppingList[shoppingListCounter] = newItem;
        shoppingListCounter ++;
    }

    // Calculate totalCost and print content of shoppingBasket and totalCost

    double getTotalCost(){
        double totalCost = 0;
        System.out.println("GROCERY SHOPPING BASKET");
        System.out.println();
        System.out.println("  Item                        Item Price  Quantity    Cost");
        System.out.println("------------------------------------------------------------");
        for (int i=0; i<shoppingListCounter; i++)
        {
            totalCost += shoppingList[i].getCost();
            System.out.println("  " + shoppingList[i].toStringV3());
        }
        //System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.print("  Total cost");
        System.out.printf("%46.2f",totalCost);
        System.out.println();
        System.out.println();
        return totalCost;
    }
    public String toString(){
        StringBuilder output = new StringBuilder();
        for (int i=0; i<shoppingListCounter; i++)
        {
            output.append("/n").append(shoppingList[i].toStringV3());
        }
        return output.toString();
    }

    int getShoppingListCounter() {
        return shoppingListCounter;
    }
}
