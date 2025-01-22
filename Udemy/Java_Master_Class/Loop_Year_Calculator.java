/* Date: 1-21-2025
   Description:  write a small program that determines if a particular year is a leap year.
 */

public class Leap_Year_Calculator {
    public static void main(String[] args) {

        // Conditions to test logic
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2023));
        System.out.println(isLeapYear(-500));
        System.out.println(isLeapYear(10000));
    }

    public static boolean isLeapYear(int year) {
        // Validate the range (1 to 9999)
        if (year < 1 || year > 9999) {
            return false; // Invalid year, not in range
        }

        // Check leap year rules
        // will need to create a nested loop since each condition is deterministic on the previous statement.
        if (year % 4 == 0) {  // rule 1, year must be divisible by 4 evenly
            if (year % 100 == 0) {  // rule 2, year must be divisible by 100 evenly
                return year % 400 == 0; // Leap year if divisible by 400 evenly
            } else {
                return true;

            }
        }
        return false; // If year does not pass all 3 tests above, it is not a Leap year, return false
    }
}
