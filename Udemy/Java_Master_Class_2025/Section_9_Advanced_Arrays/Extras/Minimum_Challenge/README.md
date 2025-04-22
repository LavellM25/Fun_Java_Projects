# Minimum Challenge

This is a simple Java console application that demonstrates how to work with arrays, user input, 
and basic array processing using loops and the `java.util.Arrays` class.

## 🧠 Challenge Summary

The goal of this challenge is to:

1. Read a list of integers from the user, separated by commas.
2. Store the integers in an array.
3. Find and return the **minimum value** in that array.

## 📋 Program Structure

- **`readIntegers()`**
    - Prompts the user to enter a list of integers (comma-separated).
    - Parses the string input and stores the values in an integer array.
    - Returns the array.

- **`findMin(int[] array)`**
    - Iterates through the array.
    - Finds and returns the minimum integer value.

- **`main(String[] args)`**
    - Calls `readIntegers()` to get user input.
    - Prints the array using `Arrays.toString()`.
    - Calls `findMin()` and prints the minimum value found.

## 🧪 Sample Run
- Enter in a list of integers, separated by a commas: 45, 21, 78, 12, 99 [45, 21, 78, 12, 99] minimum: 12


## 🛠 Technologies Used

- Java
- IntelliJ IDEA or any Java IDE
- Standard Java libraries: `java.util.Scanner`, `java.util.Arrays`

## ✅ Key Concepts Practiced

- Array creation and traversal
- String parsing and splitting
- Using enhanced for-loops
- Minimum value logic
- Input/output with the console




