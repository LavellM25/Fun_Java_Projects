// Encapsulation Challenge from video lecture

package Section_8_Advanced_OOP.Extras;

public class Printer {

    // Step 1: Create constant variables:

    // indicator whether the printer can print on both sheets of paper. True means it can print on both sides.
    // False means it can only print on one side of paper.
    private boolean duplex;
    private int pagesPrinted; // Which is the count of total pages printed
    private int tonerLevel;  // which is the percentage of toner left in the toner cartridge

    // Create a constructor to pass in two args from the fields.
    public Printer(boolean duplex, int tonerLevel) {
        this.duplex = duplex;
        /** tonerLevel should never exceed 100 percent or ever get below 0 percent
         If the amount being added makes the level fall outside range, return -1, otherwise,
         return the actual toner level after adding the amount passed to the method.
          */
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
    }

    public int addToner(int tonerAmount) {

        // Ensure tonerAmount value is within range otherwise return -1
        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount > 100 || tonerAmount < 0) {
            return -1;
        }

        // tonerAmount is added to the tonerLevel field.
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        // It should determine how many sheets of paper will be printed. Take into account the duplex value set for the printer.
        // This should return the number of sheets of paper.

        // Number should be added to pagesPrinted field.

        // if its a duplex printer, print a message that its a duplex printer

        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    // Add a getter method to retrieve the amount of pages printed
    public int getPagesPrinted() {
        return pagesPrinted;
    }

    // Test the methods in the main method
    // All of these methods passed the test and therefore are giving me the desired calculations and results.
    public static void main(String[] args) {
        Printer printer = new Printer(false, 50);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());
    }
}
