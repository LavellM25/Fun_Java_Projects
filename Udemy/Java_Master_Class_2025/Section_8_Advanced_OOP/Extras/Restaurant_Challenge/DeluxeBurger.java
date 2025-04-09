package Section_8_Advanced_OOP.Extras.Restaurant_Challenge;

public class DeluxeBurger extends Burger {

    // Create instance fields for the Item.java file
    Item delux1;
    Item delux2;

    // Create a constructor w/o any instance fields of Item
    public DeluxeBurger(String burgerType, double price) {
        super(burgerType, price);
    }

    // I will remove the override annotations and add two extra args in this method.

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        delux1 = new Item("TOPPING", 0, extra4); // pass in the additional args in the method.
        delux2 = new Item("TOPPING", 0, extra5); // pass in the additional args in the method.
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (delux1 != null) {
            delux1.printItem();
        }
        if (delux2 != null) {
            delux2.printItem();
        }
        System.out.println("-".repeat(30));
        Section_8_Advanced_OOP.Extras.Restaurant_Challenge.Item.printItem("TOTAL PRICE", getAdjustedPrice());

    }

    // create a getter method for the extra price

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }



}
