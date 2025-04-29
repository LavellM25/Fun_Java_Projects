package Section_6_Control_Flow.Coding_Exercises.Exercise27;

// Coding Exercise 27: Constructing A Diagonal Star Pattern With Loops

/**
 * Use nested loops and conditional checks to print diagonal lines of stars forming a rectangular pattern.
 *
 * Write a method named printSquareStar with one parameter of type int named number.
 *
 * If number is < 5, the method should print "Invalid Value".
 *
 * The method should print diagonals to generate a rectangular pattern composed of stars (*).
 * This should be accomplished by using loops
 *
 * EXAMPLE INPUT/OUTPUT:
 *
 * EXAMPLE 1
 *
 * printSquareStar(5); should print the following:
 *
 * → NOTE: For text in Code Blocks below, use code icon {...}  on Udemy
 *
 * *****
 * ** **
 * * * *
 * ** **
 * *****
 *
 * Explanation:
 *
 * *****   5 stars
 * ** **   2 stars space 2 stars
 * * * *   1 star space 1 star space 1 star
 * ** **   2 stars space 2 stars
 * *****   5 stars
 *
 *
 * EXAMPLE 2
 *
 * printSquareStar(8); should print the following:
 *
 * ********
 * **    **
 * * *  * *
 * *  **  *
 * *  **  *
 * * *  * *
 * **    **
 * ********
 *
 *
 * The patterns above consist of a number of rows and columns (where number is the number of rows to print).
 * For each row or column, stars are printed based on four conditions (Read them carefully):
 *
 * In the first or last row
 *
 * In the first or last column
 *
 * When the row number equals the column number
 *
 * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
 */

public class Exercise_27 {
    public static void main(String[] args) {

        printSquareStar(8);
    }

    public static void printSquareStar(int number) {

        // Step 1: Handle Invalid Input
        /*
        If the user provides a value less than 5, we print "Invalid Value" and exit the method
        (return; ensures the rest of the code doesn't run).
        This prevents generating patterns for very small numbers.
         */
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Step 2: Use Nested Loops to Create the Square
        /**
         * The outer loop (for (int row = 1; row <= number; row++)) runs from 1 to number, controlling the rows of the pattern.
         * The inner loop (for (int col = 1; col <= number; col++)) runs from 1 to number, controlling the columns in each row.
         * This combination ensures we print a square of size number × number.
         */
        for (int row = 1; row <= number; row++) {  // Outer loop for rows
            for (int col = 1; col <= number; col++) {  // Inner loop for columns

            // Step 3: When to Print a Star (*)
                /**
                 * ✅ Condition 1: First or Last Row (row == 1 || row == number)
                 *Ensures that the first (row == 1) and last (row == number) rows are completely filled with *.
                 *
                 * ✅ Condition 2: First or Last Column (col == 1 || col == number)
                 * Ensures that the first (col == 1) and last (col == number) columns are filled with *.
                 *
                 * ✅ Condition 3: Main Diagonal (row == col)
                 * If the row number and column number are equal, we are on the main diagonal (↘ top-left to bottom-right).
                 *
                 * ✅ Condition 4: Secondary Diagonal (col == (number - row + 1))
                 * This condition identifies the secondary diagonal (↙ top-right to bottom-left).
                 * (number - row + 1) calculates the correct column position for the diagonal.
                 */
                if (row == 1 || row == number || col == 1 || col == number ||
                        row == col || col == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        /**
         * How the Code Works for printSquareStar(5)
         * Let's go step by step for number = 5:
         *
         * Row (i)	Column (j)	Printed Output
         * 1	1 2 3 4 5	***** (First row)
         * 2	1 2 3 4 5	** ** (Borders & diagonals)
         * 3	1 2 3 4 5	* * * (Main & secondary diagonal)
         * 4	1 2 3 4 5	** ** (Borders & diagonals)
         * 5	1 2 3 4 5	***** (Last row)
         */
    }
}