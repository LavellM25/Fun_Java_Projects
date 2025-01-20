/* Date: 1-12-2025
   Description: Return statement in Java is a keyword used in methods to specify the value that should be returned
                to the caller after the method has executed. This an example use case of a return statement for a condition.
 */

// Define a class to contain our methods and main program
public class NumberUtils {

    // Define a static method named 'isEven' that takes an integer as input and returns a boolean
    public static boolean isEven(int number) {
        // Check if the number is evenly divisible by 2 (remainder is 0)
        if (number % 2 == 0) {
            return true; // If true, return true (the number is even)
        }

        else {
            return false; // Otherwise, return false (the number is odd)
        }
    }

    // Main method - the entry point of the program
    public static void main(String[] args) {
        // Call the 'isEven' method with the value 10 and store the result in 'result'
        boolean result = isEven(10); // Method call begins here:
        // 1. Passes the number 10 to 'isEven'.
        // 2. Inside 'isEven', 10 % 2 is calculated as 0.
        // 3. Since 10 is divisible by 2, the method returns 'true'.

        // Print the result to the console
        System.out.println("Is 10 even? " + result); // Outputs "Is 10 even? true" because 'result' holds the value 'true'.
    }
}
