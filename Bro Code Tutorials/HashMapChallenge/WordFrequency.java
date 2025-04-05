package HashMapChallenge;

/* Date: 1-15-2025
   Description: Challenge 1: Word Frequency from Hashmap_challenge.java
                Write a program that counts the frequency of each word in a given sentence.
 */

import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        // Step 1: Input sentence (you can replace this with user input if needed)
        String sentence = "This is a test. This test is simple.";

        // Step 2: Clean the sentence and split into words
        // Convert the sentence to lowercase to ensure the comparison is case-insensitive.
        // For example, "This" and "this" should be treated as the same word.
        sentence = sentence.toLowerCase();

        // Remove punctuation and special characters using a regular expression.
        // The regex [^a-zA-Z\s] matches any character that is NOT a letter (a-z, A-Z) or whitespace (\s).
        // Replace those characters with an empty string ("") to remove them.
        sentence = sentence.replaceAll("[^a-zA-Z\\s]", "");

        // Split the cleaned sentence into individual words using whitespace as a delimiter.
        // The regex \s+ matches one or more whitespace characters (spaces, tabs, etc.).
        // This ensures we properly split even if there are multiple spaces between words.
        String[] words = sentence.split("\\s+");

        // Step 3: Create a HashMap to store word frequencies
        // The HashMap will store each word as the key (String) and its count as the value (Integer).
        // HashMap provides fast access, insertion, and updates for storing and retrieving word frequencies.
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Step 4: Iterate through the words and count their occurrences
        for (String word : words) {
            // Check if the word is already in the map
            if (wordCount.containsKey(word)) {
                // If the word exists, increment its count by 1
                // get(word) retrieves the current count, and we add 1 to update it.
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // If the word does not exist in the map, add it with an initial count of 1
                wordCount.put(word, 1);
            }
        }

        // Step 5: Print the word frequencies
        System.out.println("Word Frequencies:");
        for (String key : wordCount.keySet()) {
            // keySet() retrieves all the keys (words) from the map.
            // get(key) retrieves the frequency (value) associated with the word.
            System.out.println(key + ": " + wordCount.get(key));
        }
    }
}
