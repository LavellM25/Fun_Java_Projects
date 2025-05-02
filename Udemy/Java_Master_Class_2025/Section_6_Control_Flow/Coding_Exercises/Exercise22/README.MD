# Exercise 22: 🔗 Greatest Common Divisor

## 📝 Overview

This Java program calculates the **greatest common divisor (GCD)** of two integers.  
The GCD is the largest number that can divide both inputs **without leaving a remainder**.  
If either number is **less than 10**, the method returns `-1` to indicate an invalid value.

---

## 🛠️ How It Works

- The program includes one method:
    - **`getGreatestCommonDivisor(int first, int second)`**
        - Validates that both inputs are greater than or equal to 10.
        - Uses a `for` loop from `1` to the smaller of the two numbers.
        - If a number divides both inputs exactly, it updates the running `gcd` value.
        - Returns the highest such value as the GCD.

- The `main` method runs several test cases to confirm functionality.

---

## 📚 Key Concepts Practiced
- Control Flow with For Loops
- Modulus Operator (%) for Divisibility Checks
- Minimum Value Calculation with Math.min()
- Input Validation
- Greatest Common Divisor Logic

---

## 📈 Future Improvements (Optional)
- Optimize using the Euclidean algorithm for better performance.
- Add user input functionality with Scanner.
- Return an error message string instead of -1 for clearer feedback.

---

## 🚀 Sample Output

```java

public class Example {
    public static void main(String[] args) {

       // Test methods:

        System.out.println(getGreatestCommonDivisor(25, 15)); // Output: 5


        System.out.println(getGreatestCommonDivisor(12, 30)); // Output: 6


        System.out.println(getGreatestCommonDivisor(9, 18)); // Output: -1 (first number is less than 10)


        System.out.println(getGreatestCommonDivisor(81, 153)); // Output: 9

    }

    public static int getGreatestCommonDivisor (int first, int second) {
            /*
            Step 1: Initialize gcd
            We initialize a variable gcd to 1 because 1 is the smallest possible GCD of any two numbers.
            As we iterate, if we find a larger common divisor, we will update gcd.
            In this case, gcd needs to be a global variable that will get updated locally.
             */
        int gcd = 1;

        if (first < 10 || second < 10) { // Step 2:
            return -1; // If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
        }
        else {
            for (int i = 1; i <= Math.min(first, second); i++) {
                /*
                Step 3: Loop through possible divisors
                We start the loop from 1 since 1 is always a factor of any number.
                The loop runs up to the smaller of the two numbers (Math.min(first, second)).
                This is because the GCD cannot be greater than the smaller number.
                Example: If first = 12 and second = 30, we only check numbers from 1 to 12.
                 */
                if (first % i == 0 && second % i == 0) {
                        /*
                        Step 4: Check if (i) is a common divisor
                        This condition checks whether i is a divisor of both numbers:
                        first % i == 0 → (i) is a factor of first
                        second % i == 0 → (i) is a factor of second
                        If both conditions are true, then (i) is a common divisor.
                         */
                    gcd = i; // Update the greatest common divisor
                        /*
                        If (i) is a common divisor, update gcd to (i).
                        Since the loop is running from 1 upward, the last valid (i) (largest common divisor) will be stored in gcd.
                         */
                }
            }
        }

        return gcd; // Step 5: Return the final gcd
    }
}
