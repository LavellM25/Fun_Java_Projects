/**Date: 12-28-2024
 * Description: Understanding the .removeAll() method in Java, the use case, syntax,
 *              when it is used and how it can affect a program. Syntax: datatype removeAll(Collection<?> c)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Parameter: A Collection<?> containing the elements to be removed from the list.
// Returns: true if the list changed as a result of the call (at least one element was removed); otherwise, false

public class remove_all_example {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        // Create a list of elements to remove which will remove toRemove specified elements [3, 4, 5].
        List<Integer> toRemove = Arrays.asList(3, 4, 5);

        // Remove all elements in 'toRemove' from 'list'
        // list.removeAll(toRemove) removes all matching elements (3, 4, 5) from list.
        list.removeAll(toRemove);

        // Print the updated list
        System.out.println(list);
    }
}

/** removeAll() compares elements using the .equals() method.
 * It can handle any collection (List, Set, etc.) as its parameter.
 * If an element in the collection to be removed isn't in the list, it simply skips it.
 * Used for the following:
 * Filtering Lists: Remove unwanted elements based on another collection.
 * Cleanup Operations: Remove duplicates or redundant data.
 * Subset Operations: Ensure a list does not contain certain subset values.
 */
