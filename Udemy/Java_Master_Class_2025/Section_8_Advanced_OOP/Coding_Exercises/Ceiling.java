/** Please see directions from readme.java file and Bedroom.java file for directions.

 3) Create a class with the name Ceiling. There are two member variables for this one, height and paintedColor, both of type int.
 There should also be a constructor which accepts both member variables as parameters.
 There are also two additional methods which should be defined:
 getHeight() shall return the value of height and getPaintedColor() should return the value of paintedColor.
 */

package Section_8_Advanced_OOP.Coding_Exercises;

public class Ceiling {

    // Step 1: Create the constant variables:
    private int height;
    private int paintedColor;

    // Step 2: Create a constructor which accepts both member variables as parameters.
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    // Step 3: Create getter methods for the constant variables
    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
