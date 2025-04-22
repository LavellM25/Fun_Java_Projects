package Section_9_Advanced_Arrays.Coding_Exercises.Exercise42;

import java.util.Scanner;

/** Coding Exercise 42: Implement Min Finder: Reading and Storing Data for Minimum Value Discovery
 * Write a method called readInteger() that has no parameters and returns an int.
 *
 * It needs to read in an integer from the user - this represents how many elements the user needs to enter.
 *
 *
 *
 * Write another method called readElements() that has one parameter of type int
 *
 * The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
 *
 *
 *
 * And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
 *
 *
 *
 * The scenario is:
 *
 * 1. readInteger() is called.
 *
 * 2. The number returned by readInteger() is then used to call readElements().
 *
 * 3. The array returned from readElements() is used to call findMin().
 *
 * 4. findMin() returns the minimum number.
 *
 * [Do not try and implement this. It is to give you an idea of how the methods will be used]
 *
 *
 *
 * TIP: Assume that the user will only enter numbers, never letters.
 *
 * TIP: Instantiate (create) the Scanner object inside the method. There are two scanner objects, one for each of the two methods that are reading in input from the user.
 *
 * TIP: Be extremely careful about spaces in the printed message.
 *
 *
 *
 * NOTE: All methods should be defined as private static.
 *
 * NOTE: Do not add a main method to the solution code.
 *
 * NOTE: Classes that are not in the java.lang package should be manually imported.
 *
 */

public class MinimumElement {

    // This method reads a single integer from the user.
    // It's used to determine how many elements will be in the array.
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner to get user input
        return scanner.nextInt();                  // Return the integer the user enters
    }

    // This method reads 'array' number of integers from the user and stores them in an array.
    private static int[] readElements(int array) {
        Scanner scanner = new Scanner(System.in);       // Scanner to get user input
        int[] elements = new int[array];                 // Create an integer array of size 'array'

        // Loop through and read input for each index of the array
        for (int i = 0; i < array; i++) {
            elements[i] = scanner.nextInt();             // Store each entered number into the array
        }

        return elements;                                 // Return the filled array
    }

    // This method finds the smallest (minimum) value in the provided array
    private static int findMin(int[] array) {
        int min = array[0];  // Start by assuming the first element is the minimum

        // Go through the rest of the array and compare each element to the current minimum
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {        // If a smaller number is found,
                min = array[i];          // update the minimum value
            }
        }

        return min;  // After checking all elements, return the smallest value
    }
}
