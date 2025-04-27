# Exercise 3: 💾 MegaBytes Converter: Kilobytes to Megabytes

## 📝 Overview

This Java program converts a given amount of **kilobytes (KB)** into **megabytes (MB)** and the remaining kilobytes.  
It is designed as a beginner-level exercise to practice **expressions**, **method creation**, **modulus operations**, and **basic conditional logic** in Java.

---

## 📈 Future Improvements (Optional)
- Extend the program to allow user input from the console.
- Add unit tests to verify output correctness.
- Create a reverse converter (MB and KB ➔ total KB).

---

## 🛠️ How It Works

- The program contains a single method:
    - **`printMegaBytesAndKiloBytes(int kiloBytes)`**:
        - If the input is negative, it prints `"Invalid Value"`.
        - Otherwise, it calculates:
            - How many full megabytes are in the given kilobytes (`1 MB = 1024 KB`).
            - How many kilobytes are remaining.
        - Then prints the result in a readable format.
- The `main` method tests the functionality with several example inputs.

---

## 🚀 Sample Output

### Example:
```java

public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            // Handle invalid values that are negative
            System.out.println("Invalid Value");
        } else {
            // Calculate the number of megabytes 1 MB = 1024 KB
            int megaBytes = kiloBytes / 1024;

            // Calculate the remaining kilobytes
            int remainingKiloBytes = kiloBytes % 1024;

            // Print the conversion in the specified format
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

printMegaBytesAndKiloBytes(2500);
// Output: 2500 KB = 2 MB and 452 KB

