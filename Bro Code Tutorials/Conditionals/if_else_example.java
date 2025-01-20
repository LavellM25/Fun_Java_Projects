/* Date: 12-15-2024
   Description: Working with conditional statements in Java to test particular elements.
                Based on an event, code will then execute based on said outcome.
 */

public class IfElseExample {
    public static void main(String[] args) {
        int number = 6; // Change this value to test different numbers

        if (number > 5) { // Condition 1: Check if the number is greater than 5
            System.out.println("The number is greater than 5.");
        } else if (number > 0 && number < 5) { // Condition 2: Check if the number is between 0 and 5 (exclusive)
            System.out.println("The number is greater than 0 and less than 5.");
        } else if (number == 0) { // Condition 3: Check if the number is 0
            System.out.println("The number is zero.");
        } else { // Condition 4: Handle negative numbers
            System.out.println("The number is negative.");
        }
    }
}
