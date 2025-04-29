# Exercise 12: 🐱 Playing Cat

## 📝 Overview

This Java program determines if a cat is **engaged in playtime** based on the **temperature** and **season**.  
It is designed as a beginner-level exercise to practice **boolean logic**, 
**conditional checks**, and **ternary operations** in Java.

---

## 📚 Key Concepts Practiced
- Java Expressions and Statements
- Boolean Logic and Conditional Operators
- Ternary Operator Usage
- Method Creation and Calling
- Basic Debugging and Testing

---

## 📈 Future Improvements (Optional)
- Add more customizable temperature ranges for different breeds of cats.
- Create a user interface allowing users to select the season and input temperature.
- Extend functionality to include other activities like napping, hunting, etc., based on temperature.

---

## 🛠️ How It Works

- The program contains one method:
    - **`isCatPlaying(boolean summer, int temperature)`**:
        - If it is **summer** (`summer == true`), the valid playtime temperature range is **25°C to 45°C** (inclusive).
        - If it is **not summer** (`summer == false`), the valid range is **25°C to 35°C** (inclusive).
        - Returns `true` if the temperature is within the appropriate range; otherwise, returns `false`.
- The `main` method tests various combinations of summer flag and temperature and prints the results.

---

## 🚀 Sample Output

### Example:
```java

public class Example {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));  
        // Output: false
        // (Temperature 10 is not in range 25-45 even in summer)

        System.out.println(isCatPlaying(false, 36)); 
        // Output: false
        // (Temperature 36 is above 35, not summer)

        System.out.println(isCatPlaying(false, 35)); 
        // Output: true
        // (Temperature 35 is within 25-35)

        System.out.println(isCatPlaying(true, 40));  
        // Output: true
        // (Temperature 40 is within 25-45 during summer)

        System.out.println(isCatPlaying(true, 45));  
        // Output: true
        // (Temperature 45 is valid during summer)

        System.out.println(isCatPlaying(false, 25)); 
        // Output: true
        // (Temperature 25 is the lower bound)
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return (temperature >= 25 && temperature <= upperLimit);
    }
}
