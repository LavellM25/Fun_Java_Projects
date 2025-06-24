package Section_10_Mastering_LinkedList_Iterators_Autoboxing.Coding_Exercises.Exercise44;

import java.util.ArrayList;

public class MobilePhone {

    /*
    -  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
     */
    private String myNumber;
    private ArrayList<Contact> myContacts; // so no errors show up, you must create contact.java in the same directory.

    /*
    -  A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
     */

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    /* 1st Method:
    Explanation:
    - Loop through myContacts
    - Compare names with equalsIgnoreCase (to ignore case)
	- If a match is found → return false
	- If loop finishes → add contact and return true
     */
    public boolean addNewContact(Contact contact) {
        for (Contact existingContact : myContacts) {
            if (existingContact.getName().equalsIgnoreCase(contact.getName())) {
                return false; // Already exists
            }
        }
        myContacts.add(contact);
        return true;
    }

    /* 2nd Method:
    Explanation:
    If oldContact exists in myContacts (based on name)
	•	Replace it with newContact
	•	Return true
	•	Else, return false
     */
    public boolean updateContact(Contact oldContact, Contact newContact) {
        /**
         * Loop through all existing contacts
         * 	•	Compare the name of each contact to oldContact
         * 	•	If match found, replace it using ArrayList.set(index, newValue)
         * 	•	Else, return false
         */
        for (int i = 0; i < myContacts.size(); i++) {
            Contact current = myContacts.get(i);
            if (current.getName().equalsIgnoreCase(oldContact.getName())) {
                myContacts.set(i, newContact);
                return true;
            }
        }
        return false;
    }



}
