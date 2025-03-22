/** Date: 3-22-2025
 * This is simple example for extras of section 7 OOP to go over
 * Static vs. Instance in Java
 *
 * static = belongs to the class, shared by all objects.
 * non-static (instance) = belongs to the object, each object gets its own copy.
 */

package Section_7_Master_OOP.Extras;

public class Dog {

    static int numberOfDogs = 0; // Static variable (shared)
    String name;                 // Instance variable (unique per object)

    public Dog(String dogName) {
        name = dogName;
        numberOfDogs++; // Increments for every new Dog created
    }

    // Static method
    public static void printTotalDogs() {
        System.out.println("Total dogs: " + numberOfDogs);
    }

    // Instance method
    public void bark() {
        System.out.println(name + " says Woof!");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Buddy");
        Dog d2 = new Dog("Max");

        d1.bark();            // Instance method. Output: Buddy says Woof!
        d2.bark();            // Instance method. Output: Max says Woof!
        Dog.printTotalDogs(); // Static method called on class. Output Total dogs: 2

        /** Here is an explanation of what is going on:
         * numberOfDogs is a static variable — shared across all Dog instances.
         *
         * name is unique to each dog — stored in instance variables.
         *
         * bark() is an instance method — needs an object.
         *
         * printTotalDogs() is static — called on the class itself.
         */
    }
}
