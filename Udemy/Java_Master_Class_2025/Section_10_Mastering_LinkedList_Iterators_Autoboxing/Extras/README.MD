# Java LinkedList & Iterator Practice (Beginner Level)

This section is focused on mastering Java's `LinkedList` and working with `Iterator` and `ListIterator`. The goal is to help beginner or junior-level Java programmers gain a strong understanding of:

* How to create and modify linked lists
* How to navigate lists forward and backward
* How to insert elements in order
* How to use iterators to traverse and update lists safely

---

## Files Covered

### 1. `Lesson 44`

**Purpose**: Demonstrates basic `LinkedList<String>` usage: adding elements, and using queue and stack methods.

**Concepts Learned**:

* `add()` to add elements at a specific index or end
* `offer()`, `offerFirst()`, `offerLast()` for queue-style inserts
* `push()` and `pop()` for stack-style operations
* Removing by index or by object value

**Key Output**:
List of cities updated in different ways using list and queue logic.

---

### 2. `Iterator Example`

**Purpose**: Demonstrates how to use both `Iterator` and `ListIterator` to traverse and modify a `LinkedList<String>`.

**Concepts Learned**:

* `Iterator` for forward-only traversal and safe removal
* `ListIterator` for forward and backward navigation
* `set()` to replace current element
* `add()` to insert new elements during iteration
* `remove()` to delete elements while looping

**Key Output**:
Prints the list going forward, then backward, then modifies it by adding, removing, and replacing elements.

**Iterator vs ListIterator Table**:

| Feature         | Iterator         | ListIterator                      |
| --------------- | ---------------- | --------------------------------- |
| Direction       | Forward only     | Forward and backward              |
| `hasNext()`     | Yes              | Yes                               |
| `hasPrevious()` | No               | Yes                               |
| `remove()`      | Yes              | Yes                               |
| `add()`         | No               | Yes                               |
| `set()`         | No               | Yes                               |
| Use Case        | Simple traversal | Advanced traversal + modification |

---

### 3. `Linked List Challenge`

**Purpose**: Creates a sorted travel itinerary using `LinkedList<Place>` (custom record with name and distance).

**Concepts Learned**:

* Java `record` type for clean data model
* Custom `addPlace()` method to insert elements in sorted order
* Duplicate detection by both object and name
* Demonstrates insertion logic based on distance value

**Future Expansion (Optional)**:

* Add an interactive `ListIterator` menu to navigate the travel list (forward, backward, quit)
* Handle name comparison case-insensitively
* Let user input their own destinations

---

## Learning Objectives:

* Master the behavior and methods of `LinkedList`
* Differentiate `Iterator` vs `ListIterator`
* Learn to insert elements in sorted order
* Practice safe list modifications while iterating

These small exercises build a solid foundation for working with more complex data structures, real-world applications, and interactive Java programs.

Let me know if you'd like to build a CLI-based menu navigator or save this list to a file!
