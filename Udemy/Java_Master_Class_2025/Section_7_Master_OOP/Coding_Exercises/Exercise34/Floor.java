/** Coding Exercise 34: Carpet Cost Calculator Class
 * Write classes to calculate floor area and total carpet cost, solidifying constructor usage
 * and method design for real-world applications.
 *
 * The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms.
 * To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet.
 * For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters.
 * To cover the floor with a carpet that costs $8 per square meter would cost $960.
 *
 * 1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
 *
 * The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.
 *
 * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.
 *
 * Write the following methods (instance methods):
 *
 * Method named getArea without any parameters, it needs to return the calculated area (width * length).
 *
 * 2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
 *
 * The class needs to have one constructor with parameter cost of type double, and it needs to initialize the field.
 *
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 *
 * Write the following methods (instance methods):
 *
 * Method named getCost without any parameters, it needs to return the value of cost field
 *
 *
 *
 * 3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
 *
 * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet, and it needs to initialize the fields.
 *
 * Write the following methods (instance methods):
 *
 * Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.
 */


/*
Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
→ OUTPUT

total= 38.5
total= 36.45
 */
package Section_7_Master_OOP.Coding_Exercises.Exercise34;

public class Floor { // Ran tests and all methods passed for this class

    // Step 1:
    private double width;
    private double length;

    // Step 2: This class needs to only have constructor with parameters width and length of type double,
    // and it needs to initialize the fields.
    // In case the width parameter is less than 0 it needs to set the width field value to 0.
    // in case the length parameter is less than 0 it needs to set the length field value to 0.

    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    /**When running this test I realized I do not need these extra set and getter methods for width and length
     * However I naturally wrote this portion of the program for practice so I will omit this section of code for the
     * sake of JUnit tests.
     */

//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }

    public double getArea() {
        return width * length;
    }

    public static class Carpet {
        private double cost;


        // In case the cost parameter is less than 0 it needs to set the cost field value to 0.
        public Carpet(double cost) {
            this.cost = (cost < 0) ? 0 : cost;
        }

        // Method named getCost without any parameters, it needs to return the value of cost field
        public double getCost() {
            return cost;
        }
    }

    // Write a class with the name Calculator.
    // The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.

    // The logic for the math is from the floor class width(2.75) * length(4) which will be the area * the cost of carpet (3)
    // Which is why the output is 38.5

    // Carpet carpet = new Carpet(3.5);
    // Floor floor = new Floor(2.75, 4.0);
    // total= 38.5

    // Same here: 1.5 * (5.4 * 4.5)
    // carpet = new Carpet(1.5);
    //floor = new Floor(5.4, 4.5);

    public static class Calculator {
        private Floor floor;
        private Carpet carpet;


        // Constructor
        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        // Method to calculate total cost
        public double getTotalCost() {
            return floor.getArea() * carpet.getCost();
        }
    }


    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        // To run tests I had to make carpet and floor static for some reason to get desired result, not sure at this point why
        // But once making update, code runs great error free
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());  // Should print: 38.5

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());  // Should print: 36.45
    }
}

