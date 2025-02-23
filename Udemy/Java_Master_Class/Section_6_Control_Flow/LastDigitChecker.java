package Section_6_Control_Flow;

// Coding Exercise 20: Last Digit Checker

/**
 * The objective of this coding exercise is to write a small program that checks
 * if at least two of the numbers have the same rightmost digit.
 */


public class LastDigitChecker {
    public static void main(String[] args) {

//        // Call method isValid to confirm logic works
//        System.out.println(isValid(10)); //  → should return true since 10 is within the range of 10-1000
//        System.out.println(isValid(468)); // → should return true since 468 is within the range of 10-1000
//        System.out.println(isValid(1051)); // → should return false since 1051 is not within the range of 10-1000

        // Call method hasSameLastDigit to check range 10-1000 logic condition checks out
//        System.out.println(hasSameLastDigit(9,2,3)); // test passed no numbers greater than 10
//        System.out.println(hasSameLastDigit(19, 2, 3)); // test passed, 1 number greater than 10, the rest less than 10
//        System.out.println(hasSameLastDigit(19, 22, 3)); // test passed, 2 numbers greater than 10, however last number 10
//        System.out.println(hasSameLastDigit(19, 22, 33)); // test passed, all numbers greater than 10 and within range 10-1000
//        System.out.println(hasSameLastDigit(1119, 22, 33)); // test passed, first value outside of range 10-1000
//        System.out.println(hasSameLastDigit(1119, 1122, 33)); // test passed, first and second number greater than 1000
//        System.out.println(hasSameLastDigit(1119, 1122, 1033)); // test passed, all values are greater than 1000.

        // Call method hasSameLastDigit to ensure all logic checks out
        System.out.println(hasSameLastDigit(41, 22, 71)); // → should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit(23, 32, 42)); // → should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit(9, 99, 999)); // → should return false since 9 is not within the range of 10-1000

    }
    /**
     * Write another method named isValid with one parameter of type int.
     *
     * The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive),
     * otherwise return false.
     */
    public static boolean isValid (int number1) {
        if(number1 >= 10 && number1 <= 1000) {
            return true;
        }
        return false;
    }
    /**
     * Write a method named hasSameLastDigit with three parameters of type int.
     *
     * Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
     *
     * The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
     *
     * Brainstorming thought process:
     * It makes sense to make an overloaded method since some of the conditions in this method is based on previous conditions
     * of having to be within 10-1000.
     */
    public static boolean hasSameLastDigit (int number1, int number2, int number3) {
        // 1. Check if all numbers are within the range between 10 and 1000 (inclusive)
        if ((number1 >= 10 && number1 <= 1000) && (number2 >= 10 && number2 <= 1000) && (number3 >= 10 && number3 <= 1000)) {
            // 2. Extract the last digit of each number which can be done by using the % 10
            // Ex: if 45 will rightmost digit will be 5, 994 % 10 = 4 meaning 4 is the remainder to divide number nicely
            int lastDigit1 = number1 % 10;
            int lastDigit2 = number2 % 10;
            int lastDigit3 = number3 % 10;

            // Step 3: Compare last digits, condition that must be met here is that 2 of 3 numbers
            // must have the same rightmost digit or in this case the same remainder after number has been % 10
            if ((lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3)) {
                return true;
            }
        }
        return false;
    }
}
