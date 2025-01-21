/* Date: 1-21-2025
   Description: Learning about assigning variables and conditional statements.
 */

public class ifthenelsechallenge {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;

        // Step 4: Declare and initialize an integer variable named `bonus` with the value `200`.
        int bonus = 200;

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
