# Exercise 14: 🔢 Number in Word: Print Number as Text

## 📝 Overview

This Java program reads an integer input and prints the **word form** of the number if it’s between **0 and 9**.  
If the input is outside that range (including negatives), it prints `"This is not a number"`.  
This exercise helps solidify your understanding of **control flow** and **switch statements** in Java.

---

## 🛠️ How It Works

- The program includes two main methods:
    - **`isLeapYear(int year)`**:
        - Returns `true` if the given year is a valid **leap year** using rules based on divisibility by 4, 100, and 400.
        - Returns `false` for invalid years (not in 1–9999) or non-leap years.
    - **`getDaysInMonth(int month, int year)`**:
        - Validates inputs for acceptable month/year ranges.
        - Uses a `switch` statement to return the correct number of days for each month.
        - Returns `29` or `28` for February depending on leap year status.
        - Returns `-1` if the inputs are invalid.

- The `main` method includes several test cases covering typical and edge scenarios.

--- 

## 📚 Key Concepts Practiced
- Control Flow with Switch Statements
- User Input Handling with Scanner
- Default Case Handling
- Input Validation
- Readable Console Output

--- 

## 📈 Future Improvements (Optional)
- Support a wider range of numbers (e.g., 10–20 or 0–99).
- Handle spelled-out output for negative numbers (e.g., -3 → "MINUS THREE").
- Add GUI or web-based interface for input/output.

--- 

## 🚀 Sample Output

### Example: 

public class Example {

    public static int getDaysInMonth(int month, int year) {
        // Check if month is between 1 and 12 and year between acceptable ranges of 1 and 9999
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1; // Invalid input
        }
        // Create switch-case statements for more efficient comparison of months of year.
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; // Months with 31 days (January, March, May, July, August, October, December)
            case 4: case 6: case 9: case 11:
                return 30; // Months with 30 days (April, June, September, November)
            case 2: // February can have either 29 or 28 days depending on if there is a leap year.
                return isLeapYear(year) ? 29 : 28; // Leap year logic
                /* Logic breakdown:
                return isLeapYear(year) ? 29 : 28;
                isLeapYear(year): This checks if the year is a leap year (true or false).
                The ? means: "If the condition before it (isLeapYear(year)) is true, then..."
                29: This is what gets returned if the condition is true (leap year).
                The : means: "Otherwise (if the condition is false)..."
                28: This is what gets returned if the condition is false (not a leap year).

                Code written if an if-else statement is used:
                if (isLeapYear(year)) {
                    return 29; // Leap year
                } else {
                    return 28; // Not a leap year
                }
                 */
            default:
                return -1; // Should never happen
        }
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

    public static void main(String[] args) {

        // Test cases to check code logic
        System.out.println(getDaysInMonth(1, 2020)); // should return 31 since January always 31 days. 
        
        System.out.println(getDaysInMonth(2, 2020)); // should return 29 since year 2020 qualifies as a leap year.
        
        System.out.println(getDaysInMonth(2, 2018)); // should return 28 since 2018 is not a leap year.
        
        System.out.println(getDaysInMonth(-1, 2020)); // should return -1 since the parameter month is invalid.
        
        System.out.println(getDaysInMonth(6, -2020)); // should return -1 since year is outside the range of 1 to 9999.

    }
}