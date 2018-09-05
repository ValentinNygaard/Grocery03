package grocery;

public class GrocerySystem {

    public static void goShopping(){

        System.out.println("WELCOME TO GROCERY SHOPPING");
        System.out.println("---------------------------------------------");
        System.out.println();

        GroceryItemOrderHandler.initGroceryItemList();

        GroceryList shoppingCart = new GroceryList();

        boolean repeatMenu = true;
        do
        {
            GroceryItemOrderHandler.printGroceryItemList();
            System.out.println();
            System.out.print("Enter #id of item to add to shopping cart - Enter 0 to check out: ");
            int menuChoice = InputHandler.getInt(0,4,"Only numbers allowed - Try again: ","Out of range - Try again: "); // Get user input
            System.out.println();

            // Activate user selected menu

            if (menuChoice == 0)
            {
                repeatMenu = false;
            }
            else
            {
                System.out.print("Enter the quantity of the selected item: ");
                int quantityChoice = InputHandler.getInt(0,99,"Only numbers allowed - Try again: ","Out of range - Try again: "); // Get user input
                System.out.println();
                GroceryItemOrderHandler.groceryItemList.get(menuChoice-1).setQuantity(quantityChoice);
                shoppingCart.addGroceryItemOrder(GroceryItemOrderHandler.groceryItemList.get(menuChoice-1));
                GroceryList.getTotalCost();
            }
        }
        while (repeatMenu);
        System.out.print("CHECKOUT");
        System.out.print();
        System.out.print("Enter the quantity of the selected item: ");


    }

}
