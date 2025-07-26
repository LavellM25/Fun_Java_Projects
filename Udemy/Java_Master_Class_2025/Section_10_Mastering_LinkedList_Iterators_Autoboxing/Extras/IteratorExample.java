package Section_10_Mastering_LinkedList_Iterators_Autoboxing.Extras;

// 7/15/2025
// In this lesson, we explore:
// 1. Navigating a LinkedList with Iterator (forward only)
// 2. Navigating with ListIterator (forward and backward)
// 3. Modifying the list with remove(), add(), and set() using ListIterator

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {

    public static void main(String[] args) {

        LinkedList<String> cartoonList = new LinkedList<>();

        add(cartoonList); // Fill the list with values

        System.out.println("Traversing forward with Iterator:");
        useIterator(cartoonList);

        System.out.println("\nTraversing forward and backward with ListIterator:");
        useListIterator(cartoonList);

        System.out.println("\nModifying list using ListIterator (remove, add, set):");
        modifyListWithListIterator(cartoonList);

        System.out.println("\nFinal list after modifications:");
        System.out.println(cartoonList);
    }

    // Add items to the list
    private static void add(LinkedList<String> list) {
        list.add("Timmy Turner");
        list.add("Spongebob");
        list.add("Hey Arnold");
        list.add("Magic School Bus");
    }

    // Use regular Iterator to go forward only
    private static void useIterator(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String cartoon = iterator.next();
            System.out.println(cartoon);
        }

        // Key Lesson:
        // Iterator only moves forward.
        // It supports the .remove() method but not .add() or .set().
    }

    // Use ListIterator to go forward and backward
    private static void useListIterator(LinkedList<String> list) {
        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Forward direction:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward direction:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Key Lesson:
        // ListIterator supports both forward and backward traversal.
    }

    // Demonstrate modifying the list using ListIterator
    private static void modifyListWithListIterator(LinkedList<String> list) {
        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            String current = listIterator.next();

            // Remove "Hey Arnold" from the list
            if (current.equals("Hey Arnold")) {
                listIterator.remove(); // Removes the current element
            }

            // Replace "Timmy Turner" with "Jimmy Neutron"
            if (current.equals("Timmy Turner")) {
                listIterator.set("Jimmy Neutron"); // Replaces current element
            }

            // After "Spongebob", add "Patrick Star"
            if (current.equals("Spongebob")) {
                listIterator.add("Patrick Star"); // Adds immediately after current
                // Note: After adding, cursor is before the newly added element
                // so we skip over it with next() in the loop automatically
            }
        }

        // Key Lesson:
        // ListIterator supports .remove(), .set(), and .add().
        // These methods allow safe modifications during iteration.
    }
}

/*
 Key Differences: Iterator vs ListIterator

 | Feature           | Iterator           | ListIterator                     |
 |-------------------|--------------------|----------------------------------|
 | Direction         | Forward only       | Forward and backward             |
 | hasNext()         | Yes                | Yes                              |
 | hasPrevious()     | No                 | Yes                              |
 | remove()          | Yes                | Yes                              |
 | add()             | No                 | Yes                              |
 | set()             | No                 | Yes                              |
 | Use Case          | Simple traversal   | Advanced traversal + modification|
*/
