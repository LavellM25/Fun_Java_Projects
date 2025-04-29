# Exercise 10: 🕰️ Minutes to Years and Days Calculator

## 📝 Overview

This Java program converts a given number of **minutes** into an approximate equivalent of **years** and **days**.  
It is designed as a beginner-level exercise to practice **unit conversions**, **integer arithmetic**, 
and **conditional validation** in Java.

---

## 📚 Key Concepts Practiced
- Java Expressions and Statements
- Integer Division and Modulus Operator Usage
- Conditional Input Validation
- Unit Conversions (Minutes ➔ Years and Days)
- Basic Debugging and Testing

---

## 📈 Future Improvements (Optional)
- Extend the program to also show **remaining hours and minutes** for a more detailed breakdown.
- Accept user input through the console.
- Add formatting for pluralization (e.g., "1 year" vs "2 years").

---

## 🛠️ How It Works

- The program contains one method:
    - **`printYearsAndDays(long minutes)`**:
        - If `minutes` is negative, prints `"Invalid Value"`.
        - Otherwise:
            - Converts minutes to years using the formula:  
              `years = minutes / (60 × 24 × 365)`
            - Calculates the remaining minutes after converting to years.
            - Converts the remaining minutes to days.
            - Prints the result in the format:  
              `X min = Y y and Z d`
- The `main` method tests the `printYearsAndDays` method with different input values.

---

## 🚀 Sample Output

### Example:
```java

public class Example {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        // Output: 525600 min = 1 y and 0 d

        printYearsAndDays(1051200);
        // Output: 1051200 min = 2 y and 0 d

        printYearsAndDays(561600);
        // Output: 561600 min = 1 y and 25 d
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / (60 * 24 * 365);
        long remainingMinutes = minutes % (60 * 24 * 365);
        long days = remainingMinutes / (60 * 24);

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
