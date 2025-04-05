package Reading_Writing_Files;

/* Date: 1-7-2025
   Description: Learning how to write a file in Java if the file does not exist using Files.write function.
                Additionally, writing content to the file, using Try-with-Resources Block: .
                Use try and catch block if writing a file was successful for error handling purposes.
 */

import java.io.IOException; // Imports IOException for handling file-related errors
import java.io.FileWriter; // Imports the FileWriter class for writing text to a file

/* FileWriter used to direct write to the file, Ideal for smaller files or one-time writes.
Used case for writing a small amount of text to a file. In the case of writing happens once or very infrequently.
Example: Creating configuration files, writing logs occasionally. Less efficient for large files or multiple small writes
No internal buffering. Every write() call interacts directly with the file.
Basic methods: write(), flush(), close()
 */

public class Filewriter3000 {
    public static void main(String[] args) {
        // Step 1: Specify the file name to write to.
        // If the file does not exist, it will be created.
        // If it already exists, it will be overwritten.
        String fileName = "example.txt"; // File to be created or overwritten
        // Step 2: Prepare the content you want to write to the file.
        // \n represents a newline character, which ensures each string appears on a new line in the file.
        String content = "Hello, this is a sample text file.\n" +  // First Line
                         "You can use this file to practice reading in Java.\n" +  // Second Line
                         "Each line represents a new string in your program.\n" +  // Third Line
                         "Good luck!";  // Fourth Line

        // Step 3: Use a try-with-resources block to ensure the FileWriter is closed automatically after use.
        try (FileWriter writer = new FileWriter(fileName)) {
            // FileWriter constructor opens or creates the file "example.txt" in write mode.
            // If the file exists, it will overwrite the existing content.

            // Step 4: Write the content string to the file.
            writer.write(content);             // The write method takes the content string and writes it to the file.
            // Step 5: Print a confirmation message to the console.
            System.out.println("File written successfully: " + fileName);
        }
        // Step 6: Catch any IOException that might occur during file writing.
        catch (IOException e) {
            // IOException occurs if there are file access issues (e.g., permission denied, disk full).
            System.out.println("Error writing to the file: " + e.getMessage());
        }

    }

}
