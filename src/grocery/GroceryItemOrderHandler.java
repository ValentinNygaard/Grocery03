package grocery;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryItemOrderHandler {

    FileHandler fileIO = new FileHandler();

    // Making ArrayList for objects

    static ArrayList<GroceryItemOrder> groceryItemList = new ArrayList<GroceryItemOrder>();

    // Initialising

    public void initGroceryItemList()
    {
        Scanner input = new Scanner(fileIO.readFile("grocery/GroceryItemData.txt"));

        while (input.hasNextLine())
        {
            String fileLine = input.nextLine();
            Scanner item = new Scanner(fileLine);
            int quantity = item.nextInt();
            int pricePrItem = item.nextInt();
            String name = item.next();

            groceryItemList.add(new GroceryItemOrder(quantity, pricePrItem, name));
        }
    }

    // Show list of all reservations

    public void printGroceryItemList()
    {
        System.out.println("GROCERY ITEMS");
        System.out.println();
        System.out.println("#  Name             Price pr item");
        System.out.println("-------------------------------------------------------------------");
        for (int i=0; i<groceryItemList.size(); i++)
        {
            System.out.printf("%5d",(i+1));
            System.out.printf("%20s",groceryItemList.get(i).getName());
            System.out.printf("%5d",groceryItemList.get(i).getPricePrUnit());
            System.out.println();
        }
        System.out.println();
    }


}
