package Section_6_Control_Flow.Coding_Exercises;

// Coding Exercise 27: Constructing a Diagonal Star Pattern with Loops

/*
Use nested loops and conditional checks to print diagonal lines of stars forming a rectangular pattern.
 */

/**
 * Write a method named printSquareStar with one parameter of type int named number.
 *
 * If number is < 5, the method should print "Invalid Value".
 *
 * The method should print diagonals to generate a rectangular pattern composed of stars (*).
 * This should be accomplished by using loops (see examples below).
 */

public class DiagonalStar {
    public static void main(String[] args) {

        System.out.println(printSquareStar(6));
    }
    public static boolean printSquareStar (int number) {
        if (number < 5 ) {
            System.out.println("Invalid Value");
        }

        for (int i = 0; i < number; i++) {
            System.out.println("*");
            for (int j = 0; j < number; j++) {
                System.out.println("*");
            }
        }

        return true;
    }
}
