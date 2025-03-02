package Section_6_Control_Flow.Extras;

public class DiagonalStar {
    public static void main(String[] args) {
        int n = 10; // Size of the diagonal

        /*
        The outer loop (i) runs n times to print n lines.
        The inner loop (j) prints i spaces before printing *, creating a diagonal effect.
         */

        for (int i = 0; i < n; i++) {  // Loop for rows
            for (int j = 0; j < i; j++) {  // Print spaces before *
                System.out.print(" ");
            }
            System.out.println("*");  // Print star after spaces
        }
    }
}

