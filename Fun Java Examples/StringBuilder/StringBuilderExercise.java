/**
 * Date: 2-1-2025

 * Exercise: Reverse and Modify a String
 * Write a Java program that:
 *
 * Takes a string input from the user.
 * Reverses the string using StringBuilder.
 * Removes all vowels (a, e, i, o, u) from the reversed string.
 * Prints the final modified string.
 */

import java.util.Scanner;

public class StringBuilderExercise {
    public static void main(String[] args) {

        /*
        Example output:
        Enter a string: Hello World
        Step 1: Reverse the string → "dlroW olleH"
        Step 2: Remove vowels (o, o, e) → "dlrW llH"
        Output: Modified string: dlrW llH
         */

        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Step 2: Reverse the string using StringBuilder
        StringBuilder reversedString = new StringBuilder(userInput);
        reversedString.reverse(); // Reverse the string

        // Step 3: Remove vowels (a, e, i, o, u) from the reversed string
        StringBuilder modifiedString = new StringBuilder();
        for (int i = 0; i < reversedString.length(); i++) {
            char c = reversedString.charAt(i);

            // Check if the character is a vowel (both uppercase and lowercase)
            if ("aeiouAEIOU".indexOf(c) == -1) { // If not a vowel, keep it
                modifiedString.append(c);
            }
        }

        // Step 4: Print the final modified string
        System.out.println("Modified string: " + modifiedString);

        scanner.close(); // Close Scanner
    }
}
