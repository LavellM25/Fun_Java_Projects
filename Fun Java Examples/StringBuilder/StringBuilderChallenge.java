/**
 * Date: 2-1-2025
 * From Stringbuilder.java file, this is a challenge to the previous file to add extra robust features
 *
 * ✅ Modifications:
 * Loop until the user types "exit" (case-insensitive).
 * Count the number of removed vowels and display it.
 * Convert the final modified string to uppercase before printing.
 *
 * ✅ Summary of Enhancements
 * 🔁 Keeps asking for input until "exit" is entered.
 * 🧮 Counts and prints the number of vowels removed.
 * 🔠 Converts the final output to uppercase.
 * 🚀 More user-friendly and interactive.
 */

import java.util.Scanner;

public class StringBuilderChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*  Example testing conditions:
        Enter a string (or type 'exit' to quit): Hello World
        Reversed without vowels (UPPERCASE): DLRW LLH
        Total vowels removed: 3

        Enter a string (or type 'exit' to quit): Java Programming
        Reversed without vowels (UPPERCASE): GNMRGRM VJ
        Total vowels removed: 5

        Enter a string (or type 'exit' to quit): exit
        Program exited. Goodbye!
         */

        while (true) { // Infinite loop to allow multiple inputs
            // Step 1: Get user input
            System.out.print("Enter a string (or type 'exit' to quit): ");
            String userInput = scanner.nextLine();

            // Step 2: Check if the user wants to exit
            if (userInput.equalsIgnoreCase("exit")) { // Allows EXIT == exit
                System.out.println("Program exited. Goodbye!");
                break; // Exit the loop
            }

            // Step 3: Reverse the string using StringBuilder
            StringBuilder reversedString = new StringBuilder(userInput);
            reversedString.reverse(); // Reverse the string

            // Step 4: Remove vowels and count how many were removed
            StringBuilder modifiedString = new StringBuilder();
            int vowelCount = 0; // Counter for removed vowels

            for (int i = 0; i < reversedString.length(); i++) {
                char c = reversedString.charAt(i);

                // Check if the character is a vowel (both uppercase and lowercase)
                if ("aeiouAEIOU".indexOf(c) == -1) { // If not a vowel, keep it
                    modifiedString.append(c);
                } else {
                    vowelCount++; // Count removed vowels
                }
            }

            // Step 5: Convert the final modified string to uppercase
            String finalResult = modifiedString.toString().toUpperCase();

            // Step 6: Print the results
            System.out.println("Reversed without vowels (UPPERCASE): " + finalResult);
            System.out.println("Total vowels removed: " + vowelCount);
            System.out.println(); // Line break for readability
        }

        scanner.close(); // Close Scanner
    }
}
