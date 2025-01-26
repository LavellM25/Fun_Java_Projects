/* Date: 1-25-2025
   Description: The objective of this coding exercise is to write a small program that checks
                if the sum of two numbers are equal to a third number.
 */

public class EqualSumChecker {
    public static void main(String[] args) {

        // Test the methods to ensure they work they way they should
        System.out.println(hasEqualDifference(34, 4, 30));
        System.out.println(hasEqualMultiplication(5, 90, 450));
        System.out.println(hasEqualQuotient(42, 7, 6));
        System.out.println(hasEqualSum(8, 7, 16));
    }
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        return num1 + num2 == num3;  // method that will add two # together, will return true if correct, false if not.

    } // will get difference between two values, will return true correct, false if not
    public static boolean hasEqualDifference(int num1, int num2, int num3){
        return num1 - num2 == num3 || num2 - num1 == num3;
    }
    public static boolean hasEqualQuotient(int num1, int num2, int num3){
        return num1 / num2 == num3; // will divide two numbers to see if result equals num3, if not answer will be false.
    }
    // will multiply two numbers and if they add if to num3, it will return true, false if not
    public static boolean hasEqualMultiplication(int num1, int num2, int num3) {
        return num1 * num2 == num3;
    }
}
