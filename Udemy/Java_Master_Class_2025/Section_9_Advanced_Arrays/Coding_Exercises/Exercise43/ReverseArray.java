package Section_9_Advanced_Arrays.Coding_Exercises.Exercise43;


import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {
        // Step 1: Print original array
        System.out.println("Array = " + Arrays.toString(array));

        // Step 2: Set up two pointers
        int start = 0;
        int end = array.length - 1;

        // Step 3: Swap elements moving toward the center
        while (start < end) {
            // Step 3a: Store start element in temp
            int temp = array[start];

            // Step 3b: Replace start with end element
            array[start] = array[end];

            // Step 3c: Replace end with temp
            array[end] = temp;

            // Step 3d: Move pointers
            start++;
            end--;
        }

        // Step 4: Print reversed array
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    // Only for manual testing
    public static void main(String[] args) {

        /** This code should work no matter how many numbers we decide to through at it.
         * Whether those #'s are positive or negative, this code should work.
         */

        // Test 1: Normal case
        int[] test1 = {1, 2, 3, 4, 5};
        reverse(test1);
        // Expected Output:
        // Array = [1, 2, 3, 4, 5]
        // Reversed array = [5, 4, 3, 2, 1]
        // Test passed

        System.out.println("----------------");

        // Test 2: Single element array
        int[] test2 = {42};
        reverse(test2);
        // Expected Output:
        // Array = [42]
        // Reversed array = [42]
        // Test passed

        System.out.println("----------------");

        // Test 3: Empty array
        int[] test3 = {};
        reverse(test3);
        // Expected Output:
        // Array = []
        // Reversed array = []
        // Test passed

        System.out.println("----------------");

        // Test 4: Even number of elements
        int[] test4 = {8, 6, 4, 2};
        reverse(test4);
        // Expected Output:
        // Array = [8, 6, 4, 2]
        // Reversed array = [2, 4, 6, 8]
        // Test passed

        System.out.println("----------------");

        // Test 5: Negative numbers
        int[] test5 = {-1, -2, -3, -4, -5};
        reverse(test5);
        // Expected Output:
        // Array = [-1, -2, -3, -4, -5]
        // Reversed array = [-5, -4, -3, -2, -1]
        // Test passed
    }

}
