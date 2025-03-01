package Section_6_Control_Flow.Coding_Exercises;

// Coding Exercise 26: Identifying The Largest Prime Factor Of A Number

/**
 * Write a method named getLargestPrime with one parameter of type int named number.
 * If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
 * The method should calculate the largest prime factor of a given number and return it.
 */

public class LargestPrime {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(45));
        /* All tests passed:
        getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)

        getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)

        getLargestPrime (0); should return -1 since 0 does not have any prime numbers

        getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

        getLargestPrime (-1); should return -1 since the parameter is negative
         */
    }
    public static long getLargestPrime(long number) {
        if (number <= 1) return -1; // No prime factors for numbers ≤ 1

        /*
        Since -1 is not a valid prime factor, it serves as a default error value in case n ≤ 1, meaning the input has no prime factors.
        If a valid factor is found, largestFactor will be updated accordingly.
         */
        long largestFactor = -1;

        // Step 1: Remove factors of 2
        /*
        Since 2 is the only even prime number, we divide n by 2 continuously as long as n is even.
        Each time we divide n by 2, we update largestFactor to 2, ensuring we capture 2 as a factor.

        Example Run
        For n = 40:

        40 % 2 == 0 → largestFactor = 2, n = 40 / 2 = 20
        20 % 2 == 0 → largestFactor = 2, n = 20 / 2 = 10
        10 % 2 == 0 → largestFactor = 2, n = 10 / 2 = 5
        5 % 2 != 0, so we exit this loop.
        At this point, n = 5, which is an odd number.
         */
        while (number % 2 == 0) {
            largestFactor = 2;
            number /= 2;
        }

        // Step 2: Check odd factors from 3 to sqrt(n)
        /*
        Since we've already removed all factors of 2, n is now odd, so we only check odd numbers (i += 2).
        If n is divisible by i, we divide n by i until it is no longer divisible.
        We update largestFactor to i each time, ensuring we capture the largest divisor found.

        Example Run
        For n = 45:

        Check i = 3:
        45 % 3 == 0 → largestFactor = 3, n = 45 / 3 = 15
        15 % 3 == 0 → largestFactor = 3, n = 15 / 3 = 5
        5 % 3 != 0, so we move to the next odd number.
        Check i = 5:
        5 % 5 == 0 → largestFactor = 5, n = 5 / 5 = 1
        Since n = 1, we exit the loop.
        The largest prime factor of 45 is 5.
         */
        for (long i = 3; i * i <= number; i += 2) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }

        // Step 3: If there's any prime factor left greater than 2, it must be prime
        /*
        After checking up to √n, if n is still greater than 2, it means n itself is prime.
        This happens when the largest prime factor of n is greater than √n.

        Example Run
        For n = 29:

        29 is not divisible by 2, 3, 5, or any number up to √29.
        It remains 29, meaning 29 itself is prime.
        Since n > 2, we set largestFactor = 29.
         */
        if (number > 2) {
            largestFactor = number;
        }

        /*
        We efficiently reduce n by removing smaller prime factors first.
        By checking up to √n, we minimize unnecessary calculations.
        The last value assigned to largestFactor is always the largest prime factor.
         */
        return largestFactor;
    }
}
