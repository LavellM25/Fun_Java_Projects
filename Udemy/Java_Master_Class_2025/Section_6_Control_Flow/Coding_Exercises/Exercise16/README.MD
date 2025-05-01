# Exercise 16: 🔁 Number Palindrome Checker

## 📝 Overview

This Java program checks whether a given integer is a **palindrome** — a number that reads the same backward as forward.  
It works for both **positive** and **negative** integers (ignoring the sign).  
This exercise focuses on **looping**, **digit manipulation**, and **reverse logic**.

---

## 🛠️ How It Works

- The program includes one method:
    - **`isPalindrome(int number)`**:
        - Stores the original number for later comparison.
        - Uses `Math.abs()` to work with the positive version of the number.
        - Reverses the digits using a `while` loop:
            - Extracts the last digit using modulus (`%`).
            - Builds the reversed number by multiplying and adding.
        - Compares the reversed number to the absolute original to determine if it’s a palindrome.

---

## 📚 Key Concepts Practiced
- Control Flow with While Loops
- Digit Extraction and Reversal
- Working with Negative Numbers
- Mathematical Modulus and Division
- Boolean Return Values
- Data Validation Using Absolute Values

--- 

## 📈 Future Improvements (Optional)
- Add a second method to return true only for positive palindromes.
- Extend to check string-based palindromes.
- Build a version that accepts user input using Scanner.

---

## 🚀 Sample Output

```java

public class Example {
    
    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // Output: true

        System.out.println(isPalindrome(-121)); // Output: true

        System.out.println(isPalindrome(123)); // Output: false

        System.out.println(isPalindrome(0)); // Output: true

        System.out.println(isPalindrome(707)); // Output: true

    }

    public static boolean isPalindrome(int number) {
        // Store the original number for comparison
        int originalNumber = number;

        // Make number positive for processing
        number = Math.abs(number);

        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;  // Extract last digit
            reverse = (reverse * 10) + lastDigit; // Append to reverse
            number /= 10; // Remove last digit
        }

        // Compare original with reversed number
        return Math.abs(originalNumber) == reverse;
    }
   
}


