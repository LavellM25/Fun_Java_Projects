package Section_6_Control_Flow.Coding_Exercises;

// Coding exercise 18: Even Digit Sum


/**
 * The objective of this coding exercise is to write a small program that calculates
 * the sum of the even digits of a given number.
 *
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 *
 * The method should return the sum of the even digits within the number.
 *
 * If the number is negative, the method should return -1 to indicate an invalid value.
 *
 * * --- Brainstorming Process ---
 *  * 1. We need to process an integer and extract each digit.
 *  * 2. We need to check if each digit is even.
 *  * 3. If it is even, add it to a sum.
 *  * 4. If the number is negative, return -1 to indicate an invalid input.
 *
 * EXAMPLE INPUT/OUTPUT:
 *
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 *
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 *
 * getEvenDigitSum(-22); → should return -1 since the number is negative
 */

public class EvenDigitSum {
    public static void main(String[] args) {

        // Call the method that calculates the sum of even digits
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(19523));
        System.out.println(getEvenDigitSum(12389));



    }

/**
 * This method calculates the sum of all even digits in a given number.
 * If the number is negative, it returns -1 to indicate an invalid value.
 *
 * Steps to solve:
 * 1. Check if the number is negative; if so, return -1.
 * 2. Initialize a sum variable to store the sum of even digits.
 * 3. Use a loop to extract each digit using modulus (%) operation.
 * 4. Check if the extracted digit is even (divisible by 2).
 * 5. If it is even, add it to the sum.
 * 6. Remove the last digit using division (/ 10).
 * 7. Continue until all digits are processed.
 * 8. Return the final sum of even digits.
 */

// Example of code if you were to use a for-loop to solve solution:
//public class EvenDigitSum {
//
//    public static int getEvenDigitSum(int number) {
//
//        if (number < 0) {
//            return -1;
//        }
//
//        int sum = 0;
//        for (int i = number; i > 0; i /= 10) {
//            int lastDigit = i % 10;
//            if (lastDigit % 2 == 0) {
//                sum += lastDigit;
//            }
//        }

public static int getEvenDigitSum(int number) {
    // Step 1: Check if the number is negative
    if (number < 0) {
        return -1; // Invalid input case
    }

    int sum = 0;  // Step 2: Initialize sum variable to store the total sum

    // Step 3: Loop through all digits of the number
    while (number > 0) {
        int digit = number % 10; // Extract the last digit

        if (digit % 2 == 0) {  // Step 4: Check if the digit is even
            sum += digit;  // Step 5: Add even digit to sum
        }

        number /= 10;  // Step 6: Remove the last digit from number
    }

    return sum;  // Step 7: Return the total sum of even digits
    }
}