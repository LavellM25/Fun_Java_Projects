# Exercise 5: 📅 Leap Year Calculator

## 📝 Overview

This Java program checks whether a given **year** is a **leap year** according to the standard Gregorian calendar rules.  
It is designed as a beginner-level exercise to practice **nested conditionals**, 
**modulus operations**, **input validation**, and **logical reasoning** in Java.

---

## 📚 Key Concepts Practiced
- Java Expressions and Statements
- Boolean Logic and Nested Conditionals
- Modulus Operator Usage (%)
- Input Validation (Range Checking)
- Basic Debugging and Testing

---

## 📈 Future Improvements (Optional)
- Extend the program to allow user input via console.
- Create a batch checker that processes multiple years at once.
- Provide more detailed output messages explaining why a year is or isn't a leap year.

---

## 🛠️ How It Works

- The program contains one method:
    - **`isLeapYear(int year)`**:
        - Returns `false` if the year is not between `1` and `9999`.
        - A year is a leap year if:
            - It is divisible by `4`.
            - **If** divisible by `100`, it must also be divisible by `400`.
- The `main` method tests several years by printing the result of calling `isLeapYear()`.

---

## 🚀 Sample Output

### Example 1:
```java

public class Example { 
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
        
        System.out.println(isLeapYear(2024));
        // Output: true
        // (2024 is divisible by 4 and not a century year)
        
        System.out.println(isLeapYear(1900));
        // Output: false
        // (1900 is divisible by 100 but not by 400)
        
        System.out.println(isLeapYear(2000));
        // Output: true
        // (2000 is divisible by 400, 100, and 4)
        
        System.out.println(isLeapYear(2023));
        // Output: false
        // (2023 is not divisible by 4)
        
        System.out.println(isLeapYear(-500));
        // Output: false
        // (Invalid year, not between 1 and 9999)
        
        System.out.println(isLeapYear(10000));
        // Output: false
        // (Invalid year, not between 1 and 9999)
        
        }
}

