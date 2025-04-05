package Example3;

/* Date: 1-12-2025
   Description: Learning about classes and return statements. Public classes must be declared in a file
                with the same name as the class. Only one public class is allowed per file. 
 */


//package Example3.PersonCreator;

// Define a class to represent a person with name and age fields
class Person {
    public String name; // Name of the person
    public int age;     // Age of the person

    // Constructor to initialize the Example3.PersonCreator.Example3.Person object with a name and age
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


