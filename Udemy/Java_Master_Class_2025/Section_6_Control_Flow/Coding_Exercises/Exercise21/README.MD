# Exercise 21: 🧮 All Factors Printer

## 📝 Overview

This Java program prints all **factor pairs** of a given integer.  
A factor is a number that divides another number exactly, without leaving a remainder.  
If the input number is less than 1, the program prints `"Invalid Value"`.

---

## 🛠️ How It Works

- The program contains one method:
    - **`printFactors(int number)`**
        - If the input is less than 1, prints `"Invalid Value"`.
        - Uses a loop from `1` to `√number` to find and print all valid factor pairs.
        - For each factor `i` that divides `number`, the pair `(i, number / i)` is printed in the format:  
          `i x (number / i) = number`.

- The `main` method tests various input cases to verify correctness.

---

## 📚 Key Concepts Practiced
- Factorization using modulus
- Efficient looping up to square root of a number
- Handling invalid input
- Formatted output with mathematical expressions
- Mathematical reasoning for performance optimization

--- 

```java

public class Example {
    public static void main(String[] args) {
    
            // Call the method to test the logic
    
            printFactors(6);
            // Output:
            // Factor pairs of 6:
            // 1 x 6 = 6
            // 2 x 3 = 6
    
            printFactors(32);
            // Output:
            // Factor pairs of 32:
            // 1 x 32 = 32
            // 2 x 16 = 32
            // 4 x 8 = 32
    
            // Output: 1 x 5 = 5
            printFactors(5);
    
            printFactors(10);
            // Output:
            // Factor pairs of 10:
            // 1 x 10 = 10
            // 2 x 5 = 10
    
            printFactors(-1);
            // Output:
            // Invalid Value
    
        }
    
        public static void printFactors(int number) {
            if (number >= 1) { // Condition is that the number must be equal to or greater than 1.
                System.out.println("Factor pairs of " + number + ":");
    
                // Step 2: Loop from 1 to sqrt(N) to find factor pairs
                //  stop at √N (square root of N) to avoid repeating factor pairs.
                // We only check up to √N because:
                //Factors repeat after square root.
                //If we find a factor i, it automatically get paired with N / i.
                //This reduces iterations and makes the program more efficient.
                // So basically, loop from 1 to square root of N.
                for (int i = 1; i * i <= number; i++) {
                    if (number % i == 0) { // Check if 'i' is a factor
                        int factor1 = i;
                        int factor2 = number / i;
                        System.out.println(factor1 + " x " + factor2 + " = " + number);
                    }
                }
            }
            else {
                System.out.println("Invalid Value");  // If condition is not met, handle error
            }
        }
    }
