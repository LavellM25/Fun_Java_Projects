package Section_5_Expression_Statements;/* Date: 1-21-2025
   Description: write a small program that can convert kilobytes to megabytes.
 */

// Coding exercise 3: MegaBytes Converter

public class MB_to_KB {
    // Method to convert kilobytes to megabytes and print the result
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            // Handle invalid values that are negative
            System.out.println("Invalid Value");
        } else {
            // Calculate the number of megabytes 1 MB = 1024 KB
            int megaBytes = kiloBytes / 1024;

            // Calculate the remaining kilobytes
            int remainingKiloBytes = kiloBytes % 1024;

            // Print the conversion in the specified format
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    public static void main(String[] args) {
        // Call the method with a Section_5_Expression_Statements.test value
        printMegaBytesAndKiloBytes(2500); // Test case
        printMegaBytesAndKiloBytes(-1024); // Test case
        printMegaBytesAndKiloBytes(5000); // Test case
        printMegaBytesAndKiloBytes(1024); // Test case

    }
}
