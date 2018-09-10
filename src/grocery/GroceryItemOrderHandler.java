package grocery;

// Handling collection of Grocery Items - Reading data from file with help of FileHandler Class

import java.util.ArrayList;
import java.util.Scanner;

class GroceryItemOrderHandler {

    // Making ArrayList for Grocery Item objects

    ArrayList<GroceryItemOrder> groceryItemList = new ArrayList<>();

    // Filling ArrayList with Grocery object Items and loading object content from file

    void initGroceryItemList()
    {
        FileHandler file = new FileHandler();

        Scanner input = new Scanner(file.readFile("groceryItemData.txt"));

        while (input.hasNextLine())
        {
            String fileLine = input.nextLine();
            Scanner item = new Scanner(fileLine);
            int quantity = item.nextInt();
            double pricePrItem = item.nextDouble();
            String nameTemp = item.nextLine();
            String name = nameTemp.substring(1);

            groceryItemList.add(new GroceryItemOrder(quantity,pricePrItem,name));
        }
    }

    // Print list of Grocery Items

    void printGroceryItemList()
    {
        System.out.println("GROCERY ITEMS LIST ");
        System.out.println();
        System.out.println("  #  Item                        Item price");
        System.out.println("---------------------------------------------");
        for (int i=0; i<groceryItemList.size(); i++)
        {
            System.out.printf("%3d",(i+1));
            System.out.print("  ");
            System.out.print(groceryItemList.get(i).toStringV2());
            System.out.println();
        }
        System.out.println();
    }

}