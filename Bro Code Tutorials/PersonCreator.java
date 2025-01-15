/* Date: 1-12-2025
   Description: Learning about classes and return statements. Public classes must be declared in a file
                with the same name as the class. Only one public class is allowed per file. 
 */


package PersonCreator;

// Define a class to represent a person with name and age fields
class Person {
    public String name; // Name of the person
    public int age;     // Age of the person

    // Constructor to initialize the PersonCreator.Person object with a name and age
    public Person(String name, int age) {
        this.name = name; // Set the name field with the provided value
        this.age = age;   // Set the age field with the provided value
    }

    // Override the toString method to display the person's details in a readable format
    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age; // Format the output
    }
}

// Define a class to create and manage PersonCreator.Person objects
public class PersonCreator {

    // Define a static method to create and return a new PersonCreator.Person object
    public static Person createPerson(String name, int age) {
        // Create a new PersonCreator.Person object using the name and age provided and return it
        return new Person(name, age);
    }

    // Main method - the entry point of the program
    public static void main(String[] args) {
        // Call the 'createPerson' method with "John" as the name and 25 as the age.
        // Store the resulting PersonCreator.Person object in the variable 'person'
        Person person = createPerson("John", 25);
        // The 'createPerson' method:
        // 1. Receives "John" and 25 as input parameters.
        // 2. Creates a new PersonCreator.Person object by calling the PersonCreator.Person constructor with these values.
        // 3. Returns the newly created object to the caller.

        // Print out the details of the created PersonCreator.Person object
        System.out.println("Created PersonCreator.Person: " + person);
        // The 'toString' method of the PersonCreator.Person class will format the output like:
        // "Created PersonCreator.Person: Name: John, Age: 25"
    }
}
