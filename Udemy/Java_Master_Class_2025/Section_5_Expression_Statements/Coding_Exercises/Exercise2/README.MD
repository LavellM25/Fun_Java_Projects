# Exercise 2: 🚗 Speed Converter: Kilometers per Hour to Miles per Hour

## 📝 Overview

This Java program converts a given speed from **kilometers per hour (km/h)** to **miles per hour (mi/h)**.  
It is designed as a beginner-level exercise to practice **expressions**, **method creation**, **mathematical calculations**, and **conditional logic** in Java.

---

---

## 🛠️ How It Works

- The program contains two methods:
    - **`toMilesPerHour(double kilometersPerHour)`**:  
      Converts kilometers per hour to miles per hour. Returns `-1` if the input is invalid (negative).
    - **`printConversion(double kilometersPerHour)`**:  
      Prints the conversion result in a readable format or shows `"Invalid Value"` if the input is negative.
- The `main` method can be used to test both methods with different inputs.

---

## 🚀 Sample Output

### Example 1:
```java
// Method to convert kilometers per hour to miles per hour
    public static long toMilesPerHour(double kilometersPerHour) {
        // Return -1 if the input is invalid (negative value)
        if (kilometersPerHour < 0) {
            return -1;
        }

        // Conversion factor: 1 kilometer = 0.621371 miles
        double milesPerHour = kilometersPerHour * 0.621371;

        // Round the result and return as a long
        return Math.round(milesPerHour);
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            // Print "Invalid Value" if the input is negative
            System.out.println("Invalid Value");
        } else {
            // Calculate miles per hour using the toMilesPerHour method
            long milesPerHour = toMilesPerHour(kilometersPerHour);

            // Print the conversion in the specified format
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

System.out.println(toMilesPerHour(1.5));
// Output: 1
'''

