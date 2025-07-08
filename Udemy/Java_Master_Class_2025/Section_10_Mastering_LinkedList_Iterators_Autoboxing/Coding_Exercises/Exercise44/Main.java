package Section_10_Mastering_LinkedList_Iterators_Autoboxing.Coding_Exercises.Exercise44;

public class Main {
    public static void main(String[] args) {
        // Initialize the mobile phone
        MobilePhone phone = new MobilePhone("123-456-7890");

        // Test 1: Add new contacts
        Contact bob = Contact.createContact("Bob", "31415926");
        Contact alice = Contact.createContact("Alice", "16180339");
        Contact tom = Contact.createContact("Tom", "11235813");
        Contact jane = Contact.createContact("Jane", "23571113");

        System.out.println("\n--- Add New Contacts ---");
        System.out.println("Added Bob? " + phone.addNewContact(bob));   // true
        System.out.println("Added Alice? " + phone.addNewContact(alice)); // true
        System.out.println("Added Tom? " + phone.addNewContact(tom));   // true
        System.out.println("Added Jane? " + phone.addNewContact(jane));  // true

        // Test 2: Try to add duplicate contact
        System.out.println("\n--- Add Duplicate ---");
        System.out.println("Added Bob again? " + phone.addNewContact(bob)); // false

        // Test 3: Print all contacts
        System.out.println("\n--- Print Contacts ---");
        phone.printContacts();

        // Test 4: Update existing contact
        System.out.println("\n--- Update Contact ---");
        Contact newBob = Contact.createContact("Bob", "99999999");
        System.out.println("Update Bob to new number? " + phone.updateContact(bob, newBob)); // true

        // Test 5: Try updating non-existent contact
        Contact ghost = Contact.createContact("Ghost", "00000000");
        System.out.println("Update non-existent Ghost? " + phone.updateContact(ghost, newBob)); // false

        // Test 6: Try updating to a duplicate name
        Contact duplicateName = Contact.createContact("Alice", "77777777");
        System.out.println("Update Tom to Alice's name? " + phone.updateContact(tom, duplicateName)); // false

        // Test 7: Remove contact
        System.out.println("\n--- Remove Contact ---");
        System.out.println("Remove Jane? " + phone.removeContact(jane)); // true

        // Test 8: Remove non-existent contact
        System.out.println("Remove Jane again? " + phone.removeContact(jane)); // false

        // Test 9: Query contact
        System.out.println("\n--- Query Contact ---");
        Contact queried = phone.queryContact("Bob");
        System.out.println("Queried Bob: " + (queried != null ? queried.getPhoneNumber() : "Not found")); // should show 99999999

        Contact notFound = phone.queryContact("Ghost");
        System.out.println("Queried Ghost: " + (notFound != null ? notFound.getPhoneNumber() : "Not found")); // Not found

        // Final contact list
        System.out.println("\n--- Final Contact List ---");
        phone.printContacts();
    }
}

