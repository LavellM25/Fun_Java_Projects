# Exercise 29: Paint Job

## 📘 Description
Bob is a wall painter and needs help figuring out how many buckets of paint he needs to buy for a job. This exercise involves writing **overloaded methods** that calculate how many paint buckets are required to cover a given wall area. These methods must account for:

- The **dimensions of the wall** (width and height),
- The **area each bucket can cover**, and
- Any **extra buckets** Bob already owns.

You will write **three versions** of the method `getBucketCount`, each with a different parameter list to support different real-life scenarios Bob might face.

---

## 📌 Summary
This exercise introduces you to real-world problem solving using **method overloading** in Java. You practiced:

- Validating user inputs
- Performing mathematical calculations
- Handling rounding with `Math.ceil()`
- Using multiple overloaded methods to match different usage scenarios

Bob can now go to work confidently knowing exactly how many paint buckets he needs — and you’ve leveled up your Java skills! 🎨

---

## 🧠 Concepts Practiced
- Method Overloading
- Input Validation
- Arithmetic and Type Casting
- Use of `Math.ceil()` for rounding up partial buckets

---

## 📌 Summary
This exercise introduced **method overloading** and showed how to solve real-world problems using Java methods. You practiced:

- Handling **different sets of parameters** (overloading)
- Using `Math.ceil()` to **round up** to full buckets
- **Validating inputs** for correctness
- Working with real-world units like wall dimensions and area

Bob can now go to work confidently, and you’ve leveled up your Java programming skills! 🎨

---

## Sample Output:

```java

public class Example {
    public static void main(String[] args) {
        // I am going to test three versions of this scenario:

        // Method 1: With Width, Height, Area per Bucket, and Extra Buckets

        /** 🔹 What it does:
        - Calculates how many buckets Bob needs to **buy**, considering the buckets he already has.
        - Uses `Math.ceil()` to round up (since you can’t buy a partial bucket).

         ❗ Validation:
        - If `width`, `height`, or `areaPerBucket` is ≤ 0, or if `extraBuckets` is < 0, return `-1`.

         Explanation:
         - Wall area = 2.75 × 3.25 = 8.9375
         - Each bucket covers 2.5 area → `Math.ceil(8.9375 / 2.5) = 4`
         - Bob has 1 extra bucket → `4 - 1 = 3` buckets to buy
         */
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // Expected Output: 3

        // Method 2:
        /** 🔹 What it does:
         - Same as Method 1 but assumes Bob has no extra buckets.

         ❗ Validation:
         - If `width`, `height`, or `areaPerBucket` is ≤ 0, return `-1`.

         💡 Example:

         **Explanation:**
         - Wall area = 3.4 × 2.1 = 7.14
         - Each bucket covers 1.5 area → `Math.ceil(7.14 / 1.5) = 5
         */

        System.out.println(getBucketCount(3.4, 2.1, 1.5)); // ➤ Expected: 5

        // ✅ Method 3:
        /** 🔹 What it does:
         - Bob knows only the **total area** and **coverage per bucket**.

         ❗ Validation:
         - If `area` or `areaPerBucket` is ≤ 0, return `-1`.

         💡 Example:
         
         **Explanation:**
         - Wall area = 3.26
         - Each bucket covers 0.75 area → `Math.ceil(3.26 / 0.75) = 5
         */
        
        System.out.println(getBucketCount(.75, 3.26)); // ➤ Expected: 5

        // 🧪 Additional Test Cases
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // ➤ -1 (invalid width)
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));  // ➤ 3
        System.out.println(getBucketCount(7.25, 4.3, 2.35));   // ➤ 14
        System.out.println(getBucketCount(3.26, 0.75));        // ➤ 5
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, double extraBuckets) {
        // needs to return a int that represents the number of buckets that Bob needs to buy before going to work.
        // To calculate the bucket count, refer to the notes below.

        // If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0,
        // the method needs to return -1 to indicate an invalid value.
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0 ) {
            return -1;
        }

        // Calculate total wall area
        double totalArea = width * height;

        // Calculate required buckets (always round up to ensure full coverage)
        // math.ceil meaning it will round a floating point decimal value to the next integer, meaning 7.4 goes to 8.
        // remember math.floor does the opposite and round down, ex: 7.4 goes down to 7.
        int bucketsNeeded = (int) Math.ceil(totalArea / areaPerBucket);

        // Subtract extra buckets already available
        int bucketsToBuy = (int) (bucketsNeeded - extraBuckets);

        // If Bob already has enough buckets, return 0
        return (bucketsToBuy > 0) ? bucketsToBuy : 0;

//        getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.

    }
    // ✅ Method 2: With Width, Height, and Area per Bucket (No Extra Buckets)
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }

}


