/** Please see directions from readme.java file and Bedroom.java file for directions.

 4) Create a class with the name Wall. It contains one member variable, direction, and is of type String.
 A constructor for Wall should accept one parameter for the member variable direction.
 A getter should also be defined for the direction field called getDirection().
 */

package Section_8_Advanced_OOP.Coding_Exercises;

public class Wall {

    // Step 1: Create the constant variables:
    private String direction;

    // Step 2: constructor for Wall should accept one parameter for the member variable direction.
    public Wall(String direction) {
        this.direction = direction;
    }

    // Step 3: Create a getter method for the constant variable
    public String getDirection() {
        return direction;
    }
}
