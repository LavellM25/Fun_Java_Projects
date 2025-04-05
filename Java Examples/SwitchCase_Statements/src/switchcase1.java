/* Date: 1-7-2025
   Description: An overview of switch-case statements used vs the use case of if-else-if statements in Java.
                Best cases for if-else statements are when conditions involve range of values (e.g., if (x > 10)).
                Additionally, when using complex logical expressions (&&, ||).
                Advantages of Switch-Cases are the following:
                Readability: Cleaner/easier to understand when comparing a single variable against multiple values.
                Performance: Switch is optimized at compile-time for better performance vs. multiple if-else statements.
                Maintenance: Adding new cases is easier compared to managing multiple if-else conditions.
 */

public class switchcase1 {
    public static void main(String[] args) {
/*                          Key Components:
Switch keyword: Evaluates the expression or variable that will be compared placed in ().
Case keyword: Represents possible values that the variable can take.
Break keyword: Once the case has been matched and the desired code executed, use the break to exit loop.
Default keyword: Provides a fallback if none of the cases match, this block of code will be executed.
 */

//        // Basic Syntax of a Switch Statement
//        switch (variable) {
//            case value1:
//                // Code block executed if variable == value1
//                break;
//            case value2:
//                // Code block executed if variable == value2
//                break;
//            default:
//                // Code block executed if no case matches
//                break;
//        }

        // Problem: Create a program to print the day of the week based on a number (1-7).
        // int day = 3; sets the day to Wednesday.
        int day = 3; // Change this number to test different outputs

        switch (day) { // The switch statement compares day with each case.
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; // When it matches case 3, it prints "Wednesday" and hits break, preventing fall-through.
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
                break; // If no cases match, the default block executes, providing an error message.
        }
    }
}
