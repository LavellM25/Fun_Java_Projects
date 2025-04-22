# Coding Exercise 42: Implement Min Finder

---

## 📝 Objective

This coding exercise focuses on **reading input from the user** and **finding the minimum value** in an array. You'll practice using methods, arrays, and console input handling in Java.

---

## 🚧 Requirements

You need to implement **three private static methods**:

### 1. `readInteger()`

- **Returns:** `int`
- **Functionality:**  
  Prompts the user to enter the number of elements to input.  
  This value will be used to determine the size of the array.

---

### 2. `readElements(int count)`

- **Parameter:** `int count` – the number of elements to read
- **Returns:** `int[]`
- **Functionality:**  
  Reads `count` number of integers from the user and stores them in an array, then returns the array.

---

### 3. `findMin(int[] array)`

- **Parameter:** `int[] array` – the array of integers
- **Returns:** `int`
- **Functionality:**  
  Iterates through the array and returns the smallest value.

---

## ✅ Method Workflow

1. `readInteger()` is called to get how many elements to read.
2. That number is passed to `readElements()`, which returns the full array of integers.
3. The returned array is passed to `findMin()`, which returns the minimum number.

---

## 💡 Tips

- You can assume the user will **only enter valid numbers** (no input validation needed).
- Create a **new Scanner instance inside each input-reading method**.
- Be careful about spacing in prompts or printed messages.
- Do **not** include a `main()` method in this class.
- All methods must be declared as **private static**.

---

## 🔁 Sample Flow 

```java
int count = readInteger();
int[] values = readElements(count);
int min = findMin(values);
