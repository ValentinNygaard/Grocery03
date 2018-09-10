package grocery;

// Handles list of grocery items shopped - Array version

public class GroceryList {

    // Initializing

    GroceryItemOrder shoppingList[] = new GroceryItemOrder[10];
    int shoppingListCounter = 0;

    // Add Item to ShoppingList Array

    public void addGroceryItemOrder(GroceryItemOrder newItem){
        shoppingList[shoppingListCounter] = newItem;
        shoppingListCounter ++;
    }

    // Calculate totalCost and print content of shoppingBasket and totalCost

    public double getTotalCost(){
        double totalCost = 0;
        System.out.println("GROCERY SHOPPING BASKET");
        System.out.println();
        System.out.println("  Item                        Item Price  Quantity    Cost");
        System.out.println("------------------------------------------------------------");
        for (int i=0; i<shoppingListCounter; i++)
        {
            totalCost += shoppingList[i].getCost();
            System.out.printf("  ");
            System.out.printf("%-30s",shoppingList[i].getName());
            System.out.printf("%8.2f",shoppingList[i].getPricePrUnit());
            System.out.printf("%10d",shoppingList[i].getQuantity());
            System.out.printf("%8.2f",shoppingList[i].getCost());
            System.out.println();
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
        String output = "";
        for (int i=0; i<shoppingListCounter; i++)
        {
            output += "/n"+shoppingList[i].toStringV3();
        }
        return output;
    };
}
