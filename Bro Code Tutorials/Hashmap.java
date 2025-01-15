/* Date: 1-14-2025
   Description: HashMap in Java is a part of the java.util package and is a collection that stores key-value pairs.
                It uses a hashing mechanism to store data, allowing for efficient insertion,
                deletion, and access operations. In this program, I will give a step-by-step breakdown:
 */
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        // Creating a HashMap. You will need to import java.util.HashMap;
        // In this example, I will create a Hashmap where the keys are String and the values are Integer.
//     Syntax: HashMap<key, value> object that will be later to create the hashmap (map) = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>();

        // 1. Adding Key-Value Pairs, The put() method adds a key-value pair to the map.
        // If the key already exists, its value is updated.
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // 2. Accessing values
        // Will declare age here that will be the value in the Hashmap since it was not initialized prior.
        // The get method retrieves the value associated with the given key. Returns null if the key is not present.
        int age = map.get("Alice");
        System.out.println("Alice's age: " + age);

        // For example this will print null since this key "Chicken" doesn't exist in the array.
        System.out.println(map.get("Chicken"));

        // 3. Checking if a Key or Value Exists
        // containsKey checks if a key exists, and containsValue checks if a value exists. Return a T/F statement.
        System.out.println(map.containsKey("Alice")); // true, since Alice exists in the array.
        System.out.println(map.containsValue(25));    // true, since the value exists in the array.
        System.out.println(map.containsValue(36));  // false, since the value doesn't exist in the array.
        System.out.println(map.containsKey("Jimmy")); // false, since the key doesn't exist in the array.

        // 4. Removing a Key-Value Pair
        map.remove("Bob"); // Bob "key" and value "30" will be removed from the array
        System.out.println(map); // {"Alice": 25, "Charlie": 35} which is the new array after the removal of Bob
        map.remove("SpongeBob"); // if you remove a key that doesn't exist, this code will not execute
// Though you attempted to remove a value, you must remove the key in the array for the entire key and value to be removed from the array.
        map.remove("35");
        System.out.println(map); // Hashmap remains the same as before {"Alice": 25, "Charlie": 35}

        /* 5a. Iterating Through the Map. Using a for-each loop example
        map.values() returns a collection of all the values stored in the HashMap.
        The for-each loop iterates over each value in this collection.
        value is the variable that represents each individual value during each iteration of the loop.
System.out.println(value); This prints the current value from the loop to the console. Each value in the map is displayed one by one.
         */
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // 5b. Using a for-each loop to iterate through all the values in the HashMap
        for (Integer value : map.values()) {
            // 'map.values()' retrieves a collection of all the values present in the HashMap
            // A for-each loop is used to iterate over the collection returned by map.values().
            // Each value from the HashMap will be assigned to the 'value' variable in each iteration

            // Print the current value to the console
            System.out.println(value);
        }

    }
}
