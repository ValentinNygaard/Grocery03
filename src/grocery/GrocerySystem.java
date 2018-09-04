package grocery;

import java.util.ArrayList;
import java.util.Scanner;

public class GrocerySystem {

    // Making ArrayList for objects


    static ArrayList<GroceryItemOrder> groceryItemList = new ArrayList<GroceryItemOrder>();

    // Making pointer ArrayList for objects

    static ArrayList<UserO> userA = new ArrayList<UserO>();

    // Initialising - Reading from file and generating user objects

    public static void initData()
    {
        FileHandler fileIO = new FileHandler();

        Scanner input = new Scanner(fileIO.readFile("dataUser.txt"));

        while (input.hasNextLine())
        {
            String fileLine = input.nextLine();
            Scanner item = new Scanner(fileLine);
            int userID = item.nextInt();
            int userPwd = item.nextInt();
            String userName = item.nextLine();
            userName = userName.substring(1,userName.length());
            userA.add(new UserO(userID,userPwd,userName));
        }
    }


    // Initialising

    public static void initGroceryItemList()
    {
       FileHandler file = new FileHandler();

        Scanner input = new Scanner(file.readFile("groseryItemData.txt"));

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
        System.out.println("#  Name             Price pr item");
        System.out.println("-------------------------------------------------------------------");
        for (int i=0; i<groceryItemList.size(); i++)
        {
            System.out.printf("%5d",(i+1));
            System.out.printf("%20s",groceryItemList.get(i).getName());
            System.out.printf("%.2f",groceryItemList.get(i).getPricePrUnit());
            System.out.println();
        }
        System.out.println();
    }

    // Show list of users

    public static void showUserList()
    {
        System.out.println("LIST OF SYSTEM USERS: ");
        System.out.println();
        for (int i=0; i<3; i++)
        {
            System.out.println(userA.get(i).getUserID() + " - " + userA.get(i).getUserPwd() + " - " + userA.get(i).getUserName());
        }
        System.out.println();
    }



}
