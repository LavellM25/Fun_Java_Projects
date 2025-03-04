package Basics;/* Date: 1-6-2025
   Description: Practice of logical operators to solve the following problems:
   1) Write a program to check if a number is between 10 and 20 (inclusive).
   2) Check if a user is either an admin or a moderator to access restricted content.
   3) Verify if a year is a leap year using logical operators (divisible by 4 && not divisible by 100 || divisible by 400).

                                Key Takeaways:
   1) Use && when all conditions must be true.
   2) Use || when at least one condition must be true.
   3) Use ! to reverse a condition's boolean value.
   4) Combine operators logically for complex conditions.
 */

public class LogicalChallenge {
    public static void main(String[] args) {

        // Problem 1. Write a program to check if a number is between 10 and 20 (inclusive).

//        int number = 10; // Use to test the number condition accordance to the logic
//
//        if (number >= 10 && number <= 20) {
//            System.out.println("Number is between 10 and 20 ");
//        }
//        else {
//            System.out.println("Number is NOT between 10 and 20, please enter a different number! ");
//        }

        // Problem 2. Check if a user is either an admin or a moderator to access restricted content

//        boolean admin = false;
//        boolean moderator = true;
//
//        if (admin) {
//        System.out.println("Access granted: Admin privileges!");
//        }
//        else {
//        System.out.println("Access denied: Only admins can access restricted content.");
//        }
//    }
//}

        // Problem 3: Verify if a year is a leap year using logical operators (divisible by 4
        // && not divisible by 100 || divisible by 400).

        int year = 2021; // Replace with any year you want to test

        /* Conditions a loop year must meet:
        year % 4 == 0: The year must be divisible by 4.
        year % 100 != 0: If the year is divisible by 100, it should not be a leap year.
        year % 400 == 0: If divisible by 400, it is a leap year.
         */
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
            // Example 1900 is divisible by 4 and 100 but is not by 400, therefore is not a leap year
            // 2000 is a leap year because it is divisible by 4, 100 and 400.

        }
    }
}
