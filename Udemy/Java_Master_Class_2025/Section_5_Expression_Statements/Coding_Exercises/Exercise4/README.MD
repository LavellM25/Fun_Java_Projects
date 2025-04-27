# 🐕 Barking Dog: Wake Up Decision

## 📝 Overview

This Java program determines whether you should **wake up** based on whether a dog is **barking** during certain hours of the day.  
It is designed as a beginner-friendly exercise to practice **boolean logic**, **method creation**, **input validation**, and **conditional statements** in Java.

---

## 📈 Future Improvements (Optional)
- Add a user interface or console input to check real-time barking scenarios.
- Extend the logic to include different wake-up rules based on user preferences.
- Add logging for invalid inputs and detailed messages.

---

## 🛠️ How It Works

- The program contains one method:
    - **`shouldWakeUp(boolean barking, int hourOfDay)`**:
        - Returns `true` if the dog is barking **before 8** or **after 22** hours.
        - Returns `false` otherwise, including if the hour is invalid (less than 0 or greater than 23).
- The `main` method tests different scenarios by calling `shouldWakeUp` with various inputs.

---

## 📚 Key Concepts Practiced
- Java Expressions and Statements 
- Boolean Logic and Conditional Operators 
- Input Validation (Range Checking)
- Method Creation and Usage 
- Basic Debugging and Testing

---

## 🚀 Sample Output

### Example 1:
```java
public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//        We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

        // Validate the range (0 to 23)
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        // Check if the dog is barking and it's before 8 or after 22
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true; // Wake up
        }
        return false; // All other cases, don't wake up
    }
    public static void main(String[] args) {
        // Test the method with different inputs
        System.out.println(shouldWakeUp(true, 23));
}
// Example 1: 
shouldWakeUp(true, 23);
// Output: true
// (Dog is barking after 22 → Wake up)

// Example 2: 
shouldWakeUp(false, 23);
// Output: false
// (Dog is not barking → Don't wake up)

// Example 3: 
shouldWakeUp(true, 8);
// Output: false
// (Dog is barking, but not before 8 → Don't wake up)

// Example 4: 
shouldWakeUp(true, -1);
// Output: false
// (Invalid hour → Don't wake up)

// Example 5: 
shouldWakeUp(true, 7);
// Output: true
// (Dog is barking before 8 → Wake up)
