# Exercise 15: ➕ Sum of Odd Numbers in a Range

## 📝 Overview

This Java program calculates the **sum of all odd numbers** within a given range.  
It includes a method to determine if a number is **odd**, and another method to **accumulate** 
those odd values over the specified range.  
This exercise strengthens skills in **looping**, **method creation**, **input validation**, and **control flow logic**.

---

## 🛠️ How It Works

- The program contains two main methods:
    - **`isOdd(int number)`**
        - Returns `true` if the number is positive and odd.
        - Returns `false` for non-positive or even numbers.
    - **`sumOdd(int start, int end)`**
        - Validates that both `start` and `end` are > 0 and `end >= start`.
        - Iterates through the range from `start` to `end` (inclusive), summing only the odd numbers.
        - Returns the total sum of all odd numbers in the range or `-1` if input is invalid.

- The `main` method tests several scenarios, including edge cases and valid ranges.

---

## 📚 Key Concepts Practiced
- Loops and Range Iteration
- Method Reuse (isOdd inside sumOdd)
- Input Validation
- Conditional Statements
- Boolean Logic
- Mathematical Modulus Operator (%)

---

## 📈 Future Improvements (Optional)
- Accept user input via Scanner for real-time interaction.
- Add methods to return all odd numbers in a list or array.
- Add exception handling for robustness.
- Extend to support negative numbers if needed.

## 🚀 Sample Output

```java

public class Example {
    public static void main(String[] args) {
            // Example 1:
            // starts at 1 gets all the odd numbers between 1 and 100, and adds them all up to get value Output: 2500
            System.out.println(sumOdd(1, 100));
    
            // Example 2:
            // will return -1 since start <= 0 condition is not met. (Invalid start)
            System.out.println(sumOdd(-1, 100));
    
            // Example 3:
            // there are no numbers between 100 and 100 that are int values that are odd, so there this will return 0 or none.
            System.out.println(sumOdd(100, 100));
    
            // Example 4:
            // should return 13 (This set contains one number, 13, and it is odd). (Single odd number in range)
            System.out.println(sumOdd(13, 13));
    
            // Example 5:
            // will return -1 since end < start condition is not fulfilled. Output: -1 (Invalid range: end < start)
            System.out.println(sumOdd(100, -100));
    
            // Example 6: 
            // starts at 100 gets all the odd numbers between 100 and 1000, and adds them all up to get value 247500
            System.out.println(sumOdd(100, 1000)); // Output: 247500
    
    
        } // Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
    
        // Check that number is > 0, if it is not return false.
        // If number is odd return true, otherwise return false.
        public static boolean isOdd(int number) {
            if (number <= 0) {
                return false;
            }
            return number % 2 != 0;  // Odd numbers are not divisible by two w/o a remainder, this logic says
            // if the remainder is not equal to zero, meaning number is not divisible by two, it is an odd #.
            // Returns true if odd, false if even.
        }
        // Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
        // This method will return a value so it cannot be void and the answer is not t/f, so cannot be boolean return type.
        public static int sumOdd (int start, int end) {
            // Validate input: end must be >= start, and both must be > 0
            if (start <= 0 || end <= 0 || end < start) {
                return -1;
            }
            int sum = 0;
            for (int i = start; i <= end; i++) { // Loop through the range that the user passes in the code for start and end
                if (isOdd(i)) { // Call the isOdd method to check if the number is odd. I being the place-holder value
                    sum += i;  // Add all the odd numbers to the sum if this condition is met.
                }
            }
            return sum;
        }
    }