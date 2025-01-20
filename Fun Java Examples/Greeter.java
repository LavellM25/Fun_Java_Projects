/* Date: 1-12-2025
   Description: Return statement in Java is a keyword used in methods to specify the value that should be returned
                to the caller after the method has executed. This an example use case of a return statement used.
 */

public class Greeter {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        String message = greet("Alice");
        System.out.println(message); // Prints: Hello, Alice!
    }
}
