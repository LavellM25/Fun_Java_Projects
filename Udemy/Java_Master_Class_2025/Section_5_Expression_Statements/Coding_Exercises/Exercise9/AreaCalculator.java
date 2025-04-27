package Section_5_Expression_Statements.Coding_Exercises.Exercise9;

/**
 * The objective of this coding exercise is to write a small program that
 * can calculate the area of a circle and a rectangle.
 */

// Coding exercise 9: Area Calculator

public class AreaCalculator {
    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));

    }
    // Write a method that represents the area of a circle
    public static double area (double radius) {
        if (radius < 0) {
            return -1; // to represent an invalid value
        }
        return Math.PI * radius * radius; // Formula for area of a circle
// Import the built math operator from java for Pi
    }
    // write another overloaded method with 2 arg, x and y
    public static double area (double x, double y ) {
        if (x < 0 || y < 0) {
            return -1;  // to represent an invalid value
        }
        return x * y;
    }
}
