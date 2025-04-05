package Reading_Writing_Files;

/* Date: 1-7-2025
   Description: Using BufferedWriter to write over files. Making sure the file closes properly
                used error handling properly. BufferedWriter use case are for writing large amounts of text to a file.
                Used when writing happens frequently in a loop or multiple writes.
                Example: Writing logs continuously, exporting large datasets, or appending frequently.
                Rule of Thumb: If you're writing a lot of text or performing repeated write operations,
                always prefer BufferedWriter for better efficiency.
 */

import java.io.BufferedWriter; // Import BufferedWriter for efficient file writing.
import java.io.FileWriter;      // Import FileWriter for file output stream.
import java.io.IOException;     // Import IOException to handle file-related errors.

/* BufferedWriter comparison to FileWriter:
Writes characters to a buffer, then to a file in chunks.
More efficient for writing large amounts of text.
Uses an internal buffer (default size: 8KB).
Has faster performance due to reduced I/O operations.
Has advanced methods: write(), newLine(), flush()
 */
public class Filewriter1000 {
    public static void main(String[] args) {

        // Step 1: Define the file name.
        // This will create or overwrite a file named "example.txt" in your current directory.
        String fileName = "example2.txt";

        // Step 2: Define the content to write to the file.
        // \n creates a newline for each string.
        String content = "This is another example using BufferedWriter.\n" +
                         "It's efficient for larger files.\n";

        // Step 3: Use a try-with-resources block to handle resource management.
        // BufferedWriter is wrapped around FileWriter for more efficient writing.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // BufferedWriter creates a buffer to reduce the number of I/O operations.
            // FileWriter specifies the file to write to.

            // Step 4: Write the first part of the content to the file.
            writer.write(content);
            // The write() method writes the string `content` to the file.

            // Step 5: Add a new empty line to the file.
            writer.newLine();
            // newLine() ensures the next write starts on a new line.

            // Step 6: Write an additional line of text to the file.
            writer.write("This is an additional line.");
            // Another write() appends this string to the file.

            // Step 7: Print a confirmation message to the console.
            System.out.println("File written successfully using BufferedWriter: " + fileName);
        }
        // Step 8: Handle any errors during file writing.
        catch (IOException e) {
            // IOException occurs if the file cannot be written to (e.g., permission issues, disk full).
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
