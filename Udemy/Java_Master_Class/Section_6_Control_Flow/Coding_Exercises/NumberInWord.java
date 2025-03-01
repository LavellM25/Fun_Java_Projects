package Section_6_Control_Flow.Coding_Exercises;

import java.util.Scanner;

/**
 * The objective of this coding exercise is to write a small program that prints out the word of the number.
 * Write a method called printNumberInWord. The method has one parameter number which is the whole number.
 * The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9
 * or other for any other number including negative numbers.
 * You can use if-else statement or switch statement whatever is easier for you.

 *This demonstrates:
 *Switch statements (or expressions)
 * Control flow in Java
 * Handling unexpected inputs with a default case
 */

// Coding exercise 13: Number in Word

public class NumberInWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int guessNumber = scanner.nextInt();

        // Call the method
        printNumberInWord(guessNumber);

        scanner.close(); // close the scanner

    }
    public static void printNumberInWord (int number) {

        switch (number) { // If user enters any number 0-9, it will match it with a fully spelled on number.
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default: // this will handle if the user enters a negative # or a # not in the range of 0-9
                System.out.println("This is a not a number");
        }
    }
}
