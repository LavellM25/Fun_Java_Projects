/* Date: 1-21-2025
   Description: challenge creating methods
 */


// When making methods, they should not have ; semicolons at the end.
public class method_challenge {
    public static void main(String[] args) {
        // method created
        // Call both methods and display the results for 1500, 1000, 500, 100, 25
//        int[] scores = {1500, 1000, 500, 100, 25};  // Array list of scores that will be tested
//        String[] playerName = {"Bob", "Joe", "Smith", "Luke", "Leila"};  // Array list of player names

//        // Loop through scores, calculate the high score position, and display it
//        for (int i = 0; i < scores.length; i++) {
//            // Retrieve the current player's name from the `playerNames` array
//            String name = playerName[i];  // Example: When i = 0, name = "Bob"
//
//            // Retrieve the current player's score from the `scores` array
//            int score = scores[i];         // Example: When i = 0, score = 1500
//
//            // Calculate the player's position based on their score
//            // Calls the `calculateHighScorePosition` method and passes the score
//            int position = calculateHighScorePosition(score); // Example: When score = 1500, position = 1
//
//            // Display the player's name and position
//            // Calls the `displayHighScorePosition` method with the player's name and position
//            displayHighScorePosition(name, position); // Example: Outputs "Bob managed to get into position 1 on the high score list"
//        }
        displayHighScorePosition("Tim", 800);
        calculateHighScorePosition(760);
        System.out.println(calculateHighScorePosition(860)); // Print to the console a user score to check conditions
    }
        // used void since I am not expected to return a value in this method, I will be just printing out a statement
        public static void displayHighScorePosition (String playerName, int highScorePosition) {

            // method should have two parameters
            // player's name
            // player's position in a high score list
            // should print out a message "Doe managed to get into position 2 on the high score list"
            System.out.println(playerName + " managed to get into position "
                    + highScorePosition + " on the high score list");
        }

        // used static int as because I will return a value in this method
        public static int calculateHighScorePosition ( int playerScore) {

            // method should have 1 parameter (player's score)
            // should return 1-4 based on score value in table
        /* Score greater than or equal to 1000 = 1
           Score greater than or equal to 500 but less than 1000 = 2
           Score greater than or equal to 100 but less than 500 = 3
           All other scores = 4
         */
            if (playerScore >= 1000) {
                return 1;
            } else if (playerScore >= 500 && playerScore < 1000) {
                return 2;
            } else if (playerScore >= 100 && playerScore < 500) {
                return 3;
            } else {
                return 4;
            }
        }
    }

