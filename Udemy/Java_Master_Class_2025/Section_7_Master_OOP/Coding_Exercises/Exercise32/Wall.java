/** Date: 3-19-2025
 * Coding Exercise 32: Wall Area Computation
 *
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
 *
 * The class needs to have two constructors:
 *
 * The first constructor does not have any parameters (no-args constructor).
 *
 * The second constructor has parameters width and height of type double and it needs to initialize the fields.
 *
 * In case the width parameter is less than 0 it needs to set the width field value to 0.
 *
 * In case the height parameter is less than 0 it needs to set the height field value to 0.
 *
 * Write the following methods (instance methods):
 *
 * Method named getWidth without any parameters, it needs to return the value of width field.
 *
 * Method named getHeight without any parameters, it needs to return the value of height field.
 *
 * Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
 *
 * Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
 *
 * Method named getArea without any parameters, it needs to return the area of the wall.
 */

/* TEST EXAMPLE
→ TEST CODE:

1 Wall wall = new Wall(5,4);
2 System.out.println("area= " + wall.getArea());
3
4 wall.setHeight(-1.5);
5 System.out.println("width= " + wall.getWidth());
6 System.out.println("height= " + wall.getHeight());
7 System.out.println("area= " + wall.getArea());


→ OUTPUT:

area= 20.0
width= 5.0
height= 0.0
area= 0.0


NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 5 methods and 2 constructors.
 */

package Section_7_Master_OOP.Coding_Exercises.Exercise32;

public class Wall {

    // Step 1:
    // Write a class with the name Wall.
    // The class needs two fields (instance variables) with name width and height of type double.
    private double width;
    private double height;

    // The class needs to have two constructors

    //
    // Step 2:
    // No-args (first) constructor. The first constructor does not have any parameters (no-args constructor).
    public Wall() {
        this.width = 0;
        this.height = 0;
    }


    // The second constructor has parameters width and height of type double, and it needs to initialize the fields.
    // Parameterized constructor
    // In case the width parameter is less than 0 it needs to set the width field value to 0.
    // In case the height parameter is less than 0 it needs to set the height field value to 0.
    // Step 3:
    public Wall(double width, double height) {
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    // Step 4:
    //  Method named getWidth without any parameters, it needs to return the value of width field.
    public double getWidth () {
        return width;
    }

    // Step 5:
    // Method named getWidth without any parameters, it needs to return the value of width field.
    public double getHeight () {
        return height;
    }

    // Step 6:
    // Method named setWidth with one parameter of type double, it needs to set the value of the width field.
    // If the parameter is less than 0 it needs to set the width field value to 0.
    public void setWidth (double width) {
        if (width < 0) {
            this.width = 0; // If the parameter is less than 0 it needs to set the width field value to 0.
        }
        else {
            this.width = width;
        }
    }

    // Step 7:
    // Method named setHeight with one parameter of type double, it needs to set the value of the height field.
    // If the parameter is less than 0 it needs to set the height field value to 0.
    public void setHeight (double height) {
        if (height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    // Step 8:
    // Method named getArea without any parameters, it needs to return the area of the wall.
    public double getArea () {
        return height * width;
    }


}
