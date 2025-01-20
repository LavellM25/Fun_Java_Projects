/* Date: 1-12-2025
   Description: Return statement in Java is a keyword used in methods to specify the value that should be returned
                to the caller after the method has executed. This an example use case of a return statement used.
 */

/* Purpose: The return statement exits from a method and optionally sends a value back to the caller.
   Return Type: The method's return type (specified in the method declaration) determines what
   kind of value must be returned. For example:
   int for integer values.
   String for string values.
   void if the method does not return anything.
   Mandatory for Non-Void Methods: If the method specifies a return type other than void, a return statement must be present.
 */

public class Calculator {
    public static int add(int a, int b) {
        return a + b; // Returns the sum of a and b
    }

    public static void main(String[] args) {
        int result = add(5, 4); // Calling the add method
        System.out.println("Result: " + result);
    }
}

// Common Use Cases:
// Conditional Returns: Exiting early from a method based on a condition.
// Reusability: Returning values allows methods to be reused in various contexts, making the code modular.
