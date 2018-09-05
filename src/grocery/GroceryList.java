package grocery;

public class GroceryList {

    static GroceryItemOrder shoppingList[] = new GroceryItemOrder[10];
    static int shoppingListCounter = 0;

    public void addGroceryItemOrder(GroceryItemOrder newItem){
        shoppingList[shoppingListCounter] = newItem;
        shoppingListCounter ++;
    }

    public static void getTotalCost(){
        double totalCost = 0;
        System.out.println("GROCERY SHOPPING BASKET");
        System.out.println();
        System.out.println("  #  Name                        Item Price  Quantity   Price");
        System.out.println("---------------------------------------------------------------");
        for (int i=0; i<shoppingListCounter; i++)
        {
            totalCost += shoppingList[i].getCost();
            System.out.printf("%3d",(i+1));
            System.out.printf("  ");
            System.out.printf("%-30s",shoppingList[i].getName());
            System.out.printf("%8.2f",shoppingList[i].getPricePrUnit());
            System.out.printf("%7d",shoppingList[i].getQuantity());
            System.out.printf("%8.2f",shoppingList[i].getCost());
            System.out.println();
        }
        //System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.print("Total cost");
        System.out.printf("%55.2f",totalCost);
        System.out.println();
    }
}
