package Section_5_Expression_Statements.Coding_Exercises;/* Date: 1-25-2025
   Description: The objective of this coding exercise is to write a small program that checks if a number
                is a "teen" number, meaning if it's between 13 and 19.

 */

// Coding exercise 8: Teen Number Checker

public class TeenNumberChecker {
    public static void main(String[] args) {

        System.out.println(hasTeen(15, 25, 87)); // Output: true (15 is a teen)
        System.out.println(hasTeen(45, 20, 23)); // Output: false (none are teens)
        System.out.println(hasTeen(14, 13, 19)); // Output: true (all are teens)
    }
    public static boolean hasTeen (int num1, int num2, int num3){
        // Code to execute if the number is between 13 and 19
        // number must be greater than or equal to 13 AND less than or equal to 19.
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            return true; // Return true if any number is a teen
        } else {
            return false; // Return false if no numbers are teens
        }
    }
}
