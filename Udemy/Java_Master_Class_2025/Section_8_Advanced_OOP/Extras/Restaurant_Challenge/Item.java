package Section_8_Advanced_OOP.Extras.Restaurant_Challenge;

public class Item {

    // Fields for the items:
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    // adding a constructor that passes in args for everything except size.
    public Item(String type, double price, String name) {
        this.type = type.toUpperCase(); // convert string to upppercase
        this.price = price;
        this.name = name.toUpperCase(); // convert string to upppercase
    }

    // Create getter methods:
    public double getBasePrice() {
        return price;
    }
    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            // For small subtract base price $.5
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1; // For large increase base price by $1
            default -> getBasePrice(); // medium size will get no adjustment as this is a standard base price.
        };
    }

    // Create a setter method for size of the meal.
    public void setSize(String size) {
        this.size = size;
    }

    // Print out the prize of the item in uniformed way:
    public static void printItem(String name, double price) {
        // 20s 20 characters for the first argument, which specifies how large you want the string to be.
        // 6.2f specifies I want 6 characters in front of the decimal place and two after decimal place.
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
