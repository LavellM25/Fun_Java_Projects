package Section_6_Control_Flow;

// This is not related to the Udemy course, this is a logic break down of what a Prime number is.

/**
 * A prime number is a natural number greater than 1 that has exactly two distinct factors: 1 and itself.
 * This means that a prime number cannot be divided evenly by any other number except 1 and itself.
 *
 * Examples of Prime Numbers
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, ...
 * 2 is the only even prime number because every other even number is divisible by 2.
 */


public class PrimeNumberChecker {
    public static void main(String[] args) {

        // Test these methods to ensure it works fine:
        System.out.println(isPrime(1));  // false
        System.out.println(isPrime(2));  // true
        System.out.println(isPrime(17)); // true
        System.out.println(isPrime(20)); // false
        System.out.println(isPrime(29)); // true
    }
    /**
     * Logic for Checking if a Number is Prime
     * To determine whether a number n is prime, follow these steps:
     *
     * Check Small Cases First:
     *
     * If n ≤ 1, return false (since prime numbers must be greater than 1).
     * If n = 2 or n = 3, return true (since both are prime numbers).
     * Eliminate Even Numbers Greater Than 2:
     *
     * If n is even (n % 2 == 0), return false (since only 2 is prime among even numbers).
     * Check Divisibility Up to √n (Square Root of n):
     *
     * Instead of checking all numbers up to n,
     * (check up to √n (because a larger factor of n must be paired with a smaller factor that we would have already checked).
     * Only check odd numbers starting from 3 (since even numbers are already eliminated).
     */

    public static boolean isPrime(int n) {
        if (n <= 1) return false;  // 0 and 1 are not prime numbers
        if (n == 2 || n == 3) return true; // 2 and 3 are prime numbers
        if (n % 2 == 0) return false; // Eliminate even numbers greater than 2

        // Check odd divisors from 3 up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false; // If divisible, it's not prime
        }

        return true; // If no divisors found, it's prime
    }
}
