/* Date: 1-28-2025
   Description: The objective of this coding exercise is to write a small program that sums
                up the odd numbers in a given range. Coding exercise 15 SumOdd
 */

public class SumOddRange {
    public static void main(String[] args) {
// starts at 1 gets all the odd numbers between 1 and 100, and adds them all up to get value 2500
        System.out.println(sumOdd(1, 100));
        // will return -1 since start <= 0 condition is not met.
        System.out.println(sumOdd(-1, 100));
        // there are no numbers between 100 and 100 that are int values that are odd, so there this will return 0 or none.
        System.out.println(sumOdd(100, 100));
        // should return 13 (This set contains one number, 13, and it is odd)
        System.out.println(sumOdd(13, 13));
        // will return -1 since end < start condition is not fulfilled.
        System.out.println(sumOdd(100, -100));
        // starts at 100 gets all the odd numbers between 100 and 1000, and adds them all up to get value 247500
        System.out.println(sumOdd(100, 1000));

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
