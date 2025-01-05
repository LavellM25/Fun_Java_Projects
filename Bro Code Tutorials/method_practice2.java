/* Date: 1-1-2025
   Description: How to write and structure methods which act similar to how a function works in Python, a block a code
                that executes when called on. In java methods must be outside the main{} brackets.
 */

public class method_practice2 {

    // Method to calculate the square of a number
    // square(int number) → Returns the square of an integer.
    public int square(int number) {
        return number * number;
    }

    // Method to print a personalized greeting
    // greetUser(String name) → Prints a personalized greeting.
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to the program.");
    }

    // Static method to add two numbers
    // add(int a, int b) → Static method that adds two integers.
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Create an object of the class to call instance methods
        method_practice2 obj = new method_practice2();

        // Call the square method
        int squared = obj.square(5);
        System.out.println("The square of 5 is: " + squared);

        // Call the greetUser method
        obj.greetUser("Alice");

        // Call the static add method directly (no object needed)
        int sum = add(10, 20);
        System.out.println("The sum of 10 and 20 is: " + sum);
    }
}
