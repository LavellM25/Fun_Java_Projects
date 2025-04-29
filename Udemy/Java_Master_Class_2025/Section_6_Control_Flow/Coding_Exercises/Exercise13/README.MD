# Exercise 13: 🔢 Number in Word: Print Number as Text

## 📝 Overview

This Java program reads an integer input and prints the **word form** of the number if it’s between **0 and 9**.  
If the input is outside that range (including negatives), it prints `"This is not a number"`.  
This exercise helps solidify your understanding of **control flow** and **switch statements** in Java.

---

## 📚 Key Concepts Practiced:
- Control Flow with Switch Statements
- User Input Handling with Scanner
- Default Case Handling
- Input Validation
- Readable Console Output

---

## 📈 Future Improvements (Optional Ideas)
- Support a wider range of numbers (e.g., 10–20 or 0–99).
- Handle spelled-out output for negative numbers (e.g., -3 → "MINUS THREE").
- Add GUI or web-based interface for input/output.

---

## 🛠️ How It Works

- The program contains one method:
    - **`printNumberInWord(int number)`**
        - Uses a **`switch` statement** to print the number in uppercase words for values between 0 and 9.
        - For any other input, prints `"This is not a number"` as a fallback.
- The `main` method:
    - Uses a `Scanner` to get user input.
    - Calls `printNumberInWord()` with the entered number.

---

## 🚀 Sample Output

### Example 1:
```java

import java.util.Scanner; // Import the scanner module to allow system input.

public class Example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int guessNumber = scanner.nextInt();

        // Call the method
        printNumberInWord(guessNumber);

        scanner.close(); // close the scanner

        /** Here is some example of the methods tested, their input and output:
         *
         * Example 1:
         * Input: 4
         * Output: FOUR
         *
         * Example 2:
         * Input: 0
         * Output: ZERO
         *
         * Example 3:
         * Input: 9
         * Output: NINE
         *
         * Example 4:
         * Input: -2
         * Output: This is not a number.
         * Remember this logic will return the default edge case since we are looking for numbers 0-9.
         * Numbers greater than 9 or less than 0 will have the output "This is a not a number".
         *
         * Example 5:
         * Input: 12
         * Output: This is not a number
         * Remember this logic will return the default edge case since we are looking for numbers 0-9.
         * Numbers greater than 9 or less than 0 will have the output "This is a not a number".
         */

    }

    public static void printNumberInWord(int number) {
        switch (number) { // If user enters any number 0-9, it will match it with a fully spelled on number.
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default: // this will handle if the user enters a negative # or a # not in the range of 0-9
                System.out.println("This is a not a number");
        }
    }
}

