package Section_5_Expression_Statements.Coding_Exercises.Exercise11;

/**
 * The objective of this coding exercise is to develop a program capable of
 * ascertaining whether three given numbers are equal, different from each other,
 * or exhibit a combination of both.
 */

// Coding exercise 11: Equality Printer

/**
 * Equality Printer
 * Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
 *
 * If one of the parameters is less than 0, print text "Invalid Value".
 *
 * If all numbers are equal print text "All numbers are equal"
 *
 * If all numbers are different print text "All numbers are different".
 *
 * Otherwise, print "Neither all are equal or different".
 *
 *
 *
 * EXAMPLES OF INPUT/OUTPUT:
 *
 * printEqual(1, 1, 1); should print text All numbers are equal
 *
 * printEqual(1, 1, 2); should print text Neither all are equal or different
 *
 * printEqual(-1, -1, -1); should print text Invalid Value
 *
 * printEqual(1, 2, 3); should print text All numbers are different
 */


public class IntEqualityPrinter {
    public static void main(String[] args) {

        printEqual(1, 1, 1);  // test passed. Expected: All numbers are equal
        printEqual(1, 1, 2);  // test passed. Expected: Neither all are equal or different
        printEqual(1, 2, 3); // test passed. Expected: All numbers are different
        printEqual(-1, -1, -1); // Expected: Invalid Value

    }
    public static void printEqual (int a, int b, int c ) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
