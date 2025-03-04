package Section_6_Control_Flow.Extras;

public class RectangleStar {
    public static void main(String[] args) {

        int rows = 8;  // Number of rows (height)
        int cols = 5; // Number of columns (width)

        /**
         * Outer Loop (i): Iterates over each row.
         * Inner Loop (j): Iterates over each column.
         *
         * Condition:
         * i == 0 or i == rows - 1 ensures the top and bottom rows are filled with stars.
         * j == 0 or j == cols - 1 ensures the first and last columns are stars.
         * All other positions are filled with spaces.
         */
        for (int i = 0; i < rows; i++) {       // Loop through rows
            for (int j = 0; j < cols; j++) {   // Loop through columns
                // Print a star on the borders; otherwise, print a space
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
