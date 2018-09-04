package grocery;

import java.util.ArrayList;
import java.util.Scanner;

public class GrocerySystem {

    // Making ArrayList for objects


    static ArrayList<GroceryItemOrder> groceryItemList = new ArrayList<GroceryItemOrder>();


    // Initialising

    public static void initGroceryItemList()
    {
       FileHandler file = new FileHandler();

        Scanner input = new Scanner(file.readFile("GroceryItemData.txt"));

        while (input.hasNextLine())
        {
            String fileLine = input.nextLine();
            Scanner item = new Scanner(fileLine);
            System.out.println("---------------------------------");
            int quantity = item.nextInt();
            System.out.println("---------------------------------");
            int pricePrItem = item.nextInt();
            System.out.println("---------------------------------");
            String nameTemp = item.nextLine();
            String name = nameTemp.substring(1,nameTemp.length());

            groceryItemList.add(new GroceryItemOrder(quantity, pricePrItem, name));
        }
    }

    // Show list of all reservations

    public static void printGroceryItemList()
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
