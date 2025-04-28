# Exercise 7: ➕ Equal Sum Checker

## 📝 Overview

This Java program checks whether simple **arithmetic operations** between two integers (addition, subtraction, multiplication, or division) produce a result that matches a third integer.  
It is designed as a beginner-level exercise to practice **basic math operations**, **boolean logic**, **method creation**, and **conditional checks** in Java.

---

## 📚 Key Concepts Practiced
- Java Expressions and Statements
- Method Creation and Calling
- Boolean Logic and Comparisons
- Basic Arithmetic Operations (Addition, Subtraction, Multiplication, Division)
- Debugging and Testing Simple Conditions

---

## 📈 Future Improvements (Optional)
- Handle division by zero safely in `hasEqualQuotient()`.
- Extend functionality to work with floating-point numbers.
- Create a universal `hasEqualOperation()` method that handles all four checks dynamically.

---

## 🛠️ How It Works

- The program contains four methods:
    - **`hasEqualSum(int num1, int num2, int num3)`**:
        - Checks if the **sum** of `num1` and `num2` equals `num3`.
    - **`hasEqualDifference(int num1, int num2, int num3)`**:
        - Checks if the **difference** between `num1` and `num2` (or `num2` and `num1`) equals `num3`.
    - **`hasEqualMultiplication(int num1, int num2, int num3)`**:
        - Checks if the **product** of `num1` and `num2` equals `num3`.
    - **`hasEqualQuotient(int num1, int num2, int num3)`**:
        - Checks if the **quotient** of `num1` divided by `num2` equals `num3`.

- The `main` method tests each of these methods with various examples and prints the results.

---

## 🚀 Sample Output

### Example:
```java

public class Example {
    public static void main(String[] args) {
        System.out.println(hasEqualDifference(34, 4, 30)); 
        // Output: true
        // 34 - 4 = 30

        System.out.println(hasEqualMultiplication(5, 90, 450)); 
        // Output: true
        // 5 * 90 = 450

        System.out.println(hasEqualQuotient(42, 7, 6)); 
        // Output: true
        // 42 / 7 = 6

        System.out.println(hasEqualSum(8, 7, 16)); 
        // Output: false
        // 8 + 7 = 15, not 16
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }

    public static boolean hasEqualDifference(int num1, int num2, int num3) {
        return num1 - num2 == num3 || num2 - num1 == num3;
    }

    public static boolean hasEqualMultiplication(int num1, int num2, int num3) {
        return num1 * num2 == num3;
    }

    public static boolean hasEqualQuotient(int num1, int num2, int num3) {
        return num1 / num2 == num3;
    }
}
