/* Date: 1-20-2025
   Description: Write a program that gets integer input from the user, let's call it num,
                then it prints all the numbers from 1 to num (including) such that are not divisible by 3 or 7
                with new line between. Used a continue statement to solve problem.

    Explanation: Input Handling: The user enters an integer (num).
                 Loop Through Numbers: The loop iterates from 1 to num.
                 Check Divisibility: If a number is divisible by 3 or 7, it is skipped using the continue statement.
                 Print Valid Numbers: Numbers not divisible by 3 or 7 are printed.
 */

import java.util.Scanner;

public class NumbersFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); // Get input from user

        // Loop through numbers from 1 to num
        for (int i = 1; i <= num; i++) {
            // Skip numbers divisible by 3 or 7
            if (i % 3 == 0 || i % 7 == 0) {
                continue;
            }
            System.out.println(i); // Print the number
        }

        scanner.close();
    }
}

