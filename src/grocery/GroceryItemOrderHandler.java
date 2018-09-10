package grocery;

// Handling collection of Grocery Items - Reading data from file with help of FileHandler Class

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryItemOrderHandler {

    // Making ArrayList for Grocery Item objects

    ArrayList<GroceryItemOrder> groceryItemList = new ArrayList<GroceryItemOrder>();

    // Filling ArrayList with Grocery object Items and loading object content from file

    public void initGroceryItemList()
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
            String name = nameTemp.substring(1,nameTemp.length());

            groceryItemList.add(new GroceryItemOrder(quantity,pricePrItem,name));
        }
    }

    // Print list of Grocery Items

    public void printGroceryItemList()
    {
        System.out.println("GROCERY ITEMS LIST ");
        System.out.println();
        System.out.println("  #  Item                        Item price");
        System.out.println("---------------------------------------------");
        for (int i=0; i<groceryItemList.size(); i++)
        {
            System.out.printf("%3d",(i+1));
            System.out.printf("  ");
            System.out.printf("%-30s",groceryItemList.get(i).getName());
            System.out.printf("%8.2f",groceryItemList.get(i).getPricePrUnit());
            System.out.println();
        }
        System.out.println();
    }

}
