// Coding Exercise 41: Sort Integers Descending: Strengthening Array Processing Logic
// This is based on logic of found in extras folder called sort. However, we will take the user input
// rather than using random module

package Section_9_Advanced_Arrays.Coding_Exercises.Exercise41;


import java.util.Scanner;

public class SortedArray {

    // We create a Scanner object so we can read input from the user.
    // It's static so all static methods in this class can use it.
    static Scanner input = new Scanner(System.in);

    /** Pseudo Code:
     * FUNCTION getIntegers(size):
     *     CREATE an array of given size
     *     FOR i from 0 to size - 1:
     *         PROMPT user to enter an integer
     *         STORE input in array[i]
     *     RETURN array
     */

    // This method will ask the user to enter integers and store them in an array.
    public static int[] getIntegers(int SizeOfArray) {

        // We create a new integer array with the size provided as a parameter.
        // If SizeOfArray is 5, this gives us space to store 5 integers.
        int[] array = new int[SizeOfArray];

        // We're using a for loop to go through each index of the array from 0 to SizeOfArray.
        for (int i = 0; i < SizeOfArray; i++) {

            // Prompt the user to type a number.
            System.out.println("Enter an integer: ");

            // Take the number the user typed and store it at index i of the array.
            // So, the first number goes in array[0], the second in array[1], and so on.
            array[i] = input.nextInt();
        }
        // After the loop finishes, we return the full array with all the user-entered numbers.
        return array;
    }

    /** Pseudo Code:
     * FUNCTION printArray(array):
     *     FOR i from 0 to array.length:
     *         PRINT "Element i contents array[i]"
     *
     *         It should be printed in the following format:
     *          Element 0 contents 106
     *          Element 1 contents 81
     *          Element 2 contents 26
     *          Element 3 contents 15
     *          Element 4 contents 5
     */
    public static void printArray(int[] array ) {

        // Loop through the length of the array.
        for (int i = 0; i < array.length; i++) {

            // array[i] grabs the number stored at the index.
            System.out.println("Element " + i + " contents " + array[i] + " ");
            // ^ This builds the string: "Element 0 contents 106", etc.
        }
    }

    /**
     * Pseudo Code:
     * FUNCTION sortIntegers(array):
     * COPY the original array to a new array
     * SORT the new array in descending order (e.g., using bubble sort or selection sort)
     * RETURN the sorted array
     *
     * @return
     */
    public static int[] sortIntegers(int[] array) {

        // STEP 1: Create a copy of the input array to avoid modifying the original
        int[] copyArray = array.clone();

//        // Printed to the console to ensure the array is the same as before, test passed, this is not needed anymore.
//        System.out.println(Arrays.toString(copyArray));

        // SORT the new array in descending order (e.g., using bubble sort or selection sort)
        // This is going to sort the numbers from the user from least to greatest (Ascending order)
//        Arrays.sort(copyArray);
        // However we want to the opposite in the descending order

        // STEP 2: Begin the bubble sort algorithm
        // Outer loop: Controls how many times we pass through the array
        for (int i = 0; i < copyArray.length - 1; i++) {

            // Inner loop: Go through the array and compare each pair of elements
            for (int j = 0; j < copyArray.length - 1 - i; j++) {
                // We subtract 'i' from the length each time because
                // the largest numbers have already "bubbled up" to the front.

                // STEP 3: Compare current item with the one next to it
                if (copyArray[j] < copyArray[j + 1]) {
                    // If the current item is *smaller* than the one after it,
                    // we want to swap them, because we’re sorting in descending order.

                    // STEP 4: Perform the swap using a temporary variable
                    int temp = copyArray[j];              // Store the smaller number temporarily
                    copyArray[j] = copyArray[j + 1];      // Move the bigger number into the current spot
                    copyArray[j + 1] = temp;              // Put the smaller number into the next spot
                }
            }
            // After each outer loop pass, the next largest item has "bubbled up" to the front.
        }

        // STEP 5: Return the sorted array (now in descending order)
        return copyArray;
    }

    public static void main(String[] args) {
        // Step 1: Get the user input array
        int[] array = getIntegers(5);

        // Step 2: Sort the array in descending order and store the result
        int[] sortedArray = sortIntegers(array);

        // Step 3: Print the sorted array using formatted output
        printArray(sortedArray);
    }

}
