/* Date: 1-1-2025
   Description: Another real-world examples of how to create multiple objects in Java, adding an NFL player edition.
 */

// Step 1: Define a class named NFLPlayer to represent an NFL player
public class NFLPlayer {

    // Step 2: Declare attributes for player's name and team
    String name;  // To store the player's name
    String team;  // To store the player's team

    // Step 3: Define a method to display the player's information
    public void displayInfo() {
        // Print the player's name and team
        System.out.println(name + " plays for the " + team + ".");
    }

    // Step 4: Define the main method (entry point of the program)
    public static void main(String[] args) {

        // Step 5: Create the first NFL player object and assign values to its attributes
        NFLPlayer player1 = new NFLPlayer();  // Object creation
        player1.name = "Patrick Mahomes";     // Assign name
        player1.team = "Kansas City Chiefs";  // Assign team

        // Step 6: Create the second NFL player object and assign values to its attributes
        NFLPlayer player2 = new NFLPlayer();  // Object creation
        player2.name = "Josh Allen";          // Assign name
        player2.team = "Buffalo Bills";       // Assign team

        // Step 7: Create the third NFL player object and assign values to its attributes
        NFLPlayer player3 = new NFLPlayer();  // Object creation
        player3.name = "Justin Jefferson";    // Assign name
        player3.team = "Minnesota Vikings";   // Assign team

        // Step 8: Create the fourth NFL player object and assign values to its attributes
        NFLPlayer player4 = new NFLPlayer();  // Object creation
        player4.name = "Jalen Hurts";         // Assign name
        player4.team = "Philadelphia Eagles"; // Assign team

        // Step 9: Display information for all players using the displayInfo() method
        System.out.println("🏈 NFL Players and Their Teams 🏈");
        player1.displayInfo();  // Display details of player1
        player2.displayInfo();  // Display details of player2
        player3.displayInfo();  // Display details of player3
        player4.displayInfo();  // Display details of player4

        // Step 10: Create an additional scenario
        // Example: Player performs an action
        System.out.println("\n🏆 Highlight Play 🏆");
        player1.makePlay("throws a touchdown pass");
        player3.makePlay("scores an 80-yard touchdown");
    }

    // Step 11: Add a method to simulate a player's action
    public void makePlay(String action) {
        System.out.println(name + " " + action + " for the " + team + "!");
    }
}
