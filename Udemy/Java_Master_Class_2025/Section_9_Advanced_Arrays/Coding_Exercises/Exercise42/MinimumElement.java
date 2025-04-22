package Section_9_Advanced_Arrays.Coding_Exercises.Exercise42;

import java.util.Scanner;

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

    public static void main(String[] args) {

        // 🧪 Test 1: Normal Case
//        int[] values = {42, 17, 23, 5, 99};
//        int min = findMin(values);
//        System.out.println(min); // Output: 5

        // 🧪 Test 2: Some elements including negative numbers
//        int[] values = {-5, -10, 0, 20, 7};
//        int min = findMin(values);
//        System.out.println(min); // Output: -10

        // 🧪 Test 3: All Elements the Same
//        int[] values = {10, 10, 10, 10};
//        int min = findMin(values);
//        System.out.println(min); // Output: 10


        // 🧪 Test 4: Single Element
//        int[] values = {88};
//        int min = findMin(values);
//        System.out.println(min); // Output: 88


        // 🧪 Test 5: Sorted Descending Input
//        int[] values = {100, 90, 80, 70};
//        int min = findMin(values);
//        System.out.println(min); // Output: 70

    }
}
