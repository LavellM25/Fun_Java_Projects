package Creating_Methods;

/* Date: 1-1-2025
   Description: Methods in Java is similar to how a function in python is, as this is a block of code that is executed
                whenever you call on the name of the function();
 */

public class making_methods {
    public static void main(String[] args) {
        String name = "John";
        hello(name);
        // To make a method in Java, the class type has to be consistent, in the example static is used in the main,
        // so in the method hello() that is called, I used static for consistency.
        // Additionally, you must initiate what type of data type the method is when called on, then the argument.
    }
    static void hello(String name){
        System.out.println("Hello "+ name);
    }
}
