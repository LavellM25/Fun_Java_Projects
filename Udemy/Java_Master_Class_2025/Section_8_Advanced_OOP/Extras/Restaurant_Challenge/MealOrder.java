package Section_8_Advanced_OOP.Extras.Restaurant_Challenge;

public class MealOrder {

    // Create the instance fields for the Item.java, Burger.java files
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(String burgerType, String drinkType, String sideType) {
        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerType, 8.5);
        }
        else {
            this.burger = new DeluxeBurger(burgerType, 4.0);
        }
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item("drink", 1.00, drinkType);
        this.side = new Item("side", 1.50, sideType);
    }

    // Create a constructor that passes in no args and sets up default values
    public MealOrder() {
        this("regular", "coke", "fries");
    }

    // Create a method that gets the total price of the meal
    public double getTotalPrice() {
        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
        // Add the burger + drink + side together to get total price.

    }

    // Create a method that prints out the itemized lists
    public void printItemizedList() {
        burger.printItem(); // If deluxe burger still print item from console and call static method.
        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        }
        else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30)); // Print a line separator
        Item.printItem("TOTAL PRICE", getTotalPrice()); // get the total price from the method create above.
    }

    // Create a method that allows us to add up to 3 toppings.
    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    // Create a constructor to allow the user to add 5 additional toppings to create a deluxe burger
    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        burger.addToppings(extra1, extra2, extra3);
        // If the instance of a deluxe burger, the user will be able to pass in 5 args
        if (burger instanceof DeluxeBurger deluxeBurger) {
            deluxeBurger.addToppings(extra1, extra2, extra3, extra4, extra5); // This is the overloaded method for a deluxe type.
        }
        // Otherwise the user will be able to pass in the standard limit of 3 args
        else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }


    // Setter method to create drink size
    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
