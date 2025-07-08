package Section_10_Mastering_LinkedList_Iterators_Autoboxing.Coding_Exercises.Exercise44;

public class Contact {

    // Two private fields: name and phoneNumber
    private final String name;
    private final String phoneNumber;

    // Constructor that initializes both fields
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Method to create a Contact instance
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}

