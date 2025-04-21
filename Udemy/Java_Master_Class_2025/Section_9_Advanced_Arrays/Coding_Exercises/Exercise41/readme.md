# Coding Exercise 41: Sort Integers in Descending Order

## 📌 Description

This Java program demonstrates array processing logic by sorting a list of user-input integers in **descending order** — from highest to lowest.

### 🧠 Objective

Given an array like:
[106, 26, 81, 5, 15]

The program should sort and return:
[106, 81, 26, 15, 5]


The exercise strengthens your understanding of:

- Array manipulation
- Input handling using `Scanner`
- Writing and using static utility methods
- Sorting logic without relying on built-in sort methods

---

## 🧪 Methods Implemented

### 🔹 `getIntegers(int size)`
- Prompts the user to enter `size` integers via the keyboard.
- Returns an array of the entered integers.
- Uses a `Scanner` object instantiated **inside** the method.

### 🔹 `sortIntegers(int[] array)`
- Accepts the unsorted array and **returns a new array** containing the same elements sorted in descending order.
- You must manually copy and sort the array (no built-in sorting allowed).

### 🔹 `printArray(int[] array)`
- Prints each element in the array using this format:
- Element 0 contents 106 Element 1 contents 81 ...


---

## 🔄 Flow of Execution

1. Call `getIntegers()` to get input from the user.
2. Pass the resulting array into `sortIntegers()`.
3. Print the sorted array using `printArray()`.

---

## 💡 Notes

- All methods should be `public static`.
- **No `main()` method** is included in this class. This is a utility class meant for integration with a separate main application.
- Be cautious with spacing and formatting in `printArray()`.

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- `Scanner` class for console input
- Arrays and manual sorting logic


