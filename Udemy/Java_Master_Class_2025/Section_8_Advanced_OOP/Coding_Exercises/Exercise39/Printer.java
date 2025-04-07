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
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    /**
     printPages will accept one parameter, pages of type int.
     A variable called pagesToPrint should be created and initialized to the value of the incoming parameter.
     A conditional check should be performed on whether the Printer class field, duplex, is either "true" or "false".
     If "true" then a calculation must be performed to determine the number of pages needed to print the job double-sided.
     The pagesToPrint value is then added to the class field pagesPrinted, but the value of pagesToPrint should be returned by the method.
     */

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }

        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    // Create getPagesPrinted method that has no parameters and merely returns the value of the member variable pagesPrinted.
    public int getPagesPrinted() {
        return pagesPrinted;
    }

    // test the methods in the main method:
    // All tests passed
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }

    /* Tips:
    When calculating pagesToPrint if duplex is equal to "true" remember that there are two operators which can help you with this.
    The division "/" operator divides a number and returns only the quotient without any remainder.
    And the modulo "%" operator divides the number and returns only the remainder, whether 0 or otherwise.
     */
}
