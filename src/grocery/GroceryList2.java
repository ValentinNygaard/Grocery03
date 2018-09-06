package grocery;

import java.util.ArrayList;

public class GroceryList2 {

    // Initializing

    ArrayList<GroceryItemOrder> shoppingList = new ArrayList<GroceryItemOrder>();
    int shoppingListCounter = 0;

    // Add Item to ShoppingList ArrayList

    public void addGroceryItemOrder(GroceryItemOrder newItem){
        shoppingList.add(newItem);
        shoppingListCounter ++;
    }

    // Calculate totalCost and print content of shoppingBasket and totalCost

    public void getTotalCost(){
        double totalCost = 0;
        System.out.println("GROCERY SHOPPING BASKET");
        System.out.println();
        System.out.println("  Item                        Item Price  Quantity    Cost");
        System.out.println("------------------------------------------------------------");
        for (int i=0; i<shoppingListCounter; i++)
        {
            totalCost += shoppingList.get(i).getCost();
            System.out.printf("  ");
            System.out.printf("%-30s",shoppingList.get(i).getName());
            System.out.printf("%8.2f",shoppingList.get(i).getPricePrUnit());
            System.out.printf("%10d",shoppingList.get(i).getQuantity());
            System.out.printf("%8.2f",shoppingList.get(i).getCost());
            System.out.println();
        }
        //System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.print("  Total cost");
        System.out.printf("%46.2f",totalCost);
        System.out.println();
        System.out.println();
    }
}
