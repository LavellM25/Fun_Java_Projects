# Exercise 11: 🧮 Equality Printer

## 📝 Overview

This Java program checks three integers and prints whether they are **all equal**, **all different**, or **neither**.  
It is designed as a beginner-level exercise to practice **comparisons**, **logical operators**, 
**multi-branch conditionals**, and **input validation** in Java.

---

## 📚 Key Concepts Practiced
- Java Expressions and Statements
- Multi-Condition If-Else Logic
- Comparison Operators
- Input Validation
- Basic Debugging and Testing

---

## 📈 Future Improvements (Optional)
- Extend the program to allow user input through the console.
- Add support for comparing more than three numbers (arrays or lists).
- Return values instead of printing directly (for more flexible reuse).

---

## 🛠️ How It Works

- The program contains one method:
    - **`printEqual(int a, int b, int c)`**:
        - If any of the parameters are negative, prints `"Invalid Value"`.
        - If all three numbers are equal, prints `"All numbers are equal"`.
        - If all three numbers are different, prints `"All numbers are different"`.
        - Otherwise (some equal, some different), prints `"Neither all are equal or different"`.
- The `main` method tests `printEqual` with several examples.

---

## 🚀 Sample Output

### Example:
```java

public class Example {
    public static void main(String[] args) {
        printEqual(1, 1, 1);  
        // Output: All numbers are equal

        printEqual(1, 1, 2);  
        // Output: Neither all are equal or different

        printEqual(1, 2, 3);  
        // Output: All numbers are different

        printEqual(-1, -1, -1);  
        // Output: Invalid Value
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
