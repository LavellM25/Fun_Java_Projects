/* Date: 1-6-2025
   Description: Working with While Loops syntax in Java. Used to continue code execution long as a condition is true.
                While Loops can run until a certain parameter in the code is meant or as long as a condition is true.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // Create a while loop
        String sentence = "SpongeBob Squarepants";
        // Step 1: Define a string `sentence` containing "SpongeBob Squarepants".

        Scanner scan = new Scanner(sentence);
        // Step 2: Create a `Scanner` object named `scan` that reads from the `sentence`.
        //         The Scanner object allows us to break the string into individual words.

        // Create an array
        ArrayList<String> words = new ArrayList<String>();
        // Step 3: Create an `ArrayList` named `words` to store individual words from the `sentence`.

        while (scan.hasNext()) {
            // Step 4: Start a `while` loop that checks if the `Scanner` object has another word.
            //         `hasNext()` returns true as long as there are more tokens (words) to process.

            words.add(scan.next());
            // Step 5: Add the next word from the `Scanner` to the `words` ArrayList.
            //         `scan.next()` retrieves the next word/token from the string.
        }

        System.out.println(words);
        // Step 6: Print the contents of the `words` ArrayList.
        //         The output will be ["SpongeBob", "Squarepants"], as these are the words in the sentence.
    }
}
