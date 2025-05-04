# Exercise 25: 🧮 Flour Packer

## 📝 Overview

This Java program determines if it is possible to pack a specific weight of flour using only full bags of two types:
- **Big bags** (5 kg each)
- **Small bags** (1 kg each)

The method ensures:
- No bags are broken or partially used.
- The total flour packed must exactly match the goal.
- Any of the inputs being negative results in `false`.

---

## 🛠️ How It Works

### Method: `canPack(int bigCount, int smallCount, int goal)`

- **Step 1:** Validates all input values are non-negative.
- **Step 2:** Determines how many big bags can be used **without exceeding** the goal.
- **Step 3:** Uses small bags to fill in the remaining weight.
- **Returns `true`** if the combination of big and small bags can exactly meet the `goal`.

---

## 📚 Key Concepts Practiced
- Control Flow and Conditionals
- Greedy Strategy (Use Big Bags First)
- Arithmetic with Division and Modulo
- Edge Case Handling
- Input Validation

---

## 📈 Future Improvements (Optional)
- Return the actual count of big and small bags used.
- Add console-based user interaction.
- Include exception handling for invalid user inputs.

---

## 🚀 Sample Output

```java

public class Example {
    public static void main(String[] args) {

        // Example 1:
        // Output: false (1 big bag = 5 kg, goal = 4 kg → too much)
        System.out.println(canPack(1, 0, 4));

        // Example 2:
        // Output: true (1 big bag = 5 kg, matches goal)
        System.out.println(canPack(1, 0, 5));

        // Example 3:
        // Output: true (5 small bags available, only need 4)
        System.out.println(canPack(0, 5, 4));


        // Example 4:
        // Output: true (2 big bags = 10 kg + 1 small bag = 11 kg)
        System.out.println(canPack(2, 2, 11));


        // Example 5:
        // Output: false (invalid input: negative bigCount)
        System.out.println(canPack(-3, 2, 12));

        // All above tests has passed in the main method.
    } public static boolean canPack (int bigCount, int smallCount, int goal) {
        // int bigCount = 5; bigCount represents the count of big flour bags (5 kilos each).
        // int smallCount = 1; smallCount represents the count of small flour bags (1 kilo each).
        // int goal = amount of kilos of flour needed to assemble a package;
        // sum of the kilos of bigCount and smallCount must be at least equal to the value of goal will equal true

        // Step 1: Handle negative values. If any parameter is negative, return false.
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Step 2: Use big bags first (each bag is 5 kg). Uses Big Bags First Without Exceeding goal
        // Math.min(goal / 5, bigCount) ensures we don’t use more big bags than available.
        int maxBigBagsUsed = Math.min(goal / 5, bigCount); // goal / 5 calculates the maximum big bags that can be used.

        // If remainingWeight is less than or equal to smallCount, return true.
        int remainingWeight = goal - (maxBigBagsUsed * 5); // remainingWeight is what still needs to be met after using big bags.


        // Step 3: Use small bags to cover the remaining weight
        return remainingWeight <= smallCount;
    }
}