# Exercise 26: 🧮 Largest Prime Factor Finder

## 📝 Overview

This Java program identifies the **largest prime factor** of a given integer.  
If the input is less than 2, the method returns `-1` to indicate that the number has no valid prime factors.

---

## 🛠️ How It Works

### Method: `getLargestPrime(int number)`

- **Step 1:** Reject numbers less than 2 (`< 2`) — these can't have prime factors.
- **Step 2:** Use a loop starting from `2` to find the smallest prime factor.
- **Step 3:** Repeatedly divide the number by this factor until it no longer divides.
- **Step 4:** Continue the process for all divisors up to √number.
- **Step 5:** If anything is left after factoring, that leftover is a prime and is the largest one.

This method ensures we only use **prime divisors** and tracks the largest one encountered.

---

## 📈 Future Improvements
- Extend functionality to return a list of all prime factors, not just the largest.
- Add user interaction through the command line.
- Include error handling and validation messages.

--- 

## 📚 Key Concepts Practiced
- Prime Factorization
- Control Flow and Loops
- Remainder % and Division / Logic
- Optimization with Square Root (i * i <= number)
- Edge Case Handling for Zero and Negatives

---

## 🔍 Summary of Logic:
- Rejects bad input (number < 2) early.
- Loops from 2 to sqrt(n) to find factors (classic optimization).
- Strips out all instances of each factor so you don’t repeat work.
- If anything greater than 1 is left, it must be a prime factor bigger than sqrt(n).
- Keeps track of the largest factor seen.

--- 

## 🚀 Sample Output

```java

public class Example {

    public static void main(String[] args) {
        // should return 7 since 7 is the largest prime (3 * 7 = 21)
        System.out.println(getLargestPrime(21)); // should return 7 since 7 is the largest prime (3 * 7 = 21)

        // should return 31 since 31 is the largest prime (7 * 31 = 217)
        System.out.println(getLargestPrime(217));

        // should return -1 since 0 does not have any prime numbers
        System.out.println(getLargestPrime(0));

        // should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        System.out.println(getLargestPrime(45));

        // should return -1 since the parameter is negative
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {

        // STEP 1: Reject all numbers less than 2
        if (number < 2) {
            return -1; // No prime factors possible
        }

        int factor = -1; // This will hold the largest prime factor we find

        // STEP 2: Start checking for divisibility from 2 upwards
        for (int i = 2; i * i <= number; i++) {

            // If 'i' is not a factor of number, skip it
            if (number % i != 0) {
                continue;
            }

            // STEP 3: We found a factor! Save it
            factor = i;

            // STEP 4: Remove all occurrences of this factor from number
            while (number % i == 0) {
                number /= i;
            }
        }

        // STEP 5: After the loop, if number > 1, it itself is the largest prime
        // e.g., for 217, loop handles 7, and 31 is left → 31 is prime
        // otherwise, the last saved 'factor' is the largest prime factor
        return number == 1 ? factor : number;
    }
}
