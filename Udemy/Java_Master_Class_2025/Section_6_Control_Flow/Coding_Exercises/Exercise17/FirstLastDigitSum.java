package Section_6_Control_Flow.Coding_Exercises.Exercise17;

/**
 * The objective of this coding exercise is to write a small program that
 * calculates the sum of the first and last digits of a given number.
 *
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 *
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 *
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

// Coding exercise 17: First and Last Digit Sum

public class FirstLastDigitSum {
    public static void main(String[] args) {


        System.out.println(sumFirstAndLastDigit(252));  // Expected: 4
        System.out.println(sumFirstAndLastDigit(257));  // Expected: 9
        System.out.println(sumFirstAndLastDigit(0));    // Expected: 0
        System.out.println(sumFirstAndLastDigit(5));    // Expected: 10
        System.out.println(sumFirstAndLastDigit(-10));  // Expected: -1
    }
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers as required
        }

        int lastDigit = number % 10;  // Extract the last digit from the series of numbers
        /*
        The % operator (modulus) returns the remainder when dividing by 10.
        The remainder is always the last digit of the number.
        Ex: 257 % 10 = 7 because 257 does not divide easily so 250 / 10 is 25 with no remainder.
        If you add 7, 7 will be the remainder
        */
        while (number >= 10) { // In order to retrieve the first digit.
            number /= 10;

            /*
            We want to remove all digits except the first one.
            We keep dividing by 10 until we are left with only one digit.
            📌 Input: 257
            First loop: 257 / 10 = 25
            Second loop: 25 / 10 = 2
            Now, only 2 is left → this is our first digit!
            📌 First Digit: 2
             */
        }

        int firstDigit = number;  // Now number is the first digit

        return firstDigit + lastDigit; // return the sum
        /*
        📌 Input: 257
        First Digit: 2
        Last Digit: 7
        Sum: 2 + 7 = 9
        📌 Output: 9
         */
    }
}
