package Example3;

//// Define a class to create and manage Example3.PersonCreator.Example3.Person objects
public class PersonCreator {

    // Define a static method to create and return a new Example3.PersonCreator.Example3.Person object
    public static Person createPerson(String name, int age) {
        // Create a new Example3.PersonCreator.Example3.Person object using the name and age provided and return it
        return new Person(name, age);
    }

    // Main method - the entry point of the program
    public static void main(String[] args) {
        // Call the 'createPerson' method with "John" as the name and 25 as the age.
        // Store the resulting Example3.PersonCreator.Example3.Person object in the variable 'person'
        Person person = createPerson("John", 25);
        // The 'createPerson' method:
        // 1. Receives "John" and 25 as input parameters.
        // 2. Creates a new Example3.PersonCreator.Example3.Person object by calling the Example3.PersonCreator.Example3.Person constructor with these values.
        // 3. Returns the newly created object to the caller.

        // Print out the details of the created Example3.PersonCreator.Example3.Person object
        System.out.println("Created Example3.PersonCreator.Example3.Person: " + person);
        // The 'toString' method of the Example3.PersonCreator.Example3.Person class will format the output like:
        // "Created Example3.PersonCreator.Example3.Person: Name: John, Age: 25"
    }
}

