package Creating_Objects;

/* Date: 1-1-2025
   Description: How create objects in Java. A class in Java is a blueprint for creating objects.
                Classes in java, defines attributes (fields) and behaviors (methods).
                Objects in Java is a specific instance of a class, that can access the class's attributes and methods.
                Ex: Class identifies the blueprint for a car,
                Objects identifies a specific car built using that blueprint (e.g., "Red Toyota Corolla").
 */

/* How to create an Object in Java: ClassName objectName = new ClassName();
ClassName: The name of the class.
objectName: Reference variable to access the object.
new: Allocates memory for the object.
ClassName(): Calls the constructor of the class to initialize the object.
 */

public class Car {
    String brand = "Toyota";  // Attribute

    public void honk() {  // Method
        System.out.println("Beep Beep!");
    }

    // Creating_Objects.Car myCar = new Creating_Objects.Car();
    // myCar: Reference variable pointing to the object in memory.
    // new Creating_Objects.Car(): Allocates memory and initializes the object.
    public static void main(String[] args) {
        // Create an object of the Creating_Objects.Car class
        Car myCar = new Car();

        // Access attributes and methods
        System.out.println(myCar.brand);  // Access attribute
        myCar.honk();                     // Call method
    }
}
/* Objects in Java are created to do the following:
Encapsulation: Store data (attributes) and behavior (methods) together.
Modularity: Use the same blueprint (class) to create multiple objects.
Reuse Code: Access methods and fields of a class multiple times.
Scalability: Easily create, manage, and update objects independently.
 */
