package Example1_With_Instructor;

/** Learning about abstraction with instructor.
 * 03-31-2025
 */

public class Main {

    static Circle circle = new Circle("yellow", 2.5);

    /**
     * When running this test in the main method,
     * the shape class was called and the circle constructor was called
     *
     */
    public static void main(String[] args) {
        System.out.println(circle.toString());
    }
}

// Abstraction is when classes has to be hid from one another so that other code can not conflict
abstract class Shape {
    String color;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Example1_With_Instructor.Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() { return color; }
}


// New class called circle that inheritance shape with "extends"
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius)
    {

        // calling Example1_With_Instructor.Shape constructor
        super(color);
        System.out.println("Example1_With_Instructor.Circle constructor called");
        this.radius = radius;
    }

    @Override double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString()
    {
        return "Example1_With_Instructor.Circle color is " + super.getColor()
                + "and area is : " + area();
    }
}