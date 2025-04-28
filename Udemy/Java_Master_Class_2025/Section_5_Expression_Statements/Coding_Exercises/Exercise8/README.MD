# Exercise 8: 🎯 Teen Number Checker

## 📝 Overview

This Java program checks whether any of three given integers are 
**"teen" numbers** — numbers between **13** and **19** (inclusive).  
It is designed as a beginner-level exercise to practice **logical comparisons**, 
**conditional operators**, and **boolean logic** in Java.

---

## 📚 Key Concepts Practiced
- Java Expressions and Statements
- Boolean Logic and Conditional Operators
- Range Checking (Between Two Values)
- Method Creation and Calling
- Basic Debugging and Testing

---

## 📈 Future Improvements (Optional)
- Extend the program to check for a list or array of numbers instead of only three.
- Create an additional method to check if a **single number** is a teen (`isTeen(int number)`).
- Improve flexibility by allowing custom age ranges.

---

## 🛠️ How It Works

- The program contains one method:
    - **`hasTeen(int num1, int num2, int num3)`**:
        - Returns `true` if **any** of the three input numbers are **between 13 and 19** (inclusive).
        - Otherwise, returns `false`.
- The `main` method tests the method with different sets of numbers and prints the results.

---

## 🚀 Sample Output

### Example:
```java

public class Example {
    public static void main(String[] args) {
        System.out.println(hasTeen(15, 25, 87)); 
        // Output: true
        // 15 is a teen (between 13 and 19)

        System.out.println(hasTeen(45, 20, 23)); 
        // Output: false
        // No number is a teen

        System.out.println(hasTeen(14, 13, 19)); 
        // Output: true
        // 14, 13, and 19 are all teens
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 >= 13 && num1 <= 19) ||
               (num2 >= 13 && num2 <= 19) ||
               (num3 >= 13 && num3 <= 19);
    }
}
