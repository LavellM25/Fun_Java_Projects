# Exercise 18: 🔢 Even Digit Sum

## 📝 Overview

This Java program calculates the **sum of all even digits** in a given non-negative integer.  
If the input number is **negative**, the method returns `-1` to indicate invalid input.  
The exercise focuses on **digit extraction**, **modulus logic**, and **loop-based arithmetic processing**.

---

## 🛠️ How It Works

- The program includes one method:
    - **`getEvenDigitSum(int number)`**
        - Checks if the number is negative. If so, returns `-1`.
        - Uses a `while` loop to extract each digit using `% 10`.
        - Adds the digit to a running sum if it is even.
        - Removes the last digit of the number using `/ 10`.
        - Returns the total sum of even digits after processing.

- The `main` method includes test cases demonstrating various scenarios.

--- 

## 📚 Key Concepts Practiced
- Looping with While
- Digit Isolation Using Modulus
- Even Number Detection
- Input Validation
- Integer Arithmetic

--- 

## 📈 Future Improvements (Optional)
- Accept user input through Scanner for interactive usage.
- Extend functionality to return both even and odd digit sums.
- Create a version that works with string inputs for flexibility.

--- 

## 🚀 Sample Output

```java

public class Example {
    public static void main(String[] args) {
    
            // Call the method that calculates the sum of even digits
            System.out.println(getEvenDigitSum(123456789)); // Output: 20 (2 + 4 + 6 + 8)
            System.out.println(getEvenDigitSum(252));       // Output: 4 (2 + 2)
            System.out.println(getEvenDigitSum(-22));       // Output: -1 (Invalid input)
            System.out.println(getEvenDigitSum(19523));     // Output: 2 (0 + 0 + 0 + 2 + 0)
            System.out.println(getEvenDigitSum(12389));     // Output: 2 (0 + 2 + 0 + 0 + 0)
    
        }
    public static int getEvenDigitSum(int number) {
        // Step 1: Check if the number is negative
        if (number < 0) {
            return -1; // Invalid input case
        }
    
        int sum = 0;  // Step 2: Initialize sum variable to store the total sum
    
        // Step 3: Loop through all digits of the number
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
    
            if (digit % 2 == 0) {  // Step 4: Check if the digit is even
                sum += digit;  // Step 5: Add even digit to sum
            }
    
            number /= 10;  // Step 6: Remove the last digit from number
        }
    
        return sum;  // Step 7: Return the total sum of even digits
        }
}