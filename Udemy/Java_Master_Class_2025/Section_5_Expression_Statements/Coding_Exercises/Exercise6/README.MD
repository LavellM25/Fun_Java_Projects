# Exercise 5: 🔢 Decimal Comparator: Compare Numbers up to Three Decimal Places

## 📝 Overview

This Java program checks whether two floating-point numbers are **equal up to three decimal places**.  
It is designed as a beginner-level exercise to practice **mathematical manipulation**, 
**truncation techniques**, **type casting**, and **conditional comparisons** in Java.

---

## 📚 Key Concepts Practiced
- Java Expressions and Statements
- Multiplication and Type Casting
- Truncating Floating Point Numbers
- Conditional Comparisons
- Basic Debugging and Testing

---

## 📈 Future Improvements (Optional)
- Extend the program to allow comparisons up to n decimal places dynamically.
- Accept user input through the console for real-time comparisons.
- Handle cases involving NaN or Infinity values more robustly.

---

## 🛠️ How It Works

- The program contains one method:
    - **`areEqualByThreeDecimalPlaces(double num1, double num2)`**:
        - Multiplies both numbers by `1000` to shift three decimal places to the right.
        - Truncates the results to integers using type casting `(int)`.
        - Compares the truncated integers:
            - If they are equal, it returns `true`.
            - Otherwise, it returns `false`.
- The `main` method tests different pairs of numbers and prints the result.

---

## 🚀 Sample Output

### Example:
```java

public class Example {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
            // Multiply both numbers by 1000 and truncate to integers
            /*
        Multiplying by 1000 shifts the decimal point 3 places to the right, making first 3 decimal digits into whole #'s.
        Casting to int truncates extra digits beyond the three decimal places.
        Comparing the integers directly checks if the numbers are equal up to three decimal places.
             */
    
    
            /* Step 2: Plan the Solution
                Truncate the Numbers: Since we're only interested in comparing up to three decimal places,
                we can multiply the numbers by 1000 and truncate them to integers using type casting ((int)).
    
                For example, if x = -3.1756, multiplying by 1000 gives -3175.6, and truncating to an integer gives -3175.
                Similarly, if y = -3.175, multiplying by 1000 gives -3175.0, and truncating to an integer gives -3175.
                Compare the Truncated Values: Once truncated, compare the two integers:
    
                If the integers are equal, return true.
                Otherwise, return false.
             */
    
            int truncatedNum1 = (int) (num1 * 1000);
            int truncatedNum2 = (int) (num2 * 1000);
    
            // Compare the truncated numbers
            return truncatedNum1 == truncatedNum2;
        }
        public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
        /*
        Input numbers: -3.1756 and -3.175.
        Multiply by 1000: -3175.6 and -3175.0.
        Truncate to integers: -3175 and -3175.
        Compare: -3175 == -3175 → Return true.
         */

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));    // false
        /*
        Input numbers: 3.175 and 3.176.
        Multiply by 1000: 3175.0 and 3176.0.
        Truncate to integers: 3175 and 3176.
        Compare: 3175 != 3176 → Return false
         */

        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));   // false
        /*
        Input numbers: -3.123 and 3.123.
        Multiply by 1000: -3123.0 and 3123.0.
        Truncate to integers: -3123 and 3123.
        Compare: -3123 != 3123 → Return false
         */
    }
}



