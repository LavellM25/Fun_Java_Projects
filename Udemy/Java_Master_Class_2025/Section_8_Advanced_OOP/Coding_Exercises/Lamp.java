/** Please see directions from readme.java file and Bedroom.java file for directions.

 1) Create a class and name it Lamp. Inside this class should be declared three member variables:
 style of type String, battery of type boolean, and globRating of type int.
 All variables should be marked private. A constructor needs to be created which accepts the three member variables as parameters.
 In addition, four methods should also be created:
 turnOn() has no return type and should print a message that the lamp is being turned on;
 getStyle() returns the lamp style; isBattery returns the value of battery; and getGlobRating() returns the globRating of the lamp.
 */

package Section_8_Advanced_OOP.Coding_Exercises;

public class Lamp {

    // Step 1: Create the constant variables
    private String style;
    private boolean battery;
    private int globRating;

    // Step 2: constructor needs to be created which accepts the three member variables as parameters.
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // I have to create a constructor that doesn't have any args so the object lamp in main method won't fail
    // see Bedroom.java getLamp() method for more info
    public Lamp() {
    }

    // Step 3: turnOn() has no return type and should print a message that the lamp is being turned on
    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    // Step 4: getter method for style that returns the lamp style
    public String getStyle() {
        return style;
    }

    // Step 5: returns the value of battery
    public boolean isBattery() {
        return battery;
    }

    // Step 6: create a getter method for globRating that returns the globRating of the lamp.
    public int getGlobRating() {
        return globRating;
    }
}
