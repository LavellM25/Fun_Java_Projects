# ⭐ Exercise 27: Diagonal Star Pattern

## 📝 Overview

This Java program prints a square pattern made of asterisks (`*`) with diagonal symmetry. The pattern is generated using **nested loops** and **conditional logic**. The square contains:
- Filled borders (top, bottom, left, right)
- A main diagonal (↘)
- A secondary diagonal (↙)

The pattern only prints if the given `number` is **greater than or equal to 5**. Otherwise, it prints `"Invalid Value"`.

---

## 🛠️ How It Works

### Method: `printSquareStar(int number)`

This method prints a square `number x number` in size, made of stars and spaces.

- **Condition 1:** Print `*` on the **first or last row**
- **Condition 2:** Print `*` on the **first or last column**
- **Condition 3:** Print `*` on the **main diagonal** (where row == col)
- **Condition 4:** Print `*` on the **secondary diagonal** (where col == number - row + 1)

Any cell not meeting these conditions will print a space.

--- 

## 📚 Key Concepts Practiced
- Nested loops
- Row and column indexing
- Conditional logic
- Pattern design
- Edge case handling

--- 

## 📈 Potential Improvements
- Allow user input through Scanner for interactive pattern generation.
- Add additional pattern styles (e.g., hollow squares, triangles, pyramids).
- Export pattern to a .txt file.

--- 

## 🚀 Sample Output

### Input:
```java

public class Example {
    public static void main(String[] args) {

        printSquareStar(8);
        /** Output: 
         *
         ********
         **    **
         * *  * *
         *  **  *
         *  **  *
         * *  * *
         **    **
         ********
         */
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
