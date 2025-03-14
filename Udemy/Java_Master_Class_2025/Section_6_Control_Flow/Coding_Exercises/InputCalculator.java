package Section_6_Control_Flow.Coding_Exercises;

// Coding Exercise 28: Interactive Summation And Average Calculator From User Input

/**
 * Continuously read integers from keyboard input, compute their sum and the rounded average,
 * and handle invalid entries gracefully.
 *
 * Write a method called inputThenPrintSumAndAverage that does not have any parameters.
 *
 * The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
 *
 * When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
 *
 * XX represents the sum of all entered numbers of type int.
 * YY represents the calculated average of all numbers of type long.
 *
 *
 *
 * EXAMPLES OF INPUT/OUTPUT:
 *
 * EXAMPLE 1:
 *
 * INPUT:
 *
 * 1
 * 2
 * 3
 * 4
 * 5
 * a
 * OUTPUT
 *
 * SUM = 15 AVG = 3
 *
 *
 *
 * EXAMPLE 2:
 *
 * INPUT:
 *
 * hello
 *
 * OUTPUT:
 *
 * SUM = 0 AVG = 0
 *
 *
 *
 * TIP: Use Scanner to read an input from the user.
 *
 * TIP: Use casting when calling the round method since it needs double as a parameter.
 */

import java.util.Scanner;


public class InputCalculator {
    public static void main(String[] args) {

    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in); // Scanner Object: Reads user input.

        // Initialize the sum and count
        int sum = 0;
        int count = 0;

        // Loop (while (scanner.hasNextInt()))
        // Checks if input is an integer. If a non-integer is entered (e.g., "hello" or "a"), the loop exits.
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
            count++;
        }
        // Calculate average (avoid division by zero)
        // Uses Math.round() to round the average.
        long avg = (count == 0) ? 0 : Math.round((double) sum / count);

        // Print results
        // Prints SUM = XX AVG = YY.
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}

