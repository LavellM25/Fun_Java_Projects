/** Date: 3-22-2025
 *  This program is an example doing constructors in video lecture.
 */

package Section_7_Master_OOP.Extras;

public class Customer {

    // Step 1: Make the default instances
    private String name;
    private double creditlmit;
    private String email;


    // Step 2: Create a constructor that will pass in all the fields.
    public Customer(String name, double creditlmit, String email) {
        this.name = name;
        this.creditlmit = creditlmit;
        this.email = email;
    }

    /*
        To get this portion of the code, we have a built-in short-cut in IntelliJ when you click code,
        Then click generate code, this can allow you to get your getter and setter methods automatically
        w/o needing to write all that extra code by hand.
        On Mac machine, hold command then click all the fields which you want to make getter and setter methods for.
         */
    public double getCreditlmit() {
        return creditlmit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditlmit(double creditlmit) {
        this.creditlmit = creditlmit;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
