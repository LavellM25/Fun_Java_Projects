/** Date: 3-22-2025
 *  This program is an example doing constructors in video lecture.
 */


package Section_7_Master_OOP.Extras;

public class Main {
    public static void main(String[] args) {
//        System.out.println("This folder is for extra coding exercises in section 7 where I am learning about" +
//                "Object-Orientated Programming in Java");


        // Now you have made the instance of the customer.java file and passed in args:
        // First arg: Name
        // Second arg: credit limit
        // Third arg: email
        Customer c = new Customer("Tim", 2000, "tim@email.com");

        // Now let's print this to the console to ensure this info is correct:
        // Test passed, all code has successfully been passed in.
        System.out.println(c.getName());
        System.out.println(c.getCreditlmit());
        System.out.println(c.getEmail());


    }
}
