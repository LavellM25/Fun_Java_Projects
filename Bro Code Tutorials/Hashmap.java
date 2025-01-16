/* Date: 1-15-2025
   Description: HashMap in Java is a part of the java.util package and is a collection that stores key-value pairs.
                It uses a hashing mechanism to store data, allowing for efficient insertion,
                deletion, and access operations. In this program, I will give a step-by-step breakdown:
 */
import java.util.Map;
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

            // This map.values() method extracts all the values stored in the HashMap as a collection.
            // for (Integer value : map.values()) for-each loop is used to iterate over the collection for map.values().
            // In each iteration, the current value from the collection is assigned to the value variable.

            // Print the current value to the console
            System.out.println(value);
            // This outputs the value currently assigned to the value variable.
            // The process repeats until all values in the HashMap have been printed.

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // 5c. entrySet provides a set of all key-value pairs.
            // Iterate through the map

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                // 'map.entrySet()' returns a set of all key-value pairs (entries) in the map.
                // Each entry is represented as a Map.Entry<K, V>, where K is the key type and V is the value type.
                // 'entry' is a variable that holds each key-value pair during each iteration.

                // Access the key of the current entry using 'entry.getKey()'
                // The 'getKey()' method retrieves the key part of the current entry.
                String key = entry.getKey();

                // Access the value of the current entry using 'entry.getValue()'
                // The 'getValue()' method retrieves the value associated with the current key.
                Integer val = entry.getValue();

                // Print the key and value in the format "key: value"
                // Concatenates the key and value with ": " for display.
                System.out.println(key + ": " + val);
            }

            // 6. Checking the Size or the amount of items in Hashmap.
            // The size method returns the number of key-value pairs.
            System.out.println("Size: " + map.size());

            // 7. Clearing the HashMap
            // Clear method removes all elements from the hashmap.
            map.clear();
            System.out.println(map); // will return an empty hashmap {}

            // 8. Checks If the Map Is Empty. The isEmpty method checks if the map has no elements.
            // Will return a boolean statement T/F
            System.out.println(map.isEmpty()); // true or false, if there are elements in the Hashmap

            /* Use Cases of HashMaps:
            Counting Frequency
                Count the occurrence of words in a text or numbers in an array.

            Caching Data
                Store frequently accessed data to optimize performance.

            Mapping IDs to Information
                Map user IDs to their profiles in an application.

            Storing Configuration Settings
                Store application configuration in a key-value format.
             */
        }
    }
}
