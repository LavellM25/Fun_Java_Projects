package Section_5_Expression_Statements.Coding_Exercises.Exercise1;

/**
 * The objective of this coding exercise is to create a simple program that can check whether a number is positive,
 * negative or equal to zero.
 */

// Coding exercise 1: Positive, Negative or zero integer

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0)
            System.out.println("negative");
        else
            System.out.println("zero");

    }
}
