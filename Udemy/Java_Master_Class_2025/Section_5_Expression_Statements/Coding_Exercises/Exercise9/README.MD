# Exercise 9: 📐 Area Calculator

## 📝 Overview

This Java program calculates the **area of a circle** or a **rectangle**, depending on the method used.  
It is designed as a beginner-level exercise to practice **method overloading**, 
**conditional logic**, and **basic geometry formulas** in Java.

---

## 📚 Key Concepts Practiced
- Java Expressions and Statements
- Method Overloading
- Conditional Checks for Input Validation
- Mathematical Formulas (Area of Circle and Rectangle)
- Using Java's Built-in `Math.PI` Constant
- Basic Debugging and Testing

---

## 📈 Future Improvements (Optional)
- Extend the program to calculate the area of additional shapes (like triangles or trapezoids).
- Add input validation to prevent invalid shapes from being calculated.
- Create a user-friendly menu for selecting the shape type.

---

## 🛠️ How It Works

- The program contains two overloaded methods:
    - **`area(double radius)`**:
        - Calculates the **area of a circle** using the formula `π × radius²`.
        - Returns `-1` if the input radius is negative (invalid).
    - **`area(double x, double y)`**:
        - Calculates the **area of a rectangle** using the formula `length × width`.
        - Returns `-1` if either `x` or `y` is negative (invalid).
- The `main` method tests both methods with different values and prints the results.

---

## 🚀 Sample Output

### Example:
```java

public class Example {
    public static void main(String[] args) {
        System.out.println(area(5.0)); 
        // Output: 78.53981633974483
        // (Area of circle with radius 5)

        System.out.println(area(-1)); 
        // Output: -1
        // (Invalid radius)

        System.out.println(area(5.0, 4.0)); 
        // Output: 20.0
        // (Area of rectangle 5 × 4)

        System.out.println(area(-1.0, 4.0)); 
        // Output: -1
        // (Invalid dimensions)
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }
}
