package grocery;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryItemOrderHandler {

    // Making ArrayList for objects

    static ArrayList<GroceryItemOrder> groceryItemList = new ArrayList<GroceryItemOrder>();

    // Initialising

    public static void initGroceryItemList()
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

    // Show list of all reservations

    public static void printGroceryItemList()
    {
        System.out.println("GROCERY ITEMS");
        System.out.println();
        System.out.println("  #  Name                     Price pr item");
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
