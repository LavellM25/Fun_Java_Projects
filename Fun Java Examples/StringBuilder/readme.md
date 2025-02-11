StringBuilder in Java

Overview

StringBuilder in Java is a mutable sequence of characters that allows for efficient string manipulation. Unlike String, which is immutable, StringBuilder provides methods to modify the same object without creating new ones, improving performance and memory efficiency.

Why Use StringBuilder?

🚀 Advantages:

Faster string concatenation compared to String.

Mutable, so modifications occur in the same memory space.

Efficient for loops where frequent string modifications are required.

⚠️ When NOT to use StringBuilder:

When you don’t need to modify a string after creation.

When working in a multi-threaded environment (use StringBuffer instead for thread safety).

How to Use StringBuilder

1. Creating a StringBuilder

StringBuilder sb = new StringBuilder("Hello");

2. Appending to a StringBuilder

sb.append(" World");
System.out.println(sb);  // Output: Hello World

3. Inserting at a Specific Index

sb.insert(5, ",");
System.out.println(sb);  // Output: Hello, World

4. Replacing a Substring

sb.replace(6, 11, "Java");
System.out.println(sb);  // Output: Hello, Java

5. Deleting Characters

sb.delete(5, 7);  // Removes ", "
System.out.println(sb);  // Output: HelloJava

6. Reversing a String

sb.reverse();
System.out.println(sb);  // Output: avaJolleH

7. Converting StringBuilder to String

String result = sb.toString();
System.out.println(result);

Performance Comparison: String vs. StringBuilder

🔴 Using String (Inefficient in Loops)

String str = "Hello";
for (int i = 0; i < 5; i++) {
    str += " World";  // Creates a new String object each time
}
System.out.println(str);

❌ Inefficient: Creates a new String object every iteration.

✅ Using StringBuilder (Efficient)

StringBuilder sb = new StringBuilder("Hello");
for (int i = 0; i < 5; i++) {
    sb.append(" World");  // Modifies the same object
}
System.out.println(sb);

✔ Efficient: Uses the same object without extra memory allocation.

Practice Challenge 🏆

Write a Java program that:

Takes a string input from the user.

Reverses the string using StringBuilder.

Removes all vowels (a, e, i, o, u) from the reversed string.

Converts the final modified string to uppercase before printing.

Example Run:

Enter a string: Hello World
Reversed without vowels (UPPERCASE): DLRW LLH
Total vowels removed: 3



🔗 Further Reading
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuilder.html


🚀 Happy Coding! 🎉
