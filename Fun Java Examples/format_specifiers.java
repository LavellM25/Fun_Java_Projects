/* Date: 1-1-2025
   Description: Working with format specifiers in Java, and the overview of the printf() method.
 */

// printf() method is used to format output a particular way and allows printed text and variables to be structured.
// arguments are the values that are formatted
public class format_specifiers {
    public static void main(String[] args) {
        /* (%.xf, variable) is going to round the value to a specific decimal place value,
        in the example value is rounded to 5 decimal places with %f standing for decimal floating point,
        x is how many decimal places to round to.
         */
        System.out.printf("%.5f%n", 42.99555555);

        /* Common Format specifiers:
        %d - Integer data type ex: 42
        %f - Float/Douable data type ex: 42.909
        %s - String data type ex: Banana
        %c - Single Character data type ex: "@"
        %b - Boolean data type ex: true/false
        %n - To make a new line
        %10s - Align 10 spaces to the right (right-justify)
        %-10s - Align 10 spaces to the left (left-justify)
         */
        // Example combining format specifiers in real-world example:
        String item = "Apple";
        int quantity = 5;
        double price = 0.99;
        System.out.printf("Item: %s | Quantity: %d | Price: $%.2f%n", item, quantity, price);

        /* Common format specifier flags
        (%+d) or (%-d) +/- to add an (+) or minus (-) sign before a numeric value.
        (%0f) or (%0d) to add extra zeros before numeric value
         */
        int positiveNum = 42;
        int negativeNum = -42;

        // Example adding + or - sign in front of a number
        System.out.printf("With sign: %+d%n", positiveNum);
        System.out.printf("With sign: %+d%n", negativeNum);

        // Adding extra zeros before a numeric value
        int num = 42;

        // 0: adds 0s in front of value
        // 5: total width of output will be 5 characters (including spaces that the variable takes up)
        System.out.printf("Padded with zeros: %05d%n", num);

        int posNum = 42;
        int negNum = -42;

        // Combined example to show + or - sign in front of a number with adding 0s at the end of a value
        System.out.printf("Positive with sign and zeros: %+05d%n", posNum);
        System.out.printf("Negative with sign and zeros: %+05d%n", negNum);

    }
}
