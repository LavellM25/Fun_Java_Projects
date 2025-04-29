package Section_6_Control_Flow.Coding_Exercises.Exercise16;

// Coding exercise 16: Number Palindrome

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
