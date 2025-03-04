/* Date: 1-6-2025
   Date: Learned to use arrays, random number generation, while loops, user input with Scanner, string comparison,
         resource management, and clear comments to create an interactive, user-friendly Java program.
 */

import java.util.Random;
import java.util.Scanner;

public class Magic8_ball {
    public static void main(String[] args) {

        // Step 1: Predefine Magic 8-Ball Responses in an Array
        String[] responses = {
                "As I see it, yes.",
                "Don't count on it.",
                "Most likely, yes.",
                "You may rely on it.",
                "It is decidedly so.",
                "Concentrate and ask again.",
                "Sources say no.",
                "Outlook looks poor.",
                "Yes, definitely."
        };

        // Step 2: Create Scanner for User Input
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("\n🎱 Enter your question for the Magic 8-Ball (or type quit to stop): ");
            String question = scan.nextLine();

            if (question.equalsIgnoreCase("quit") || question.equalsIgnoreCase("stop")) {
                System.out.println("Goodbye! 👋"); // 🎤 Farewell message
                break; // 🎤 Exit the loop
            }

            // Step 3: Generate Random Response
            int r = rand.nextInt(responses.length); // Random index from 0 to length-1
            System.out.println("🎱 " + responses[r]); // Display the selected random response
        }

        scan.close(); // Close the scanner
    }
}
