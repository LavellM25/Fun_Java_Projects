/* Date: 1-21-2025
   Description: Setting up the variables that will later be set to increase difficulty.
 */

public class ifthenelse {
    public static void main(String[] args) {
        // Step 1: Declare and initialize a boolean variable named `gameOver` with the value `true`.
        boolean gameOver = true;

        // Step 2: Declare and initialize an integer variable named `score` with the value `800`.
        int score = 800;

        // Step 3: Declare and initialize an integer variable named `levelCompleted` with the value `5`.
        int levelCompleted = 5;

        // Step 4: Declare and initialize an integer variable named `bonus` with the value `100`.
        int bonus = 100;

        // Step 5: Declare and initialize an integer variable named `finalScore` and assign it the value of `score`.
        int finalScore = score;

        // Step 6: Check if the variable `gameOver` is `true`.
        if (gameOver == true) {
            // If the condition is true, calculate the final score by adding the product
            // of `levelCompleted` and `bonus` to the current `finalScore`.
            finalScore = finalScore + (levelCompleted * bonus);

            // Step 7: Print the final score to the console.
            System.out.println("Your final score was " + finalScore);
        }
    }
}
