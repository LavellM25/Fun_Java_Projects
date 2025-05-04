# Exercise 23: ✅ Perfect Number Checker

## 📝 Overview

This Java program determines whether a given integer is a **perfect number**.  
A perfect number is a **positive integer** that is equal to the **sum of all its proper positive divisors**, excluding itself.

For example:
- 6 is a perfect number → 1 + 2 + 3 = 6
- 28 is a perfect number → 1 + 2 + 4 + 7 + 14 = 28

If the input number is **less than 1**, the program returns `false` to indicate invalid input.

---

## 🛠️ How It Works

- The program contains one method:
    - **`isPerfectNumber(int number)`**
        - Returns `false` if the number is less than 1.
        - Loops from 1 to `number / 2` and checks for proper divisors.
        - Adds each divisor to a cumulative `sum`.
        - Returns `true` if the sum of all proper divisors equals the original number.

- The `main` method runs several test cases to demonstrate valid and invalid cases.

---

## 📚 Key Concepts Practiced
- Looping with for 
- Modulus Operator for Divisibility 
- Sum Accumulation
- Input Validation 
- Understanding Mathematical Definitions in Code

---

## 📈 Future Improvements (Optional)
- Accept user input through Scanner for real-time interaction. 
- Extend the method to return the list of proper divisors.
- Add support for performance-optimized perfect number checks for large values.

---

## 🚀 Sample Output

```java

public class Example {
    public static void main(String[] args) {

        // should return false since the number is < 1
        System.out.println(isPerfectNumber(-1));

        // should return false since its only proper divisor is 1 and the sum is 1 not 5
        System.out.println(isPerfectNumber(5));

        // should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
        System.out.println(isPerfectNumber(28));
        
        // should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
        System.out.println(isPerfectNumber(6)); 
        
        // Example number 12: Proper divisors: 1, 2, 3, 4, 6 → 1 + 2 + 3 + 4 + 6 = 16
        //1+2+3+4+6=16 ❌ (Not a perfect number)
    }
    public static boolean isPerfectNumber (int number) {
        if (number < 1) {
            return false;
        }

        else {
            int sum = 0; // To store the sum of proper divisors. Initialize the sum to be zero.

            // Find all divisors up to number/2 (excluding number itself)
            for (int i = 1; i <= number / 2; i++) {
                    /*
                    We loop from 1 to number/2.
                    We only need to check divisors up to number/2 because a number cannot have a proper
                    divisor greater than half of itself (except for itself, which we exclude).
                     */
                if (number % i == 0) {
                    sum += i;
                }
                    /*
                    If number % i == 0, then i is a divisor of number.
                    We add i to sum because it is a proper divisor.
                     */
            }

            return sum == number; // Check if sum of divisors equals the number
                /*
                After the loop, we check if sum (sum of divisors) is equal to number.
                If sum == number, it is a perfect number → return true.
                Otherwise, return false.
                 */
        }
    }
}