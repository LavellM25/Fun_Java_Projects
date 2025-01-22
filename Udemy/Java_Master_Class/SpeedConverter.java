/* Date: 1-21-2025
   Description: write a small program that can convert km/h to mi/h.
 */

public class SpeedConverter {

    public static void main(String[] args) {
//        // Test the method toMilesPerHour with different values
//        System.out.println(toMilesPerHour(1.5));    // Output: 1
//        System.out.println(toMilesPerHour(10.25)); // Output: 6
//        System.out.println(toMilesPerHour(-5.6));  // Output: -1 (invalid value)
//        System.out.println(toMilesPerHour(25.42)); // Output: 16
//        System.out.println(toMilesPerHour(75.114)); // Output: 47

//        // Test the method printConversion to ensure correct logic
//        printConversion(1.5);
//        printConversion(10.25);
//        printConversion(-5.6);
//        printConversion(25.42);
//        printConversion(75.114);
    }

    // Method to convert kilometers per hour to miles per hour
    public static long toMilesPerHour(double kilometersPerHour) {
        // Return -1 if the input is invalid (negative value)
        if (kilometersPerHour < 0) {
            return -1;
        }

        // Conversion factor: 1 kilometer = 0.621371 miles
        double milesPerHour = kilometersPerHour * 0.621371;

        // Round the result and return as a long
        return Math.round(milesPerHour);
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            // Print "Invalid Value" if the input is negative
            System.out.println("Invalid Value");
        } else {
            // Calculate miles per hour using the toMilesPerHour method
            long milesPerHour = toMilesPerHour(kilometersPerHour);

            // Print the conversion in the specified format
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
