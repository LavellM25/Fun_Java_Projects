// Coding Exercise 31: Person Class and Age Validation

package Section_7_Master_OOP.Coding_Exercises.Exercise31;

public class Person {
    /** Step 1: Define class and fields: Create a class named Person.
     * Fields (Instance Variables)
     * firstName (String)
     * lastName (String)
     * age (int)
     */

    private String firstName;
    private String lastName;
    private int age;

    /** Step 2: Implement Getter Methods
     * Method named getFirstName without any parameters, it needs to return the value of the firstName field.
     * @return the value of firstName
     */
    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    /** Step 2: Implement Getter Methods
     * Method named getLastName without any parameters, it needs to return the value of the lastName field.
     * @return the value of lastName
     */
    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    /** Step 2: Implement Getter Methods
     * Method named getAge without any parameters, it needs to return the value of the age field.
     * @return the value of Age
     */
    // Getter for age
    public int getAge() {
        return age;
    }

    /* Key Takeaways for Step 3:
    ✅ this. ensures you are modifying the instance variable, not the method parameter.
    ✅ It is only necessary when the method parameter has the same name as the instance variable.
    ✅ Without this, Java would assume you are only modifying the parameter inside the method, not the actual field of the object.
     */

    /** Step 3: Implement Setter Methods
     * Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
     * @param firstName Assign the given value to firstName.
     *
     * this.firstName refers to the instance variable of the Person object.
     * firstName (without this) is the method parameter.
     * Why use this? Without it, Java assumes both refer to the method parameter, leading to no actual assignment.
     */
    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** Step 3: Implement Setter Methods
     * Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
     * @param lastName Assign the given value to lastName.
     *                 Same logic as above: this.lastName refers to the class field, while lastName is the parameter.
     */
    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** Step 3: Implement Setter Methods
     * Method named setAge with one parameter of type int, it needs to set the value of the age field.
     * If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
     * @param age:  If age < 0 or age > 100, set age to 0.
     * Otherwise, assign the given value to age.
     */
    // Setter for age (with validation)
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0; // Invalid ages are set to 0
        } else {
            this.age = age;
        }
    }

    /** Step 4: Check for teenager
     * isTeen():
     * Return true if age > 12 and age < 20, otherwise return false.
     * @return age between 13 and 19
     */

    // Method to check if the person is a teenager (age between 13 and 19)
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    /** Step 5: Get the Full Name
     * 1. If both firstName and lastName are empty, return an empty string.
     * 2. If only lastName is empty, return firstName.
     * 3. If only firstName is empty, return lastName.
     * 4. Otherwise, return "firstName lastName".
     * @return
     */
    // Method to get the full name
    public String getFullName() {
        // Step 1
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return ""; // Both names are empty
        // Step 2
        } else if (lastName.isEmpty()) {
            return firstName; // Only lastName is empty
        // Step 3
        } else if (firstName.isEmpty()) {
            return lastName; // Only firstName is empty
        // Step 4
        } else {
            return firstName + " " + lastName; // Both names are present
        }
    }

    // Main method for testing the class
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName(""); // firstName is empty
        person.setLastName("");  // lastName is empty
        person.setAge(10);

        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setLastName("Smith");

        System.out.println("fullName= " + person.getFullName());
    }
}
