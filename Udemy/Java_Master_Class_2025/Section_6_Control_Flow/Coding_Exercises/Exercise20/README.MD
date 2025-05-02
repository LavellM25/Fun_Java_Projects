# Exercise 20: 🔚 Last Digit Checker

## 📝 Overview

This Java program checks whether **at least two out of three given numbers share the same rightmost digit**.  
All numbers must be within the **inclusive range of 10 to 1000**; otherwise, the method returns `false`.  
This exercise focuses on **input validation**, **digit extraction**, and **boolean logic**.

---

## 🛠️ How It Works

- The program contains two methods:
    - **`isValid(int number)`**
        - Returns `true` if the input number is between **10 and 1000 (inclusive)**.
        - Returns `false` for out-of-range inputs.
    - **`hasSameLastDigit(int number1, int number2, int number3)`**
        - First checks if all three numbers are valid using the range 10–1000.
        - Uses the **modulus operator (`% 10`)** to extract the last digit of each number.
        - Returns `true` if **at least two** numbers share the same last digit.

- The `main` method includes various test cases to verify both validation and logic.

---

## 📚 Key Concepts Practiced
- Input Range Validation
- Method Composition
- Modulus Arithmetic for Digit Extraction
- Boolean Logic
- Reusability and Clean Code

---

## 📈 Future Improvements (Optional)
- Overload hasSameLastDigit() to accept only two numbers.
- Return which digit is shared instead of just a boolean.
- Accept user input from the console to allow real-time checks.

---

## 🚀 Sample Output

```java

public class Example {
    public static void main(String[] args) {
        // Call method hasSameLastDigit to ensure all logic checks out

        // Output: true (last digit 1 is shared between 41 and 71)
        // → should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit(41, 22, 71));

        // Output: true (last digit 2 is shared between 32 and 42)
        // → should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit(23, 32, 42));

        // Output: false (9 is not in valid range)
        // → should return false since 9 is not within the range of 10-1000
        System.out.println(hasSameLastDigit(9, 99, 999));

        // Output: true
        System.out.println(isValid(10));

        // Output: false
        System.out.println(isValid(1051));
        
    }

    public static boolean isValid (int number1) {
        if(number1 >= 10 && number1 <= 1000) {
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit (int number1, int number2, int number3) {
        // 1. Check if all numbers are within the range between 10 and 1000 (inclusive)
        if ((number1 >= 10 && number1 <= 1000) && (number2 >= 10 && number2 <= 1000) && (number3 >= 10 && number3 <= 1000)) {
            // 2. Extract the last digit of each number which can be done by using the % 10
            // Ex: if 45 will rightmost digit will be 5, 994 % 10 = 4 meaning 4 is the remainder to divide number nicely
            int lastDigit1 = number1 % 10;
            int lastDigit2 = number2 % 10;
            int lastDigit3 = number3 % 10;

            // Step 3: Compare last digits, condition that must be met here is that 2 of 3 numbers
            // must have the same rightmost digit or in this case the same remainder after number has been % 10
            if ((lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3)) {
                return true;
            }
        }
        return false;
    }
}