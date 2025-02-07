/*
Date: 2-6-2025
 * Program: Check if a Number is a Palindrome
 *
 * Instructions:
 * 1. Read an integer input.
 * 2. Store the original number for later comparison.
 * 3. Convert the number to its absolute value (ignore negative sign).
 * 4. Reverse the number:
 *    - Extract the last digit using modulus operator.
 *    - Append it to the reversed number.
 *    - Remove the last digit by integer division.
 * 5. Compare the reversed number with the original.
 * 6. If they match, return true; otherwise, return false.
 */

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        // Store the original number for comparison
        int originalNumber = number;

        // Make number positive for processing
        number = Math.abs(number);

        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;  // Extract last digit
            reverse = (reverse * 10) + lastDigit; // Append to reverse
            number /= 10; // Remove last digit
        }

        // Compare original with reversed number
        return Math.abs(originalNumber) == reverse;
    }
}
