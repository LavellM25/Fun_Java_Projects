/** Coding Exercise 37: Cuboid Pool Area Calculation
 * Formula for rectangles are: Volume = Length x Width x Height
 * The Swimming Company has asked you to write an application that calculates the volume of cuboid shaped pools.
 * Extend a Rectangle class to form a Cuboid for pool volume calculations, showcasing geometric modeling and inheritance.
 *
 */

package Section_7_Master_OOP.Coding_Exercises;

public class Rectangle {

    // Step 1:
    // Write a class with the name Rectangle.
    // The class needs two fields (instance variable) with name width and length both of type double.
    private double length;
    private double width;

    // Step 2:
    // The class needs to have one constructor with parameters width and length both of type double.
    // Needs to initialize the fields.
    // In case the width parameter is less than 0 it needs to set the width field value to 0.
    // In case the length parameter is less than 0 it needs to set the length field value to 0.
    public Rectangle(double width, double length) {
        this.length = (length < 0) ? 0 : length;
        this.width = (width < 0) ? 0 : width;
    }

    // Step 3: Create getter methods for length and width.
    // Method named getWidth without any parameters, it needs to return the value of width field.
    // Method named getLength without any parameters, it needs to return the value of length field.

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Step 4:
    // Method named getArea without any parameters, it needs to return the calculated area (width * length).
    public double getArea() {
        return length * width;
    }

}

class Cuboid extends Rectangle {

    // Step 1:
// Write a class with the name Cuboid that extends Rectangle class. The class needs one field (instance variable) with name height of type double.
    private double height;

    // Step 2:
    // The class needs to have one constructor with three parameters width, length, and height all of type double. It needs to call parent constructor and initialize a height field.
    // In case the height parameter is less than 0 it needs to set the height field value to 0.
    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = (height < 0) ? 0 : height;
    }

    // Step 3:
    // Method named getHeight without any parameters, it needs to return the value of height field.
    // Method named getVolume without any parameters, it needs to return the calculated volume.
    // To calculate volume multiply the area with height.
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public static void main(String[] args) {
        // All tests passed in the main method
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        /* Expected Output:
        rectangle.width= 5.0
        rectangle.length= 10.0
        rectangle.area= 50.0
        cuboid.width= 5.0
        cuboid.length= 10.0
        cuboid.area= 50.0
        cuboid.height= 5.0
        cuboid.volume= 250.0
         */
    }
}
