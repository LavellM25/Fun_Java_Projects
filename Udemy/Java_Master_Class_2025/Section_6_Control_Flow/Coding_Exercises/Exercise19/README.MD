# Exercise 19: 🔁 Shared Digit Checker

## 📝 Overview

This Java program checks whether **two two-digit numbers share at least one digit in common**.  
If either number is **outside the valid range** (10 to 99 inclusive), the method returns `false`.  
This exercise focuses on **input validation**, **string manipulation**, and **character comparison**.

---

## 🛠️ How It Works

- The program contains one method:
    - **`hasSharedDigit(int firstNumber, int secondNumber)`**
        - First validates both numbers are within the range `10` to `99`.
        - Converts each number to a string.
        - Uses a loop to check whether any digit in the first number is also found in the second.
        - Returns `true` if a shared digit exists; otherwise returns `false`.

- The `main` method provides test cases with expected outcomes.

---

## 📈 Future Improvements (Optional)
- Rewrite using integer math (e.g., extracting digits via % 10 and / 10).
- Extend functionality to work with numbers of any length.
- Allow the method to return which digit was shared, if any.

---

## 📚 Key Concepts Practiced
- Control Flow with Conditionals
- Range Validation
- String Conversion and Character Comparison
- For-Each Loops
- Reusability and Boolean Logic

---

## 🚀 Sample Output

```java

public class Example {
    public static void main(String[] args) {

        // Call the method to test results

        // Output: true (Digit 2 is shared)
        // → should return true since the digit 2 appears in both numbers
        System.out.println(hasSharedDigit(12, 23));

        // Output: false (9 is not in the valid range)
        //  → should return false since 9 is not within the range of 10-99
        System.out.println(hasSharedDigit(9, 99));

        // Output: true (Digit 5 is shared)
        // → should return true since the digit 5 appears in both numbers
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
            /*
            1. Condition that must be met is: within the range of 10 (inclusive) - 99 (inclusive),
            if not return false for both numbers
             */
        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {
            // Convert numbers to string to check individual digits

            String strNum1 = Integer.toString(firstNumber);
            String strNum2 = Integer.toString(secondNumber);

            // Check if any digit in num1 exists in num2
            for (char digit : strNum1.toCharArray()) { // Convert both numbers to strings.
                if (strNum2.contains(Character.toString(digit))) { // Check if any digit in num1 exists in num2.
                    // return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
                    // Meaning there is a match found in both corresponding numbers
                    return true;
                }
            }
        }
        return false;
    }
}