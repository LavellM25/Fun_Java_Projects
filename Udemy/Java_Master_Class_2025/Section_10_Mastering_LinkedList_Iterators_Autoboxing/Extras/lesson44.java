package Section_10_Mastering_LinkedList_Iterators_Autoboxing.Extras;

// I am making this code as a demonstration to the lesson of lesson 44 from the instructor - 7/14/25

import Section_10_Mastering_LinkedList_Iterators_Autoboxing.Coding_Exercises.Exercise44.Contact;

import java.util.LinkedList;

public class lesson44 {

    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();

        // Adding initial elements
        placesToVisit.add("Sydney");         // Adds "Sydney" to the end of the list
        placesToVisit.add(0, "Berlin");      // Inserts "Berlin" at index 0 (the beginning of the list)

        System.out.println(placesToVisit);   // Output: [Berlin, Sydney]

        // Adding more elements using a separate method
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);   // Prints updated list with all additions

        // Getting more elements using a separate method
        gettingmoreElements(placesToVisit);

    }

    /**
     * This method demonstrates different ways to add elements to a LinkedList.
     * It shows how LinkedList can be used like a list, queue, and stack.
     */
    private static void addMoreElements(LinkedList<String> list) {
        // List-style additions (standard add)
        list.add("Africa");      // Adds to end
        list.add("China");       // Adds to end

        // Queue-style additions using offer (similar to add, but safer in queue scenarios)
        list.offer("Germany");   // Adds to end
        list.offer("Australia"); // Adds to end

        // More elements added using offer
        list.offer("Italy");
        list.offer("India");

        // Adds to specific ends of the list
        list.offerFirst("USA");   // Adds to front
        list.offerLast("Mexico"); // Adds to end

        // Stack-style addition
        list.push("France");      // Push adds to the front (LIFO behavior)
    }

    /**
     * This method shows how to remove elements from a LinkedList using different techniques.
     * Demonstrates index-based removal, object removal, and stack-style removal.
     */
    private static void removeElements(LinkedList<String> list) {
        list.remove(4);           // Removes the element at index 4
        list.remove("Japan");     // Removes "Japan" by value if it exists
        list.remove("Germany");   // Removes "Germany" by value

        // Stack-style removal (removes the first element)
        list.pop();               // Same as removeFirst()
    }

    /*
 Key Concepts Reinforced

 | Concept             | Description                                                                 |
 |---------------------|-----------------------------------------------------------------------------|
 | LinkedList          | A Java collection that acts like both a List and a Queue/Stack.             |
 | .add()              | Adds an element to the end or a specific index.                             |
 | .offer()            | Adds an element to the end like .add(), often used in queues.               |
 | .offerFirst()       | Adds an element to the front of the list.                                   |
 | .offerLast()        | Adds an element to the end (like .add()).                                   |
 | .push()             | Adds to the front like a stack (LIFO behavior).                             |
 | .remove(index)      | Removes element at a specific index.                                        |
 | .remove(object)     | Removes the first occurrence of the specified object.                       |
 | .pop()              | Removes and returns the first element (like popping off a stack).           |
*/
    // another method for getting elements

    private static void gettingmoreElements(LinkedList<String> list) {

        System.out.println("Retrieved elements: " + list.get(4)); // Retrieve the 4th element in linked list

        System.out.println("First Element: " + list.getFirst()); // get first element

        System.out.println("Last Element: " + list.getLast()); // get last element

        System.out.println("Size of list: " + list.size()); // how big is list or how many elements?

        System.out.println("India is at the position: " + list.indexOf("India")); // get the position of a specific element

        System.out.println("Germany is at the position: " + list.indexOf("Germany")); // get the position of a specific element

        System.out.println("Element from peek() = " + list.peek()); // get the first element

        System.out.println("Element from peekFirst() = " + list.peekFirst()); // also get the first element

        System.out.println("Element from peekLast() = " + list.peekLast()); // get the last element



    }
}

