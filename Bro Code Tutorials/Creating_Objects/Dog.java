package Creating_Objects;

/* Date: 1-1-2025
   Description: Another real-world example of how to create objects in Java.
 */

// Define a class named Creating_Objects.Dog
public class Dog {

    // Step 1: Declare an attribute 'name' for the Creating_Objects.Dog class to store the dog's name
    String name;

    // Step 2: Define a method 'bark' that will print the dog's name followed by "is barking!"
    public void bark() {
        System.out.println(name + " is barking!");
        // When this method is called, it will display the dog's name along with "is barking!" message.
    }

    // Step 3: Define the main method (entry point of the program)
    public static void main(String[] args) {

        // Step 4: Create the first object of the Creating_Objects.Dog class and assign it to the reference variable 'dog1'
        Dog dog1 = new Dog();
        // At this point, dog1 is a Creating_Objects.Dog object, but its 'name' attribute is still null.

        // Step 5: Assign the value "Buddy" to the 'name' attribute of dog1
        dog1.name = "Buddy";
        // Now, dog1 has a name: "Buddy"

        // Step 6: Create the second object of the Creating_Objects.Dog class and assign it to the reference variable 'dog2'
        Dog dog2 = new Dog();
        // dog2 is another Creating_Objects.Dog object, separate from dog1.

        // Step 7: Assign the value "Max" to the 'name' attribute of dog2
        dog2.name = "Max";
        // Now, dog2 has a name: "Max"

        // Step 8: Call the 'bark' method on dog1
        dog1.bark();
        // The program will print: "Buddy is barking!" because dog1's name is "Buddy"

        // Step 9: Call the 'bark' method on dog2
        dog2.bark();
        // The program will print: "Max is barking!" because dog2's name is "Max"
    }
}
