package Section_9_Advanced_Arrays.Extras;

import java.util.Arrays;
import java.util.Random;

/**
 * This is an array challenge where the goal is to create a list of integers in descending order.
 * Highest to lowest value.
 * Example: If the array has values 50, 25, 80, 5, and 15, the program should return: 80, 50, 25, 15, 5
 */
public class Sort {
    public static void main(String[] args) {

//        // STEP 1: Generate an array of 5 random integers (0-999)
//        int[] unsortedArray = getRandomArray(5);
//
//        // STEP 2: Print the randomly generated unsorted array
//        System.out.println("Unsorted Random Array: " + Arrays.toString(unsortedArray));
//
//        // STEP 3: Sort the array in descending order and print the result
//        int[] sortedRandomArray = sortIntegers(unsortedArray);
//        System.out.println("Sorted Random Array (Descending): " + Arrays.toString(sortedRandomArray));
//
//        // Optional: Test the sorting method with a known set of values
//        int[] sampleInput = new int[] {7, 30, 35};
//        int[] sortedSample = sortIntegers(sampleInput);
//        System.out.println("Sorted Sample Array (Descending): " + Arrays.toString(sortedSample));

//        int[] testCase1 = {50, 25, 80, 5, 15};
//        System.out.println("Original: " + Arrays.toString(testCase1));
//        System.out.println("Sorted:   " + Arrays.toString(sortIntegers(testCase1)));
//// Expected Output: [80, 50, 25, 15, 5] Test case 1: Basic Passed test

//        int[] testCase2 = {100, 90, 80, 70, 60};
//        System.out.println("Original: " + Arrays.toString(testCase2));
//        System.out.println("Sorted:   " + Arrays.toString(sortIntegers(testCase2)));
//// Expected Output: [100, 90, 80, 70, 60] Test case 2: Already sorted array

//        int[] testCase4 = {10, 10, 10, 10};
//        System.out.println("Original: " + Arrays.toString(testCase4));
//        System.out.println("Sorted:   " + Arrays.toString(sortIntegers(testCase4)));
//// Expected Output: [10, 10, 10, 10] Test case 3: All values being the same

//        int[] testCase5 = {-5, 20, -10, 15, 0};
//        System.out.println("Original: " + Arrays.toString(testCase5));
//        System.out.println("Sorted:   " + Arrays.toString(sortIntegers(testCase5)));
//// Expected Output: [20, 15, 0, -5, -10] Test case 4: Included negative numbers

//        int[] testCase6 = {42};
//        System.out.println("Original: " + Arrays.toString(testCase6));
//        System.out.println("Sorted:   " + Arrays.toString(sortIntegers(testCase6)));
//// Expected Output: [42] Test Case 5: Single element

//        int[] testCase7 = {5, 100};
//        System.out.println("Original: " + Arrays.toString(testCase7));
//        System.out.println("Sorted:   " + Arrays.toString(sortIntegers(testCase7)));
//// Expected Output: [100, 5] Test case 6: only a few elements or two in this case

    }

    /**
     * This method generates an array filled with random integers between 0 and 999
     * @param len The length of the array to be created
     * @return The array of random integers
     */
    public static int[] getRandomArray(int len) {
        Random rand = new Random();
        int[] randomArray = new int[len];

        // Loop through each index and assign a random value
        for (int i = 0; i < len; i++) {
            randomArray[i] = rand.nextInt(1000); // range: 0 to 999
        }
        return randomArray;
    }

    /**
     * This method sorts the provided array in descending order (largest to smallest)
     * using the bubble sort algorithm.
     * @param array The array to sort
     * @return A new array sorted in descending order
     */
    private static int[] sortIntegers(int[] array) {
        System.out.println("Original Input: " + Arrays.toString(array));

        // STEP 1: Create a copy of the input array to avoid modifying the original
        int[] sortedArray = Arrays.copyOf(array, array.length);

        // STEP 2: Initialize a flag for tracking if any swaps occurred
        boolean flag = true;
        int temp;

        // STEP 3: Perform bubble sort in descending order
        while (flag) {
            flag = false; // Reset flag before each pass

            // STEP 4: Compare adjacent elements and swap if left is smaller than right
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    // Swap the values
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;

                    flag = true; // A swap happened, so we need another pass
                    System.out.println("Swapped: " + Arrays.toString(sortedArray));
                }
            }

            // Show the state of the array after each full pass
            System.out.println("Pass Complete: " + Arrays.toString(sortedArray));
        }

        // STEP 5: Return the sorted array
        return sortedArray;
    }
}
