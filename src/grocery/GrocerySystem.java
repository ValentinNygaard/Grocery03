package grocery;

public class GrocerySystem {

    public static void goShopping(){

        // Initializing system

        GroceryItemOrderHandler itemHandler = new GroceryItemOrderHandler();
        itemHandler.initGroceryItemList();
        GroceryList2 shoppingCart = new GroceryList2();

        // Entry user message

        System.out.println();
        System.out.println("WELCOME TO THE GROCERY SHOPPING SYSTEM");
        System.out.println("---------------------------------------------");
        System.out.println();

        // Adding items to shopping cart

        boolean repeatAddingToCart = true;
        do
        {
            itemHandler.printGroceryItemList();
            System.out.print("Enter #id of item to add to shopping cart - Enter 0 for Checkout: ");
            int menuChoice = InputHandler.getInt(0,itemHandler.groceryItemList.size(),"Only numbers allowed - Try again: ","Out of range - Try again: "); // Get user input
            System.out.println();
            if (menuChoice == 0)
            {
                repeatAddingToCart = false;
            }
            else
            {
                System.out.print("Enter the quantity of the selected item: ");
                int quantityChoice = InputHandler.getInt(0,99,"Only numbers allowed - Try again: ","Out of range - Try again: "); // Get user input
                System.out.println();
                int index = menuChoice-1;
                itemHandler.groceryItemList.get(index).setQuantity(quantityChoice);
                shoppingCart.addGroceryItemOrder(itemHandler.groceryItemList.get(index));
                shoppingCart.getTotalCost();
                if (shoppingCart.shoppingListCounter == 5){
                    repeatAddingToCart = false;
                    System.out.println("You have reached the maximum numbers of different shoppingcart items - redirecting to Checkout ");
                    System.out.println();
                }
            }
        }
        while (repeatAddingToCart);

        // Checkout and exit user message

        System.out.println("CHECKOUT");
        System.out.println();
        shoppingCart.getTotalCost();
        System.out.println("THANK YOU FOR SHOPPING - WELCOME AGAIN SOON");
        System.out.println();
    }

}
