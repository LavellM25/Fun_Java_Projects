# 📱 Mobile Phone Contacts Manager

## 🧩 Project Overview

This project is a simple **Mobile Phone Contacts Manager** built in Java. It allows users to:
- Add new contacts
- Update existing contacts
- Remove contacts
- Search/query contacts
- Print all contacts in a clean format

It simulates core functionality you might find in a basic mobile phone app for storing contact information.

---

## 📁 Files Included

### `Contact.java`
- Represents a **single contact** with a name and phone number.
- Includes:
    - Private fields: `name`, `phoneNumber`
    - Getter methods: `getName()`, `getPhoneNumber()`
    - A static factory method: `createContact(String name, String phoneNumber)`

### `MobilePhone.java`
- Represents the **mobile phone itself**, which stores a list of contacts using an `ArrayList<Contact>`.
- Includes all core contact management logic, such as:
    - `addNewContact(Contact contact)`
    - `updateContact(Contact oldContact, Contact newContact)`
    - `removeContact(Contact contact)`
    - `queryContact(String name)`
    - `printContacts()`
- Contains two private helper methods:
    - `findContact(Contact contact)` — searches by object
    - `findContact(String name)` — searches by contact name

### `Main.java`
- A simple driver class used for **manual testing**.
- Tests all major functionality:
    - Adding contacts
    - Preventing duplicates
    - Updating and removing contacts
    - Querying contact details
    - Displaying the final contact list

---

## 🚀 How to Run the Program

1. Open your Java IDE (like IntelliJ IDEA or Eclipse), or use the command line.
2. Make sure all three files (`Contact.java`, `MobilePhone.java`, and `Main.java`) are in the same package or directory.
3. Compile and run `Main.java`.

### 📦 Command Line Example:
```bash
javac Contact.java MobilePhone.java Main.java
java Main
