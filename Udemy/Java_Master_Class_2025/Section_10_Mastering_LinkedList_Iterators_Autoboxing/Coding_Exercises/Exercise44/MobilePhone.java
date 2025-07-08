package Section_10_Mastering_LinkedList_Iterators_Autoboxing.Coding_Exercises.Exercise44;

import java.util.ArrayList;

public class MobilePhone {

    /* Class Definition and Fields
    -  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
    - myNumber: represents the phone number of this mobile phone (owner's number).
    - myContacts: an ArrayList to hold Contact objects (i.e., people the owner has saved in their phone).
     */

    private String myNumber;
    private ArrayList<Contact> myContacts; // so no errors show up, you must create contact.java in the same directory.

    /* Constructor
    -  A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
    - Initialises the phone's number and creates an empty list of contacts.
    - This ensures the phone is ready to store contacts when it's created.
     */
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    /*  addNewContact(Contact contact)
    1st Method:
    Explanation:
    - First checks if the contact name already exists using findContact(String).
    - If it does, it returns false and doesn't add the duplicate.
    - Otherwise, it adds the contact and returns true.
     */
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false; // Already exists
        }
        myContacts.add(contact);
        return true;
    }

    /* 2nd Method:
    updateContact(Contact oldContact, Contact newContact)
    Explanation:
    If oldContact exists in myContacts (based on name)
    • Replace it with newContact
    • Return true
    • Else, return false
     */
    public boolean updateContact(Contact oldContact, Contact newContact) {
        /**
         * Checks if oldContact exists using findContact(Contact).
         * If not found, can't update — return false.
         * Then checks if the newContact name already exists elsewhere to prevent duplicate names.
         * If all checks pass, replaces the old contact at the found position.
         * Checks if: your changing the name, AND
         * The new name already exists elsewhere
         */

        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if (!oldContact.getName().equals(newContact.getName()) &&
                findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists.  Update was not successful.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    /* 3rd Method:
    removeContact(Contact contact)
    Explanation:
    - Uses findContact(Contact) to locate the contact in the list.
    - If found, removes it using ArrayList.remove(index).
    - Gives appropriate messages based on result.
     */
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    /* Helper Method:
    findContact(Contact contact)
    Explanation:
    - Uses ArrayList.indexOf() which relies on the equals() method of the Contact class.
    - Returns index of the contact or -1 if not found.
     */
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    /* Helper Method:
    findContact(String contactName)
    Explanation:
    - Loops through all contacts and compares names.
    - Returns index if found, -1 otherwise.
     */
    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    /* 4th Method:
    queryContact(String name)
    Explanation:
    - Returns the Contact object if it exists.
    - Otherwise, returns null.
     */
    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    /* 5th Method:
    printContacts()
    Explanation:
    - Prints all contacts in a user-friendly numbered list.
    - Matches the output format exactly as required in the prompt.
     */
    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
