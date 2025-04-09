package Section_8_Advanced_OOP.Extras.Restaurant_Challenge;

public class Burger extends Item{

    public Burger(String burgerType, double price) {
        super("Burger", price, burgerType); // FIXED: now properly sets the burger name
    }

    // Three instance fields for the burger
    private Item extra1;
    private Item extra2;
    private Item extra3;


    // two methods that are overrider
    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    // Override getAdjustedPrice to include price of extras
    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
        // If the user doesn't order a extra topping, return 0, otherwise add topping to the price
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    // Determine price based on topping name
    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0;
        };
    }

    // Add up to 3 extra toppings

    /**
     *"TOPPING"	type —
     * Tells the Item that it’s a topping (not a drink or side). Helps format the name correctly (like including size for drinks).

     * getExtraPrice(extra1) price —
     Dynamically calculates the price based on the topping name. Lets you customize how each topping is priced.

     * extra1 name —
     * The actual topping name, e.g., "bacon" or "cheese". Gives the topping its identity (for display and clarity).
     */
    public void addToppings(String extra1, String extra2, String extra3){
        this.extra1 = new Item("TOPPING", getExtraPrice(extra1), extra1);
        this.extra2 = new Item("TOPPING", getExtraPrice(extra2), extra2);
        this.extra3 = new Item("TOPPING", getExtraPrice(extra3), extra3);
    }

    // This method will itemized the extra toppings:
    public void printItemizedList() {
        printItem("BASE BURGER", getBasePrice()); // First print out the base price of the burger.
        if (extra1 != null) { // If there are extras, additionally print out the extras on the list.
            extra1.printItem(); // This process will be the same for extra2 and extra3.
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
        System.out.println("-".repeat(30)); // Line separator
        Item.printItem(getName(), getAdjustedPrice());
    }

    @Override
    public void printItem() {
        printItemizedList(); // call the method above.
        System.out.println("-".repeat(30)); // print out a line separator for heading
        super.printItem();
    }


}
