package Section_9_Advanced_Arrays.Extras.Minimum_Challenge;

import java.util.Arrays;
import java.util.Scanner;

/** Write a method called readIntegers that reads a comma delimited list of numbers
 * entered by the user from the console, and then returns an array containing the numbers that were entered.
 *
 * Next, write a method called findMin that takes the array as an
 * argument and returns the minimum value found in the array.
 *
 * In the main method:
 * Call the method readIntegers to get the array of integers from the user and
 * print these out using method found in java.util.Arrays.
 *
 * Call the findMin method, passing the array returned from the call to the readIntegers method.
 * Print minimum element in the array which should be returned from the findMin method.
 *
 * Assume the user will only enter numbers, so you don't need to do any validation for console input.
 */

public class minimum {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("minimum: " + returnedMin);
    }

    private static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in a list of integers, separated by a commas: ");
        String input = sc.nextLine();

        String[] split = input.split(",");
        int[] values = new int[split.length];

        // Use a traditional for-loop to split through the array and separate by comma.
        for (int i = 0; i < split.length; i++) {
            values[i] = Integer.parseInt(split[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array) {

        // Initialize the variable min.
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
