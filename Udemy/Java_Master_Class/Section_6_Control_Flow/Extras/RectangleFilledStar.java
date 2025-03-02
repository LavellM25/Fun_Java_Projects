package Section_6_Control_Flow.Extras;

public class RectangleFilledStar {
    public static void main(String[] args) {

        /*
        The outer loop (i) runs rows times (5 in this case).
        The inner loop (j) prints cols number of stars (10 in this case) in each row.
        After each row is printed, System.out.println(); moves to the next line.
         */

        int rows = 8;  // Height of the rectangle
        int cols = 2; // Width of the rectangle

        for (int i = 0; i < rows; i++) {   // Loop for rows
            for (int j = 0; j < cols; j++) { // Loop for columns
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}
