package Section_8_Advanced_OOP.Coding_Exercises.Exercise39;

/** Coding Exercise 39: Toner and Duplex Printing Exercise: Enforcing Encapsulation in a Printer Class
 * See the readme.md file for more information
 */


public class Printer {

    // Create constant variables
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // Create a constructor will accept two of these variables, tonerLevel and duplex, as parameters following these rules:
    // tonerLevel must be greater than -1 but less than or equal to 100. If it does not meet these conditions then it should be initialized to -1.
    // duplex should be initialized to the value of the parameter.
    // In addition, pagesPrinted should be initialized to 0.


    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel < 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    /**
     * addToner will accept one parameter, tonerAmount of type int.
     * First off, tonerAmount should be greater than 0 and less than or equal to 100.
     * If this condition is met a second test must be included to test whether tonerLevel plus tonerAmount is greater than 100.
     * If so, the method should return -1.
     * If not then tonerLevel should have the incoming tonerAmount added to it and the new tonerLevel should then be returned by the method.
     * Also, if the initial condition test fails, then the method should return -1.
     */


}
