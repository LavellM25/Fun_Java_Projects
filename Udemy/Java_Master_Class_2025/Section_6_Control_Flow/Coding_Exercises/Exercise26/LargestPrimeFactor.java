package Section_6_Control_Flow.Coding_Exercises.Exercise26;

/** Identifying The Largest Prime Factor Of A Number
 Write a method named getLargestPrime with one parameter of type int named number.

 If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.



 The method should calculate the largest prime factor of a given number and return it.



 EXAMPLE INPUT/OUTPUT:

 getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)

 getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)

 getLargestPrime (0); should return -1 since 0 does not have any prime numbers

 getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

 getLargestPrime (-1); should return -1 since the parameter is negative



 HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
 *
 */


public class LargestPrimeFactor {

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
