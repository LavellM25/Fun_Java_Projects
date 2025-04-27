# 📚 Coding Exercise 43: Reverse an Array

## 🧐 Overview
This exercise focuses on mastering **in-place array reversal** through efficient element swapping.  
You'll write a method that **reverses an array without creating a new one**, helping to deepen your understanding of **indexing, loop boundaries, and in-place data transformations**.

---

## 🛠 Requirements
- Create a method called `reverse()` that:
    - **Takes an `int[]` array** as a parameter.
    - **Does not return** any value (modifies the array directly).
- **Before reversing**, print the array as:  
  `Array = [1, 2, 3, 4, 5]`
- **After reversing**, print the array as:  
  `Reversed array = [5, 4, 3, 2, 1]`
- Use a **temporary variable** during swapping.
- Define the method as **`private static`**.

---

## 🧠 Pseudocode for reverse(int[] array)
1. Print the array (original order):
    - Print "Array = " followed by the array elements

2. Set two pointers:
    - One pointer (start) at the beginning of the array (index 0)
    - One pointer (end) at the end of the array (last index)

3. While start is less than end:
   - a. Save the value at start index into a temporary variable
   - b. Replace the value at start index with the value at end index
   - c. Replace the value at end index with the value saved in temporary variable
   - d. Move start pointer one step forward
   - e. Move end pointer one step backward

4. Print the array again (after reversing):
    - Print "Reversed array = " followed by the reversed array elements
    - Step 2-3 is about swapping elements from outside-in. 
    - Step 1 and 4 are about printing the array in the required format. 
    - private static method is required — so your method will look like private static void reverse(int[] array) in Java.

---

## 🔎 Example
**Input:**
```java
//[1, 2, 3, 4, 5]

public class Example {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // <-- Now the array is inside a class and method
    }
}
```

**Console Output:**
```
Array = [1, 2, 3, 4, 5]
Reversed array = [5, 4, 3, 2, 1]
```

---

## ✏️ Tips
- Only swap **half** of the array to avoid undoing the swaps.
- Use a **temporary variable** to hold one value during the swap process.
- No `main()` method should be included.
- Import any required classes manually if needed.


---

## 🎯 Learning Objective
By completing this exercise, you will:
- Strengthen your understanding of **array indexing**.
- Learn how to **manipulate data in-place** for better memory efficiency.
- Practice writing clean and logically correct loops for transformation tasks.


