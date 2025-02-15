package Section_5_Expression_Statements;

/**
 * The goal of this coding exercise is to create a program that can determine the equivalent years and days
 * based on a given input in minutes.
 */

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        // where I will call methods to test the code
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays (long minutes) {
        // method should calculate the years and days from the minutes parameter.
        // If the parameter is less than 0, print text "Invalid Value".
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        long years = minutes / (60 * 24 * 365); // Convert to years
        long remainingMinutes = minutes % (60 * 24 * 365);

        long days = remainingMinutes / (60 * 24); // Convert to days
        remainingMinutes %= (60 * 24);

        long hours = remainingMinutes / 60; // Convert to hours

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
