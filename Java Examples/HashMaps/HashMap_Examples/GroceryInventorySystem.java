// Date: 3-2-2025
// Store grocery items and their stock levels in a HashMap.
// Allow a user to add, remove, and check item stock.
// Implement a low-stock alert when an item’s quantity falls below a threshold.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** Possible enhancement ideas:
 * Add a low-stock alert (e.g., if stock < 5, show a warning).
 * Allow updating stock instead of just adding/removing.
 * Implement saving/loading data to a file for persistence.
 */

public class GroceryInventorySystem {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>(); // to store grocery items and their quantities.
        Scanner scanner = new Scanner(System.in); // Get user input

        // Infinite loop to display menu options until user exits
        while (true) {
            System.out.println("\nGrocery Inventory System");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Check stock");
            System.out.println("4. Display all items");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Call method to add item
                    addItem(inventory, scanner); // (updates quantity if item already exists).
                    break;
                case 2: // Call method to remove item
                    removeItem(inventory, scanner); // Remove items from inventory.
                    break;
                case 3: // Call method to check item stock
                    checkStock(inventory, scanner); // Check stock for a specific item.
                    break;
                case 4: // Call method to display all items
                    displayInventory(inventory); // Display all items in the inventory.
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!"); // Exit the program.
                    scanner.close(); // Close scanner before exiting
                    return;
                default: // Handle the case at which none of above cases are chosen 1-5.
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Adds an item to the inventory or updates its quantity if it already exists.
     * @param inventory The HashMap storing item names as keys and their quantities as values.
     * @param scanner The Scanner object to read user input.
     */
    public static void addItem(Map<String, Integer> inventory, Scanner scanner) {
        System.out.print("Enter item name: ");
        String item = scanner.nextLine(); // Get item name from user
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt(); // Get quantity from user
        scanner.nextLine(); // Consume newline

        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
        System.out.println(quantity + " units of " + item + " added.");
    }

    /**
     * Removes an item from the inventory if it exists.
     * @param inventory The HashMap storing item names as keys and their quantities as values.
     * @param scanner The Scanner object to read user input.
     */
    public static void removeItem(Map<String, Integer> inventory, Scanner scanner) {
        System.out.print("Enter item name to remove: ");
        String item = scanner.nextLine(); // Get item name from user

        if (inventory.containsKey(item)) {
            inventory.remove(item); // Remove item from inventory
            System.out.println(item + " removed from inventory.");
        } else {
            System.out.println("Item not found.");
        }
    }

    /**
     * Checks and displays the stock quantity of a specific item.
     * @param inventory The HashMap storing item names as keys and their quantities as values.
     * @param scanner The Scanner object to read user input.
     */
    public static void checkStock(Map<String, Integer> inventory, Scanner scanner) {
        System.out.print("Enter item name to check stock: ");
        String item = scanner.nextLine(); // Get item name from user

        if (inventory.containsKey(item)) {
            System.out.println("Stock for " + item + ": " + inventory.get(item) + " units.");
        } else {
            System.out.println("Item not found in inventory.");
        }
    }

    /**
     * Displays all items and their quantities in the inventory.
     * @param inventory The HashMap storing item names as keys and their quantities as values.
     */
    public static void displayInventory(Map<String, Integer> inventory) {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\nCurrent Inventory:");
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
            }
        }
    }
}