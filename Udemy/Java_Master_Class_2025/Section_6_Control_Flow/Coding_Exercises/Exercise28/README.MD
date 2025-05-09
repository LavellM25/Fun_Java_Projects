# 🧮 Exercise 28: Input-Based Summation and Average Calculator

## 📝 Overview

This Java program continuously accepts user input via the keyboard, adds valid integers, and calculates the **rounded average**. It terminates input collection as soon as a **non-integer** value is entered.

This exercise emphasizes:
- `Scanner` input handling
- Input validation using `hasNextInt()`
- Loop control and calculations
- Use of `Math.round()` for average rounding

---

## 🛠️ How It Works

### Method: `inputThenPrintSumAndAverage()`

- Repeatedly accepts input using a `Scanner`.
- **Valid integers** are added to the running total and counted.
- **Non-integer** input (e.g., `"a"` or `"hello"`) exits the loop.
- Computes:
    - `SUM` = total of valid inputs
    - `AVG` = rounded average (as a long)
- Prints the result in the format:

---

## 📚 Key Concepts Practiced

- `Scanner` input processing (`hasNextInt()`)
- Type casting and rounding with `Math.round()`
- Graceful handling of invalid user input
- Average computation using `int` and `long`
- Looping and conditionals

---

## 🚀 Sample Runs

```java

public class Example {
    public static void main(String[] args) {

        // TEST CASE 1: Normal input ending with a letter
        // Expected output: SUM = 15 AVG = 3
        System.out.println("Test Case 1:");
        simulateInput("1\n2\n3\n4\n5\na\n");
        inputThenPrintSumAndAverage();

        // TEST CASE 2: No valid integers
        // Expected output: SUM = 0 AVG = 0
        System.out.println("\nTest Case 2:");
        simulateInput("hello\n");
        inputThenPrintSumAndAverage();

        // TEST CASE 3: Single valid input
        // Expected output: SUM = 10 AVG = 10
        System.out.println("\nTest Case 3:");
        simulateInput("10\nstop\n");
        inputThenPrintSumAndAverage();

        // TEST CASE 4: Negative and positive integers
        // Expected output: SUM = 5 AVG = 1
        /** Explanation:
         * Total sum: -5 + -3 + 4 + 9 = 5
         *
         * Count = 4
         *
         * Average = 5 / 4 = 1.25, rounded to 1
         */

        System.out.println("\nTest Case 4:");
        simulateInput("-5\n-3\n4\n9\nq\n");
        inputThenPrintSumAndAverage();

        // TEST CASE 5: Large dataset
        // Output: SUM = 600 AVG = 200
        System.out.println("\nTest Case 5:");
        simulateInput("100\n200\n300\nend\n");
        inputThenPrintSumAndAverage();

    }

    // Utility method to simulate user input
    private static void simulateInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in); // Scanner Object: Reads user input.

        // Initialize the sum and count
        int sum = 0;
        int count = 0;

        // Loop (while (scanner.hasNextInt()))
        // Checks if input is an integer. If a non-integer is entered (e.g., "hello" or "a"), the loop exits.
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
            count++;
        }
        // Calculate average (avoid division by zero)
        // Uses Math.round() to round the average.
        long avg = (count == 0) ? 0 : Math.round((double) sum / count);

        // Print results
        // Prints SUM = XX AVG = YY.
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}


