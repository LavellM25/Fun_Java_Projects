# Exercise 17: 🔢 First and Last Digit Sum

## 📝 Overview

This Java program calculates the **sum of the first and last digits** of a given non-negative integer.  
It demonstrates **looping**, **modulus arithmetic**, and **integer manipulation** to isolate specific digits.  
Negative values are treated as invalid and return `-1`.

---

## 🛠️ How It Works

- The program includes one method:
    - **`sumFirstAndLastDigit(int number)`**
        - Returns `-1` if the input number is negative.
        - Uses the **modulus operator (`%`)** to find the last digit.
        - Uses a `while` loop dividing by 10 until only the first digit remains.
        - Adds and returns the sum of the first and last digits.

- The `main` method contains test cases demonstrating various scenarios.

--- 

📚 Key Concepts Practiced
- Digit Isolation (First and Last)
- Integer Division and Modulus
- Looping Until a Single Digit Remains
- Input Validation
- Basic Arithmetic Operations

--- 

## 📈 Future Improvements (Optional)
- Add user input functionality via Scanner.
- Extend support to handle multi-digit negative numbers with absolute values.
- Create a method that returns a formatted string (e.g., "First: 2, Last: 5, Sum: 7").

---

## 🚀 Sample Output
```java

public class Example { 
    public static void main(String[] args) {
    
    
            System.out.println(sumFirstAndLastDigit(252));  // Expected: 4      Output: 4 (First: 2, Last: 2, Sum: 2 + 2)
            System.out.println(sumFirstAndLastDigit(257));  // Expected: 9      Output: 9 (First: 2, Last: 7, Sum: 2 + 7)
            System.out.println(sumFirstAndLastDigit(0));    // Expected: 0      Output: 0 (First & Last: 0)
            System.out.println(sumFirstAndLastDigit(5));    // Expected: 10     Output: 10 (First & Last: 5 + 5)
            System.out.println(sumFirstAndLastDigit(-10));  // Expected: -1     Output: -1 (Invalid input)
        }
        public static int sumFirstAndLastDigit (int number) {
            if (number < 0) {
                return -1; // Return -1 for negative numbers as required
            }
    
            int lastDigit = number % 10;  // Extract the last digit from the series of numbers
            /*
            The % operator (modulus) returns the remainder when dividing by 10.
            The remainder is always the last digit of the number.
            Ex: 257 % 10 = 7 because 257 does not divide easily so 250 / 10 is 25 with no remainder.
            If you add 7, 7 will be the remainder
            */
            while (number >= 10) { // In order to retrieve the first digit.
                number /= 10;
    
                /*
                We want to remove all digits except the first one.
                We keep dividing by 10 until we are left with only one digit.
                📌 Input: 257
                First loop: 257 / 10 = 25
                Second loop: 25 / 10 = 2
                Now, only 2 is left → this is our first digit!
                📌 First Digit: 2
                 */
            }
    
            int firstDigit = number;  // Now number is the first digit
    
            return firstDigit + lastDigit; // return the sum
            /*
            📌 Input: 257
            First Digit: 2
            Last Digit: 7
            Sum: 2 + 7 = 9
            📌 Output: 9
             */
        }
}