package Section_6_Control_Flow.Coding_Exercises;


// Coding Exercise 19: Shared Digit

/**
 * The objective of this coding exercise is to write a small program that
 * checks if there's a digit that appears in both numbers.
 *
 * Write a method named hasSharedDigit with two parameters of type int.
 *
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If one of the numbers is not within the range, the method should return false.
 *
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 *
 *
 * EXAMPLE INPUT/OUTPUT:
 *
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 *
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 *
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 */

public class SharedDigit {
    public static void main(String[] args) {

        // Call the method to test results
        System.out.println(hasSharedDigit(12, 23)); // → should return true since the digit 2 appears in both numbers
        System.out.println(hasSharedDigit(9, 99)); //  → should return false since 9 is not within the range of 10-99
        System.out.println(hasSharedDigit(15, 55)); // → should return true since the digit 5 appears in both numbers
//        System.out.println(hasSharedDigit(12, 23));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        /*
        1. Condition that must be met is: within the range of 10 (inclusive) - 99 (inclusive),
        if not return false for both numbers
         */
        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {
            // Convert numbers to string to check individual digits

            String strNum1 = Integer.toString(firstNumber);
            String strNum2 = Integer.toString(secondNumber);

            // Check if any digit in num1 exists in num2
            for (char digit : strNum1.toCharArray()) { // Convert both numbers to strings.
                if (strNum2.contains(Character.toString(digit))) { // Check if any digit in num1 exists in num2.
                    // return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
                    // Meaning there is a match found in both corresponding numbers
                    return true;
                }
            }
        }
        return false;
    }
}