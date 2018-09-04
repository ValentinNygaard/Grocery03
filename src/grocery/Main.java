package grocery;

public class Main {

    public static void main(String[] args) {
        GroceryItemOrderHandler.initGroceryItemList();
        //GroceryItemOrderHandler.printGroceryItemList();
        GrocerySystem.goShopping();
    }
}
