package Section_6_Control_Flow;

// Coding Exercise 22: Greatest Common Divisor

/**
 * The objective of this coding exercise is to write a small program that
 * returns the greatest common divisor of two numbers.
 *
 * Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
 *
 * If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
 *
 * The method should return the greatest common divisor of the two numbers (int).
 *
 * The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
 *
 *
 *
 * For example 12 and 30:
 *
 * 12 can be divided by 1, 2, 3, 4, 6, 12
 *
 * 30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
 *
 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.
 *
 *
 *
 * EXAMPLE INPUT/OUTPUT:
 *
 * getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
 *
 * getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
 *
 * getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
 *
 * getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder
 *
 *
 *
 * HINT: Use a while or a for loop and check if both numbers can be divided without a remainder.
 */


public class GreatestCommonDivisor {
    public static void main(String[] args) {

//        getGreatestCommonDivisor(21, 17); // test passed both numbers greater than 10
//        System.out.println(getGreatestCommonDivisor(7, 17));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }
    public static int getGreatestCommonDivisor (int first, int second) {
        /*
        Step 1: Initialize gcd
        We initialize a variable gcd to 1 because 1 is the smallest possible GCD of any two numbers.
        As we iterate, if we find a larger common divisor, we will update gcd.
        In this case, gcd needs to be a global variable that will get updated locally.
         */
        int gcd = 1;

        if (first < 10 || second < 10) { // Step 2:
            return -1; // If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
        }
        else {
            for (int i = 1; i <= Math.min(first, second); i++) {
            /*
            Step 3: Loop through possible divisors
            We start the loop from 1 since 1 is always a factor of any number.
            The loop runs up to the smaller of the two numbers (Math.min(first, second)).
            This is because the GCD cannot be greater than the smaller number.
            Example: If first = 12 and second = 30, we only check numbers from 1 to 12.
             */
                if (first % i == 0 && second % i == 0) {
                    /*
                    Step 4: Check if (i) is a common divisor
                    This condition checks whether i is a divisor of both numbers:
                    first % i == 0 → (i) is a factor of first
                    second % i == 0 → (i) is a factor of second
                    If both conditions are true, then (i) is a common divisor.
                     */
                    gcd = i; // Update the greatest common divisor
                    /*
                    If (i) is a common divisor, update gcd to (i).
                    Since the loop is running from 1 upward, the last valid (i) (largest common divisor) will be stored in gcd.
                     */
                }
            }
        }

        return gcd; // Step 5: Return the final gcd
    }
}
