package Introduction;

/* Date: 1-6-2025
   Description: Working with logical operators in Java like || && !
 */

public class LogicalOperators {
    public static void main(String[] args) {

        // || operator denotes to or
        // && operator denotes to and
        // ! operator denotes to not or opposite

        // Example using && AND operator
        // both conditions (age >= 18 and isCitizen = true) must be true for someone to be eligible to vote.
//        int age = 20;
//        boolean isCitizen = false;
//
//        if (age >= 18 && isCitizen) {
//            System.out.println("Eligible to vote!");
//        } else {
//            System.out.println("Not eligible to vote.");
//        }

        // Example using || OR operator, Check if a number is either negative or zero.
//        int number = -1;
//
//        // If either condition (number < 0 OR number == 0) is true, the statement executes.
//        if (number < 0 || number == 0) {
//            System.out.println("Number is either negative or zero.");
//        } else {
//            System.out.println("Number is positive.");
//        }

        // Example using ! NOT Operator, check if the user is not logged in. Used for simply yes or no condition.
//        boolean isLoggedIn = false;
//
//        if (!isLoggedIn) { // !isLoggedIn reverses false to true.
//            System.out.println("Please log in to continue.");
//        }
        // Example combining all logical operators together.
        int score = 60;
        boolean completedExam = false;
        boolean hasExemption = true;

        // (score >= 50 && completedExam) must both be true, OR hasExemption must be true for the student to pass.
        if ((score >= 50 && completedExam) || hasExemption) {
            // student fails if a score that is higher than 50, but still did not complete exam, and don't have exemption
            System.out.println("Student passes the exam.");
        } else {
            System.out.println("Student fails the exam.");
        }
    }

}
