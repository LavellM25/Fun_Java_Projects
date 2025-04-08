package Section_8_Advanced_OOP.Extras.Restaurant_Challenge;

public class Burger extends Item{

    public Burger(String type, double price) {
        super("Burger", price);
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

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
        // If the user doesn't order a extra topping, return 0, otherwise add topping to the price
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3){
        this.extra1 = new Item("TOPPING", getExtraPrice(extra1));
        this.extra2 = new Item("TOPPING", getExtraPrice(extra2));
        this.extra3 = new Item("TOPPING", getExtraPrice(extra3));
    }
}
