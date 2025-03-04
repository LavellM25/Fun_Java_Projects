package Basics;// Date: 2-11-2025

// Description: Overview of the Ternary Operator, it's logic and its use cases.

public class ternaryOperator {
    public static void main(String[] args) {

//        int ageOfClient = 14; // this is the Section_5_Expression_Statements.Extras.test case that is the dependency that will be tested and change value to
//        // Section_5_Expression_Statements.Extras.test conditions
//
//        // this means that if "?" this case will execute and will print "Over Eighteen" if true (ageOfClient >= 18)
//        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
//        // this : means that if (ageOfClient >= 18) is false, execute this code and print the statement Still a kid
//        System.out.println("Our client is " + ageText);
//
//        // Ternary Operators is much shorter than running if-else statements.
//
//        System.out.println(checkNumber(7)); // Call the checkNumber method
//
//        System.out.println(checkEligibility(16)); // call vote method, and Section_5_Expression_Statements.Extras.test logic

        System.out.println(gradeScore(92)); // check logic for grade A (works)
        System.out.println(gradeScore(82)); // check logic for grade B (works)
        System.out.println(gradeScore(72)); // check logic for grade C (works)
        System.out.println(gradeScore(62)); // check logic for grade D (works)
        System.out.println(gradeScore(52)); // check logic for grade F (works)


    }
    // Method to check if number is odd or even
    public static String checkNumber(int num) {
        String result = (num % 2 == 0) ? "Even" : "Odd";

        return "Number is " + result;
        /**
         * ✅ Condition: (num % 2 == 0)
         * This checks whether the given number is even (num % 2 gives the remainder when dividing by 2).
         * If the remainder is 0, the number is even.
         * If the remainder is not 0, the number is odd.
         *
         * ✅ Evaluating the Ternary Expression
         * If num is even (num % 2 == 0 is true), "Even" is stored in result.
         * If num is odd (num % 2 == 0 is false), "Odd" is stored in result.
         */
    }
    // Method to check Checking Voter Eligibility based on condition if age is greater than or equal to 18.
    public static String checkEligibility (int age) {
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

        return "" + eligibility;
    }

    public static String gradeScore (int score) {
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        return "Grade: " + grade;
    }
}
