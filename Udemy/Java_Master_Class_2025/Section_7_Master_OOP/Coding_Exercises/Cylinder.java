// Coding Exercise 36: Cylinder Class with Circle Inheritance cont.

/**
 *  * Write a class with the name Cylinder that extends Circle class.
 *  * The class needs one field (instance variable) with name height of type double.
 *  *
 *  * The class needs to have one constructor with two parameters radius and height both of type double.
 *  * It needs to call parent constructor and initialize a height field.
 *  *
 *  * In case the height parameter is less than 0 it needs to set the height field value to 0.
 *  *
 *  * Write the following methods (instance methods):
 *  *
 *  * Method named getHeight without any parameters, it needs to return the value of height field.
 *  *
 *  * Method named getVolume without any parameters, it needs to return the calculated volume.
 *  * To calculate volume multiply the area with height.
 */
package Section_7_Master_OOP.Coding_Exercises;

public class Cylinder extends Circle {
    // Step 1:
    // Write a class with the name Cylinder that extends Circle class.
    // The class needs one field (instance variable) with name height of type double.
    private double height;

    // Step 2:
    // The class needs to have one constructor with two parameters radius and height both of type double.
    // It needs to call parent constructor and initialize a height field.
    // In case the height parameter is less than 0 it needs to set the height field value to 0.
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }

    // Step 3:
    // Method named getHeight without any parameters, it needs to return the value of height field.
    public double getHeight() {
        return height;
    }

    // Step 4:
    // Method named getVolume without any parameters, it needs to return the calculated volume.
    // To calculate volume multiply the area with height.
    public double getVolume () {
        return getArea() * height;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
/*
INPUT:
Cylinder cylinder = new Cylinder(5.55, 7.25);
System.out.println("cylinder.radius= " + cylinder.getRadius());
System.out.println("cylinder.height= " + cylinder.getHeight());
System.out.println("cylinder.area= " + cylinder.getArea());
System.out.println("cylinder.volume= " + cylinder.getVolume());

OUTPUT:
cylinder.radius= 5.55
cylinder.height= 7.25
cylinder.area= 96.76890771219959
cylinder.volume= 701.574580913447
 */


