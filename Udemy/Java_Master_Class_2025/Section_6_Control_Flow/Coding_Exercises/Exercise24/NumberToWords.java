package Section_6_Control_Flow.Coding_Exercises.Exercise24;

// Coding Exercise 24: Number to Words

/**
 * The objective of this coding exercise is to write a small program that prints out the number in words.
 *
 * Example Input/Output - getDigitCount method
 *
 * getDigitCount(0); should return 1 since there is only 1 digit
 *
 * getDigitCount(123); should return 3
 *
 * getDigitCount(-12); should return -1 since the parameter is negative
 *
 * getDigitCount(5200); should return 4 since there are 4 digits in the number
 *
 * Example Input/Output - reverse method
 *
 * reverse(-121); should  return -121
 *
 * reverse(1212); should return  2121
 *
 * reverse(1234); should return 4321
 *
 * reverse(100); should return 1
 *
 * Example Input/Output - numberToWords method
 *
 * numberToWords(123); should print "One Two Three".
 *
 * numberToWords(1010); should print "One Zero One Zero".
 *
 * numberToWords(1000); should print "One Zero Zero Zero".
 *
 * numberToWords(-12); should print "Invalid Value" since the parameter is negative.
 */


public class NumberToWords {

    /**
     * Takes number as input.
     * Iteratively extracts the last digit and appends it to reverse.
     * Removes the last digit from number after each step.
     * @param number that is used as input.
     * @return
     */
    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0) {
            // multiply by 10 then and add last digit (number % 10)
            reverse = reverse * 10 + number % 10;
            number /= 10; // discard last digit
        }
        return reverse;
    }

    /**
     * This method counts the number of digits in a number
     * Returns -1 for negative numbers (invalid input).
     * Handles zero separately (zero has 1 digit).
     * Uses a loop that starts at 1 and multiplies by 10 each step (1, 10, 100...).
     * The number of times it runs before exceeding number gives the digit count.
     * @param number
     * @return
     */
    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;  // Negative numbers are invalid
        }

        if (number == 0) {
            return 1; // Special case: '0' has one digit
        }

        int count = 0;
        // start from 1 and multiply by 10 each step so i goes 1, 10, 100, 1000
        // count how many times it was multiplied, and that's the digit count
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // get reversed number
        int reverse = reverse(number);  // Step 1: Reverse the number

        // subtract numberDigits and reverseDigits to get leading zeroes
        // Step 2: Count leading zeroes
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

        /*
        Example: 100 → Reverse: 1
        Digit Count Difference: 3 - 1 = 2 (so, 2 leading zeroes)
         */
        if (number == 0) {
            System.out.println("Zero");
            return;
        } // Handles cases like 100 → "One Zero Zero"

        // use loop to print words
        while (reverse != 0) {
            // Extracts each digit from the reversed number and prints the corresponding word.
            int lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reverse /= 10;
        }

        // print zeroes if there are any leading zeroes in reversed number
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
    }
}

/**
 * Reverse the number → reverse(100) → 1
 * Count leading zeros → getDigitCount(100) - getDigitCount(1) = 3 - 1 = 2
 *  Final Output: "One Zero Zero"
 */