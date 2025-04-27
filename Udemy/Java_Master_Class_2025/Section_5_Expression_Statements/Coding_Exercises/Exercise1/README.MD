# 📈 Positive, Negative, or Zero Checker

## 📝 Overview

This simple Java program checks whether an integer is **positive**, **negative**, or **zero**.  
It is designed as a beginner-friendly exercise to practice writing **expressions**, 
**statements**, and **basic conditional logic** (`if-else`) in Java.

---

## 🛠️ How It Works

- The program contains a **`checkNumber(int number)`** method.
- Based on the input integer:
    - If the number is greater than `0`, it prints `"positive"`.
    - If the number is less than `0`, it prints `"negative"`.
    - If the number is exactly `0`, it prints `"zero"`.
- The `main` method demonstrates the usage by checking the number `0`.

---

## 🚀 Sample Output

### Example 1:

```java
public static void checkNumber(int number) {
    if (number > 0) {
        System.out.println("positive");
    } else if (number < 0) {
        System.out.println("negative");
    } else {
        System.out.println("zero");
    }
}

// Console Output examples:
checkNumber(5);  // Output: positive
checkNumber(-3); // Output: negative
checkNumber(0);  // Output: zero
