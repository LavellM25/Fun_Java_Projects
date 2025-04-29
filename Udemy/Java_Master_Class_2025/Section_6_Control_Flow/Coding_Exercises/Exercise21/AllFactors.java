package Section_6_Control_Flow.Coding_Exercises.Exercise21;

// Coding Exercise 21: All Factors

/**
 * The objective of this coding exercise is to write a small program that prints out all the factors of a given number.
 *
 * Write a method named printFactors with one parameter of type int named number.
 *
 * If number is < 1, the method should print "Invalid Value".
 *
 * The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
 *
 * For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.
 *
 *
 *
 * EXAMPLE INPUT/OUTPUT:
 *
 * printFactors(6); → should print 1 2 3 6
 *
 * printFactors(32); → should print 1 2 4 8 16 32
 *
 * printFactors(10); → should print 1 2 5 10
 *
 * printFactors(-1); → should print "Invalid Value" since number is < 1
 *
 *
 *
 * HINT: Use a while or for loop.
 */

public class AllFactors {
    public static void main(String[] args) {

        // Call the method to test the logic
//        printFactors(-1); // → should print "Invalid Value" since number is < 1
//        printFactors(6); // → should print "Invalid Value" since number is < 1
//        printFactors(32); // → should print 1 2 4 8 16 32
//        printFactors(10); // → should print 1 2 5 10
        printFactors(5);
    }

    public static void printFactors(int number) {
        if (number >= 1) { // Condition is that the number must be equal to or greater than 1.
            System.out.println("Factor pairs of " + number + ":");

            // Step 2: Loop from 1 to sqrt(N) to find factor pairs
            //  stop at √N (square root of N) to avoid repeating factor pairs.
            // We only check up to √N because:
            //Factors repeat after square root.
            //If we find a factor i, it automatically get paired with N / i.
            //This reduces iterations and makes the program more efficient.
            // So basically, loop from 1 to square root of N.
            for (int i = 1; i * i <= number; i++) {
                if (number % i == 0) { // Check if 'i' is a factor
                    int factor1 = i;
                    int factor2 = number / i;
                    System.out.println(factor1 + " x " + factor2 + " = " + number);
                }
            }
        }
        else {
            System.out.println("Invalid Value");// If condition is not met, handle error
            }
        }
    }
