/* Date: 1-7-2025
   Description: Additional practical example of the use of switch-case statements in Java.
                Key takeaways are the following:
                Use switch when checking a single variable against multiple constant values.
                Always include a default case to handle potential errors that can happen so program doesn't crash.
                Prefer switch-case for better readability and cleaner code over lengthy and many if-else-if statements.
 */
import java.util.Scanner; // Import the Scanner class to take user input

public class switchcase2 {
    public static void main(String[] args) {
        // Problem: Perform basic mathematical operations based on user input.
        // Using switch-case for a calculator.
        // Step 1: Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter the first number
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble(); // Read the first number as a double to allow real-world #'s like decimals.

        // Step 3: Prompt the user to enter the second number
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble(); // Read the second number as a double, same conditions as first #.

        // Step 4: Prompt the user to choose an arithmetic operation
        System.out.println("Choose an operation: +, -, *, /");
        char operator = scanner.next().charAt(0); // Read the first character of the user's input

        // Step 5: Use a switch statement to determine the operation
        switch (operator) {
            // Case 1: Addition
            case '+':
                System.out.println("Result: " + (num1 + num2)); // Add the two numbers and print the result
                break; // Exit the switch block

            // Case 2: Subtraction
            case '-':
                System.out.println("Result: " + (num1 - num2)); // Subtract num2 from num1 and print the result
                break; // Exit the switch block

            // Case 3: Multiplication
            case '*':
                System.out.println("Result: " + (num1 * num2)); // Multiply the two numbers and print the result
                break; // Exit the switch block

            // Case 4: Division
            case '/':
                if (num2 != 0) { // Check if the second number is not zero
                    System.out.println("Result: " + (num1 / num2)); // Divide num1 by num2 and print the result
                } else {
                    System.out.println("Error: Division by zero is not allowed."); // Handle division by zero
                }
                break; // Exit the switch block

            // Default Case: Invalid operator
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /."); // Handle invalid input
                break; // Exit the switch block
        }

        // Step 6: Close the scanner to avoid resource leak
        scanner.close();
    }
}
